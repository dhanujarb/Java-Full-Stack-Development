package validation;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static Scanner ab=new Scanner(System.in);

	public static void main(String[] args) {

        ArrayList<String> emails=new ArrayList<String>();
        System.out.println("Type the number of emails to verify");

        int number=ab.nextInt();
        ab.nextLine();
        for(int i=0;i<number;i++) {

            System.out.println("Type ur email");
            emails.add(ab.nextLine().toLowerCase());
        }

        String regex="[a-z0-9-.]+@[a-z0-9.]+$";
        for(int i=0;i<emails.size();i++) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emails.get(i));
            if(matcher.matches()) {
                System.out.println("Email is valid");
            }else {
                System.out.println("Email is invalid");
            }

        }
	}
		

}

