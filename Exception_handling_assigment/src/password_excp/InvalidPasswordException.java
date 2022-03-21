package password_excp;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(int i) {
    }

    public boolean printMessage() {
        return false;
    }
}
