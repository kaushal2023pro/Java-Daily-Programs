// find out minimum maximum no in array.

public class MinMax{
    public static void main(String[] args){
        int[] numbers = {10,100,150,3000,500};
        int maxno = findLargestNumber(numbers);
        int minno = findSmallestNumber(numbers);
        System.out.println(maxno);
        System.out.println(minno);
    }

    public static int findLargestNumber(int[] arr){
        // validation
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Assume first number as maximum
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallestNumber(int[] arr){
        // validation
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Assume the first number as minimum
        int min = arr[0];
        for(int j=1; j<arr.length; j++){
            if(arr[j] < min){
                min = arr[j];
            }
        }
        return min;
    }
}


/*
1. We start by defining a public class named `MinMax`.

2. Inside the class, we define the main method, which serves as the entry point for the program. It initializes an array of integers named `numbers` with some example values.

3. We call a method named `findLargestNumber` and pass the `numbers` array to it. This method will find the largest number in the array.

4. The result from `findLargestNumber` is stored in a variable called `maxNumber`.

5. We print the result to the console, displaying the largest number found in the array.

6. After the main method, we define another method named `findLargestNumber`, which takes an array of integers as input and returns the largest number found in that array.

7. Inside `findLargestNumber`, we first check if the input array is empty or null. If it is, we throw an exception.

8. We initialize a variable named `max` with the first element of the array, assuming it's the maximum value.

9. We then iterate through the array starting from the second element and compare each element to the current maximum. If an element is greater than the current maximum, we update the maximum value.

10. After iterating through all elements, we return the maximum value found.

11. The program execution ends, and the `Main` class is closed.

*/
