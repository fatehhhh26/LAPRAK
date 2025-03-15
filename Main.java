public class Main {
    public static void main(String[] args) {
        BankAccount rekening = new BankAccount("Tegar", 100000.0);

        System.out.println("Pemilik Rekening: " + rekening.getPemilik());
        System.out.println("Saldo Awal: Rp" + rekening.getSaldo());

        rekening.deposit(50000.0);

        rekening.withdraw(30000.0);

        rekening.withdraw(200000.0);

        rekening.deposit(-1000);

        rekening.withdraw(-500);

        System.out.println("Saldo Akhir: Rp" + rekening.getSaldo());
    }
}


public class Main {
    public static void main(String[] args) {
        Warrior W1 = new Warrior("Afif");
        Tank T1 = new Tank("Virza");
        Archer A1 = new Archer("Valdo");

        W1.displayInfo();
        T1.displayInfo();
        A1.displayInfo();

        System.out.println("PHASE 1");
        W1.attack(T1);
        T1.heal();
        A1.attack(W1);

        System.out.println("\nPHASE 2");
        W1.berserk();
        T1.taunt();
        A1.doubleShot(W1);
    }
}
