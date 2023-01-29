package linkedin_learning.java;

import java.util.Scanner;

public class PasswordComplex {
    public static boolean isPasswordComplex(String password) {
        // boolean isup=false,islow=false,isdig=false;
        // if(password.length()>=6){
        //     for(char c:password.toCharArray()){
        //         if(Character.isUpperCase(c)){
        //             isup=true;
        //         }
        //         else if(Character.isLowerCase(c)){
        //             islow=true;
        //         }
        //         else if(Character.isDigit(c)){
        //             isdig=true;
        //         }
        //     }
        // }
        // return isdig && islow && isup;
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}

