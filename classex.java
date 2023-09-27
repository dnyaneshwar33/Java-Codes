public class classex {
    int num1=11;
    int num2=13;
    int result;

    void perform()
    {
        result=num1+num2;
    }
    

public static void main(String[]args){

    classex obj=new classex();
    obj.perform();
    System.out.println(obj.result);

}
}
