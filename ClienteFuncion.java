package clientefuncion;

import java.util.Scanner;


public class ClienteFuncion {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sexo (H/M): ");
        String sexo = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        double seguro = calcularSeguro(sexo, edad);
        
        if (seguro == -1) {
            System.out.println("Edad introducida no es valida.");
        }else{
            System.out.println("El costo del seguro es: "+seguro+"€");
        }
    }
    public static double calcularSeguro(String sexo, int edad){
        if (sexo.equalsIgnoreCase("m")) {
            if (edad >= 18 && edad <= 30) {
                return 30.0;
            }else if (edad >= 31 && edad <= 35) {
                return 6.0;
            }
        }else if (sexo.equalsIgnoreCase("h")) {
            if (edad >= 36) {
                if (edad >= 50) {
                    return 5.5 / 2;
                }else{
                    return 5.5;
                }
            }
        }
        return -1; //Retorna -1 en caso de error
    }
    
}
