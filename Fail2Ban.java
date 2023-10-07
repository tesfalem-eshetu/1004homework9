/*
     Tesfalem Eshetu
     te2320
     Fail2Ban.java  
*/
import java.io.*;
import java.util.*;

public class Fail2Ban{

// here in the main method i have included the possibililty of 
//FileNotFoundException using the first method we disccused in class

public static void main(String[] args)throws FileNotFoundException {

//instantiate a new PrintWriter object to print out to a file
//input in the first array of commandline argument

        PrintWriter outPut = new PrintWriter(args[1]);

//instantite a scanner aalong with file object to read input form 
//commandline argunemr of input 0

        File fileInput = new File(args[0]);
          
        Scanner in = new Scanner(fileInput);

//instantiate an arraylist of string to store the invalis ip adress form
//the input file
         ArrayList<String> ipInvalid = new ArrayList<>();

// create a while loop to check input from a file and used .split method 
//to create array of stringt from a given file
//which then is feed to the above to the arraylist of String provided
//above under the given conditions 

          while(in.hasNextLine()) {

           String line = in.nextLine();

           String[] words = line.split(" ");

           ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

//location of ipadress in the file ,when converted to string arrays        
           int IP_LOCATION_IN_STRING_ARRAY = 9;

                if(list.contains("Invalid")){ 

                    ipInvalid.add(list.get(IP_LOCATION_IN_STRING_ARRAY));
                }
           }

           //check point to see if we get the excpected reults.

           System.out.println(ipInvalid.size());

           ArrayList<String> duplicatelist = new ArrayList<>();

//for each elements of the @ipInavalid it will check if they appear more
//than 3 times 
           for(String element: ipInvalid){

                if(occurence(element,ipInvalid)>= 3){

//this helps to only print the unique ip adress , in non-repating fashion
//will check if they already appear in the list and if so it will add them

                if(!duplicatelist.contains(element)){

                    duplicatelist.add(element);
                     }
                }
          }
// this lor loop iterates through the @duplicatelist arraylist and 
//will print them on the provied output.txt file           
           for (int i = 0; i < duplicatelist.size();i++) { 

	          outPut.println(duplicatelist.get(i));		
	      }   

           outPut.close();

}
//create da method called occurence, thatr will keep track of how many 
//times an element of an array occured in an array list
          
   public static int occurence(String ip, ArrayList<String> ipArray ){
     
          int counter = 0;
          for(int i=0;i< ipArray.size();i++){

               if(ip.equals(ipArray.get(i))){
                counter++;
            }
        } 
          return counter;
}
}
