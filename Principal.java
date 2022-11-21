public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        System.out.println(cb);
        cb.setSaldo(256);
        cb.mostrarDatos();
    }
}

//Al ejecutar el programa sin el this veremos que no modifica nada,ya que java entiende que se esta haciendo referencia consigo mismo
//por consiguiente para evitar eso debemos agregar el this,para evitar la ambiguedad de nombres 
