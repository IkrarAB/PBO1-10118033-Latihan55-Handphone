package pbo1.pkg10118033.latihan55;

public class Android extends Handphone {
    private String keystore;

    public Android(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public String getKeystore() {
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }    
}