
package com.mycompany.bankingapp;

import java.util.Scanner;

public class BankingApp {
 static String names, gender,welcome,  names1, physicalAddress, idNo, meterNo, network;
    static int phoneNo, phoneNo1, pin,pin1, option, answer, age, numbers,accountNo=345678986;
    static double deposit, withdraw, transfer, airtime, electricity, balance, newBalance, account, currentBalance=0.0;
    
    static void captureRegistration(){
        Scanner S= new Scanner (System.in);
        System.out.println("enter 1 to register");
         System.out.println("enter 2 to login");
        numbers=S.nextInt();
        
        if(numbers==1){
            System.out.println("welcome, register with us");
            welcome=S.nextLine();
        
        
         System.out.println("enter your full names");
           names=S.nextLine();
            System.out.println("enter your idNo");
            idNo=S.next();
            System.out.println("enter your phoneNo");
            phoneNo=S.nextInt();
            System.out.println("enter your gender");
            gender=S.next();
            System.out.println("enter your age");
            age=S.nextInt();
            System.out.println("enter 4 secretive numbers to make your pin");
            pin1=S.nextInt();
              System.out.println("you've successfully registered!!");
    }
        else if(numbers==2){
            System.out.println("you can't loggin without registering. Please register first.");
            captureRegistration();
        }
      
        else{
            System.out.println("Invalid input");
            captureRegistration();
        }
    }
    
    static void capturelogin(){
        Scanner S = new Scanner (System.in);
        
        System.out.println("enter 2 to login");
        numbers=S.nextInt();
        if(numbers==2){
            System.out.println("welcome, enter your details to login");
            welcome=S.nextLine();
        }
        else if(numbers == 1){
            captureRegistration();
        }
        else{
            System.out.println("Invalid input");
           capturelogin();
        }
        System.out.println("enter your full names");
        names=S.nextLine();
        System.out.println("enter your phoneNo");
        phoneNo=S.nextInt();
       
        System.out.println("enter your pin");
        pin=S.nextInt();
        if(pin1==pin){
            System.out.println("you have successfully logged in");
            
        System.out.println("welcome to our banking app your accountNo is:"+ " "+accountNo);
        System.out.println("Account holder's name:" +" "+names);
        System.out.println("Account holder's phoneNO:"+ " "+phoneNo);
        System.out.println("Account holder's pin:"+" "+pin);
         System.out.println("You are now depositing money into your account. Enter the amount you want to deposit.");
            deposit = S.nextDouble();
            newBalance += deposit;
            System.out.println("You have deposited"+" "+"R"+newBalance+ " into your account.");
            captureDetails();
        }
        else if(pin!=pin1){
            System.out.println("invalid login");
            capturelogin();
        }
       
    }

    static void captureDetails(){
    Scanner S=new Scanner(System.in);

        System.out.println("press 2 to withdraw, 3 to transfer, 4 to buy airtime, 5 to buy electricity, 6 to exit");
        answer =S.nextInt();
       
       if(answer==2){
            System.out.println("enter the amount you wish to withdraw");
            withdraw=S.nextDouble();
            balance= newBalance-withdraw;
            if(withdraw>newBalance){
                System.out.println("sorry you dont have enough money");
            }
            else{
            System.out.println("newBalance"+ " "+ balance+" "+"Your new balance is"+" "+balance);
            }
        }
        else if(answer==3){
            System.out.println("enter account number of the account that you wish to transfer to");
            account=S.nextDouble();
            System.out.println("how much will you like to transfer?");
            transfer=S.nextDouble();
            balance= newBalance-transfer;
            if(transfer>balance){
                System.out.println("sorry you dont have enough money");
            }
            else{
                System.out.println("balance"+" "+transfer+" "+"Your new balance is"+" "+balance);
            }
            
        }
        else if(answer==4){
            System.out.println("which network do you want?");
            network=S.nextLine();
            System.out.println("press 1 for mtn, 2 for vodacom, 3 for cellC, 4 for telkom");
            answer=S.nextInt();
                 System.out.println("how much airtime do you want to buy? ");
                 airtime=S.nextDouble();
                 balance=newBalance-airtime;
                 if(airtime>newBalance){
                     System.out.println("sorry you dont have enough money");
                 }
                 else{
                     System.out.println(" you bought "+" "+"R"+airtime+" "+"Your new balance is"+" "+balance);
                 }
                 
             }
        
        else if(answer==5){
            System.out.println("enter the metterNo");
            meterNo=S.next();
            System.out.println("how much electricity do you want?");
            electricity=S.nextDouble();
            balance=newBalance-electricity;
            if(electricity>newBalance){
                System.out.println("sorry you dont have enough money");
            }
            else{
                System.out.println("balance"+" "+electricity+" "+"Your new balance is"+" "+balance);
            }
        }
        else if(answer==6){
            System.out.println("successfully exited the app");
        }
        else{
            System.out.println("Invalid input.");
           captureDetails();
        }
       
    }
    public static void main(String[] args) {
        captureRegistration();
        capturelogin();
        captureDetails();
    }
}
