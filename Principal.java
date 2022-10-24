public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a;

        a=new Auto();

        System.out.println(a);//Saldra por pantalla que hay guardado realmente dentro de la variable "a"


        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        System.out.println(a);


    
        Auto a2 = new Auto();
        System.out.println(a2);//Mostrara el contenido de a2
        
    
        a2.patente="DDFG123";
        a2.color="Azul";
        a2.kms=100;
        a2.conAire=true;

        System.out.println(a2);
    
    }
}

//Veremos en al terminal lo siguiente

//Auto@36baf30c 
//Auto@36baf30c
//Auto@7a81197d
//Auto@7a81197d

//Las dos primeras impresiones de la variable a nos dio lo mismo Auto@36baf30c
//Las segundas impresiones de la variables a2 nos dio igual Auto@7a81197d

//Lo que estamos viendo,se llama IDENTIFICADOR ,lo que guarda la variable realmente  es un identificador del objeto NO todo el objeto

//Auto@ (NOMBRE DE LA CLASE)
//36baf30c (IDENTIFICADOR DE LA CLASE)

//La identificacion nos permite ver que los objetos se manejan por referencia  y para no perder esa referencia nos la guardamos en una variable de manera tal
//de no perder la forma de llegar a su valores guardados


