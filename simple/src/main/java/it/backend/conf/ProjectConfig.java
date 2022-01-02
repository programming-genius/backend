package it.backend.conf;

import it.backend.beans.MyBean1;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("it.backend.comp")
public class ProjectConfig  {

	@Bean
	@Scope("singleton") //ConfigurableBeanFactory.SCOPE_SINGLETON
	@Lazy
	public MyBean1 myBean1(){
		return new MyBean1("MyBean1");
	}

	@Bean
	@Scope("singleton") //ConfigurableBeanFactory.SCOPE_SINGLETON
	@Lazy
	public MyBean1 myBean2(){
		return new MyBean1("MyBean2");
	}

}