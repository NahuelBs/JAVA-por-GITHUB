public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a=new Auto();//La parte (Auto a)es un objeto?


        System.out.println(a);
        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;
        System.out.println(a);

        //Para demostrar que (Auto a) no es un objeto declararemos lo siguiente

        Auto a2;
        System.out.println(a2);//Observamos que al querer operar con a2 creyendo que es un objeto no encontramos con un error 
                                //que nos dice que a2 en realidad es una varible(tipo auto) sin inicializar,como cualquier otra variable si no le damos un valor inicial simplemente no copila el programa
    }
}



