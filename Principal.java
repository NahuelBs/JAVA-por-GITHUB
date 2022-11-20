public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        //Vemos que para este caso es asi de simple asignar los atributos a la variable cb
        cb.saldo = -123;
        cb.alias = ")/&(&$))";
        cb.CBU = "Hola que tal";
        //Dichos valores no son muy consistentes,es decir son cualquiera 
        
        //Todo eso es posible ya que los atributos de la Cuenta Bancaria no son privados
    
        
        cb.mostrarDatos();//por eso al llevar uso del metodo mosrarDatos veremos que en este momento la cuenta bancaria,no dara errores por que son valores posibles pero dichos valores son inconsistentes para emplear en una cuenta del banco
    }
}
