public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        System.out.println(cb);
    }
}
//Al ejecutar el programa observamos que nos sale una referencia CuentaBancaria@(al ver this),al ver cb nos sale la misma referencia
//Comprobamos que en la consola sale la misma referencia,esto nos esta mostrando que cuando nosotros dentro de una clase colocamos el this lo que estamos haciendo
//es referencia al propio objeto asi mismo,eso lo estamos comprobando el objeto que esta referenciado en cb es exactamente el mismo objeto que se esta referenciando asi mismo en el this dento del metodo mostrarDatos
 
