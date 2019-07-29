import java.util.ArrayList;
/**
 * The InvalidArray Class accepts valid creditcard numbers from CreditCardDemo.
 * Final Assignemnt: Mobius Duck
 * Class: Spring - COSC 1437.83003
 * Date: 05/07/18
 * @author Clint Wyatt
 * @version 1.0.8
 */
public class InvalidArray
{
    // instance variables - replace the example below with your own
    
    private ArrayList<String> invalidList = new ArrayList<String>();
    
    /**
     * The InvalidArray no-arg constructor sets the invalid array list.
     * @param none
     * @returns none
     * @throws none implemented
     */
    public InvalidArray()
    {
       invalidList = new ArrayList<String>();
       
    }
    
  
    /**
     * The setInvalidNumbers method accepts a string argument and adds it to the
     * invalid list array
     * @param String str
     * @return none
     * @throws none implemented
     */
    public void setInvalidNumbers(String str)
    {
        
        
        invalidList.add(str);
        
    }
    /**
     * The getinvalidList method returns the array, which is used in the CreditCardDemo
     * @param none
     * @returns invalidList
     * @throws none implemented
     */
    public ArrayList<String> getinvalidList(){
        invalidList.clone(); // will return a shallow copy
        
        return invalidList;
    }
    
}
