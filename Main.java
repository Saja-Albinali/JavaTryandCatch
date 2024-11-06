import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";


try{
    System.out.println("enter username: ");
    String username = scanner.nextLine();
    System.out.println("enter password");
    String password = scanner.nextLine();

    if((!username.equals(validUsername)) || !password.equals(validPassword)){
        throw new Exception("invalid credentials");
    }
    System.out.println("successful");
} catch (Exception e){
        System.out.println(e.getMessage());


    }
scanner.close();
}}