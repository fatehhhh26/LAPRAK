public class BankAccount {
    private String pemilik;
    private double saldo;

    public BankAccount(String pemilik, double saldoAwal) {
        if (saldoAwal < 0) {
            System.out.println("Saldo tidak boleh negatif!");
            this.saldo = 0;
        } else {
            this.saldo = saldoAwal;
        }
        this.pemilik = pemilik;
    }

    public String getPemilik() {
        return this.pemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean deposit(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Deposit berhasil: Rp" + jumlah);
            System.out.println("Saldo Setelah Deposit: Rp" + this.saldo);
            return true;
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
            return false;
        }
    }

    public boolean withdraw(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
            return false;
        }

        if (jumlah > this.saldo) {
            System.out.println("Saldo tidak cukup untuk menarik Rp" + jumlah);
            return false;
        }

        this.saldo -= jumlah;
        System.out.println("Penarikan berhasil: Rp" + jumlah);
        System.out.println("Saldo Setelah Withdraw: Rp" + this.saldo);
        return true;
    }
}