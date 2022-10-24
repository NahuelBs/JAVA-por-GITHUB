public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();//creamos un objeto auto,pero al no estar guardado,asi como lo creamos lo perdemos

        //para guardar un objeto lo asociamos a una variable dicha variable tiene que ser declarada del mismo tipo que el objeto

        Auto a;//creo variable tipo Auto

        a=new Auto();//creo un objeto auto y la asocio a una variable tipo auto

        System.out.println(a.color + " " + a.patente + " " + a.kms + " " + a.conAire);//Observamos si el objeto tiene o no estado(valor de los atributos en el instante que lo estamos consultando)

    }
}

//Lo que mostrara en la terminal sera null null 0 false 

//¿En que momento nosotros dijimos que tenian que valer eso? Java le asigna un estado inicial a todo objeto de cualquier tipo

//En el caso que un atributo apunte a otro objeto(String y demas tipos de objeto) le pondra como valor NULL(los String son objetos,vemos que estos son tratados como referancia no como cadena vacia,es null,no hay ninguna cadena alli guardada)
//Para el caso de una variable numerica(byte,short,int,long,float,double,char) es 0
//Para los tipo logicos(boolean) el valor por defecto sera falso

