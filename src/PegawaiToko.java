public class PegawaiToko extends Person implements DapatDicetak {
    private String idPegawai;

    public PegawaiToko(String nama, String alamat, String idPegawai) {
        super(nama, alamat);
        this.idPegawai = idPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai [ID: " + idPegawai + ", Nama: " + getNama() + ", Alamat: " + getAlamat() + "]");
    }

    @Override
    public void cetakStruk() {
        System.out.println("--- Cetak Laporan Kinerja Pegawai: " + getNama() + " ---");
    }
}