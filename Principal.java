public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a=new Auto();

        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        Auto a2;
        System.out.println(a2);//observamos que nos sale error al querer mostrar a2,y nos dice que dicha variable no esta inicializada
        //que no este inicializada nos idica que NO tiene un valor por defecto  

        a2=a;//Ahora en a2 guardamos a

        System.out.println(a2);//observemos que para mostrar a2 en esta line,no sale con error eso sucede ya que la estoy inicializando antes es decir le di un valor para que pueda mostrar
    }
}



