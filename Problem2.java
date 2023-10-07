/* Following the specification in the README.md file, provide your 
 * Problem2.java class.

 Tesfalem Eshetu
 te2320
 Problem2.java
 */
 import java.util.Scanner;
 import java.util.Arrays;
  public class Problem2{

//generic method implementing comparable 
public static <E extends Comparable<E>> int binarySearch(E[] x,
                         int startingIndex, int finsihIndex,E y){ 

//checks if the two indexies are equal or not to determine as a base case     
     if(startingIndex == finsihIndex){

          if(x[startingIndex].compareTo(y) == 0){

               return startingIndex;
                
          }else return -1;
     }

//instantiating importrant the mid point, using average
//optimized for over flow
           
     int midIndex =(startingIndex + (finsihIndex - startingIndex )/2);

// the if statment will do the binary searching by calling 
// the binary search method reccurively as needed

           if(x[midIndex].compareTo(y) == 0){
               return midIndex;

           } else if(x[midIndex].compareTo(y) > 0){
     
               return binarySearch(x ,startingIndex, midIndex-1, y);
                    
          } else if(x[midIndex].compareTo(y) < 0){
          
              return binarySearch(x , midIndex+1, finsihIndex, y);
          }
               return -1;       
}

     public static void main(String[] args){

// Scanners are use here to recive input from the user
//they are used to create the string array length and to
// feed it to the string array created 

     Scanner in= new Scanner(System.in);
     System.out.println("please enter how many strings you want to enter");

// used to limit and decide on the length of the array 

     String[] strings = new String[in.nextInt()];

     System.out.println("enter your string please"); 
          in.nextLine(); 

//for loop to feed the input to our string arrray @strings

          for (int i = 0; i < strings.length; i++)   
               {  
                    strings[i] = in.nextLine(); 
               }
          
//used to specify the string element to be located

          System.out.println("enter string you want to locate");
          String choice = in.nextLine();

          System.out.println("____________________");
          

//we call Array.sort incase the array is not sorted 
//prints sorted elements for the @strings array we created above 

          System.out.println("your input array sorted is :");
          Arrays.sort(strings);

          for(String i: strings){
               System.out.println(i);
          }
          System.out.println("____________________");
  //main execution of the binary search 

          System.out.println("It is located at index "
                + binarySearch(strings,0,strings.length-1,choice));
            
      } 
}

          