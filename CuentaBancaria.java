public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private double saldo;
   private String moneda;
   private String tipo;



public CuentaBancaria(String alias,String moneda,String tipo){//Constructor

     this.CBU=generarCBU();
     setAlias(alias);
     setMoneda(moneda);
     setTipo(tipo);
}
//Los constructores no llevan tipo de retorno(ni siquiera void),por que por definicion los constructores devuelven las referencias de los objetos que estan creando y eso se asigna en las variables

//Los constructores se tienen que llamar con exactamente el mismo nombre que la clase,para que java lo detecte como construtor y no como metodo

//El constructor se ejecuta por una unica vez en el ciclo de vida de cada 

//Colocar al menos un constructor anula el que Java coloco por defecto

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
