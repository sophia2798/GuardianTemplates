package guardiantemplates;

import java.util.regex.Pattern;

public class UserValidationHelpers {

    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern ePattern = Pattern.compile(EMAIL_PATTERN);
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"; // checking for at least one digit (0-9), one lower case letter, one upper case letter, one special character, no whitespace, min 8 characters
    private static final Pattern pPattern = Pattern.compile(PASSWORD_PATTERN);
    
    public boolean email(String email) {
        return ePattern.matcher(email).matches();
    }

    public boolean password(String password) {
        return pPattern.matcher(password).matches();
    }
}