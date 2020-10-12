package designpattern.factorymethod;

public class MessageFactory {
	
	private MessageFactory() {
	}

	public static Message getMessageService(MessageType messageType) {
		switch (messageType) {
		case EMAIL:
				return new EmailMessage();
		case SMS:
			return new SMSMessage();
		default: 
			return new EmailMessage();
		}
	}
	
}
