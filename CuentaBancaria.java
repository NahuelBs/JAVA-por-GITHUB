public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private double saldo;
   private String moneda;
   private String tipo;


//nosotros nunca dijimos que hay un constructor en la clase cuenta bancaria,pero java lo pone de forma implicita al constructor
//toda clase en java tendra un constructor sin que nosotros lo sepamos

//Ahora que sabemos que java por defecto crea un constructor de forma implicita,lo escribiremos para hacerlo explicito

public CuentaBancaria(String alias,String moneda,String tipo){//Constructor
//EL mejor lugar para inicializar  a los atributos de todo objeto es el constructor,para ello el constructor debe recibir parametros
//para que se establezca como valores de los atributos  
this.alias=alias;
this.moneda=moneda;
this.tipo=tipo;

}
//Los constructores no llevan tipo de retorno(ni siquiera void),por que por definicion los constructores devuelven las referencias de los objetos que estan creando y eso se asigna en las variables

//Los constructores se tienen que llamar con exactamente el mismo nombre que la clase,para que java lo detecte como construtor y no como metodo

//El constructor se ejecuta por una unica vez en el ciclo de vida de cada 

//Colocar al menos un constructor anula el que Java coloco por defecto

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
