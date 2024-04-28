abstract class Employee {
    protected String name;
    protected double salary;
    static int totalEmployees;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    public abstract double calculateBonus();

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    
}