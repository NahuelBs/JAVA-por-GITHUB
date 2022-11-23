public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();
        CuentaBancaria cb2 = new CuentaBancaria();
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
    //vemos que crear algo tan sencillo como crear tres objetos del tipo cuenta bancaria y establecer parcialmente sus atributos  no lleva bastantes lineas de codigos
    // y muchas de ellas repetidas setTipo,set Alias por mas que tenga valores diferentes
    
    //para evitar esto se utiliza lo que se conoce como un constructor,que nos va a permitir en una sola linea,no solamente construir el objeto si no tambien darle su estado inicial
}


