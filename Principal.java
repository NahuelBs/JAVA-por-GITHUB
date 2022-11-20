public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.establecerAlias("mi Nuevo Alias");
        cb.mostrarDatos();
        cb.establecerAlias(null);
        cb.mostrarDatos();

    }
}

//AL ejecutar el programa observamos la primera fila para los 3 casos sale null ya que nunca se asigno un CBU ,la segunda fila es la que nos interesa vemos que para el primer caso el alias es null 
//ya que no se asigno ningun valor,luegop se lo establecio como mi nuevo alias, y al final se intento establecer un alias en null 
//pero el metodo no nos deja,por ende lo dejo sin cambiar