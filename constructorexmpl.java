class human{
      int age;
      String name;

    public human(int a,String n)
    {
       age=a;
       name=n;
    }
}

public class constructorexmpl{
    public static void main(String a[])
    {
       human obj1 = new human(12,"john");
       System.out.println(obj1.age);
        System.out.println(obj1.name);
    }
}