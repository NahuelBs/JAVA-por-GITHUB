public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//creamos un objeto cuenta bancaria,guardandola en la variable cb para no perderla asi llegar a el

        //invocamos al metodo creado,podemos invocarlo las veces que uno quiera
        cb.mostrarDatos();
        cb.CBU="324788324629102";//realizamos dos cambios de estado
        cb.alias="miCuenta";
        cb.mostrarDatos();

        System.out.println(cb.saldo);//si nosotros quisieramos mostrar un valor que tiene la cuenta bancaria podemos hacerlo de esta manera 

        //pero si yo no quiero que el saldo se obtenga como en la linea 12,debo crear un metodo en cuenta bancaria para que me de la posibilidad de obtener saldo

        cb.obtenerSaldo();
    }
}
