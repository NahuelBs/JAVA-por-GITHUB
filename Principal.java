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
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo());

        //Nosotros podemos depositar cualquier cosa, como por ejemplo numeros negativos como el parametro es de tipo double no tendre problema
        cb.depositar(-50);
        System.out.println(cb.obtenerSaldo());

        //Para evitar que un deposito reste dinero,ya que esto en la vida real no tiene logica debemos editar el metodo depositar,para que depositar no nos quede en un estado inconsistente

    }
}
