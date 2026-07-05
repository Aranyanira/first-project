package ConstructorGetterSetterPractice;
/*
Создайте класс StudentGroup с полями groupName и studentCount.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
В main измените число студентов и выведите информацию.
 */
public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo(){
        System.out.println("Название группы: " + this.groupName + " , количество студентов: " + this.studentCount);
    }

}
