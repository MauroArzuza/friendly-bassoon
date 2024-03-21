package Ejercicio;

public class CurrentAccount extends Account {
    protected float sobregiro = 0;

    public CurrentAccount(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void withdraw(float amount){
        balance -= amount;
        if (balance < 0){
            sobregiro += Math.abs(balance);
        }
    }
    public void consign(float amount){
        balance += amount;
        sobregiro -= amount;
        if(sobregiro < 0){
            sobregiro = 0;
        }
    }
    public void extractoMensual(){
        super.monthlyStatement();
    }
    public void imprimir(){
        System.out.println("El saldo de la cuenta es de: " + balance + "$.");
        System.out.println("La comisión mensual es de: ");
        super.monthlyStatement();
        System.out.println("En total has realizado " + (numberConsignments + numberWithdrawals) + " transacciones.");
    }
}
