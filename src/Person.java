//Classe Pessoa:
//Crie uma classe chamada Pessoa para modelar informações sobre uma pessoa.
//Atributos: Nome, Idade, Altura, Peso
//Métodos: envelhecer, engordar, emagrecer e mostrarInformacoes.
public class Person {
    private String name;
    private int age;
    private double height; // height in meters
    private double weight; // weight in kilograms

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void growOlder() {
        this.age += 1;
    }

    public void gainWeight(double amount) {
        this.weight += amount;
    }

    public void loseWeight(double amount) {
        this.weight -= amount;
        if (this.weight < 0) {
            this.weight = 0;
        }
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
