


/**
 * The DinersClub class determines whether if the string argument from the CreditCardDemo
 * (Which is a string of a credit card number from the file "CreditCardNumbers.txt")
 * is a DinersClub creditcard.
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 0.8.2
 */
public class DinersClub extends ValidateCreditCard
{
    // instance variables - replace the example below with your own
    private String dclubAmerica = "54";
    private String dclubAmerica1 = "55";
    private String dclubCarteBlanche= "30";
    private String dclubInternational = "36";
    private String cardStart = "Diners Club - North America ";
    private String cardStart1 = "Diners Club-Carte Blanche ";
    private String cardStart2 = "Diners Club-International ";
    private String creditCardNumber;

    /**
     * The DinersClub constructor accepts a string from CreditCardDemo, which
     * is the creditcard number from CredCardNumbers.txt
     * @param String str
     * @returns none
     * @throws none implemented
     */
    public DinersClub(String str)
    {
        
        //delete the origional String later
        creditCardNumber = str;
    }

    /**
     * The validate method overloads the validate method in ValidateCreditCard.
     * This method determines if the creditcard starts with any of the starting
     * DinersClub numbers. If the creditcard does start with the starting Club numbers, then 
     * "Diners Club || Diners Club-Carte Blanche || Diners Club-International" is added the the beginning of the credidcard number. If the creditcard 
     * number does not start with any of the Diners Club starting numbers, then the creditcard is
     * set to a empty string. 
     * @param none
     * @returns none
     * @throws none implemented
     */
    public void validate(){
        
        //StringBuilder card = new StringBuilder(creditCardNumber);
        
        if(creditCardNumber.startsWith(dclubAmerica))
           creditCardNumber =  cardStart + creditCardNumber;
        
        else if(creditCardNumber.startsWith(dclubAmerica1))
           creditCardNumber =  cardStart + creditCardNumber;
        
          else if(creditCardNumber.startsWith(dclubCarteBlanche))
           creditCardNumber =  cardStart1 + creditCardNumber;
         
          else if(creditCardNumber.startsWith(dclubInternational))  
           creditCardNumber =  cardStart2 + creditCardNumber;
           
          
           else
            creditCardNumber = "";
         
           
           
        
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
     * The firstLetters method is tested against the toString method in the 
     * CreditCardDemo. If the first letters (cardStart) match the first
     * letters of the toString, then the credit card number string from CreditCardNumbers.txt
     * is either passed to the valid class or the invalid class
     * @param none
     * @returns start1
     * @throws none implemented
     */
    public String firstLetters(){
        ;
        String start1 = new String(cardStart);
        return start1;
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
    public String firstLetters1(){
        ;
        String start1 = new String(cardStart1);
        return start1;
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
    public String firstLetters2(){
        ;
        String start1 = new String(cardStart2);
        return start1;
    }
}