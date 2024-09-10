import java.util.*;

public class linandbinque{

    // public static int sqrt(int n){
    //     double a=(Math.sqrt(n));
    //     int b=(int)a;
    //     return b;
    // }
    // public static void main(String args[]){
    //     int n=sqrt(8);
    //     System.out.println(n);
    // }

    // public static int highorlow(int a,int n){
    //     if(a==n){
    //         return 0;
    //     }
    //     else if(a<n){
    //         return -1;

    //     }
    //     else{
    //         return 1;
    //     }
    // }


    // public static void main(String args[]){
    //     int a=highorlow(2, 6);
    //     System.out.println(a);

    // }



    // public static int twosum(int arr[],int target){
    //     int start=0,end=arr.length-1;
    //     while(start<=end){
    //         for(int i=0;i<arr.length-1;i++){
    //             for(int j=i+1;j<arr.length-1;j++){
    //                 if(arr[i]+arr[j]==target){
    //                     return i;
    //                 }
    //             }
    //         }
    //         }
    //         return -1;
    //     }

    // public static void main(String[] args) {
    //     int arr[]={2,7,11,14,16,17};
    //     int target=13;
    //     int n=twosum(arr,target);
    //     System.out.println(n);
    // }

    // public static int[] twosum(int arr[],int target){
    //     int first=0;
    //     int last=arr.length-1;
    //     int sum=arr[first]+arr[last];
    //     if(sum==target){
    //         return new int[]{first,last};
    //     }
    //     else if(sum>target){
    //         last--;
    //     }
    //     else{
    //         first++;
    //     }
    //     return null;
    // }
    // public static void main(String args[]){
    //     int arr[]={2,4,6,8,10};
    //     int target=12;
    //     int[] n=twosum(arr, target);
    //     System.out.println(n);
    // }




    /* Array and bin question  */

    // public static int binarysearch(int arr[],int target){
    //     int start=0,end=arr.length-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         //int mid=(start+end)/2;// it may exced by the range //
            
    //         if(target>arr[mid]){
    //             start=mid+1;
    //         }
    //         else if(target<arr[mid]){
    //             end=mid-1;
    //         }
    //         else if(target==arr[mid]){
    //            return mid;
    //         }
            
    //     } 
    //     return arr[start];
    //     // for get the floor we use arr[end]
    // }
    // public static void main(String[] args) {
    //     int arr[]={2,4,5,6,8,10};
    //     int target=9;
    //     int ans=binarysearch(arr, target);
    //     System.out.println(ans);
    // }


    // public static char smallleterrs(char arr[],char target){
        // int start=0,end=arr.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     //int mid=(start+end)/2;// it may exced by the range //
            
        //     if(target>arr[mid]){
        //         start=mid+1;
        //     }
        //     else if(target<arr[mid]){
        //         end=mid-1;
        //     }
        //     }
        //     return arr[start%arr.length];
            
        // }
    //     // for get the floor we use arr[end]
    // public static void main(String[] args) {
    //     char arr[]={'c','d','f'};
    //     char target='a';
    //     char ans=smallleterrs(arr,target);
    //     System.out.println(ans);
    // }


    // question 4 first and last postion

    // public static int[] searchRange(int[] nums,int target){
    //     int[] ans={-1,-1};
    //     int start=search(nums, target, true);
    //     int end=search(nums, target, false);
    //     ans[0]=start;
    //     ans[1]=end;

    //     return new int[] {ans[0],ans[1]};        
    // }
    // // this function just returns thr index value of target
    // public static int search(int [] nums,int target,boolean findStartIndex){
    //     int ans=-1;
    //     int start=0,end=nums.length-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;            
    //         if(target>nums[mid]){
    //             start=mid+1;
    //         }
    //         else if(target<nums[mid]){
    //             end=mid-1;
    //         }
    //         else {
    //             ans=mid;
    //             if(findStartIndex){
    //                 end=mid-1;
    //             }
    //             else{
    //                 start=mid+1;
    //             }
    //         }
    //     }
    //     return ans;

    // }

    // public static void main(String[] args) {
    //     int[] nums={2,4,5,7,7,7,7,8,8};
    //     int target=7;
    //     int[] arr=searchRange(nums,target);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }




    // public static int binininfinity(int[] arr,int target,int start,int end){
    //     while(start<=end){
    //         int mid=start+(end-start)/2;    
    //         if(target>arr[mid]){
    //             start=mid+1;
    //         }
    //         else if(target<arr[mid]){
    //             end=mid-1;
    //         }
    //         else if(target==arr[mid]){
    //            return mid;
    //         }
    //     }
    //     return 1;
    // }
    // static int ans(int[] arr,int target){
    //     //first find the range
    //     int start=0;
    //     int end=1;

    //     //condition for the target to lie in the range
    //     while(target>arr[end]){
    //         int temp=end+1;
    //         //double the box value
    //         /// end=previous end +size of box 
    //         end=end + (end-start+1)*2;
    //         start=temp;
    //     }
    //     return binininfinity(arr, target, start, end);

    // }



    // public static void main(String[] args){
    //     int [] arr={3,5,9,10,90,400,700,8000};
    //     int target=5;
    //     System.out.println(ans(arr, target));
        
    // }


    // build array from permutation

    // public static void permutation(int nums[]){
        // int[] arr =new int [nums.length];
        // for(int i=0;i<nums.length-1;i++){
        //     arr[i]=nums[nums[i]];
        // }
        // System.out.println(arr);
    // }
    // public static void main(String[] args) {
    //     int[] nums={0,2,1,5,3,4};
    //     permutation(nums);
    // }


    // public static void con(int []nums){
    //     int n=(nums.length*2)-1;
    //     int l=nums.length-1;
    //     int[] arr=new int[(nums.length*2)-1];
    //     for(int i=0;i<=nums.length-1;i++){
    //         arr[i]=nums[i];
    //         arr[i+l]=nums[i];
    //     }
    //     System.out.println(arr);
    // }

    // public static void main(String[] args) {
    //     int[] nums={1,2,1};
    //     con(nums);
    // }


    // public static int[] run(int[] nums){
    //     int[] arr=new int[nums.length];
    //     for(int i=0;i<=nums.length-1;i++){
    //         int sum=0;
    //         for(int j=0;j<=i;j++){
    //             sum=sum+nums[j];
    //         }
    //         arr[i]=sum;
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     int[] nums={1,2,3,4};
    //     int[]ans=run(nums);
    //     System.out.println(ans);
    // }



    // public static int wealth(int[][] arr){
        // int max=Integer.MIN_VALUE;
        // for(int rows=0;rows<arr.length;rows++){
        //     int sum=0;
        //     for(int col=0;col<arr[rows].length;col++){
        //         sum=sum+arr[rows][col];
        //         if(sum>max){
        //             max=sum;
        //         }
        //     }
        // }

        // return max;
    // }
    // public static void main(String[] args) {
    //     int[][] arr ={{1,5},{1,23},{13,5}};
    //     int ans=wealth(arr);
    //     System.out.println(ans);
    // }


    // public static int[] shuffle(int[] nums,int n){
    //     int[] arr=new int[nums.length];
    //     for(int i=1;i<=n;i++){
    //         arr[i]=nums[i];
    //         arr[i+n]=nums[i+n];

    //     }
        
    // }

// Numbers of good pair
// public static int pairs(int[] nums){
//     int count=0;
//     for(int i=0;i<=nums.length-1;i++){
//         for(int j=0;j<=nums.length-1;j++){
//             if((nums[i]==nums[j]) && (i<j)){
//                 count++;
//             }
//         }
//     }
//     return count;
// }
// public static void main(String[] args) {
//     int[] nums={1,2,3,1,1,3};
//     int ans=pairs(nums);
//     System.out.println(ans);
    
// }


// Smaller than current

// public static int[] small(int[] nums){
//     int[] arr=new int[nums.length];
//     for(int i=0;i<=nums.length-1;i++){
//         int count=0;
//         for(int j=1;j<=nums.length-1;j++){
//             if(nums[j]<nums[i]){
//                 count++;
//                 arr[i]=count;
//             }
//         }
//     }
//     return arr;

// }
// public static void main(String[] args) {
//     int[] nums={7,1,2,2,3};
//     int[] ans=small(nums);
//     System.out.println(ans);
// }


// public static boolean pangram(String sentence){
    // for( int i=0;i<sentence.length-1;i++){
    //     if(sentence.charAt(i).)
    // }
// }

// public static void main(String[] args) {
    
// }


// highrst altitude
// public static int height(int[] gains){
//     int[] arr=new int[gains.length+1];
//     arr[0]=0;
//     int sum=0;
//     for(int i=0;i<gains.length-1;i++){
//         sum=sum+gains[i];
//         arr[i+1]=sum;
//     }
//     int max=Integer.MIN_VALUE;
//     for(int j=0;j<arr.length-1;j++){
//         if(arr[j]>max){
//             max=arr[j];
//         }
//     }
//     return max;
// }
// public static void main(String[] args) {
//     int[] gains={-4,-3,-2,-1,4,3,2};
//     int ans=height(gains);
//     System.out.println(ans);
    
// }


// public static void main(String[] args) {
//     int m=1;
//     int i=1;
//     while(m<=5){
//         m=m*i;
//         i++;
//     }
//     System.out.println();
//     System.out.println(m/i-1);
// }






/* even no in array */
// public static int[] count(int[] arr){
//     int [] cou=new int[arr.length];
//     for(int i=0;i<arr.length;i++){
//         int n=arr[i];
//         int count=0;
//         while(n>0){
//             n=n/10;
//             count++;
//         }
//         cou[i]=count;    
//     }
//     return cou;
// }
// public static int Evenno(int[] arr){
//     int[] click=count(arr);
//     int c=0;
//     for(int i=0;i<click.length;i++){
//         if(click[i]%2==0){
//             c++;
//         }
//     }
//     return c;
// }
// public static void main(String[] args) {
//     int[] arr={12,345,2,6,7896};
//     int ans= Evenno(arr);
//     System.out.println(ans);
// }


// 


/* Transpose matrixnjmnmjnjm */

// public static void main(String[] args) {
    // int [][] arr=new int[3][3];
    // Scanner input=new Scanner(System.in);            
    // for( int row=0;row<arr.length;row++){
    // for(int col=0;col<arr[row].length;col++){
    //         arr[row][col]=input.nextInt();
    //         }
    //     }
//     for( int row=0;row<arr.length;row++){
//         for(int col=0;col<arr[row].length;col++){
//                 System.out.print(arr[col][row]+"");
//                 }
//             System.out.println();

//         }
// }



// Add to array 

// public static int add(int[] nums){
//     int sum=0;
//     int k=34;
//     for(int i=0;i<nums.length;i++){
//         int n=nums[i];
//         sum=10*sum+n;
//     }
//     return sum+k;
// }
// public static int[] convert(int[] nums){
//     int ans=add(nums);
//     int[] arr=new int[4];
//     int i=3;
//     while(ans>0 &&i>=0){
//         int k=ans%10;
//         arr[i]=k;
//         ans=ans/10;
//     }
//     return arr;
    
// }

// public static void main(String[] args) {
//     int[] nums={1,2,0,0};
//     int ans=add(nums);
//     int[] arr=convert(nums);
//     System.out.print(arr);
// }


// public static void main(String[] args) {
//     int sum=0;
//     int[] arr=new int[5];
//     for(int i=0;i<5-1;i++){
//         sum+=i;
//         arr[i]=i;
//     }
//     arr[5-1]=-1*sum;
//     for(int j=0;j<arr.length;j++){
//         System.out.print(arr[j]+" ");
//     }
// }



// public static void main(String[] args) {
//     int [][] arr=new int[3][3];
//     Scanner input=new Scanner(System.in);            
//     for( int row=0;row<arr.length;row++){
//     for(int col=0;col<arr[row].length;col++){
//             arr[row][col]=input.nextInt();
//             }
//         }
    
//     int minx=Integer.MIN_VALUE;
//     int[] cn=new int[arr.length];
//     for( int row=0;row<arr.length;row++){
//         for(int col=0;col<arr[row].length;col++){
//             if(arr[row][col]>max){
//                 max=arr[row][col];
//             }
//             cn[row]=max;
//             }
//         }
//     int min=Integer.MAX_VALUE;
//     int[] ck=new int[arr.length];
//     for( int row=0;row<arr.length;row++){
//         for(int col=0;col<arr[row].length;col++){
//             if(arr[col][row]<min){
//                 min=arr[col][row];
//             }
//             ck[row]=min;
//             }
//         }
//     for(int i=0;i<cn.length;i++){
//         System.out.print(cn[i]+" ");
//     }
// }




    /*road trips  */
    // public static void main(String[] args) {
        // int[] altitude={-4,-3,-2,-1,4,3,2};
        // // int sum=0;
        // // int max=0;
        // // for(int i=0;i<altitude.length;i++){
        // //     sum=sum+altitude[i];
        // //     if(sum>max){
        // //         max=sum;
        // //     }
        // // }
    //     // // System.out.println(max);
    // }



    /* add one */
    // public static void main(String[] args) {
    //     int[] arr={9,8,7,6,5,4,3,2,1,0};
    //     long LargeInteger=0;
    //     long[] nums= new long[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         LargeInteger=LargeInteger*10+arr[i];
    //     }
    //     long k=LargeInteger+1;
    //     long newk=k;
    //     int count=0;
    //     while(k>0){
    //         k=k/10;
    //         count++;
    //     }
    //     System.out.println(count);
    //     for(int i=count-1;i>=0;i--){
    //         long m=newk%10;
    //         nums[i]=m;
    //         newk=newk/10;
    //         System.out.println(nums[i]);
    //     }
        
    // }\


/*product of array except self */

    // public static int[] product(int[] nums){
    //     int [] arr=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int pro=1;
    //         for(int j=0;j<nums.length;j++){
    //             if(j!=i){
    //                 pro=pro*nums[j];
    //             }

    //         }
    //         arr[i]=pro;
    //     }
    //     return arr;
    // }



    // public static void main(String[] args) {
    //     int[] nums={1,2,3,4};
    //     int [] arr=product(nums);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }


    /* Rotate array */
    // public static int[] rotate(int[] nums,int target){
    //     int[] arr=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         if(target+i<nums.length){
    //             arr[i]=nums[target+i];
    //         }
    //         else{
    //             arr[i]=nums[i-target];
    //         }
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     int[] nums={1,2,3,4,5,6,7};
    //     int target=3;
    //     int[] arr=rotate(nums, target);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }


    // static void selection(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         // find the max item in the remainig array
    //         int last =arr.length-i-1;
    //         int maxIndex=getMaxIndex(arr,0,last);
    //         swap(arr,maxIndex,last);
    //     }
    // }
    // private static int getMaxIndex(int[] arr,int start,int end){
    //     int max=start;
    //     for(int i=start;i<=end;i++){
    //         if(arr[max]<arr[i]){
    //             max=i;
    //         }
    //     }
    //     return max;
    // }
    // static void swap(int[] arr,int first,int second){
    //     int temp=arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;
    // }

    // public static void main(String[] args) {
    //     int[] arr={0,2,1,2,2,1,0,0};
    //     selection(arr);
    //     System.out.println(Arrays.toString(arr));
    // }

//     public static int mySqrt(int x) {
//         int start=1;
//         int end=x;
//         int ans=0;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(mid*mid==x){
//                 ans=mid;
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
                
//             }
//         }
//         return ans;

        
// }

//     public static void main(String[] args) {
//         int x=4;
//         int ans=mySqrt(x);
//         System.out.println(ans);

//     }


// public static  void main(String[] args) {
//     int nums=28;
//     int sum=0;
//     int temp=nums;
//     for(int i=1;i<nums;i++){
//         if(nums%i==0){
//             sum=sum+i;
//         }
//     }
//     if(sum==temp){
//         System.out.println("yes");
//     }
//     else{
//         System.out.println("no");
//     }
// }



public static void main(String[] args) {
    int[] nums={1,2,3,1};
    int start=1;
    int ans=0;
    int end=nums.length-2;
    while(start<=end){
        int mid=start +(start-end)/2;
        if(nums[mid]>nums[mid-1]&&nums[mid+1]<nums[mid]){
            ans=mid;
        }
        if(nums[mid]>nums[mid-1]) start=mid+1;
        else {
            start=mid+1;
        }

    }
    System.out.println(ans);
    
}








}





    










































    








    


