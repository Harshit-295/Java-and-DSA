public class linearsearch {

    // public static void main(String[] args) {
    //     int[]  nums={23,45,1,2,4,5,6};
    //     int target=9;
    //     int ans=linearSearch(nums, target);
    //     System.out.println(ans);

    // }
    // //search in the array;return the index if item found 


    // public static int linearSearch(int[] arr,int target){
    //     if(arr.length==0){
    //         return -1;
    //     }

    //     for(int element:arr){
    //         //check for element at evry index if it is=target
    //         // int element=arr[i];
    //         if (element==target){
    //             return element;
    //         }
    //     }
    //     return -1;
    // }



    /* Linear search in string */

    static boolean string(String str,char target){
        if(str.length()==0){
            return false;
        }
        // for(int i=0;i<str.length();i++){
        //     if(target==str.charAt(i)){
        //         return true;
        //     }
        // }
        for(char s:str.toCharArray()){
            if(target==s){
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        String name="Harshit";
        char target='k';
        System.out.println(string(name, target));
        
    }
}
