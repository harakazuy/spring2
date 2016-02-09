package jp.hara.spring.websample1;

import org.springframework.context.ApplicationEvent;

public class MyBeanEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	
	public MyBeanEvent(Object source){
		super(source);
		System.out.println("create MyBeanEvent!");
	}
}
