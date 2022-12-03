public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria("miAlias","Pesos","Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria();//sale error por que no le estoy mandando los argumentos que declare en el constructor

        cb.mostrarDatos();
    }
    
}


