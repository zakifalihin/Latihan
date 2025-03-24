public class Transfer extends Pembayaran {
    
    Transfer(){
        jenis = "Transfer";
        jumlah = 200000;
    }
    
    
    @Override
    public void display(){
        System.out.println("\nMetode Pembayaran Berhasil :");
        System.out.println("Metode Pembayaran :" + super.jenis);
        System.out.println("Jumlah            :" + this.jumlah);
    }
    
}
