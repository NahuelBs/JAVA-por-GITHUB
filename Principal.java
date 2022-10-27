public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//creamos un objeto cuenta bancaria,guardandola en la variable cb para no perderla asi llegar a el

        //invocamos al metodo creado,podemos invocarlo las veces que uno quiera
        cb.mostrarDatos();
        cb.CBU="324788324629102";//realizamos dos cambios de estado
        cb.alias="miCuenta";
        cb.mostrarDatos();

        cb.obtenerSaldo();

        //Al ejecutar el programa no nos saldra nada,ya que el metodo nos devuelve un valor,el cual se esta perdiendo
        //Para evitar esto podemos hacer de dos maneras

        System.out.println(cb.obtenerSaldo());//podemos mostrar directamente

        double x =cb.obtenerSaldo();//o guardarla en una variable y mostarar x
        System.out.println(x);

    }
}
