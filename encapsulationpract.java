class human{
    private int age;
    private String name;

    public void setAge(int a)
    {
       age=a;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String n)
    {
       name=n;
    }
    public String getName()
    {
        return name;
    }
}

public  class encapsulationpract{
    public static void main(String a[])
    {
      human man = new human();
      man.setAge(21);
      man.setName("VD");

      System.out.println("your age is:" +man.getAge() + " " +"your name is:"+ man.getName());

    }
}