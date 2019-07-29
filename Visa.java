import java.util.ArrayList;
/**
 * The Laser class determines whether if the string argument from the CreditCardDemo
 * (Which is a string of a credit card number from the file "CreditCardNumbers.txt")
 * is a visa creditcard.
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 1.0.2
 */
public class Visa extends ValidateCreditCard
{
    // instance variables - replace the example below with your own
    private String visaStart = "45";
    private String visaStart1 = "44";
    private String cardStart = "Visa";
    private String creditCardNumber;

    /**
     * The Visa constructor accepts a string from CreditCardDemo, which
     * is the creditcard number from CredCardNumbers.txt
     * @param String str
     * @returns none
     * @throws none implemented
     */
    public Visa(String str)
    {
       
        creditCardNumber = new String(str);
    }

    /**
     * The validate method overloads the validate method in ValidateCreditCard.
     * This method determines if the creditcard starts with any of the starting
     * visa numbers. If the creditcard does start with the starting visa numbers, then 
     * "visa" is added the the beginning of the credidcard number. If the creditcard 
     * number does not start with any of the visa starting numbers, then the creditcard is
     * set to a empty string. 
     * @param none
     * @returns none
     * @throws none implemented
     */
    public void validate(){
      
        
        if(creditCardNumber.startsWith(visaStart))
           creditCardNumber =  cardStart + " "  + creditCardNumber;
        
        else if(creditCardNumber.startsWith(visaStart1))
           creditCardNumber =  cardStart + " "  + creditCardNumber;
            
            else
            creditCardNumber = "";
         
        
    }
    
    /**
     * The resetCard method resets the card after it has been used by CreditCardDemo.
     * The card is reset to a empty string. 
     * @param none
     * @returns str
     * @throws none implemented
     */
      public String resetCard(){
        creditCardNumber="";
        String str = new String(creditCardNumber);
        return str;
        
    }
    
    /**
     * The toString method returns the current status of the creditCardNumber.
     * The CreditCardDemo uses this method to determine whether the valid class or
     * the invalid class needs the variable creditCardNumber.
     * @param none
     * @returns str2
     * @throws none implemented
     */
    public String toString(){
        String str2 = new String(creditCardNumber);
        return str2;
    }
    
    /**
     * The firstLetters method is tested against the toString method in the 
     * CreditCardDemo. If the first letters (cardStart) match the first
     * letters of the toString, then the credit card number string from CreditCardNumbers.txt
     * is either passed to the valid class or the invalid class
     * @param none
     * @returns start1
     * @throws none implemented
     */
    public String firstLetters(){
        
        String start1 = new String(cardStart);
        return start1;
    }
    
  
}
