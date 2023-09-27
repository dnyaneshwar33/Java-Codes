class calculator{
    public int add(int n1,int n2)
    {
        
        int r=n1+n2;
        return r;
    }
    public int mult(int n1,int n2)
    {
        int res=n1*n2;
        return res;
    }
}
public class objdemo
{
public static void main(String a[])
{
    // int num1=4;
    // int num2=5;
     
     calculator calc =new calculator();
     int addition=calc.add(3,5);
     System.out.println("addition is:" + addition);
     int multiplication=calc.mult(3,5);
     System.out.println("multiplication is:" + multiplication);
}
}