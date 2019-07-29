import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
/**
 * The creditCard demo takes in a inputfile named CreditCardNumbers.txt and determines if the creditcard is valid or not.
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 4.9.2
 */
public class main
{
    /**
     * The main method takes in the string of credit card numbers from "CreditCardNumbers.txt"
     * and prints the valid numbers into valid_cards.txt and invalid numbers into invalid_numbers.txt.
     * @param String[] args
     * @returns none
     * @throws IOException
     */
    public static void main(String [] args) {
              
       System.out.println("This application determines whether the credit card from 'CreditCardNumbers.txt' is real of fake.");
       System.out.println("Processing.........");
       String str1 = new String();
       try{
       File file = new File("CreditCardNumbers.txt"); //"CreditCardNumbers.txt"
       Scanner inputFile = new Scanner(file);
       
       File file2 = new File("valid_cards.txt"); //"valid_cards.txt"
       PrintWriter outputFile = new PrintWriter(file2);
       
       File file3 = new File("invalid_numbers.txt");
       PrintWriter outputFile1 = new PrintWriter(file3);
       
       ValidateCreditCard card1 = new ValidateCreditCard();
       InvalidArray invalid2 = new InvalidArray();
       ValidArray valid1 = new ValidArray();
       
       while(inputFile.hasNext()){
           //put this to a integer to test whether the creditcard is a integer
          str1 = inputFile.nextLine();
          String negative = new String(str1);
        try{
          String str = new String(str1);
        }
         catch(NumberFormatException  | InputMismatchException ex)
         {
             System.out.println("Error in credit card number.");
             inputFile.nextLine();
          }
          
        //Creating objects for all the classes. Must know if the credit card is any known creditcard
        //before testing whether it is valid or not       
        
        Visa visa = new Visa(str1);
        visa.validate();
        Laser laser = new Laser(str1);
        laser.validate();
        DinersClub diner = new DinersClub(str1);
        diner.validate();
        InstaPayment insta = new InstaPayment(str1);
        insta.validate();
        JCB jcb = new JCB(str1);
        jcb.validate();
        MasterCard master = new MasterCard(str1);
        master.validate();
        Maestro maestro = new Maestro(str1);
        maestro.validate();
        VisaElectron electron = new VisaElectron(str1);
        electron.validate();
        Discover discover = new Discover(str1);
        discover.validate();
        AmericanExpress amex = new AmericanExpress(str1);
        amex.validate();
        
        //Testing to see which card the number form the input file could be. If the inputed number does not match any of the
        //credit cards, the number is written to the invalid array
        if(visa.toString().startsWith(visa.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        visa.validate(str1);
                
        if(visa.Total() %card.modulus() ==0){    
        valid1.setValidNumbers(visa.toString());
          }
        if(visa.Total() %card.modulus() !=0){       
        invalid2.setInvalidNumbers(visa.toString());
           }
        visa.resetCard();
    }
       
    else if(laser.toString().startsWith(laser.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        laser.validate(str1);        
        
        if(laser.Total() %card.modulus() ==0){       
        valid1.setValidNumbers(laser.toString());
    }
        if(laser.Total() %card.modulus() !=0){       
        invalid2.setInvalidNumbers(laser.toString());
    }
        laser.resetCard();
    }
    
    else if(diner.toString().startsWith(diner.firstLetters()) || diner.toString().startsWith(diner.firstLetters1()) || diner.toString().startsWith(diner.firstLetters2())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        diner.validate(str1);        
        
        if(diner.Total() %card.modulus() ==0){    
        valid1.setValidNumbers(diner.toString());
    }
        if(diner.Total() %card.modulus() !=0){    
       invalid2.setInvalidNumbers(diner.toString());
    }
    diner.resetCard();
    }
    
    else if(insta.toString().startsWith(insta.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        insta.validate(str1);       
        
        if(insta.Total() %card.modulus() ==0){
        valid1.setValidNumbers(insta.toString());
    }
        if(insta.Total() %card.modulus() !=0){
        invalid2.setInvalidNumbers(insta.toString());
    }
        insta.resetCard();
    }
    
    else if(jcb.toString().startsWith(jcb.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        jcb.validate(str1);        
        
        if(jcb.Total() %card.modulus() ==0){
        valid1.setValidNumbers(jcb.toString());
    }
        if(jcb.Total() %card.modulus() !=0){
        invalid2.setInvalidNumbers(jcb.toString());
    }
        jcb.resetCard();
    }
    
    else if(master.toString().startsWith(master.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        master.validate(str1);
                
        if(master.Total() %card.modulus() ==0){
        valid1.setValidNumbers(master.toString());
    }
        if(master.Total() %card.modulus() !=0){

        invalid2.setInvalidNumbers(master.toString());
    }
        master.resetCard();
    }
    
    else if(maestro.toString().startsWith(maestro.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        maestro.validate(str1);        
        
        if(maestro.Total() %card.modulus() ==0){
        valid1.setValidNumbers(maestro.toString());
    }
        if(maestro.Total() %card.modulus() !=0){
        invalid2.setInvalidNumbers(maestro.toString());
    }
        maestro.resetCard();
    }
    
    else if(electron.toString().startsWith(electron.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        electron.validate(str1);
                
        if(electron.Total() %card.modulus() ==0){       
        valid1.setValidNumbers(electron.toString());
        
    }
        if(electron.Total() %card.modulus() !=0){        
        invalid2.setInvalidNumbers(electron.toString());
        
    }
        electron.resetCard();
    }
    
    else if(discover.toString().startsWith(discover.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        discover.validate(str1);       
        
        if(discover.Total() %card.modulus() ==0){       
        valid1.setValidNumbers(discover.toString());
        
    }
        if(discover.Total() %card.modulus() !=0){       
        invalid2.setInvalidNumbers(discover.toString());
        
    }
        discover.resetCard();
    }
    
    else if(amex.toString().startsWith(amex.firstLetters())){
        ValidateCreditCard card = new ValidateCreditCard(str1);    
        amex.validate(str1);        
        
        if(amex.Total() %card.modulus() ==0){
        valid1.setValidNumbers(amex.toString());
    }
        if(amex.Total() % card.modulus() !=0){
        invalid2.setInvalidNumbers(amex.toString());
    }
        amex.resetCard();        
    }
        else{

            invalid2.setInvalidNumbers(str1);
        }
        card1.resetTotal(); //resets the total for the numbers added up in valid credit card class
    }
                
        for(String val : invalid2.getinvalidList())
        outputFile1.println(val);
        
        
        for(String val1 : valid1.getvalidList())
            outputFile.println(val1);
            
          
       System.out.println("All cards have now been scanned.");
       System.out.println("Unfortunately, Mobius Duck stole a lot of credit cards. His punishment is in the copied website address below.");
       System.out.println("https://www.youtube.com/watch?v=0o_c5hRFrMc");
       System.out.println("Thank you for using this application!");
   
       inputFile.close();
       outputFile.close();
       outputFile1.close();
    }
       catch(FileNotFoundException | InputMismatchException ex)
    {
        System.out.println("Error processing the file.");
    }
    }
}
