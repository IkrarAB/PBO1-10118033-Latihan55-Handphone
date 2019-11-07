
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan informasi
 *                     Handphone.
 *  
 */

package pbo1.pkg10118033.latihan55;

public class PBO110118033Latihan55 {
    public static void main(String[] args) {
        Android andro = new Android("Samsung","Android","Grand",3000000);
        andro.setKeystore("234ibfd3840fo");
        BlackBerry BB = new BlackBerry("BlackB","RIM","Curve",2000000);
        BB.setPinBB("BHS249");
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        andro.displayProduct();
        System.out.println("Android Key Store : "+andro.getKeystore()+"\n");
        BB.displayProduct();
        System.out.println("PIN : "+BB.getPinBB()+"\n");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore()+"\n");
    }
}