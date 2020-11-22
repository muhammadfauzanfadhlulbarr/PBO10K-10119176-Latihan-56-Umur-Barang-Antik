/**
 * Latihan56
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Umur Barang Antik
 */
public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur){
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
