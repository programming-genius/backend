package it.backend.app;

import it.backend.beans.MySecondBean;
import it.backend.conf.ProjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//equivale a
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@Import({it.backend.conf.ProjectConfig.class})
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(applicationClass, args);
        /*ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);*/
        //MySecondBean bean = applicationContext.getBean(MySecondBean.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<Application> applicationClass = Application.class;

}


