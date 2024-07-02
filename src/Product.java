//Classe Produto:
//Crie uma classe chamada Produto para modelar informações sobre um produto.
//Crie um pequeno sistema de compra simples.
//Atributos: Nome, Preço, Quantidade em Estoque
//Métodos: atualizarEstoque e exibirDetalhes.
public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void updateStock(int amount) {
        this.stockQuantity += amount;
        if (this.stockQuantity < 0) {
            this.stockQuantity = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
