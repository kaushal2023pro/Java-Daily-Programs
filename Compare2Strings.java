/*
Problem statement ->
"Compare 2 strings using 'equals()' function
which returns true if content of 2 string 
is same, else false."
*/

public class Compare2Strings{
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "world";
        String s3 = "Hello";

        boolean isEqual1 = s1.equals(s2);
        boolean isEqual2 = s1.equals(s3);
        System.out.println("s1 equal s2 : " + isEqual1);
        System.out.println("s1 equal s3 : " + isEqual2);
    }
}


// ### Code2  ###
// this code has no inbuilt function like "equals". Which we used above.
// created using if statements & Comparison operators. 

// public class Compare2{
//     public static void main(String[] args){
//         String string1 = "Hello";
//         String string2 = "World";  
//         String string3 = "Hello";  

//         // compare
//         if(string1 == string2){
//             System.out.println("string1 == string2");
//         }
//         if(string1 != string2){
//             System.out.println("string1 != string2");
//         }
//         if(string1 == string3){
//             System.out.println("string1 == string3");
//         }
//         if(string1 != string3){
//             System.out.println("string1 != string3");
//         }
//     }
// }