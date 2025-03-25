public class Main {
    public static void main(String[] args) {
        System.out.println("Program dimulai...");

        try {
            // Mencoba membagi angka dengan nol (akan menyebabkan error)
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil); // Baris ini tidak akan dieksekusi
        } catch (ArithmeticException e) {
            // Menangkap error jika terjadi pembagian dengan nol
            System.out.println("Kesalahan: Tidak bisa membagi dengan nol.");
        }

        System.out.println("Program tetap berjalan setelah menangani error.");
    }
}
