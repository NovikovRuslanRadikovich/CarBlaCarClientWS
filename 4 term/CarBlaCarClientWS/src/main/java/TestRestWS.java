import config.CoreConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.RestTrip;
import service.beans.CbcTripInfo;

import java.util.Arrays;

public class TestRestWS {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(CoreConfig.class);
        configApplicationContext.refresh();
        System.out.println(Arrays.toString(configApplicationContext.getBeanDefinitionNames()));
        RestTrip restTrip = (RestTrip) configApplicationContext.getBean("restTrip");
        CbcTripInfo response = restTrip.getTripInfoById(1);
        System.out.println(response);
    }
}
