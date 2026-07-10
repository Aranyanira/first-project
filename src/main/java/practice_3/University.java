package practice_3;
/*
Создайте класс University с полями:
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName
Реализуйте конструктор для studentID и studentName,
статический метод changeUniversityName(String newName),
геттер для studentName,
метод printStudentInfo() — выводит имя, ID и университет.
В main: создайте 3 студента, измените название университета и выведите данные.
 */

public class University {
    static String universityName;

    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("University Name: " + this.universityName);
    }
}
