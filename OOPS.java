//CLASS AND OBJECT
// public class OOPS{
//     String name="VD";
//     int marks = 95;
//     public void printinfo(){
//         System.out.println("Name is:"+name);
//         System.out.println("marks are:"+marks);
        
//     }

//     private  OOPS(){
//         System.out.println("Constructor called");
//     }
//     public static void main(String args[]){

//         OOPS obj = new OOPS();
//         // System.out.println(obj.name);
//         // System.out.println(obj.marks);
//         // obj.printinfo();

//     }
// }

//ENCAPSULATION
// public class OOPS{
//     private String name;

//     public String getName(){
//         return name;
//     }
//     public void setName(String newname){
//         this.name=newname;
//     }
//     public static void main(String args[]){
       
//        OOPS obj = new OOPS();
//        obj.setName("VD");
//        System.out.println(obj.getName());
//     }
// }

//INHERITANCE
// class Vehicle{
//     public void car(){
//         System.out.println("This is parent method");
//     }
// }

// class creta extends Vehicle{
//     public void drive(){
//         System.out.println("This is child method");
//     }
// }
// public class OOPS extends Vehicle{
    

//     public static void main(String args[]){
//        creta obj = new creta();
//        OOPS obj2 = new OOPS();
//        obj2.car();
//        obj.car();
//        obj.drive();
//     }
// }

//POLYMORPHISM-Method overloading-compile time
// public class OOPS{
//      public void addition(int a,int b){
//             int c = a+b;
//              System.out.println(c);
//         }
//         public void addition(int a,int b,int c){
//             int d = a+b+c;
//             System.out.println(d);
//         }
//     public static void main(String args[]){
       
//        OOPS obj  = new OOPS();
//        obj.addition(23,45,23);


//     }
// }

//POLYMORPHISM-Method overriding-runtime
// class Animal{
//     public void sound(){
//         System.out.println("Common sound");
//     }
// }
// class Horse extends Animal{
//       public void sound(){
//         System.out.println("Horse sound");
//     }
//     }

// class Dog extends Animal{
//      public void sound(){
//         System.out.println("DOg sound");
//     }
// }
// class OOPS {
   

//     public static void main(String args[]){

//         Animal common = new Animal();
//         Dog rambo = new Dog();
        
        
//         rambo.sound();
//         common.sound();


//     }
// }

//ABSTRACTION

// abstract class Animal{
//     public abstract void animalsound();
//     public void sleep(){
//         System.out.println("Sleeping");
//     }
// }
// class Horse extends Animal{
//     public void animalsound(){
//         System.out.println("This is abtract method of parent class");

//     }
// }
// public class OOPS{
//     public static void main(String args[]){
//         Horse obj = new Horse();
//         obj.animalsound();
//         obj.sleep();

//     }
// }

//INTERFACES

// interface Animal{
//     public void firstmethod();
   
// }
// class Horse implements Animal{
//     public void firstmethod(){
//         System.out.println("THis is interface example");
//     }
    
// }
//     public class OOPS{
//         public static void main(String args[]){
//       Horse obj = new Horse();
//       obj.firstmethod(); 
      
//         }
//     }

//MULTIPLE INHERITANCE
interface Animal{
    public void firstmethod();
   
}
interface Human{
    public void secondmethod();
}
class Horse implements Animal,Human{
    public void firstmethod(){
        System.out.println("THis is interface example");
    }
    public void secondmethod(){
        System.out.println("This is multiple inheritance");
    }
    
}
    public class OOPS{
        public static void main(String args[]){
      Horse obj = new Horse();
      obj.firstmethod(); 
      obj.secondmethod();
      
        }
    }