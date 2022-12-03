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

//Si quiero construir un objeto cuenta bancaria sin enviar argumentos lo que debo hacer si ya hice un constructor previamente es sobrecargarlo

public CuentaBancaria(){

}

//observamos que ahora ya no sale el error 


//una tercera variante para construir cuentas bancarias podria ser por ejemplo no conocer o no querer dar un alias  y que se genere por defecto
//generemos entonces un tercer constructor

public CuentaBancaria(String alias,String moneda,String tipo){//Observamos que ya nos esta dando error y esto es por que al sobrecargar no puede a ver una ambiguedad es decir no puedo tener un constructor que pida tres cadenas ya que yo ya cree uno
                                                            //si yo quiero dar vuelta por ejemplo  moneda  y alias  me seguira dando error  por que a pesar de darlo vuelta java lo seguira viendo  como dos String,entonces cuando nosotros llamemos a crear una cuenta bancaria con tres cadenas de texto 
                                                            //java no sabra si llamara al constructor de la linea 11 o el que estoy creando,por que lo ve a ambos que admite tres cadenas
                                                            //Java no analiza el contexto de cual es una moneda cual es un alias si no que java ve LOS TIPOS DE DATOS
     this.CBU=generarCBU();
     setAlias(alias);
     setMoneda(moneda);
     setTipo(tipo);
}

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
