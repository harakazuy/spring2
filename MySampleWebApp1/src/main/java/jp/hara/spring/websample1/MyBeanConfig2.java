package jp.hara.spring.websample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="jp.hara.spring.websample1")
public class MyBeanConfig2 {
	@Autowired
	private MyBeanConfig config;
	
	@Bean
	public MyBean2 myBean2(){
		return new MyBean2();
	}
	
	@Bean
	public MySampleApplicationListener appListener(){
		return new MySampleApplicationListener();
	}
	
	@Bean
	public MyBeanEventListener mybeanListener(){
		return new MyBeanEventListener();
	}
	
	@Bean
	public MyBeanEventService mybeanService(){
		return new MyBeanEventService();
	}
}
