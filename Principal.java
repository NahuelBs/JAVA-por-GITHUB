public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria("miAlias","Pesos","Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria();

        cb.mostrarDatos();
        cb2.mostrarDatos();
    }
    
}


