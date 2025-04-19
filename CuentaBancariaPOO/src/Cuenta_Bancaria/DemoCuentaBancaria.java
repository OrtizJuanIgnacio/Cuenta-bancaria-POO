package Cuenta_Bancaria;

public class DemoCuentaBancaria {

    public static void main(String[] args) {
        Cuenta_Bancaria cuenta1 = new Cuenta_Bancaria("001", Cuenta_Bancaria.Tipocuenta.CAJA_AHORRO);
        cuenta1.setTitularCuenta("Alfedro Perez");
        cuenta1.depositarDinero(500);

        Cuenta_Bancaria cuenta2 = new Cuenta_Bancaria("002", Cuenta_Bancaria.Tipocuenta.CUENTA_CORRIENTE);
        cuenta2.depositarDinero(1000);
        cuenta2.retirarDinero(200);
        
        Cuenta_Bancaria cuenta3 = new Cuenta_Bancaria("003", Cuenta_Bancaria.Tipocuenta.CUENTA_SALDO);
        cuenta3.setTitularCuenta("Cristina Girotti");
        cuenta3.desactivarCuenta();
        cuenta3.depositarDinero(400); //no deberia servir
        cuenta3.activarCuenta();
        cuenta3.depositarDinero(400);

        System.out.println("Datos de la cuenta");
        System.out.println("_____________________");
        cuenta1.mostrarDatosCuenta();
        System.out.println("_____________________");
        cuenta2.mostrarDatosCuenta();
        System.out.println("_____________________");
        cuenta3.mostrarDatosCuenta();
        System.out.println("_____________________");

        System.out.println("Total de cuentas creadas: " + Cuenta_Bancaria.getTotalCuentas());
    }

    


}
