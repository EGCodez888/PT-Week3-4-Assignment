import java.util.Arrays;
import java.util.Scanner;


public class application {

  public static void main(String[] args) { {
    // TODO Auto-generated method stub

//1.create an array of int called ages that contains the following values:
    //3, 9 , 23, 64, 2, 8, 28, 93
   
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};
    
    for (int i = 0; i < ages.length; i++)
      
    System.out.println(ages[i]);
    
    
    
    
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
//    Print the result to the console. 
    
    int lastNumber = ages[ages.length -1];
    int total = lastNumber - ages[0];
   System.out.println(total);
    
   
    //b. Add a new age to your array and repeat the step above to 
    //   ensure it is dynamic (works for arrays of different lengths).

   
     int ageNumber = 0;
     for (int i = 0; i<ages.length; i++) {
      ageNumber += ages[i];
      
    }
     
     
    //c.Use a loop to iterate through the array and 
     //calculate the average age. Print the result to the console. 
     
     
     double averageAge = ageNumber/ages.length;
     System.out.println(averageAge + " is the average age");
//2. Create an array of String called names that contains the following values: 
     //“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
      
    String[] names = {"Sam" , "Tommy", "Tim", "Sally", "Buck" , "Bob"};
     
  
     
  //a. Use a loop to iterate through the array and calculate the average number of letters per name. 
    // Print the result to the console.
   
   int sumOfLetters = 0;
   for(String name : names) {
     sumOfLetters += name.length();
   }
   System.out.println(sumOfLetters/6);
   
  //b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
   //  and print the result to the console.
   
   
   String allNames = String.join(" ", names);
   System.out.println(allNames);
   
   
 //3. How do you access the last element of an array =
   
   //int lastNum = arrayName [arrayName.length - 1];
   
   
   
//4. HOw do you access the first element of an array =
   //int firstNum = arrayName[0];
   
   
   
//5. Create a new array of ints called nameLengths. Write a loop
  // to iterate over the previously created names array
  // and add the length of each name to the nameLengths array.
   
   int[] nameLengths = new int [7];
   int sum = names.length;
   
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all 
  // the elements in the array. Print the result to the console.
   
   for (int i = 0; i < 0; i++) {
     sum = sum + i;
   }
   System.out.println(sum);
   
   //System.out.println(Arrays.toString(names));
   
   
  
   
 //7. Using Write a method that takes a String, word, and an int, n, 
   // as arguments and returns the word concatenated to itself n number of times. 
   // (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
   
   System.out.println(myMethod1("Hello",3));
   
   
   //Method - Full Name
//8. Write a method that takes two Strings, firstName and lastName, and returns a 
  // full name (the full name should be the first and the last name as a String separated by a space).
   String firstName = "Dan";
   String lastName = "Anderson";
   String firstAndLast = fullName1(firstName, lastName);
   System.out.println(firstAndLast);
   
   
// 9. Write a method that takes an array of int and returns 
   // true if the sum of all the ints in the array is greater than 100
   
   int[] newArray = new int[7];
   newArray[0] = 80;
   newArray[1] = 15;
   newArray[2] = 10;
   newArray[3] = 30;
   newArray[4] = 140;
   
   
   
   
   System.out.println(booleanArray(newArray)); 
   
   
   
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
   
   double[] newDoubleArray = {30.11, 40.11, 50.11};
   
   System.out.println(doubleAverage(newDoubleArray)); 
   
   
   
  
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
   //is greater than the average of the elements in the second array.
   
  double[] array1 = {5, 3};
  double[] array2 = {1, 2};

  
  System.out.println(averageBooleanDouble(array1, array2));
  
  
 
  
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
  //moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
  //is greater than 10.50.

  
  double MoneyInPocket = 16.20;
  boolean isHotOutside = true;
  System.out.println(willBuyDrink(isHotOutside, MoneyInPocket));
  
  
  
  //Create a method of your own that solves a problem. 
  //In comments, write what the method does and why you created it.
  //Grade calculator. To determine the overall average of your grades. 
 
  {
  int[] myArray = new int[3];
  myArray[0] = 5;
  myArray[1] = 12;
  myArray[2] = 15;
  
  System.out.println(sumArray(myArray)); }}
  
  
double[] grades = new double[5];
  grades[0] = 85.2;
  grades[1] = 71.8;
  grades[2] = 82.9;
  grades[3] = 70.5;
  grades[4] = 91.7;
  
  System.out.println(calculateGrades(grades));
  }
  
  
  
  
  
  
 public static double sumArray(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
    
  }






public static double calculateGrades(double[] numbers) {
   double sum = 0;
   for (double number : numbers) {
     sum += number;
   }
   return sum / numbers.length;
 }

  

  
  
  
  
  public static boolean averageBooleanDouble(double[] array1, double[] array2) {
    
    double total1 = 0;
    for(double number1 : array1) {
      total1 += number1;
      double avg1 = total1/array1.length;
      double total2 = 0;
      for (double number2 : array2) {
        total2 += number2;
        double avg2 = total2/array2.length;
        
        if(avg1 > avg2) {
          return true;
        }
      }
    }
    return false;
    
    
  }
   
   




  
   
   
   //full name 
 public static String fullName1(String first, String last) {
     
     String name = first + " " + last;
     return name;
   }
   
 
 
 ////////////7.hellohellohello
 
 public static String myMethod1(String str, int num) {
   
   String result = "";
   for (int i=0; i<num; i++) {
     result += str;
   }
   return result;
 }
 
 
 
 //

  public static boolean booleanArray(int[] sum) {
    int total = 0;
    for(int number: sum) {
      total += number;
      if(total < 100) {
        return false;
      }
    }

    return true;
    

  }
  
  
//////////////
  public static double doubleAverage(double[] average) {
    double sum = 0;
    for (double value: average) {
      sum += value;
    }
    double avg = sum / average.length;
    
    return avg;
    
  }
  
  
////////////////
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
  
  if (moneyInPocket > 10.50 && isHotOutside == true) {
    return true;
  }
  else {
    return false;
  }
}
  
  
  
  
  
//////////////
  private static char[] myMethod(String string, int i) {
    // TODO Auto-generated method stub
    return null;
  }//end of main method

  
}//end of class
