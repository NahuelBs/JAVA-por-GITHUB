public class Principal {
    public static void main(String[] args) {
      
        CuentaBancaria cb = new CuentaBancaria();

        cb.saldo = -123;
        cb.alias = ")/&(&$))";
        cb.CBU = "Hola que tal";
        //Vemos que las lineas 6,7 y 8 ahora salen con error,por que tanto saldo como alias y CBU tienen acceso privado en cuenta bancaria y no sera posible verlo desde la clase principal

        //El programa no copilara,entonces ya hemos garantizado la integridad de los objetos por que ya no sera capaz cualquier clase de asignarle valores a saldo alias o CBU
        //si no que para ello,debera pasar por metodos de  la  propia clase cuenta bancaria con validaciones 

        cb.mostrarDatos();
    }
}
