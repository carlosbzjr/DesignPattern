package designpattern.factorymethod;

public class EmailMessage implements Message{

	@Override
	public void send(String text) {
		System.out.println("Email: "+ text);
	}

}
