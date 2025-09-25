package Lesson13.Task1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException() {
        super("Неверный пароль");
    }
}
