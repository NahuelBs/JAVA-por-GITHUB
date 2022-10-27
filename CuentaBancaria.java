public class CuentaBancaria {
    
    String CBU;
    String alias;
    double saldo;

    //creamos un metodo para mostrar el estado de la cuenta bancaria,asi no repetir tantas veces la misma linea como en el caso de la linea 6 y 9 de la clase principal

    void mostrarDatos(){//todos los objetos cuenta bancaria podran realizar este metodo

        System.out.println(CBU +" "+ alias +" "+ saldo);//un metodo de la clase cuenta bancaria es directamente accesible a sus atributos

    }

    double obtenerSaldo(){
        
        return saldo;
    }

    void depositar(double monto){
        if(monto > 0)
            saldo=saldo+monto;
    }
    
    //Nuestra ultima variante posible es un metodo que reciba un parametro y devuelva algo

    boolean saldoDisponible(double monto){//El monto de este metodo no es el mismo que monto del metodo depositar son distintos parametros que yo decidi que se llamen iguales pero podrian llamarce de distintas maneras
        
        return saldo >= monto;//saldo >= monto ya es una expresion logica es un booleano,java devolvera true o false si se cumple o no la expresion logica
    }
}
