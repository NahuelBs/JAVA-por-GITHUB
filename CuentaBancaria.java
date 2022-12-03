public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private double saldo;
   private String moneda;
   private String tipo;

//Si bien el anterior codigo funciona lo mejoraremos un poco ya que estamos repitiendo codigo y es una de las cosas que no se debe hacer como programador

//vemos que en dos constructores la unica diferencia es la de alias,despues son exactamente identicos

public CuentaBancaria(String alias,String moneda,String tipo){//Constructor

     this.CBU=generarCBU();
     setAlias(alias);
     setMoneda(moneda);
     setTipo(tipo);
}


public CuentaBancaria(){

}


//Para ello vamos a utilizar el this 
public CuentaBancaria(String moneda,String tipo){
     //Vamos a invocar desde aqui a otro constructor de la misma clase usando la palabra THIS,pero esta vez con parentesis
     
     this("ALIAS POR DEFECTO",moneda,tipo);//Siempre se debe apuntar al constructor mas grande que alla y resolviendo el parametro que falta,en este caso el alias
     
     //para evitar el error ponemos un alias por defecto
}

//que nos permite esto? que cuando alguien haga new cuentabancaria y nos envie apenas 2 parametros de tipo String  se ejecutara el construtor con dos parametros es decir el de la linea 28
//y asi como lo recibe los delega al construtor de la linea 13,gracias al this,es decir la moneda y y el tipo entran al constructor con dos parametros yo dentro de ese constructor llamo,
//al constructor de 3 parametros mandando exactamente la misma moneda y tipo del comienzo,pero agregando un alias para el constructor de 3 parametros desde el construtor de dos parametros 


//Entonces esto nos permite que los constructores mas pequeños,pueden llamar a los constructores  con mas parametros,por medio del THIS



   private String generarCBU(){

     return "128632734";
   }

   public void mostrarDatos(){
        System.out.println(CBU+" "+alias+" "+saldo+" "+moneda+" "+tipo);
   }

   public void setAlias(String alias){
        if(alias!=null)
        this.alias=alias;
   }

   public void setMoneda(String moneda){
        if(moneda!=null)
            this.moneda=moneda;
   }
   
   public void setTipo(String tipo){
        if(tipo!=null)
            this.tipo=tipo;
   }

   public double getSaldo(){
    return saldo;
   }
}
