//Classe Funcionário:
//Crie uma classe chamada Funcionário para modelar informações sobre um
//funcionário.
//Atributos: Nome, Cargo, Salário, Departamento
//Métodos: promover e exibirDetalhes.
public class Employee {
    private String name;
    private String position;
    private double salary;
    private String department;

    public Employee(String name, String position, double salary, String department) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public void promote(String newPosition, double salaryIncrease) {
        this.position = newPosition;
        this.salary += salaryIncrease;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
