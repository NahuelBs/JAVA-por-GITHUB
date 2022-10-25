public class CuentaBancaria {
    
    String CBU;
    String alias;
    double saldo;

    //creamos un metodo para mostrar el estado de la cuenta bancaria,asi no repetir tantas veces la misma linea como en el caso de la linea 6 y 9 de la clase principal

    void mostrarDatos(){//todos los objetos cuenta bancaria podran realizar este metodo

        System.out.println(CBU +" "+ alias +" "+ saldo);//un metodo de la clase cuenta bancaria es directamente accesible a sus atributos

    }

    double obtenerSaldo(){//nos sale error,ya que ,como este metodo nos tiene que devolver algo distinto de vacio,necesitamos si o si la clausula return 

    }
}
