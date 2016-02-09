package jp.hara.spring.websample1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	private List<String> messages = new ArrayList<String>();
	
	public MyBean(){
		super();
		messages.add("This is Bean sample.");
	}
	
	public void addMessage(String message){
		messages.add(message);
	}
	
	public String getMessage(int n){
		return messages.get(n);
	}
	
	public void setMessage(int n, String message){
		messages.set(n, message);
	}
	
	public List<String> getMessages(){
		return messages;
	}
	
	public void setMessages(List<String> messages){
		this.messages = messages;
	}
	
	@Override
	public String toString(){
		String result = "MyBean [\n";
		for(String message : messages){
			result += "\t'" + message + "'\n";
		}
		result += "]";
		return result;
	}

}
