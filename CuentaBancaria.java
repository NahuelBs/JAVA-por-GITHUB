public class CuentaBancaria {
    
   private String CBU;
   private String alias;
   private double saldo;
   private String moneda;
   private String tipo;

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
