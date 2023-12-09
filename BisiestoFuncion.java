package bisiestofuncion;


public class BisiestoFuncion {

    
    public static void main(String[] args) {        
        System.out.println("Introduzca el año en la linea de comandos!");
        int ano = Integer.parseInt(args[0]);
        
        if (bisiesto(ano)) {
            System.out.println("El año "+ano+" es bisiesto.");
        }else{
            System.out.println("El año "+ano+" no es bisiesto.");
        }
        
        
    }
    public static boolean bisiesto(int ano){
        if (ano % 4 != 0) {
            return false;
        }else if(ano % 100 != 0){
            return true;
        }else return ano % 400 == 0;        
    }
    
}
