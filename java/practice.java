import java.util.Scanner;
import java.util.*;

public class practice {


    // public static void main(String[] args){
    // Scanner input=new Scanner(System.in);


    //Even and odd no;;;;;

    // System.out.print("Please enter the no::");
    // int a=input.nextInt();
    // if (a%2==0){
    //     System.out.println("This no is even no => "+a);
    // }
    // if (a%2!=0){
    //     System.out.println("Given no is odd no => "+a);
    // }


    // System.out.print("Plese enter your name coder => ");
    // String a=input.nextLine();
    // System.out.println("Hello welcome to the world of the java "+a);




    // System.out.print("Enter the No you want ::");
    // int a=input.nextInt();
    // int b=input.nextInt();
    // System.out.print("Plese enter the opertor you want(+,-,*,/) => ");
    // char c=input.next().charAt(0);
    // if (c=='+'){
    //     System.out.println("The opertor is of sum then your answer => "+(a+b));
    // }
    // else if (c=='*'){
    //     System.out.println("The opertor is of sum then your answer => "+(a*b));
    // }
    // else if (c=='/'){
    //     System.out.println("The opertor is of sum then your answer => "+(a/b));
    // }
    // else if (c=='-'){
    //     System.out.println("The opertor is of sum then your answer => "+(a-b));
    // }


    ///Larger no 
    // Scanner input= new Scanner(System.in);
    // int a=input.nextInt();
    // int b=input.nextInt();
    // if (a>b){
    //     System.out.println("A is bigger no "+a);
    // }
    // else{
    //     System.out.println("B is bigger no "+b);
    // }

    //largest three no
    // int a=input.nextInt();
    // int b=input.nextInt();
    // int c=input.nextInt();
    // if ((a>b) && (a>c)){
    //     System.out.println("A is greater no "+a);
    // }
    // else if((b>a)&&(b>c)){
    //     System.out.println("B is greater no "+b);
    // }
    // else{
    //     System.out.println("C is greater no "+c);
    // }
     

    ////////////// Factorial of no //////////
    // int n=input.nextInt();
    // int product=1;
    // for (int i=1;i<=n;i++){
    //     product =product*i;
    // }
    // System.out.println(product);

    /////// Table of no   //////
    // int n =input.nextInt();
    // for (int i=1;i<=10;i++){
    //     System.out.println(n*i);
    // }

    ///// type of no/////

    // int n=input.nextInt();
    // if (n>0){
    //     System.out.println("pos");
    // }
    // else if(n==0){
    //     System.out.println("zero");
    // }
    // else{
    //     System.out.println("negative");
    // }

    // int n=input.nextInt();
    // switch (n) {
    //     case 1:
    //       System.out.println("Monday");
    //       break;
    //     case 2:
    //       System.out.println("Tue");
    //       break;
    //     case 3:
    //       System.out.println("wednesday");
    //       break;
    //     case 4:
    //       System.out.println("Thusday");
    //       break;
    //     case 5:
    //       System.out.println("FRiday");
    //       break;
    //     case 6:
    //       System.out.println("Saturday");
    //       break;
    //     case 7:
    //       System.out.println("Sunday");
    //       break;  
    // }

    // int ye=input.nextInt();
    // boolean x=(ye%4==0);
    // boolean y=(ye%100!=0);
    // boolean z=((ye%100==0) && (ye%400==0));

    // if (x&&(y||z)){
    //     System.out.println("leap year");

    // }
    // else{
    //     System.out.println("Not a leap year");
    // }

    // ////// multiply in function //////


    // public static int multiply(int num1,int num2){
    //     int multiply=num1*num2;
    //     return multiply;
    // }
    // public static void main(String[] args) {
    //     Scanner input =new Scanner (System.in);
    //     int a=input.nextInt();
    //     int b=input.nextInt();
    //     int product=multiply(a, b);
    //     System.out.println("Product is = "+product);

    // }


    ////////////////////   Factorial of no by function ////////////////

    // public static int factorial(int num1){
    //     int pro=1;
    //     for (int i=1;i<=num1;i++){
    //         pro=i*pro;
    //     }
    //     return pro;
    // }
    // public static void main(String[] args) {
    //     Scanner input =new Scanner(System.in);
    //     int a=input.nextInt();
    //     int fact=factorial(a);
    //     System.out.println("Factorial os a number is = "+fact);
    // }


    ////////////// Binomial Coefficient by function //////////////////
    // public static int factorial(int num1){
    //     int pro=1;
    //     for (int i=1;i<=num1;i++){
    //         pro=pro*i;
    //     }
    //     return pro;
    // }
    // public static int bincoff(int n ,int r){
    //     int nfact=factorial(n);
    //     int rfact=factorial(r);
    //     int nrfact=factorial((n-r));
    //     int bio=nfact/((rfact*nrfact));
    //     return bio;
        
    // }
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     int n=input.nextInt();
    //     int r=input.nextInt();
    //     int answer=bincoff(n,r);
    //     System.out.println("Binomial coffcient is = "+answer);
    // }


    //// Prime no or not using functiion /////

    // public static boolean isPrime(int n){
    //     if (n==2){
    //         return true;
    //     }
    //     boolean isPrime=true;
    //     for (int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             isPrime= false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPrime(2));
        
    // }


    /// Prime no in range ////
    // public static boolean isPrime(int n){
    //     if (n==2){
    //         return true;
    //     }
    //     boolean isPrime=true;
    //     for (int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             isPrime= false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }


    // public static void Prime_in_range(int n){
    //     for (int i=2;i<=n;i++){
    //         if (isPrime(i)){
    //             System.out.print(i+" ");
    //         }
            
    //     }
    // }
    // public static void main(String[] args) {
    //     Prime_in_range(10);
    // }



    ///////////////// Binary No to decimal ////////////////////
    // public static int bin_to_deci(int n){
    //     int sum=0;
    //     int pow=0;
    //     while(n>0){
    //         int lastdigit=n%10;
    //         sum +=lastdigit*Math.pow(2,pow);
    //         pow++;
    //         n=n/10; 

    //     }
    // //     for (int i=0;i<=4;i++){
    // //         int c=n%10;
    // //         sum+=Math.pow(2,i)*c;
    // //         n=n/10;

    // //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int sum=bin_to_deci(10100);
    //     System.out.println("Bin of given no is "+sum);
    // }



    //////////////// decimal to Binary ///////////////////////////

    // public static void dec_to_bin(int n){
    //     int pow=0;
    //     int binnum=0;
    //     while (n>0){
    //         int rem=n%2;
    //         binnum+=(rem*(int)(Math.pow(10,pow)));
    //         pow++;
    //         n=n/2;
    //     }
    //     System.out.println(binnum);
    // }

    // public static void main(String[] args) {
    //     dec_to_bin(7);
    // }



    /// array asssingment

    /* Q1 */
    // public static int twice(int numbers[]){
    //     int count=0;
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i+1;j<numbers.length;j++){
    //             if(numbers[i]==numbers[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // } 
    // public static void main(String[] args) {
    //     int numbers[]={1,2,3,4};
    //     int c=twice(numbers);
    //     if(c>=1){
    //         System.out.println("true");
    //     }
    //     else if(c<1){
    //         System.out.println("False");
    //     }
    // }


    /* Q2 */
public static void answer(){

}
public static void main(String[] args) {
    int nums[]={4,5,6,7,0,1,2};
}






}






    




    

    
   

