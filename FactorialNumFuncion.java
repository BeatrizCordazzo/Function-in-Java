package factorialnumfuncion;

import java.util.Scanner;


public class FactorialNumFuncion {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        long factorial = calcularFactorial(num);
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
    
    public static long calcularFactorial(int num){
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}
