public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//sin saberlo hace rato venimos usando constructores,cada vez que nosotros creamos un objeto de cualquier tipo en este caso cuenta bancaria 
        CuentaBancaria cb2 = new CuentaBancaria();//lo que hace java es invocar al constructor de la clase en este caso cuenta bancaria al escribir new CuentaBancaria()
        CuentaBancaria cb3 = new CuentaBancaria();

        cb.setAlias("miAlias");
        cb.setMoneda("Pesos");
        cb.setTipo("Caja de ahorros");

        cb2.setAlias("caja2");
        cb2.setMoneda("Dolares");
        cb2.setTipo("Caja de ahorros");

        cb3.setAlias("cuenta_123");
        cb3.setMoneda("Pesos");
        cb3.setTipo("Cuenta corriente");

        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();

    }
    
}


