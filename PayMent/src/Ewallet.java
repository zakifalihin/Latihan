
public class Ewallet extends Pembayaran{
    
    Ewallet(){
        this.jenis = "Ewallet";
        this.jumlah = 100000;
    }
    
    @Override
    public void display(){
        System.out.println("\nMetode Pembayaran Berhasil :");
        System.out.println("Metode Pembayaran :" + jenis);
        System.out.println("Jumlah            :" + jumlah);
    }
    
}
