package email;





public interface EmailSendingService {
	/**
	 * TODO: please provide valid credentials   
	 */
	final String username="xxxxxxxxxxxxxxxx"; // Give any sample usrname and pass word	
	final String password = "xxxxxxxxxxxxxxxx";

	public boolean sendMail(MailDTO mailDTO);
	
}
