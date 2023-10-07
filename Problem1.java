/* Following the specification in the README.md file, provide your 
 * Problem1.java class.
Tesfalem Eshetu
 te2320
 Problem2.java
 */
 public class Problem1{

//the method reccursively calculates for x^n

    public static int pow(int x, int n){
         //base case 
         if(n == 1){

              return x;

         } else {
       //will recursively call the method itself untill best case
              return x*pow(x, n-1);
         }
    }

    public static void main(String[] args){
     // we use cmd argument to enter data
         int x = Integer.parseInt(args[0]);

         int n = Integer.parseInt(args[1]);
     // display the result of the computation
         System.out.println(pow(x,n));
    }
 }

