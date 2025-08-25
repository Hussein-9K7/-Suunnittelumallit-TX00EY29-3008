public class Main {
    public static void main(String[] args) {
        Department headOffice = new Department("Head Office");

        Employee e1 = new Employee("Ali", 1000);
        Employee e2 = new Employee("Sara", 1200);
        headOffice.add(e1);
        headOffice.add(e2);

        Department itDept = new Department("IT Department");
        Employee e3 = new Employee("Hussein", 1500);
        itDept.add(e3);

        headOffice.add(itDept);

        System.out.println("Total Salary: " + headOffice.getSalary());
        System.out.println("Organization XML:");
        System.out.println(headOffice.toXML());
    }
}
