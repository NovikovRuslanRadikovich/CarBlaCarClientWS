package config;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Order(1)
public class WebAppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {


	@Override
    public Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {CoreConfig.class};
	}

	@Override
    public Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
    public String[] getServletMappings() {
		return new String[] { "/" };
	}

}