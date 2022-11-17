public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a=new Auto();

        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        Auto a2;
        
        a2=null;//ahora en lugar de guardar a en a2 guardamos null

        System.out.println(a.color);
        
        a2.color="Azul";//cuando queremos que a2 acceda a su color saldra el error NullPointerException(es decir estamos tratando de acceder a un campo a traves de un punteo nulo,es decir una referencia nula)
                        //es decir queremos guardar un atributo en algo nulo(una variable nula),ya que en este caso no hay ningun objeto guardado en a2
        System.out.println(a.color);

    }
}


