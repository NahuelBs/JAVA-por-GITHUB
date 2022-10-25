public class CuentaBancaria {
    
    String CBU;
    String alias;
    double saldo;

    //creamos un metodo para mostrar el estado de la cuenta bancaria,asi no repetir tantas veces la misma linea como en el caso de la linea 6 y 9 de la clase principal

    void mostrarDatos(){//todos los objetos cuenta bancaria podran realizar este metodo

        System.out.println(cb.CBU +" "+ cb.alias +" "+ cb.saldo);//me sale error si copio y pego la lineas que estaban en la clase main,ya que cb no esta declarado en cuenta bancaria
                                                                //un metodo de la clase cuenta bancaria es directamente accesible a sus atributos

    }
}
