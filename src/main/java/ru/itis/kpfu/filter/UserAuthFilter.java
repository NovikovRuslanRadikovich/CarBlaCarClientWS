package ru.itis.kpfu.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Implements Filter class
public class UserAuthFilter implements Filter {
    List<String> urlList;

    public void init(FilterConfig filterConfig) throws ServletException {
        String urls = filterConfig.getInitParameter("avoid-urls");
        urlList = new ArrayList<String>();
        Collections.addAll(urlList,urls.split(","));
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String url = req.getServletPath();
        boolean allowedRequest = false;

        for (String s : urlList) {
            if (url.startsWith(s)){
                allowedRequest = true;
            }
        }

        if(!allowedRequest){
            HttpSession session = req.getSession(false);

            if (session == null || session.getAttribute("session_uname") == null){
                resp.sendRedirect("/login");
            }
        }

        filterChain.doFilter(req,resp);
    }

    public void destroy() {
        urlList = null;
    }
}