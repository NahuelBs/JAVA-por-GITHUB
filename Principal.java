public class Principal {
    public static void main(String[] args) {
      
//lo que hicimos en el constructor de cuenta bancaria nos permite borrar las siguentes lineas
//debemos establecer el alias, moneda y tipo dentro de los constructores en ese orden ya que en ese orden lo escribi en en el constructor de cuenta bancaria    
        CuentaBancaria cb = new CuentaBancaria("miAlias","Pesos","Caja de ahorros");
        CuentaBancaria cb2 = new CuentaBancaria("caja2","Dolares","Caja de ahorros");
        CuentaBancaria cb3 = new CuentaBancaria("cuenta_123","Pesos","Cuenta corriente");


//        cb.setAlias();
//        cb.setMoneda();
//        cb.setTipo();

//        cb2.setAlias();
//        cb2.setMoneda();
//        cb2.setTipo();

//        cb3.setAlias();
//        cb3.setMoneda();
//        cb3.setTipo();

        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();

    }
    
}


