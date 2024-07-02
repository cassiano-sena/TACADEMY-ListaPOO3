//Classe Casa:
//Crie uma classe chamada Casa para modelar informações sobre uma casa.
//Atributos: Endereço, Número de Quartos, Área, Valor
//Métodos: exibirDetalhes e calcularValorImposto.
public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    private double value;

    public House(String address, int numberOfRooms, double area, double value) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.value = value;
    }

    public void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Area: " + area + " sq meters");
        System.out.println("Value: $" + value);
    }

    public double calculatePropertyTax() {
        double taxRate = 0.015; // 1.5% tax rate
        return value * taxRate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
