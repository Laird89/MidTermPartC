/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a user name: ");
        String userName = input.nextLine();
        
        System.out.println("Enter a genre from the following values: ");
        System.out.println("Comedy, Drama, Action, Mystery.");
        String genreName = input.nextLine();
        
        UserProfile userProfile1 = new UserProfile(userName, genreName);
        
        System.out.println("Your user profile was created!");

    }
}
