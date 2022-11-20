public class CuentaBancaria {
    
    //Para evitar que  se ingrese valores inconsistentes,usaremos modificadores de acceso,pondremos los atributps de la cuenta bancaria como privados

    private String CBU;
    private String alias;
    private double saldo;


    void mostrarDatos(){

        System.out.println(CBU +" "+ alias +" "+ saldo);

    }

    void establecerAlias(String nuevoAlias){//metodo creado para poder establecer nuevo alias
        if(nuevoAlias!=null)//validamos si el area no es null
            alias=nuevoAlias;
    }
    
    String obtenerAlias(){//metodo creado para obtener el alias por separado
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

//Existen 4 modificadores de acceso en JAVA

//PUBLICO public
//PRIVADO private 
//(nada) visibilidad de paqueta,como ambas clases estan en el mismo paquete  se pueden conocer,si la clase principal estuviera en otro paquete,no hubiese podido acceder a los metodos de la clase cuenta bancaria

