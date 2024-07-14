import java.util.Scanner;

public class pattern {
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     int n=input.nextInt();
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();


        //////////////////////Inverted triangle//////////////////


        // for (int i=n;i>=1;i--){
        //     for (int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //////////////////  Half Pyramid /////////////////////////

        //  for (int i=1;i<=n;i++){
        //      for (int j=1;j<=i;j++){
        //         System.out.print(j);
        //      }
        //      System.out.println();
            
        // }




        /////  Character Pattern /////
        // char ch='A';
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    //     }

/// ** Hollow Reactangle **//
    // public static void hollow_rectangle(int trows,int tcols){
    //     for (int i=1;i<=trows;i++){
    //         //inner _coloumns
    //         for (int j=1;j<=tcols;j++){
    //             //cell -(i,j)
    //             if(i==1||i==trows||j==1||j==tcols){
    //                 System.out.print("*");

    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args) {
    //     Scanner input= new Scanner(System.in);
    //     hollow_rectangle(4,5);
    //     }

    /// ** inverted and rotated half ////

    // public static void inverted(int n){
    //     for (int i=1;i<=n;i++){
    //         for (int j=1;j<=n-i;j++){
    //             System.out.print("#");
    //         }
    //         for (int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     inverted(5);
    // }



    /// inverted half pyramid with no///

    // public static void no_pyramid(int n){
    //     for(int i=1;i<=n;i++){
    //         int c=1;
    //         for(int j=1;j<=n+1-i;j++){
    //             System.out.print(j+" ");
    //             c++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     no_pyramid(5);
    // }

    // ** 01 triangle pattern//

    // public static void no_triangle (int n){
    //     for (int i=1;i<=n;i++){
    //         for (int j=1;j<=i;j++){
    //             if ((i+j)%2==0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     no_triangle(5);
    // }

    // *** Floyd's Triangle

    // public static void f_triangle(int n){
    //     int c=1;
    //     for (int i=1;i<=n;i++){
    //         for (int j=1;j<=i;j++){
    //             System.out.print(c+" ");
    //             c++;
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     f_triangle(5);
    // }

    // *** solid rhombus ////
    // public static void rhombus(int n){
    //     for (int i=1;i<=n;i++){
    //         for (int j=1;j<=n-i+1;j++){
    //             System.out.print(" ");
    //         }
    //         for (int j=1;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }

    // public static void main(String[] args) {
    //     rhombus(5);
    // }


    // ** hollow rhombus **///
    // public static void h_rhombus(int n){
    //     for (int i=1;i<=n;i++){
    //         for (int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for (int j=1;j<=n;j++){
    //             if (i==1||i==5||j==1||j==5){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args) {
    //     h_rhombus(5);
    // }


    /// *** Diamond Pattern *** ////
    public static void diamond(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("#");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            } 
        
        

           System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(5);
    }









}



    

