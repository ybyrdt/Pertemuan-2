
package Pertemuan4;


public class ContohMethod
{
    public static void main(String[] args) {
        ContohMethod lingkaran = new ContohMethod();
        lingkaran.luas_lingkaran();
        double hasil_luas = lingkaran.fungsi_luas_lingkaran();
        System.out.println("Hasil Luas Lingkaran dari fungsi : " + hasil_luas);
    } 
    
     // berikut adalah contoh method prosedure ciri ciri = awalan void
    public void luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        System.out.println("Hasil Luas Lingkaran dari prosedur: " + luas);
    }
    
    // berikut adalah contoh method fungsi ciri ciri = awalan tipe data dengan ada nilai balik return
    public double fungsi_luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        return luas;
    }
}
