import java.util.Scanner;

public class Student{
    int id;
    String name;
    int age;
    String dob;
    String dept;
    long phone;

    Student(int id, String name, int age, String dob, String dept, long phone){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.dept=dept;
        this.phone=phone;
    }

    public void show_Student(){
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Dob: "+this.dob);
        System.out.println("Dept: "+this.dept);
        System.out.println("Phone: "+this.phone);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter student "+(i+1)+" id: ");
            int id=sc.nextInt();
            System.out.print("Enter student "+(i+1)+" name: ");
            String name=sc.next();
            System.out.print("Enter student "+(i+1)+" age: ");
            int age=sc.nextInt();
            System.out.print("Enter student "+(i+1)+" dob: ");
            String dob=sc.next();
            System.out.print("Enter student "+(i+1)+" dept: ");
            String dept=sc.next();
            System.out.print("Enter student "+(i+1)+" phone number: ");
            long phone=sc.nextLong();
            System.out.println();
            Student s=new Student(id,name,age,dob,dept,phone);
            s.show_Student();
            System.out.println();
        }
    }
}