package jp.hara.spring.websample1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class MySampleApplicationListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof ContextRefreshedEvent){
			System.out.println("refreshed!");
		}
		if(event instanceof ContextClosedEvent){
			System.out.println("closed!");
		}
		
	}
	
}
