public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        System.out.println(cb);
        cb.setSaldo(256);
        cb.mostrarDatos();
    }
}


