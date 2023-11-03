import java.util.Scanner;
public class userinput{

    public static void main(String a[])
    {

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the name");
        String name = obj.nextLine();
      
        System.out.println("Enter the Age");
        int age = obj.nextInt();

        System.out.println("your age is: "+age+" "+"your name is: "+name);

    }
}
