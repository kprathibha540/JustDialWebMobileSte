package com.justdial.browserconfig;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




public class JustDailMail {
	
	static String host="mail.justdial.com";  
	static final String user="s.kumar15";  	//change accordingly  
	static final String password="jjjJJJ@3";	//change accordingly 
	static Properties props = new Properties();  
	static Session  session;
	
	static
	{
		   
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		   System.out.println(" After Properties " );
		   
		   //Get the session object 
		   
		   session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {  
					protected PasswordAuthentication getPasswordAuthentication() {  
									return new PasswordAuthentication(user,password);  
								}  });  

	}
	
	public static void sendMailStart() {

				String to="s.kumar15@justdial.com";//change accordingly  
			  
			   //Compose the message  
			    try {  
					     MimeMessage message = new MimeMessage(session);  
					     message.setFrom(new InternetAddress(user));  
					     message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("s.kumar15@justdial.com,bharatsharma@justdial.com,jignesh.mehta@justdial.com,kasula.prathiba@justdial.com"));
					     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
					     message.setSubject(" UI Mobile Site Automation ");  
					     message.setText(" Automation Test Started ");  
					     System.out.println(" Before Transport "); 
					     Transport.send(message);  
					     System.out.println("mail sent successfully...");  
			   
			     } 
			    
			    catch (MessagingException e) {e.printStackTrace();
			
		}
	}
			    
		// This method is send mail if the Each Test Cases fail 
	    public static void sendFailureMail(String methodName) 
	    {
	    	
	    	String to="s.kumar@justdial.com";//change accordingly  
			 
			   //Compose the message  
			    try {  
					     MimeMessage message = new MimeMessage(session);  
					     message.setFrom(new InternetAddress(user));  
					     message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("s.kumar15@justdial.com,bharatsharma@justdial.com,jignesh.mehta@justdial.com,kasula.prathiba@justdial.com"));
					     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
					     message.setSubject(" Test Case Failure Notification ");  
					     message.setText(" Test Script with name =  "+methodName+ " is failed !! " );  
					     System.out.println(" Before Transport "); 
					     Transport.send(message);  
					     System.out.println("mail sent successfully...");  
			   
			     } 
			    
			    catch (MessagingException e) {e.printStackTrace();
			
		}
	    	
	    	
	    	
	    	
	    }
	     
	    public static void sendSucessMail()
	    {
			
		}
}
