import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] courseFiled = {"Code", "CourseName", "DoctorName", "house"};
        for (String s:courseFiled) {
            System.out.print(s+"      ");
        }
        System.out.println();

        //Student
        Student student1 = new Student();
        student1.stu_Code = "s1";
        student1.stu_Name = "Buthaina";

        Student student2 = new Student();
        student2.stu_Code = "s2";
        student2.stu_Name = "Sara";

        Student student3 = new Student();
        student3.stu_Code = "s3";
        student3.stu_Name = "Amjed";


        ArrayList<Student> stu_array = new ArrayList<>();
//        stu_array.add(student1);
//        stu_array.add(student2);
//        stu_array.add(student3);
        //stu_array.add(courses1);


        //Courses
        Courses courses1 = new Courses();
        courses1.stu_Code = "s1";
        courses1.course_code = "c1";
        courses1.courseName = "Math";
        courses1.doctorName = "said";
        courses1.hours = 2;

        Courses courses2 = new Courses();
        courses2.stu_Code = "s2";
        courses2.course_code = "c2";
        courses2.courseName = "java";
        courses2.doctorName = "Eslam";
        courses2.hours = 2;

        Courses courses3 = new Courses();
        courses3.stu_Code = "s3";
        courses3.course_code = "c3";
        courses3.courseName = "dart";
        courses3.doctorName = "Eslam";
        courses3.hours = 2;

        ArrayList<Courses> cour_array = new ArrayList<>() ;
        cour_array.add(courses1);
        cour_array.add(courses2);
        cour_array.add(courses3);


        for (int i = 0; i <cour_array.size() ; i++) {

            System.out.print(cour_array.get(i).course_code +"\t");
            System.out.print("\t\t"+cour_array.get(i).courseName +"\t");
            System.out.print("\t\t"+cour_array.get(i).doctorName +"\t");
            System.out.println("\t\t"+cour_array.get(i).hours +"\t");
        }
        System.out.println("  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose cources (1:math, 2:java , 3:dart) :");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("you are selected Math");
                break;
            case 2:
                System.out.println("you are select Java");
                break;
            case 3:
                System.out.println("you are select dart");
                break;
            default:
                System.out.println("No selection");
                break;
        }


    }
}

class Student{
    String stu_Code ;
    String stu_Name;

    public String getStu_Code() {
        return stu_Code;
    }

    public void setStu_Code(String stu_Code) {
        this.stu_Code = stu_Code;
    }

    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }
}

class Courses extends Student{
    String courseName;
    String doctorName;
    String course_code;
    int hours;

}

