class CompanyEmployee {
    private String empName;
    private double salary;

    private static String companyName = "Bright Horizon Technologies";
    private static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class M5_StaticEmployee {
    public static void main(String[] args) {
        new CompanyEmployee("Asha", 60000);
        new CompanyEmployee("Ravi", 70000);
        new CompanyEmployee("Meera", 65000);

        CompanyEmployee.printCompanyInfo();
    }
}
