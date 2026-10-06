public abstract class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    // Abstract method yang wajib diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}