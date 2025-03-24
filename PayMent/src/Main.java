
public class Main {
    public static void main(String[] args) {
        
        Pembayaran PB = new Transfer();
        PB.display();
        
        Pembayaran KT = new KartuKredit();
        KT.display();
        
        Pembayaran EW = new Ewallet();
        EW.display();
    }
        
}

