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
/*
`Company` конструктор реализован не по условию.
Он должен принимать `employeeID` и `employeeName`, но сейчас принимает `companyName` и `employeeID`,
дважды присваивает `companyName`, а `employeeName` остается `null`.
Статическое название компании не нужно передавать при создании каждого сотрудника.
Конструктор должен выглядеть так: `Company(int employeeID, String employeeName)`.
,
После исправления этих моментов стоит добавить в `main` проверку, что изменение `companyName` отражается у всех сотрудников,
и закомментированную попытку изменить `final employeeID` с пояснением, что это проверка невозможности изменения.
 */
public class Company {
    static String companyName;

    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
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
