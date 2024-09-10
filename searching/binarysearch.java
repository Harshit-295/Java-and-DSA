public class binarysearch {
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
    //     return -1;  
    // }
    // public static void main(String[] args) {
    //     int arr[]={2,4,5,6,8,10};
    //     int target=6;
    //     int ans=binarysearch(arr, target);
    //     System.out.println(ans);
    // }


    //find the array is sorted in ascending or not


    public static int Orderdiagonstics(int arr[],int target){
        int start=0,end=arr.length-1;
        boolean isArr=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            //int mid=(start+end)/2;// it may exced by the range //
            if(isArr){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
            if(target==arr[mid]){
               return mid;
            }
            
        } 
        return -1;  
    }
    public static void main(String[] args) {
        int arr[]={10,8,6,4,2};
        int target=6;
        int ans=Orderdiagonstics(arr, target);
        System.out.println(ans);
    }

    

}

