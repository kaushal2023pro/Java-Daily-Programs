/*
    Enhanced for Loop - also known as for each loop
    it iterates over arrays or collections.
*/

public class EnhancedForLoop{
    public static void main(String[] args){
        int[] numbers = {10,20,100,20,40};

        // using enhanced for loop
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}

/*  int num : declares a variable "num" of type "int". 
    This variable will hold each element of
    the array "numbers" during each iteration 
    of loop.
*/