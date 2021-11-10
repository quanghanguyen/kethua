package ThuaKe_Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Student extends Person {
    String studentID;
    int academic_year;
    
    public Student() {
    }

    public Student(String studentID, int academic_year, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.studentID = studentID;
        this.academic_year = academic_year;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Student{" + "studentID=" + studentID + ", academic_year=" + academic_year + '}';
        return res;
    }
    
    Scanner scan = new Scanner(System.in);  
    public void nhap() {
          
        System.out.println("Nhap ten:");
        this.name = scan.nextLine();

        System.out.println("Nhap nam sinh:");
        this.birth_year = scan.nextInt();

        System.out.println("Nam la M, nu la F");
        System.out.println("Nhap gioi tinh:");
        this.gender = scan.next().charAt(0);
        scan.nextLine();

        System.out.println("Nhap ma hoc sinh:");
        this.studentID = scan.nextLine();

        System.out.println("Nhap nam nhap hoc:");
        this.academic_year = scan.nextInt();
    }
    
}
