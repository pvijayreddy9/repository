package com.sample.training.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormat {
	public static boolean isEmailValid(String emailAddress) {
        try {            
            Pattern alpha = Pattern.compile("[a-zA-Z0-9]@([\\w-]+\\.)+[\\w-]{2,4}$");
            Matcher matcher = alpha.matcher(emailAddress.trim());
            if (matcher.find())
                return true;
        } catch (Exception ae) {
            return false;
        }
        return false;
    }
	public static void groupByEmails(String emails) {
		String[] emailAddress = emails.split(" ");
		Map<String, StringBuilder> groupedEmails = new HashMap<>();

		for (String str:emailAddress) {
			String domain = str.substring(str.indexOf("@")+1);
			if(groupedEmails.containsKey(domain)) {
				groupedEmails.put(domain, groupedEmails.get(domain).append(str).append(" "));
			}else {
				groupedEmails.put(domain, new StringBuilder().append(str).append(" "));
			}
		}
		for(Map.Entry<String, StringBuilder> entry:groupedEmails.entrySet()) {
			System.out.println("Domain: "+ entry.getKey());
			System.out.println("Emails: "+ entry.getValue());
			System.out.println();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		String email = "abc12@email.com";
		if(isEmailValid(email))
			System.out.println("Email is valid");
		else
			System.out.println("Email is not valid");
		//Group Emails
		String emails = "abc12@gmail.com def34@email.com raju@gmail.com ravi@yahoo.com vijay@email.com";
		groupByEmails(emails);
		
	}
	

}
