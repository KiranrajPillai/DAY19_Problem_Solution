import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter E-Mail ID: ");
        String firstName = s.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("E-Mail ID is Valid");
        else
            System.out.println("E-Mail ID is not valid");
    }
}
