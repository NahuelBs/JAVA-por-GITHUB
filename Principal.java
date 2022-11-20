public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.establecerAlias("mi Nuevo Alias");
        cb.mostrarDatos();
        cb.establecerAlias(null);
        cb.mostrarDatos();

        //Si quiero obtener el alias y guardarlo por separado 

        String a=cb.obtenerAlias();
        System.out.println(a);

        //Ahora veremos los detalles de implementacion

        //Nosotros ahora queremos que saldo disponible sea un metodo de apoyo al metodo extraer y que no pueda ser utilizado por la clase principal 
        //para ello ponemos el modificador de acceso private para el metodo saldoDisponible,de esta forma la clase principal no podra utilizar el metodo de forma directa
        //si no que solamente podra ser usado por la misma clase que fue creada,en este caso cuenta bancaria
    }
}

