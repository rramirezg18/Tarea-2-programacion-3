/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2programacion3;

/**
 *
 * @author ianto
 */
public class MetodosDeOrdenamiento {
    
    public static void selectionSort(char[] arreglo){
        for (int i = 0; i < arreglo.length -1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[minIdx]){
                    minIdx = j;
                }  
            }
            char temp = arreglo[minIdx];
            arreglo[minIdx] = arreglo[i];
            arreglo[i] = temp;
        }
    }
    
    public static void bubbleSort(char[] arreglo){
        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length - i - 1; j++){
                if(arreglo[j] > arreglo[j+1]){
                    char temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
    
    public static void insertionSort(char[] arreglo){
        for(int i = 1; i < arreglo.length; i++){
            char temp = arreglo[i];
            int j = i -1;
            for(; j >= 0 && arreglo[j] > temp; j++){
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[j+1] = temp;
        } 
    }
}
