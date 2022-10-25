public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();//creamos un objeto cuenta bancaria,guardandola en la variable cb para no perderla asi llegar a el

        System.out.println(cb.CBU +" "+ cb.alias +" "+ cb.saldo);//mostramos los valores de los atributo
        cb.CBU="324788324629102";//realizamos dos cambios de estado
        cb.alias="miCuenta";
        System.out.println(cb.CBU +" "+ cb.alias +" "+ cb.saldo);//volvemos a mostrar lo atributos

    }
}
