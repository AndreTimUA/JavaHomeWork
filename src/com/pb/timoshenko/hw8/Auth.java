package com.pb.timoshenko.hw8;

public class Auth {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Auth() {
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        String loginCheck = login.replaceAll("[^a-zA-Z0-9]", "");
        if ((login.equals(loginCheck)) && login.length()>4 && login.length()<20) {
            setLogin(login);
        } else {
            throw new WrongLoginException();
        }

        String passCheck = password.replaceAll("[^a-zA-Z0-9_]", "");
        if ((password.equals(passCheck)) && (password.equals(confirmPassword)) && password.length()>5){
            setPassword(password);
        } else {
            throw new WrongPasswordException();
        }
        System.out.println( "It's OK! User created!");
    }

    public void signIn (String login, String password) throws WrongLoginException{
        if ((login.equals(getLogin())) && (password.equals(getLogin()))) {
            System.out.println("Welcome to our SHOP!!!");;
        } else {
            throw new WrongLoginException();
        }

    }

}
