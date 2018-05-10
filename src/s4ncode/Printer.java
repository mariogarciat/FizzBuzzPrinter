package s4ncode;

/**
 *
 * @author andre
 */
public class Printer {
        
    //Fills a String array with data passed through add method, then return the array
    public String[] fill(String[] array){
        try {
            for(int i = 1; i <= array.length; i++) {
            array[i-1] = add(i);
        }
        } catch (NullPointerException e) {
            System.out.println("Invalid parameter, array is null");
        }
        return array;
    }
    
    //Prints the array passed as parameter
    public void print(String[] vect){
        if(vect == null) {
            System.out.println("Invalid parameter, array is null");
        }else if(vect.length == 0) {
            System.out.println("The array is empty");
        }else{
            for (String vect1 : vect) {
                System.out.println(vect1);
            }
        }
    }
    
    //Returns different String values depending what number is passed as parameter 
    //and if it is divisible by 3, 5, both of them or neither of them
    public String add(int i){ 
        if(isInt(i) && isNumber(i)){
            if(isDividedByThreeAndFive(i)){
                return "FizzBuzz";
            }else if(isDividedByThree(i)){
                return "Fizz";
            }else if(isDividedByFive(i)) {
                return "Buzz";
            }
            return String.valueOf(i);    
        }else{
            return "Invalid input";
        }
    }
    
    //Analyzes if x value is from int type
    public boolean isInt(double x){
        boolean flag= false;
        if(x%1 != 0){
            System.out.println("Number ins't int");
            return flag;
        }else{
            return flag = true;
        } 
    }
    
    //Analyzes if x value is a number
    public boolean isNumber(int x) {
        boolean flag= false;
        try {
            int d = x%1;
            return flag=true;
        } catch (NumberFormatException e) {
            System.out.println("Input ins't a number");
            return flag;
        }
    }
    
    //Returns true if x is divisible by 3
    public boolean isDividedByThree(int x){
        return x%3==0;
    }
    
    //Returns true if x is divisible by 5
    public boolean isDividedByFive(int x){
        return x%5==0;
    }
    
    //Returns true if x is divisible by 3 and 5
    public boolean isDividedByThreeAndFive(int x){
        return x%3==0 && x%5==0;
    }
    
}
