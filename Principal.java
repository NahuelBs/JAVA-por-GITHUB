public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria("miAlias","Pesos","Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria("Dolares", "Caja de ahorros");

        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
    }
    
}


//como curiosidad un Scanner es una sobrecarga de un constructor