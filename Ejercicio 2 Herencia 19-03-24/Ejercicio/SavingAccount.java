package Ejercicio;

public class SavingAccount extends Account {
    protected boolean active;
    protected static int cantRetiros = 0;
    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if(balance >= 10000){
            active = true;
        }else{
            active = false;
        }
    }

    @Override
    public void consign(float amount){
        if(active){
            super.consign(amount);
            System.out.println("Tu saldo ahora es de: " + balance + "$.");
        }else{
            System.out.println("No se puede porque la cuenta se encuentra inactiva.");
        }
    }
    public void withdraw(float amount){
        if(active){
            super.withdraw(amount);
            System.out.println("Tu saldo ahora es de: " + balance + "$.");
        }else{
            System.out.println("No se puede retirar dinero porque la cuenta se encuentra inactiva.");
        }
    }
    public void monthlyStatement(){
        if(numberWithdrawals > 4){
            monthlyCommission += (numberWithdrawals-4) * 1000;
            System.out.println("La comisión mensual es de: " + monthlyCommission + "$.");
        }else{
            System.out.println("La comisión mensual es de 0$.");
        }
        super.monthlyStatement();
        if(balance < 10000){
            System.out.println("La cuenta se encuentra inactiva.");
        }else{
            System.out.println("La cuenta se encuentra activa.");
        }
    }
    public void imprimir(){
        System.out.println("El saldo de la cuenta es de: " + balance + "$.");
        System.out.println("La comisión mensual es de: " + monthlyCommission);
        super.monthlyStatement();
        System.out.println("En total has realizado " + (numberConsignments + numberWithdrawals) + " transacciones.");
    }
}
