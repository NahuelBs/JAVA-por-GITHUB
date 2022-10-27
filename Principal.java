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
        cb.depositar(-50);
        System.out.println(cb.obtenerSaldo());

        //Lo siguiente no es una extraccion si no mas bien es una consulta

        System.out.println(cb.saldoDisponible(100));//Al ejecutar me saldra, para este caso true ya que mi saldo es 200 y yo pregunto si saldo es mayor al monto solicitado, en este caso 100
        System.out.println(cb.saldoDisponible(300));//Al ejecutar me saldra, para este caso false ya que mi saldo es 200 y yo pregunto si saldo es mayor al monto solicitado,en este caso 300 



    }
}
