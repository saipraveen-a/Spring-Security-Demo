import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
  public static void main(String[] args) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String encodedPassword = encoder.encode("password");

    System.out.println(encodedPassword);
    CharSequence rawPassword = "1234";
    System.out.println(encoder.matches(rawPassword, "$2a$10$.OxKBZeH7nhXh9XC58iLUOAxkg066OjwxZuKaXeLD/FIb9JXngWvy"));
  }
}
