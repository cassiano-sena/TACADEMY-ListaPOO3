//Classe Celular:
//Crie uma classe chamada Celular para modelar informações sobre um celular.
//Atributos: Marca, Modelo, Armazenamento, Aplicativos instalados
//Métodos: instalarAplicativo e exibirInformacoes.
import java.util.ArrayList;
public class Cellphone {
    private String brand;
    private String model;
    private int storage; // Storage in GB
    private ArrayList<String> installedApps;

    public Cellphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.installedApps = new ArrayList<>();
    }
    public void installApp(String appName) {
        installedApps.add(appName);
        System.out.println("App " + appName + " installed successfully.");
    }
    public void displayInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Installed Applications: " + installedApps);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public ArrayList<String> getInstalledApps() {
        return installedApps;
    }
}