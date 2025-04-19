package Cuenta_Bancaria;

public class Cuenta_Bancaria {
    private static int totalCuentas = 0;
    private String titularCuenta;
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private Tipocuenta tipoCuenta;

    public enum Tipocuenta{
    CAJA_AHORRO, CUENTA_CORRIENTE, CUENTA_SALDO
    }

    public Cuenta_Bancaria(String numeroCuenta, double saldo, Tipocuenta tipoCuenta, boolean estado) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.tipoCuenta = tipoCuenta;
        totalCuentas++;
    }

    public Cuenta_Bancaria(String numeroCuenta, Tipocuenta tipoCuenta) {
        this(numeroCuenta, 0.0, tipoCuenta, true);
    }


    //getters
    
    public String getTitularCuenta() {
        return titularCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEstado() {
        return estado;
    }


    //setters
    public Tipocuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setTipoCuenta(Tipocuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void depositarDinero (double monto){
        if (estado){
            saldo += monto;
            System.out.println("El Deposito se hizo exitosamente. Saldo: $" + saldo);
        } else{
            System.out.println("La cuenta se encuentra inactiva. No se puede realizar el deposito ");
        }

    }

    public void retirarDinero (double monto){
        if(!estado){
            System.out.println("La cuenta se encuenta inactiva. No se puede retirar el dinero");
        } else if(monto > saldo){
            System.out.println("Saldo insuficiente");
        } else{
            saldo -= monto;
            System.out.println("El retiro se realizo de manera exitosa. Saldo: $ " + saldo);   
        }
    }

    public void desactivarCuenta(){
        estado = true;
    }

    public void activarCuenta(){
        estado = true;
    }

    public void mostrarDatosCuenta(){
        System.out.println("Número: " + numeroCuenta);
        System.out.println("Titular: " + titularCuenta);
        System.out.println("Tipo: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Estado: " + estado);

    }

    public static int getTotalCuentas(){
        return totalCuentas;
    }

    



    

   

}
