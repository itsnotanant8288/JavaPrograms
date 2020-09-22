import java.util.Scanner;
public class Student {
    String name;
    int roll_no;
    Student(int z)
    {
        name = "Unknown";
        roll_no = z;
    }
    Student(String y,int b)
    {
        name = y;
        roll_no = b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n="xyz";int x=100,a=101;
        Student obj1 = new Student(x);
        Student obj2 = new Student(n,a);
        System.out.println("obj1(only roll number passed while creating object),name: "+obj1.name+" roll number: "+obj1.roll_no);
        System.out.println("obj2(both name and roll number passed during creating object),name: "+obj2.name+" roll number: "+obj2.roll_no);
    }
}
