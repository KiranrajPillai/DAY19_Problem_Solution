
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Mobile Number: ");
        String firstName = s.next();
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("Mobile Number is Valid");
        else
            System.out.println("Mobile Number is not valid");
    }
}
