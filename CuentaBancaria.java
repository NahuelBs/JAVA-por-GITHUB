public class CuentaBancaria {
    

    private String CBU;
    
    //getter y setter generado automaticamente para CBU    

    public String getCBU() {
        return CBU;
    }

    public void setCBU(String cBU) {
        CBU = cBU;
    }


    private String alias;

    //getter y setter generado automaticamente para alias
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    private double saldo;

    //getter y setter generado automaticamente para saldo
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




    void mostrarDatos(){

        System.out.println(this);//linea para ver que es this
        System.out.println(CBU +" "+ alias +" "+ saldo);

    }
   
    void establecerAlias(String nuevoAlias){
        if(nuevoAlias!=null)
            alias=nuevoAlias;
    }
    
    String obtenerAlias(){
        return alias;
    }

    double obtenerSaldo(){
        
        return saldo;
    }

    void depositar(double monto){
        if(monto > 0)
            saldo=saldo+monto;
    }
    

    private boolean saldoDisponible(double monto){
        
        return saldo >= monto;
    }
    
    void extraer(double monto){

        if(saldoDisponible(monto))
            saldo=saldo-monto;

    }


    

}

//Al poner los atributos privados no podemos acceder a ellos en otra clase,pero si a treves de metodos

//los getters son los metodos que devuelven los valores de los atributos como el obtenersaldo y obtener alias

//los setters permite a un atributo setearlo con un nuevo valor

