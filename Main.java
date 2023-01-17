


package SchoolMangement;

 

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 

 

 

public class Main {

 

 

 

    /**
     * @param args
     */
    public static void main(String[] args) {
         String Username;
         String Password;

 

      

 

         Password = "Admin@123";
         Username = "Admin";

 

      

 

         Scanner input1 = new Scanner(System.in);
         System.out.println("-------------------------------------------------------------------");
         System.out.println("----------------WELCOME TO LOGIN PAGE----------------");
         System.out.println("-------------------------------------------------------------------");

 

         
         System.out.println("Enter Username : ");
         String username = input1.next();

 

      

 

         Scanner input2 = new Scanner(System.in);
         System.out.println("Enter Password : ");
         String password = input2.next();

 

      

 

         if (username.equals(Username) && password.equals(Password)) {
             System.out.println("-------------------------------------------------------------------");
             System.out.println("----------------WELCOME TO SCHOOL MANAGEMENT SYSTEM----------------");
             System.out.println("-------------------------------------------------------------------");

 

      

 

         }

 

      

 

         else if (username.equals(Username)) {
             System.out.println("Invalid Password!");
         } else if (password.equals(Password)) {
             System.out.println("Invalid Username!");
         } else {
             System.out.println("Invalid Username & Password!");
         }

 

    

 



 


        int id;
        String name;
        int salary;

       // System.out.println("Select a option : 1) Total amount earned by school \n 2. Amount left paying salary to devi");
        Teacher devi= new Teacher(id= 1, name="devi", salary= 1000);
        Teacher devika= new Teacher(id=2, name="devika", salary=1500);
        Teacher vikas= new Teacher(id=3, name="vikas", salary=500);
        Teacher vivek= new Teacher(id=4, name="vivek", salary=1000);
        Teacher Tripura=new Teacher(id=5, name="Tripura", salary=2000);

 



        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(devi);
        teacherList.add(devika);
        teacherList.add(vikas);
        teacherList.add(vivek);
        teacherList.add(Tripura);
       // Teacher Tripura=new Teacher(id=5, name="Tripura", salary=2000);
       // ltv.addTeacher(Tripura);

 


        int grade;
        Student sahil=new Student(id=1, name="sahil", grade=4);
        Student avi=new Student(id=2, name="avi", grade=12);
        Student sailesh=new Student(id=3, name="sailesh", grade=15);

 

 

        List<Student> studentList = new ArrayList<>();
        studentList.add(sahil);
        studentList.add(avi);
        studentList.add(sailesh);

 

 

        School ltv=new School(teacherList, studentList);
        /**
         * if you want to add new Teacher we have to implement this method
         */
        //using this method we can add teacher as well as Student
       // Teacher Tripura=new Teacher(id=5, name="Tripura", salary=2000);
        //ltv.addTeacher(Tripura);

 


        Student Saransh=new Student(id=4, name="Saransh", grade=5);
        Saransh.payFees(2500);
        ltv.addStudent(Saransh);

 

 


        /**
         * let assumed that sahil has paid 5000 fees to the school
         * 
         * let assumed that that avi has paid 10000 fees to the school
         */
        sahil.payFees(5000);
        avi.payFees(10000);

 

 

 

       // System.out.println("LTV has earned $" + ltv.getTotalMoneyEarned());
        //we get output LTV has earned $15000
        //LTV has earned $15000 its adding both the things

 

 

        Scanner in = new Scanner(System.in);
        int option;
        int suboption1;

 

        int repeat = 3;

 

        while (repeat > 0) {

            System.out.println("-------------------------------------------------------------------");
            System.out.println("-------------Please choose one of the below Options----------------");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1. Teacher Details.");
            System.out.println("2. Student Details.");



            System.out.println("-------------------------------------------------------------------");
            suboption1 = Integer.parseInt(in.next());

 

            switch (suboption1) {
                case 1: {
                     System.out.println("-------------------------------------------------------------------");
                     System.out.println("-------------Teachers Details----------------");
                     System.out.println("-------------------------------------------------------------------");

        /**
         * I want to directly know that what salary devi get
         */
        //devi salary
        devi.receiveSalary(devi.getSalary());
        System.out.println("LTV has spent for salary to " + devi.getName()
        +" and now has " + ltv.getTotalMoneyEarned());
        /**
         * it will minus salary from ltv totalmoneyearned
        LTV spent 15000 - devi salary 1000 = 14000 remain with LTV

 

 

         */
        //devika salary
        devika.receiveSalary(devika.getSalary());
        System.out.println("LTV has spent for salary to devika " + devika.getSalary()
        + " and now has " + ltv.getTotalMoneyEarned());
        /**
         * it will minus salary from ltv totalmoneyearned
        LTV spent 15000 - devi salary 1000 - devika salary = 12500 remain with LTV

 

 

         */

 

 

        //vivek salary

 

 

        vivek.receiveSalary(vivek.getSalary());
        System.out.println("LTV has spent for salary to vivek " + vivek.getSalary()
        + " and now has " + ltv.getTotalMoneyEarned());

        Tripura.receiveSalary(Tripura.getSalary());
        System.out.println(Tripura);

        vikas.receiveSalary(vikas.getSalary());
        System.out.println(vikas);

 

 

     break;
                }
                case 2:
                    int repeat2 = 7;
                    while (repeat2 > 0){
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("-------------Students Details----------------");
                        System.out.println("-------------------------------------------------------------------");


        System.out.println(sahil);
        System.out.println(avi);

 
  /** vikas.receiveSalary(vikas.getSalary());
        System.out.println(vikas);

 


        /*
         * we Don't know how much sailesh pay to school
         * if we try to get sailesh fees we get 0 
         */

 

     //  Tripura.receiveSalary(Tripura.getSalary());
       // System.out.println(Tripura);
      //  Saransh payfeesh
        System.out.println(Saransh);
        System.out.println("\n");
        break;
                    }

 

 

    }

 

 

}
    }
}