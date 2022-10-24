public class Principal {
    
    public static void main(String[] args) {
        
        new Auto();

        Auto a;

        a=new Auto();

        System.out.println(a.color + " " + a.patente + " " + a.kms + " " + a.conAire);


        a.patente="ABC123";
        a.color="Verde";
        a.kms=500;
        a.conAire=true;

        System.out.println(a.color + " " + a.patente + " " + a.kms + " " + a.conAire);


    
        Auto a2 = new Auto();
        System.out.println(a2.color + " " + a2.patente + " " + a2.kms + " " + a2.conAire);
        
    
        a2.patente="DDFG123";
        a2.color="Azul";
        a2.kms=100;
        a2.conAire=true;

        System.out.println(a2.color + " " + a2.patente + " " + a2.kms + " " + a2.conAire);
    
    }
}

