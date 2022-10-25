public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a=new Auto();

        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        Auto a2;
        
        a2=a;

        System.out.println(a.color);
        a2.color="Azul";
        System.out.println(a.color);

        //Al ejecutar el programa nosotros primero veremos Verde y luego azul,por que sucede esto si yo cambie "a2" y no "a"?
        //Lo que sucede que al igualar las dos variables estas apuntaran al mismo objeto

        System.out.println(a);
        System.out.println(a2);//lo anteriormente dicho se lo puede observar con las lineas 25 y 26

        //Vemos en la terminal la misma identidad ,es decir entonces que en la memoria hay un solo objeto
        //ese objeto esta una unica vez y habra dos manera de llegar a este objeto,por medio de la variable a o a2
        
        //Un ejemplo de lo anterior,si uno pasa la direccion de una casa a distintas personas,todos tienen la misma direccion para distintas personas,
        //y si por ejemplo pintamos la casa este cambio se ve reflejado a todos que lleguen a ella por medio de su direccion

    }
}


