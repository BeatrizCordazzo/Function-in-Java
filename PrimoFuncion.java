package primofuncion;

import java.util.Scanner;


public class PrimoFuncion {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para saber si es primo o no: ");
        int num = sc.nextInt();
        
        if (esPrimo(num)) { //Llamando la funcion esPrimo para la comprobacion
            System.out.println("El numero "+num+" es primo.");
        }else{
            System.out.println("El numero "+num+" no es primo.");
        }
        sc.close();
    }
    public static boolean esPrimo(int num){
        if (num <= 1) { //si el numero es menor o igual que 1, no es primo, por eso devolver falso
            return false;
        }
        if (num == 2) { //si no ponemos eso, y el usuario introduce el numero 2, el programa va decir que 2 no es primo
            return true;
        }
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;        
    }    
    
}