public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.establecerAlias("mi Nuevo Alias");
        cb.mostrarDatos();
        cb.establecerAlias(null);
        cb.mostrarDatos();


        String a=cb.obtenerAlias();
        System.out.println(a);

    }
}

