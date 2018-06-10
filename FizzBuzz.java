
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
    String start = "";
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String printLine(int number)
    {
        for(int x = 1; x <= number; x++){
        start += x + " ";
        }
        
        return start;
    }
    
    public String printFizzBuzz(int number){
    for(int x = 1; x <= number; x++){    
    if(x % 15 ==0)
    start +="FizzBuzz ";
    else if (x % 3 ==0)
    start +="Fizz ";
    else if (x % 5 ==0)
    start +="Buzz ";
    else 
    start += x + " ";
    }
    return start;
    }
}
