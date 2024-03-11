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
