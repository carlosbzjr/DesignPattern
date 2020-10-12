package designpattern.factorymethod;

public class SMSMessage implements Message {

	@Override
	public void send(String text) {
		System.out.println("SMS: "+text);
	}
	
}
