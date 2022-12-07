package encapsulation;

/**
 *
 * @author LENOVO
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        karyawan data = new karyawan();
        data.setId(7);
        data.setNama("SITI AYUNI");
        data.setGaji(7000000);
        
        System.out.println("gaji :" +data.getGaji());
    }
    
}
