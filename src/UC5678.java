
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5678 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String firstName = s.next();
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is not valid");
    }
}
