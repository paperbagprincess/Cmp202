public class User {
    String username = "rio";
    String password = "Pass";
    String login() {
        if (username.equals("rio") && password.equals("Pass")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        User jane = new User();
        System.out.println(jane.login());ss
    }
}
