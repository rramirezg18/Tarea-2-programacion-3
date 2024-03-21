/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2programacion3;

/**
 *
 * @author ianto
 */
import java.util.*;
public class Tarea2Programacion3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MetodosDeOrdenamiento metodo = new MetodosDeOrdenamiento();
        String cadena = "";
        System.out.println("Ingresa una cadena de texto");
        cadena = entrada.nextLine();
        char[] arreglo = cadena.toCharArray();
        int opcion = 0;
        int salir = 0;
        while(salir != 1){
            Menu();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                	System.out.println("\n\t Selection Sort\n");
                    System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.selectionSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 2:
                	System.out.println("\n\t Bubble Sort\n");
                    System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.bubbleSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 3:
                	System.out.println("\n\t Insertion Sort\n");
                    System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.insertionSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 4:
                	System.out.println("\n\t Merge Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.mergeSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 5:
                	System.out.println("\n\t Quick Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.quickSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 6:
                	System.out.println("\n\t Heap Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.heapSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 7:
                	System.out.println("\n\t Counting Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.countingSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 8:
                	System.out.println("\n\t Radix Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.radixSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 9:
                	System.out.println("\n\t Bucket Sort\n");
                	System.out.println("La cadena desordenada es");
                    System.out.println(cadena);
                    metodo.bucketSort(arreglo);
                    System.out.println("La cadena ordenada es");
                    System.out.println(arreglo);
                    break;
                case 10:
                	salir = 1;
                    break;
            }
        }
    }
    
    public static void Menu(){
        System.out.println("\n\t METODOS DE ORDENAMIENTO\n");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Heap Sort");
        System.out.println("7. Counting Sort");
        System.out.println("8. Radix Sort");
        System.out.println("9. Bucket Sort");
        System.out.println("10. Salir \n");
        System.out.println("Seleccione un metodo de ordenamiento");
        
    }
}
