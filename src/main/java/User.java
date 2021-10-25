import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String email;
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public User(String email, String firstName, String lastName, LocalDate birthday) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public boolean isValid() {
        return this.checkEmail() && this.nameNotEmpty() && this.ageMoreThan13();
    }

    public boolean checkEmail() {
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(this.email);
        return matcher.find();
    }

    public boolean ageMoreThan13() {
        return LocalDate.now().minusYears(13).isAfter(this.birthday);
    }

    public boolean nameNotEmpty() {
        return !this.firstName.isEmpty() && !this.lastName.isEmpty();
    }
}
