public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//Vemos que ahora aqui nos sale como un error ,ya que nos dice que no estamos enviando los argumentos  necesarios es decir alias,moneda y tipo         CuentaBancaria cb2 = new CuentaBancaria();
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


