public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//creamos un objeto cuenta bancaria,guardandola en la variable cb para no perderla asi llegar a el

        //invocamos al metodo creado,podemos invocarlo las veces que uno quiera
        cb.mostrarDatos();
        cb.CBU="324788324629102";//realizamos dos cambios de estado
        cb.alias="miCuenta";
        cb.mostrarDatos();

        cb.obtenerSaldo();


        System.out.println(cb.obtenerSaldo());
        cb.depositar(200);//Este 200 se convertira en parametro cuando llamemos al metodo depositar,en la clase principal esos 200 se lo llama argumento
        System.out.println(cb.obtenerSaldo());

    }
}
