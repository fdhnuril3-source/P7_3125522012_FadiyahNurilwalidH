public class Main {
    public static void main(String[] args) {
        // Skenario 1 & 2: Membuat object subclass dan memanggil abstract method melalui reference superclass
        Person p1 = new Pelanggan("Budi Santoso", "Surabaya", "P001");
        Person p2 = new PegawaiToko("Siti Aminah", "Sidoarjo", "EMP05");

        System.out.println("=== Uji Abstract Class & Polymorphism ===");
        p1.tampilkanInfo();
        p2.tampilkanInfo();

        System.out.println("\n=== Uji Interface & Polymorphism ===");
        // Skenario 3: Memanggil method melalui reference interface
        DapatDicetak d1 = new Pelanggan("Budi Santoso", "Surabaya", "P001");
        d1.cetakStruk();

        System.out.println("\n=== Uji Polymorphic Collection (Array/List) ===");
        // Skenario 4: Menggunakan beberapa object dalam array bertipe superclass dan interface
        Person[] daftarPerson = {
            new Pelanggan("Ani", "Malang", "P002"),
            new PegawaiToko("Joko", "Gresik", "EMP06")
        };

        for (Person p : daftarPerson) {
            p.tampilkanInfo(); // Setiap object menjalankan perilaku overridden-nya sendiri
        }
    }
}