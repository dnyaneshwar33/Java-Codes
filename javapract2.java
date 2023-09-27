//PRIINTING * PATTERN HAVING RECTANGLE SHAPE  

// public class javapract2{

//     public static void main(String args[])
//     {
//        for(int i=0;i<=4;i++){
//          for(int j=1;j<=5;j++)
//             System.out.print("*" );
//             System.out.println();
         
//        }
//     }
// }

//PRIINTING * PATTERN HAVING HOLLOW RECTANGLE SHAPE 

// public class javapract2{

//     public static void main(String args[])
//     {
//         int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//     }
// }

//HALF PYRAMID
// public class javapract2{
//     public static void main(String args[]){
//     int n = 5;
      
//        for(int i=0; i<=n; i++) {
//            for(int j=0; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
          
//        }
        


//     }
// }

//inverted half pyramid
public class javapract2{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=4;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}

