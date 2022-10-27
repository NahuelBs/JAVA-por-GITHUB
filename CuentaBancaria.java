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

    void depositar(double monto){//Declaramos un metodo que consta de un parametro
                                //¿Cuando se utiliza un parametro?Cuando necesitamos un valor EXTERNO a la Cuente Bancaria en este caso
                                //Hablando mas general, un parametro siempre se utiliza, cuando dentro de una clase,necesito utilizar un atributo o un valor que no se encuantra dentro de la clase donde esta ubicado el metodo 
        saldo=saldo+monto;
    }

    //Puedo observar que no hace falta recibir los atributos de la clase para poder utilizarla en un metodo dentreo de dicha clase
    //Como por ejemplo la variable saldo NO es un parametro para el metodo depositar,pero aun asi la puedo utilizar


    //Que velor tiene el monto?Hay que inicializarlo?Hay que hacer algo?
    //La respuesta es NO,tengamos en cuenta que nosotros estamos definiendo el metodo "depositar" y cada vez que alguien nos quiera depositar nos va tener que mandar si o si el monto a depositar



}
