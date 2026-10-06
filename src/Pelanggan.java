public class Pelanggan extends Person implements DapatDicetak {
    private String idPelanggan;

    public Pelanggan(String nama, String alamat, String idPelanggan) {
        super(nama, alamat);
        this.idPelanggan = idPelanggan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pelanggan [ID: " + idPelanggan + ", Nama: " + getNama() + ", Alamat: " + getAlamat() + "]");
    }

    @Override
    public void cetakStruk() {
        System.out.println("--- Cetak Struk untuk Pelanggan: " + getNama() + " ---");
    }
}