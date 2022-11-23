public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//sin saberlo hace rato venimos usando constructores,cada vez que nosotros creamos un objeto de cualquier tipo en este caso cuenta bancaria 
        CuentaBancaria cb2 = new CuentaBancaria();//lo que hace java es invocar al constructor de la clase en este caso cuenta bancaria al escribir new CuentaBancaria()
        CuentaBancaria cb3 = new CuentaBancaria();

        //cada vez que hagamos un new ,java invoca al constructor y hace lo que este adentro de este,casi como un metodo pero con algunas particularidades

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

    //cuando ejecutamos el programa vemos 3 referencias distintas 
    //Se creo el objetoCuentaBancaria@36baf30c
    //Se creo el objetoCuentaBancaria@7a81197d  
    //Se creo el objetoCuentaBancaria@5ca881b5

    //indicandonos que el constructor se ejecuta para cada objeto

    
}


