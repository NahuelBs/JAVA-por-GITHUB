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

   




    void mostrarDatos(){

        System.out.println(this);//linea para ver que es this
        System.out.println(CBU +" "+ alias +" "+ saldo);

    }

    //El uso del this se da en circunstancias bastantes especificas una de ellas es lo que hacemos en la linea 47 ,el this hace referencia a la misma clase que esta siendo llamada en 
    //este caso cuentabancaria para ser llamada dentro de un metodo


    //Otro caso particular seria el siguiente

    public void setSaldo(double saldo) {
        this.saldo = saldo;//utilizo el this ya que el parametro tiene el mismo nombre que el atributo de la clase

    } 


   
    void establecerAlias(String nuevoAlias){
        if(nuevoAlias!=null)
            alias=nuevoAlias;
    }
    
    String obtenerAlias(){
        return this.alias;//para los metodos que no tiene ambiguedad da lo mismo si va o no el this 
    }

    double obtenerSaldo(){
        
        return saldo;
    }

    void depositar(double monto){
        if(this.monto > 0)
            saldo=saldo+this.monto;//pondriamos en un lugar incorrecto el this ya que monto  es el nombre que se decidio darle  al parametro de tipo double que llega desde afuera 
            //para realizar un deposito,pero no existe NINGUN ATRIBUTO EN LA CLASE CUENTABANCARIA que se llame monto,es decir si la variable no se encuentra como atributo de la clase no podre usar this en ella
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

