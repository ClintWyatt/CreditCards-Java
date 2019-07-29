import java.util.ArrayList;
/**
 * The ValidArray Class caccepts valid creditcard numbers from CreditCardDemo.
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 1.5.1
 */
public class ValidArray
{
    // instance variables - replace the example below with your own
    protected ArrayList<String> validList = new ArrayList<String>();

    /**
     * The ValidArray no-arg constructor sets the valid array list. 
     */
    public ValidArray(){
    
        validList = new ArrayList<String>();
    }

    /**
     * The setValidNumbers method accepts a string argument and adds it to the
     * valid array list. 
     * @param String str
     * @return none
     * @throws none implemented
     */
    public void setValidNumbers(String str){
      validList.add(str);  
    }
    
    /**
     * The getvalidList method returns the array, which is used in the CreditCardDemo
     * @param none
     * @returns invalidList
     * @throws none implemented
     */
     public ArrayList<String> getvalidList(){
        validList.clone(); //returns a shallow copy of this array
        
        return validList;
    }
  
    
    
}
