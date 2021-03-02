package menoramayor;

import java.util.Scanner;

public class MenorAmayor {

    private int numero[];
    private int cantidad, aux;
    Scanner sc = new Scanner(System.in);
    
    public MenorAmayor(){
        System.out.println("Programa que pida N cantidad de numeros, y los ordenanda de menor a mayor.\n");
    }
    
    public void dato(){
        System.out.print("Cuantos numeros deceas ingresar: ");
        cantidad = sc.nextInt();
        
        numero = new int[cantidad];
        
        for(int i=0; i<cantidad; i++){
            System.out.print("Ingresa un numero: ");
            numero[i] = sc.nextInt();
        }
    }
    public void proceso(){
        for(int i=0; i<(cantidad-1); i++){
            for(int j=0; j<(cantidad-1); j++){
                if(numero[j]>numero[j+1]){
                aux = numero[j];
                numero[j] = numero[j+1];
                numero[j+1] = aux;
                }
            }
        }
        System.out.println("El resulado ordenado de menor a mayor es: ");
        for(int i=0; i<cantidad; i++){
            System.out.print(numero[i] + ", ");
    }
        System.out.println(" ");
    }
    public static void main(String[] args) {
      
        MenorAmayor exe = new MenorAmayor();
        
        exe.dato();
        exe.proceso();
    }
    
}
