public class exceptionhandling{

    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException ("you must be 18 year older");

        }
        else{
            System.out.println("Congrats ...You r eligible");
        }
    }


    public static void main(String a[])
    {
    //     int nums[]={1,2,3,4};
    //     try{
    //         System.out.println(nums[4]);
    //     }
    //     catch(Exception e){
    //         System.out.println("something went wrong" + e);
    //     }

    //     finally{
    //         System.out.println("print default");
    //     }

    //     System.out.println("bye");


     checkage(1);
    
    }
    
}