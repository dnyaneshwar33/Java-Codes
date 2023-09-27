

public class innerclass {
    int eid;
    int sal;

    public void show() {
        System.out.println("ID: "+ eid );
        System.out.println("SALARY= " + sal); 
    }
    class empfamily{
        public void fam()
        {
            System.out.println("wife name is meera");
        }
    }

    public static void main(String[] args) {
        innerclass navin=new innerclass();
        innerclass.empfamily friend= navin.new empfamily();
        navin.eid=11;
        navin.sal=3000;
        System.out.println("Navin`s details are :");
        navin.show();
        friend.fam();
       

    }
}
