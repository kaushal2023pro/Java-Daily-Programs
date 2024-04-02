

public class TryCatch{
    public static void main(String[] args){
        try{
            // code that might throw an exception
            int result = 10 / 0;
            // this will throw an ArithmeticException
        }
        catch(ArithmeticException e){
            // Handling the exception
            System.out.println("An arithmetic exception occured: " + e.getMessage());
        }
    }
}



/*
    "division by zero" operation inside the try
    block throws an ArithmeticException. 

    The division by zero operation "10 / 0" is the
    line that might throw an "ArithmeticException".

    The catch block catches this exception,
    & the specified code within the catch block
    is executed to handle the exception,
    which in this case prints a message indicating 
    the occurence of an arithmetic exception.

    "e.getMessage()" : retrieves the detail message 
    associated with the "ArithmeticException" object "e",
    & it is concatenated with the string 
    "An arithmetic exception occured: "
    before being printed to the console. 
    This helps provide more context about the 
    exception that was caught. 

    Output : An arithmetic exception occured: / by zero
*/