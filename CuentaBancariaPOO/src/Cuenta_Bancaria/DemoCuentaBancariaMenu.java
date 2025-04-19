package Cuenta_Bancaria;
import javax.swing.JOptionPane;

public class DemoCuentaBancariaMenu {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
        String[] opciones = {"CAJA_AHORRO", "CUENTA_CORRIENTE", "CUENTA_SUELDO"};
        int tipoCuentaSelec = JOptionPane.showOptionDialog(null, "Seleccione tipo de cuenta", "Tipo de Cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        Cuenta_Bancaria.Tipocuenta tipocuenta = Cuenta_Bancaria.Tipocuenta.valueOf(opciones[tipoCuentaSelec]);

        Cuenta_Bancaria cuenta = new Cuenta_Bancaria(numero, tipocuenta);
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular");
        cuenta.setTitularCuenta(titular);


        int opcion;
        do{
            String input = JOptionPane.showInputDialog(
                "BIENVENIDO!\\n"+
                "Menu Cuenta Bancaria\n"+
                "1. Depositar dinero\n"+
                "2. Retirar dinero\n"+
                "3. Activar la cuenta\n"+
                "4. Desactivar cuenta\n"+
                "5. Ver datos de cuenta\n"+
                "6. Ver total de cuentas\n"+
                "7. Salir del programa"+
                "Seleccione la operacion que quiere realizar");
                
                
                if (input == null) {
                    opcion = 7; 
                } else {
                    try {
                        opcion = Integer.parseInt(input);
    
                        switch (opcion) {
                            case 1:
                                double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Monto del dinero a depositar:"));
                                cuenta.depositarDinero(montoDeposito);
                                break;
                            case 2:
                                double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("Monto del dinero a retirar:"));
                                cuenta.retirarDinero(montoRetiro);
                                break;
                            case 3:
                                cuenta.activarCuenta();
                                break;
                            case 4:
                                cuenta.desactivarCuenta();
                                break;
                            case 5:
                                //JOptionPane.showMessageDialog(null, cuenta.mostrarDatosCuenta());
                                //No funciona da error desconocido
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Total de cuetas creadas " + cuenta.getTipoCuenta()) ;
                                break;
                            case 7:
                                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema del banco, que tenga un buen dia! ;)");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida.");
                        }
    
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                        opcion = 0; 
                    }
                }
    
            } while (opcion != 7);
           
    }



}
