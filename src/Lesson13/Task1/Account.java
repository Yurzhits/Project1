package Lesson13.Task1;

import java.util.Objects;

public class Account {
    private String login;
    private String password;
    private String confirmPassword;

    public Account(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean validation(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Логин не должен содержать пробелы");
        }
        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

}
