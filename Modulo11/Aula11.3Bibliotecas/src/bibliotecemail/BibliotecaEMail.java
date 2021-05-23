package bibliotecemail;

import org.apache.commons.mail.EmailException;

public class BibliotecaEMail {

	public static void main(String[] args) throws EmailException {

		Carteiro.enviar("andremazevedo@gmail.com", "Teste de E-Mail", "Este é um e-Mail de teste ... :-)");
	}

}
