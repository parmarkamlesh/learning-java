import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Employee{
    private String name,city;
    private int age;
    private char gender;
    public void setAll(String name,String city,int age,char gender){
        this.name=name;
        this.city=city;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public String toString(){
        return "name :"+this.name+" city: "+this.city+" age:"+this.age+" gender: "+((this.gender=='m')?"Male":"Female");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }    
    
}
class SimpleQueue {
    public static void recursionHere(Queue<Employee> empList){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Do you want to contine?");
        System.out.println("enter 1:Add 2:Delete (other input exit)");
        
        int choice=sc.nextInt();
        switch(choice){
           case 1:
                Employee e=new Employee();
                sc.nextLine();

                System.out.println("Enter name of employee ");      
                e.setName(sc.nextLine());

                System.out.print("Enter name of city ");      
                e.setCity(sc.nextLine());

                System.out.print("Enter name of gender (f/m) ");  
                e.setGender(sc.next().charAt(0));

                System.out.print("Enter name of age ");      
                e.setAge(sc.nextInt());

                empList.add(e);

                System.out.println("List of queue: ");
                System.out.println(empList);

                recursionHere(empList);

                break;
            case 2: 
                
                if(empList.size()==0){
                    System.out.println("its blank, add elements");
                }else{
                    Employee empHead=empList.remove();

                    System.out.println("Deleted Employee data ");
                    System.out.println(empHead);                    
                }
                
                recursionHere(empList);
                break;
            default:
                System.out.println("Bye!! ");
                return;
        }
    }
    public static void main(String[] args) {
        Queue<Employee> q = new LinkedList<>();
        recursionHere(q);
    }
}
