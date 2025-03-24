
    public class KartuKredit extends Pembayaran{
    
    KartuKredit(){
        jenis = "Kartu Kredit";
        jumlah = 500000;
    }
    
    @Override
    public void display(){
        System.out.println("\nMetode Pembayaran Berhasil :");
        System.out.println("Metode Pembayaran :" + this.jenis);
        System.out.println("Jumlah            :" + this.jumlah);
    }
}

