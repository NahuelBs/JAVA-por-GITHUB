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

        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(100);
        System.out.println(cb.obtenerSaldo());
        
        //Al ejecutar observamos que podremos extraer 180 ya que es menor al saldo(200) asi que el metdos saldoDisponible devuelve un true y entra al if del metodo extraer
        //Pero para el segundo caso al ya extraer 180 nos queda 20 como saldo y el monto para extraer (100) es mayor al saldo disponible por este motivo saldoDisponible nos devuelve un false por ende no ingresamos al if del metodo extraer
        //por eso al volver a llamar el metodo obtenerSaldo tenemos los 20 que teniamos antes

    }
}
