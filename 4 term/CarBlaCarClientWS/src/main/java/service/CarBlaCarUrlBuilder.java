package service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CarBlaCarUrlBuilder {

    private final String baseUrl;
    private final String method;
    private final List<Argument> arguments;
    private final Map<String, List<ArrayArgument>> arrayArgumentsByName;

    public CarBlaCarUrlBuilder(String baseUrl, String method) {
        this.baseUrl = baseUrl;
        this.method = method;
        this.arguments = new LinkedList<>();
        this.arrayArgumentsByName = new HashMap<>();
    }

    public CarBlaCarUrlBuilder addArgument(String name, String value) {
        if (value != null) {
            arguments.add(new Argument(name, encode(value)));
        }
        return this;
    }


    public CarBlaCarUrlBuilder addArgument(String name, String code, String value) {
        if (value != null) {
            List<ArrayArgument> arrayArguments = arrayArgumentsByName.get(name);
            if (arrayArguments == null) {
                arrayArguments = new LinkedList<>();
                arrayArgumentsByName.put(name, arrayArguments);
            }
            arrayArguments.add(new ArrayArgument(name, code, encode(value)));
        }
        return this;
    }

    public CarBlaCarUrlBuilder addArgument(String name, String code, Long value) {
        if (value != null) {
            addArgument(name, code, encode(String.valueOf(value)));
        }
        return this;
    }

    public String build() {
        StringBuilder builder = new StringBuilder(baseUrl).append("/rest.php?f=").append(method).append("&out=json");
        for (Argument argument : arguments) {
            builder.append("&arg[").append(argument.getName()).append("]=").append(argument.getValue());
        }
        for (Map.Entry<String, List<ArrayArgument>> entry : arrayArgumentsByName.entrySet()) {
            List<ArrayArgument> arrayArguments = entry.getValue();
            for (int i = 0; i < arrayArguments.size(); i++) {
                ArrayArgument argument = arrayArguments.get(i);
                builder.append("&arg[").append(argument.getName()).append("]").append("[").append(i).append("]")
                        .append("[CODE]=").append(argument.getCode());
                builder.append("&arg[").append(argument.getName()).append("]").append("[").append(i).append("]")
                        .append("[VALUE]=").append(argument.getValue());
            }
        }
        return builder.toString();
    }

    private String encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return value;
        }
    }

    private static class Argument {
        private final String name;
        private final String value;

        public Argument(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    private static class ArrayArgument {
        private final String name;
        private final String code;
        private final String value;

        public ArrayArgument(String name, String code, String value) {
            this.name = name;
            this.code = code;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }
}


