class Calc{
    public int add(int num1,int num2){
        return num1 + num2;
    }
    public int sub(int num1,int num2){
        return num1 - num2;
    }
}

class AdvCalc extends Calc{
    public int multi(int num1,int num2){
        return num1 * num2;
    }
}
public class inheritanceexmpl{
    public static void main(String a[])
    {  
        AdvCalc obj=new AdvCalc();
        int addition=obj.add(13,45);
        int subtraction=obj.sub(45,12);
        System.out.println(addition);
        System.out.println(subtraction);

 


    }
}