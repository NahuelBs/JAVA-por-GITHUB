public class CuentaBancaria {
    
    //Para evitar que  se ingrese valores inconsistentes,usaremos modificadores de acceso,pondremos los atributps de la cuenta bancaria como privados

    private String CBU;
    private String alias;
    private double saldo;


    void mostrarDatos(){

        System.out.println(CBU +" "+ alias +" "+ saldo);

    }

    double obtenerSaldo(){
        
        return saldo;
    }

    void depositar(double monto){
        if(monto > 0)
            saldo=saldo+monto;
    }
    

    boolean saldoDisponible(double monto){
        
        return saldo >= monto;
    }
    
    void extraer(double monto){

        if(saldoDisponible(monto))
            saldo=saldo-monto;

    }

}
