import java.util.*;


public class array {
    // public static void update(int marks[]) {
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;
    //     }
    // }
    // public static void main(String args[]){
    //     int marks[]={2,3,4};
    //     update(marks);

    //     for(int i=0;i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }

// linear Search 

// public static int linearSearch(int numbers[],int key){
//     for(int i=1;i<numbers.length;i++){
//         if (numbers[i]==key){
//             return i;
//         }
//     }
//     return -1;    
// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10,12,14,16};
//     int key=11;
//     int index=linearSearch(numbers,key);
//     if (index==-1){
//         System.out.println("Not found");
//     }
//     else{
//         System.out.println("key is at index => "+index);
//     }

// }


/// largest numbers
// public static int getlargest(int numbers[]){
//     int largest=Integer.MIN_VALUE;// - infinity
//     int smallest=Integer.MAX_VALUE;//
//     for(int i=0;i<numbers.length;i++){
//         if(largest<numbers[i]){
//             largest=numbers[i];
//         }
//         if(smallest>numbers[i]){
//             smallest=numbers[i];
//         }
//     }
//     System.out.println("smallest value is => "+smallest);
//     return largest;

// }

// public static void main(String[] args) {
//     int numbers[]={1,2,49,58,6,7,8};
//     int larger_no=getlargest(numbers);
//     System.out.println("largest no is +>  "+larger_no);
// }


/// *** BInary search///

// public static int binarysearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;
//     while(start<=end){
//         int mid =(start+end)/2;
//         if (numbers[mid]==key){
//             return mid;
//         }
//         else if (numbers[mid]<key){  // right 
//             start=mid+1;
//         }
//         else{//else
//             end=mid-1;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10,12,14};
//     int key=10;
//     int here=binarysearch(numbers, key);
//     System.out.println("index of the key is here => "+here);
// }


/// ***  reverse an array
// public static void reverse(int numbers[]){
//     int first =0,last=numbers.length-1;
//     while (first<last){
//         //swap
//         int temp=numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;
//     }
// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10};
//     reverse(numbers);
//     for (int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//     }
//     System.out.println();
// }


/// **** pairs in array
// public static void pairs(int number[]){
//     int tp=0;
//     for (int i=0;i<number.length;i++){
//         int curr=number[i];
//         for(int j=i+1;j<number.length;j++){
//             System.out.print(("("+curr+","+number[j]+")"));
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total numbers of pairs => "+tp);
// }
// public static void main(String[] args) {
//     int number[]={2,4,6,8,10};
//     pairs(number);
// }


/// *** subarray in arrays
// public static void subarray(int numbers[]){
//     for (int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             int sum=0;
//             for(int k=start;k<=end;k++){
//                 sum=sum+numbers[k];
//                 System.out.print(numbers[k]+" ");
//             }
//             System.out.print("sum is"+sum);
//             System.out.println();
//         }
//         System.out.println();
//     }
//     System.out.println();

// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10};
//     subarray(numbers);
// }

// ** maximum sum array
// public static void maxsub(int numbers[]){
//     int maxsum=Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         for(int j=i;j<numbers.length;j++){
//             int sum=0;
//             for(int k=i;k<=j;k++){
//                 // System.out.print(numbers[k]+" ");
//                 sum=sum+numbers[k];
//             }
//             System.out.println(sum);
//             if(maxsum<sum){
//                 maxsum=sum;
//             }
//         }
//     }
//     System.out.println("the maximum sum of subarrays =   "+maxsum);
// }
// public static void main(String[] args) {
//     int numbers[]={1,-2,6,-1,3};
//     maxsub(numbers);
// }

//// ** prefix array
// public static void maxsub(int numbers[]){
//     int maxsum=Integer.MIN_VALUE;
//     int currsum=0;
//     int prefix[]=new int[numbers.length];
//     prefix[0]=numbers[0];
    // prefix array
//     for(int i=1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1]+numbers[i];
//     }
//     for(int i=0;i<numbers.length;i++){
//         for(int j=i;j<numbers.length;j++){
//             currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
//             if (maxsum<currsum){
//                 maxsum=currsum;
//             }
//           }
//         }
//         System.out.println("the maximum sum of subarrays =   "+maxsum);
//     }
// public static void main(String[] args) {
//     int numbers[]={1,-2,6,-1,3};
//     maxsub(numbers);
// }


/// sum of sub array by kadane's algorithm

// public static void kadanes(int numbers[]){
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
//     for (int i=0;i<numbers.length;i++){
//         cs=cs+numbers[i];
//         if (cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs,ms);
//     }
//     System.out.println("our maximum element is =  "+ms);

// }
// public static void main(String[] args) {
//     int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//     kadanes(numbers);
    
// }


//*** Rain water trapped  */

// public static int trapped(int numbers[]){
//     int leftmax[]=new int[numbers.length];
//     leftmax[0]=numbers[0];
//     for(int i=1;i<numbers.length;i++){
//         leftmax[i]=Math.max(numbers[i],leftmax[i-1]);
//     }
//     int rightmax[]=new int[numbers.length];
//     rightmax[numbers.length-1]=numbers[numbers.length-1];
//     for(int i=numbers.length-2;i>=0;i--){
//         rightmax[i]=Math.max(rightmax[i+1],numbers[i]);
//     }
//     int trappedwater=0;
//     for(int i=0;i<numbers.length;i++){
//         int waterlevel=Math.min(leftmax[i],rightmax[i]);
//         trappedwater += waterlevel-numbers[i];
//     }
//     return trappedwater;
// }

// public static void main(String[] args) {
//     int numbers[]={4,2,0,6,3,2,5};
//     System.out.print(trapped(numbers));
// }



/// *** buy or sell stock
// public static int besttime(int prices[]){
//     int buyprice=Integer.MAX_VALUE;
//     int maxprofit=0;
//     for(int i=0;i<prices.length;i++){
//         if(buyprice<prices[i]){
//             int profit=prices[i]-buyprice;
//             maxprofit=Math.max(maxprofit,profit);

//         }
//         else{
//             buyprice=prices[i];
//         }
//     }
//     return maxprofit;

// }
// public static void main(String[] args) {
//     int prices[]={7,1,5,3,6,4};
//     System.out.println(besttime(prices));
    
// }






}




