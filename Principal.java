public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a;

        a=new Auto();

        System.out.println(a.color + " " + a.patente + " " + a.kms + " " + a.conAire);

        //Realizaremos un cambio de estado,es decir cambiamos los valores que vienen por defecto

        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        System.out.println(a.color + " " + a.patente + " " + a.kms + " " + a.conAire);

        //Al principio de la consola,salio el estado por defecto y luuego el mismo objeto cambio de estado,paso a tener los valores que nosotros acabamos de poner

        //Crearemos un segundo auto(un segundo objeto)
        Auto a2 = new Auto();
        System.out.println(a2.color + " " + a2.patente + " " + a2.kms + " " + a2.conAire);//Observamos el estado del auto 2
        
        //Se observa al correr el programa que para el auto dos vuelve a salir los valores por defecto
        
        //Ponemos un nuevo estado al segundo auto
        a2.patente="DDFG123";
        a2.color="Azul";
        a2.kms=100;
        a2.conAire=true;

        System.out.println(a2.color + " " + a2.patente + " " + a2.kms + " " + a2.conAire);//Observamos el estado del auto 2    
    
    }
}

