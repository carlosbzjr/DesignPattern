package designpattern.factorymethod;

public class FactoryMethodMain {
	public static void main(String[] args) {
		Message email = MessageFactory.getMessageService(MessageType.EMAIL);
		email.send("This is email!");
		
		Message sms = MessageFactory.getMessageService(MessageType.SMS);
		sms.send("This is SMS!");
	}
}
