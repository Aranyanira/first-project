package practice_3;

public class Main {
    public static void main(String[] args) {

        Company.companyName = "Новая заря";
        Company.printCompanyName();
        Company employee1 = new Company(101, "Василий");
        Company employee2 = new Company(90, "Алена");
        Company employee3 = new Company(88, "Никита");
        Company.companyName = "Красные башмаки";
        Company.printCompanyName();
        //employee1.employeeID = 199; - Cannot assign a value to final variable 'employeeID'
        System.out.println("Новая компания у сотрудника " + employee1 + " = " + Company.companyName);
        System.out.println("Новая компания у сотрудника " + employee2 + " = " + Company.companyName);



        /*
        System.out.println(MathConstants.calculateCircleArea(8));
        System.out.println(MathConstants.calculateCircleArea(909));
        System.out.println(MathConstants.calculateCircumference(10));
        System.out.println(MathConstants.calculateCircumference(9.9));
        System.out.println(MathConstants.calculateExponentialGrowth(2, 6, 10));
        System.out.println(MathConstants.calculateExponentialGrowth(1, 1, 1));

         */
        /*
        University.universityName = "UrFU";
        System.out.println(University.universityName);

        University petya = new University(10, "Petr");
        University inna = new University(110, "Inna");
        University vasiliy = new University(120, "Vasiliy");

        petya.printStudentInfo();
        inna.printStudentInfo();
        vasiliy.printStudentInfo();

        University.universityName = "MGIMO";
        System.out.println(University.universityName);

        petya.printStudentInfo();
        inna.printStudentInfo();
        vasiliy.printStudentInfo();
         */

        /*
        GameSettings.maxPlayers = 5;
        GameSettings gta = new GameSettings("GTA", 4);
        GameSettings theSims = new GameSettings("The Sims 4", 10);

        gta.printGameStatus();
        theSims.printGameStatus();

        GameSettings.maxPlayers = 12;

        gta.addPlayer(3);
        gta.printGameStatus();
        theSims.addPlayer(1);
        theSims.printGameStatus();
         */

        Person lada = new Person("Лада", "Васильева", "900-009-900");
        Person vadim = new Person("Вадим", "Иванов", "899-009-900");
        Person konstantin = new Person("Константин", "Брежнев", "900-90999-900");

        lada.printPersonInfo();
        vadim.printPersonInfo();
        konstantin.printPersonInfo();

        konstantin.setLastName("Васильев");
        lada.setFirstName("Владлена");

        lada.printPersonInfo();
        vadim.printPersonInfo();
        konstantin.printPersonInfo();

    }
}
