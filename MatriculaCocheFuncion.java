package matriculacochefuncion;

import java.util.Scanner;


public class MatriculaCocheFuncion {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche: ");
        String matricula = sc.nextLine();
        
        if (numeroMatriculaCorrecto(matricula) && letraMatriculaCorrecto(matricula)) {
            System.out.println("La matricula es correcta.");
        }else{
            System.out.println("La matricula no es correcta.");
        }
        sc.close();
    }
    
    public static boolean numeroMatriculaCorrecto(String matricula){
        String numeros = matricula.substring(0, 4);
        return numeros.matches("\\d{4}");
    }
    
    public static boolean letraMatriculaCorrecto(String matricula){
        String letras = matricula.substring(4);
        return letras.matches("[BCDFGHJKLMNPRSTVWXYZ]{3}");
    }
    
}
