package bibliotecemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	static void enviar(String para, String assunto, String msg) throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("andremazevedo", "ama7020"));
		email.setSSLOnConnect(true);
		email.setFrom("cursologicaalgaworks@gmail.com");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();
		System.out.println("E-Mail enviado com Sucesso!!!");
	}
}
