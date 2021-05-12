package calculador;

import java.util.Scanner;

public class Calculador {

 
    public static void main(String[] args) {
        //Definimos las variables que llaman a la funcion
        double suma;
        double resta;
        double multip;
        //Definimos la variable que recoge la opcion del menu
        int opcion;
        //Definimos el escanner
        Scanner teclado = new Scanner(System.in);
        //Mostarmos el menu con las opciones
        imprimirmenu();
        //Leemos la opcion del teclado
        opcion = teclado.nextInt();
        //Segun la opcion elegida llamamos la funcion y mostramos su resultado
        switch (opcion) {
        //devuelto por la funcion
            case 1:
                suma = sumar();//llamado a la funcion
                System.out.println("Resultado: "+suma);//Mostramos el resultado
                break;
            case 2:
                resta = restar();
                System.out.println("Resultado: "+resta);
                break;
            case 3:
                multip = multiplica();
                System.out.println("Resultado: "+multip);
                break;
            default:
                break;
        }
        
    }
    public static void imprimirmenu(){
        System.out.println("Ingrese operacion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");   
    }    
    public static double sumar(){
        Scanner teclado = new Scanner(System.in);//Definimos el escaner
        System.out.println("Ingrese primer numero");
        double num1 = teclado.nextDouble();//amacenamos el primer numero
        System.out.println("Ingrese Segundo numero");
        double num2 = teclado.nextDouble();//amacenamos el segundo numero
        double suma = num1+num2;//realizamos la operacion matematica
        return suma;// devolvemos el resultado
    }
    public static double restar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese Segundo numero");
        double num2 = teclado.nextDouble();
        double resta = num1-num2;
        return resta;
    }
    public static double multiplica(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese Segundo numero");
        double num2 = teclado.nextDouble();
        double multip = num1*num2;
        return multip;
    }
}