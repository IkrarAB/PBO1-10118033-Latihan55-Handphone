package pbo1.pkg10118033.latihan55;

public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("Operating System : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
}