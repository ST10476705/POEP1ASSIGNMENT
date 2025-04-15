/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POEPART1 {

    public static void main(String[] args) {
        
        //Creating an instance to create a class
        Login objLogin = new Login ();
        
        //Creating a scanner class
        Scanner scan = new Scanner(System.in);
        
        // Promt the user to enter username
        System.out.println("please enter username");
        //user enters username
        String username=scan.nextLine();
        // using if statements to check the username
        if(objLogin.CheckUserName(username)== true){
            System.out.println("Thank you for username");
        }else{
            // Display the results
            System.out.println("the username is incorrectly formated");
        }
        // prompt the user to enter password
        System.out.println("please enter the password");
        // user enters a password
        String password=scan.nextLine();
        // using if statements to check password
        if(objLogin.checkpasswordComplexity(password)==true){
            System.out.println("Thank you for password");
        }else{
            System.out.println("password is incorrectly formated");
    
        }
        //prompt the user to enter cellphone number
        System.out.println("please enter a cellphone number");
        //user enters a cellphone number
        String CellPhoneNumber=scan.nextLine();
        
        //using if statements to checkCellphoneNumber
        if(objLogin.checkCellPhoneNumber(CellPhoneNumber)==true){
           System.out.println("thank you for the cellphone number");
        }else{
            System.out.println("the cellphone number is incorrectly formated");
        }
       objLogin.registerUser(username,password);
       System.out.println("please enter the username you signed up with");
       String verifyusername=scan.nextLine();
       
       System.out.println("please enetr the password you signed up with");
       String verifyPassword=scan.nextLine();
       
       if (objLogin.loginUser(username, password, verifyusername, verifyPassword)){
           System.out.println("Login Succesfull");
           objLogin.returnloginstatus(username, password, verifyusername, verifyPassword);
       } else {
           System.out.println("Login Unsuccessful");
           
       
      
       
       
       
       
    }

 
    }

   
    }
    

