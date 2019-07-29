
/**
 * The validate credit card class calculates whether the credit card is valid
 * by adding all the credit cards numbers in one credit card togeather. If the 
 * sum of all the creditcards %10 == 0, then the card is valid. 
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 5.0.5
 */
public class ValidateCreditCard
{
    // instance variables - replace the example below with your own
    private String numbers;
    private int total;
    private int x;
    private int modAmount =10;
    private int [] addNumbers;

    /**
     * The ValidateCreditCard no-arg constructor sets the numbers and total
     * @param none
     * @returns none
     * @throws none implemented
     */
    public ValidateCreditCard(){
        numbers = "";
        total=0;
    }
    
    /**
     * The validatecreditcard Constructor accepts a string from the credid
     * CardDemo, which is the string from the input file CreditCardNumbers.txt
     * @param String str
     * @returns none
     * @throws none implemented
     */
    public ValidateCreditCard(String str)
    {
        numbers = str;
    }
/**
 * The validate method returns nothing and calculates whether the creditcard is
 * valid or not. If the sum of all the creditcards %10 == 0, then the card is valid. 
 * @param String str1
 * @returns none
 * @throws none implemented
 */
 public void validate(String str1){
     
     
      StringBuilder str = new StringBuilder(str1); 
      String lastIndex = new String();
     //int[] addNumbers;
     //int x;
     
     
         if(str.length() == 14)
         {
             lastIndex =str.substring(13);
             str.deleteCharAt(13);
             
            }
         else if(str.length() ==15){
             lastIndex =str.substring(14);
             str.deleteCharAt(14);
             
            }
         else if(str.length() ==16){
             lastIndex =str.substring(15);
             str.deleteCharAt(15);
            }
         else if(str.length() ==17){
             lastIndex =str.substring(16);
             str.deleteCharAt(16);
            } 
             else if(str.length() ==18){
             lastIndex =str.substring(17);
             str.deleteCharAt(17);
            }
             else if(str.length() ==19){
             lastIndex =str.substring(18);
             str.deleteCharAt(18);
            }
            
            
            addNumbers = new int[str.length()];
            str.reverse();
            str.toString();
            String str2 = new String(str);
            x= Integer.parseInt(lastIndex);
           
            for(int i =0; i< addNumbers.length; i++){ 
                addNumbers[i] = Math.abs(str2.charAt(i) -'0'); //prevents negative numbers from being credit card numbers
            }
            
            for(int i =0; i<addNumbers.length; i++){ //multiplies all the odd emements in the array
                if (i%2 ==0)
                addNumbers[i] *=2;
            }
     
            for (int i =0; i<addNumbers.length; i++){ // subtracts numbers greater than 9 by 9
                if(addNumbers[i] > 9)
                addNumbers[i] -=9;
            }
            
            for (int i =0; i<addNumbers.length; i++){
                total += addNumbers[i];
            }
            total += x;
    }
    
    /**
     * The Total method is the total of all the creditcard numbers in one credit
     * card added togeather
     * @param none
     * @returns total1
     * @throws none implemented
     */
    public int Total(){
        int total1 = total;
        return total1;
        
    }
    
    /**
     * The resetTotal method resets the total after the numbers in a single creditcard
     * have been added togeather.
     * @param none
     * @returns total
     * @throws none implemented
     */
    public int resetTotal(){
       total = 0;
       
       return total;
        
    }
    
    /**
     * The modulus method is used in the CreditCardDemo to determine whether the 
     * credit card has a remainder of 0 or not.
     * @param none
     * @returns modAmount
     * @thorws none implemented
     */
    public int modulus(){
        return modAmount;
    }
 
}
