// abstract class animal{
//     public abstract void wild();
// }

// class pig extends animal{
//     public void wild(){
//         System.out.println("Animal barks");
//     }
// }


// public class abstractdemo{
//     public static void main(String a[])
//     {
//        pig dog =new pig();
//        dog.wild();
//     }
// }


//lets try interface

// interface computer{
//     void devlop();
// }

// interface desktop{
//     void show();
// }
// class laptop implements desktop,computer{
//     public void devlop(){
//         System.out.println("coding");
//     }
//     public void show(){
//         System.out.println("In show");
//     }
// }

// public class abstractdemo{
//     public static void main(String a[]){

//         laptop obj = new laptop();
//         obj.devlop();


//     }
// }

abstract class laptop{

    public abstract void feature();

    public void display(){
        System.out.println("displaying something..");
    }
}

class computer extends laptop{
    public void feature(){
        System.out.println("now displaying featuress..");
    }
}
public class abstractdemo{
public static void main(String args[])
{

    computer hp = new computer();
    hp.feature();
}
}
