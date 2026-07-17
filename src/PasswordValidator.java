// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        if(pw == null) throw new IllegalArgumentException("Password is null");
        if(pw.length() == MIN_LEN) return true;
        if(pw.length() < MIN_LEN) return false;
        if(pw.length() == MAX_LEN) return true;
        if(pw.length() > MAX_LEN) return false;


        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpace = true;
        boolean hasLetter = false;

        for (int i = 0; i < pw.length(); i++) {
            Character c = pw.charAt(i);
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isLowerCase(c)) hasLower = true;
            if(Character.isDigit(c)) hasNumber = true;
            if(pw.contains(" ")) hasSpace = false;
            if(Character.isLetter(c)) hasLetter = true;
        }
        return hasUpper && hasLower && hasNumber && hasSpace && hasLetter;
    }
}
