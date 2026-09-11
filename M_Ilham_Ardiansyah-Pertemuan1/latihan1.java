import java.util.Scanner; // 1. Harus ditambah ini di paling atas

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            // 2. Menggunakan 'System' (S besar)
            System.out.print("masukan angka (1-10): "); 
            
            // 3. Menggunakan 'nextInt' (I besar)
            angka = input.nextInt(); 

            if (angka < 1 || angka > 10) {
                System.out.println("angka tidak valid, silahkan coba lagi.\n");
            }
        } while (angka < 1 || angka > 10);

        // Tambahan: Menampilkan hasil jika sukses lolos dari perulangan
        System.out.println("Terima kasih! Angka " + angka + " berhasil disimpan.");
        
        input.close(); // Praktik yang baik untuk menutup scanner
    }
}
