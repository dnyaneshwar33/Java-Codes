// import java.util.ArrayList;
// import java.util.Collections;
// public class javacollections{
//     public static void main(String a[]){


//         ArrayList<Integer> nums = new ArrayList<Integer>();
//         nums.add(9);
//         nums.add(45);
//         nums.add(99);
//         nums.add(34);
//         nums.add(455);
//         // for(int i=0;i<nums.size();i++){
//         //     System.out.println(nums.get(i));
//         // }
//         //sort arrays reverse order
//         // Collections.sort(nums,Collections.reverseOrder());
//         // for(Integer i:nums){
//         //     System.out.println(i);
//         // }
//         System.out.println(nums.size());
//         System.out.println(nums.get(3));
//         nums.set(3,65);
//         System.out.println(nums.get(3));    
//     }
// }

//sorting arraylist while taking user input
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class javacollections{
    public static void main(String a[]){


        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        System.out.println("Enter elements of array:");

        for(int i=0;i<n;i++){
            
            nums.add(sc.nextInt());
        }
        //sort arrays reverse order
        Collections.sort(nums,Collections.reverseOrder());
        // for(Integer i:nums){
        //     System.out.println("Sorted array is: "i);
        // }
        System.out.println("Sorted array is: "+ nums);
           
    }
}