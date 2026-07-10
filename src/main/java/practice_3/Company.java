package practice_3;

/*
static String companyName — общее название для всех сотрудников
final int employeeID — уникальный идентификатор (нельзя менять)
String employeeName — имя сотрудника
Реализуйте конструктор, принимающий employeeID и employeeName,
статический метод printCompanyName(), геттеры и сеттеры для employeeName.
В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
Попробуйте изменить employeeID — должно быть невозможно.
 */

public class Company {
    static String companyName;

    final int employeeID;
    String employeeName;

    Company(String companyName, int employeeID) {
        this.companyName = companyName;
        this.employeeID = employeeID;
        this.companyName = companyName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static void printCompanyName(){
        System.out.println(companyName);
    }
}
