
import java.util.Scanner;


class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) { super(msg); }
}
class LoginSystem {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
        System.out.println("Login successful!");
    }
}
public class LoginApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem login = new LoginSystem();

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            login.validate(user, pass);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage() + " Please try again.");
        }

        sc.close();
    }
}
