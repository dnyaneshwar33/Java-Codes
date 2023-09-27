import java.util.Collections;
public class arryexmple{

    public static void main(String a[])
    {
    // {
    //     int mynum[]={10,20,30};
    //     for(int i=0;i<mynum.length;i++)
    //     {
        
    //     System.out.println("Array index is:" + i + " The number is:" + mynum[i]);
        
    //     }
    //     System.out.println("Length of array is:" + mynum.length);
    // }
    // int mynumbers[][]={{2,4,5,6,9},{5,8,9,3}};

    // for(int i=0;i<mynumbers.length;i++)
    // {
    //     for(int j=0;j<mynumbers[i].length;j++)
    //     {
    //         System.out.print(mynumbers[i][j]);
    //     }
    //     System.out.println(" ");
        
    // }

     int mynums[]={3,5,6,8,3};

     Collections.sort(mynums);

    for (int i : mynums) {
      System.out.println(i);
    }
     }
}