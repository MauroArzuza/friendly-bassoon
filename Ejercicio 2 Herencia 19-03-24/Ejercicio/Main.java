package Ejercicio;

public class Main {
    public static void main(String[] args) {
        SavingAccount cuentaAhorros1 = new SavingAccount(90000, 500000);
        cuentaAhorros1.consign(5000);
        cuentaAhorros1.withdraw(40000);
        cuentaAhorros1.withdraw(5000);
        cuentaAhorros1.withdraw(10000);
        cuentaAhorros1.withdraw(20000);
        cuentaAhorros1.withdraw(10000);
        cuentaAhorros1.monthlyStatement();
        cuentaAhorros1.imprimir();
    }
}
