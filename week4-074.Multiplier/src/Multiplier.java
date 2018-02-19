/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laurent
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int number){
        this.number = (number);
        }
    
    public int multiply(int otherNumber){
        return (otherNumber*number);
        
    }
    
}
/*
SOLUTION-TYPE :
public class Multiplier {
    private int ownNumber;
    public Multiplier(int number) {
        this.ownNumber = number;
    }
    public int multiply(int otherNumber) {
        return this.ownNumber * otherNumber;
    }
}
*/