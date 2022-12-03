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


//una tercera variante para construir cuentas bancarias podria ser por ejemplo no conocer o no querer dar un alias  y que se genere por defecto
//generemos entonces un tercer constructor

public CuentaBancaria(String moneda,String tipo){
     this.CBU=generarCBU();
     setAlias("Alias,por defecto");
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
