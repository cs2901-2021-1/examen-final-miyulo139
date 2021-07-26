package cs.lab;


public class Usuario {


    private final String password;

    Usuario(String username) {
        this.username = username;
        this.password = reversePassword(username);
    }

    String reversePassword(String username){
        StringBuilder strb = new StringBuilder(username);
        String pwd = strb.reverse().toString();
        return pwd;
    }

    public String getUsername() {
        return username;
    }

    private String username;

    public String getPassword() {
        return password;
    }


}
