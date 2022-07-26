package vetClinic;

import java.util.Scanner;

public class Authentication {


    public static void authenticate() {

        Scanner scanner = new Scanner(System.in);

        boolean isAuthenticationSuccess = false;
        for (int i = 3; i != 0 && !isAuthenticationSuccess; i--) {
            String login;
            String password;

            System.out.println("Enter your login:");
            login = scanner.nextLine();


            System.out.println("Enter your password:");
            password = scanner.nextLine();

            if(validate(login, password)){
                isAuthenticationSuccess = true;
                System.out.println("Login success");
            }else{
                System.out.println("Password is incorrect. Please try again. ");
            }
        }

        if(!isAuthenticationSuccess){
            throw new RuntimeException("Login failed");
        }

    }

    private static boolean validate(String login, String password) {

//        for (OldUserClass user : OldUserRepositoryImpl.getSingleton().findAll()) {
//            if(user instanceof OldStaff){
//                if(((OldStaff)user).getLogin().equals(login)){
//                    return ((OldStaff)user).getPassword().equals(password);
//                }
//            }
//
//        }
        return false;
    }

}



