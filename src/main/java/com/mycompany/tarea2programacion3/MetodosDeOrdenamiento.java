/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2programacion3;

import java.util.*;

/**
 *
 * @author ianto
 */
public class MetodosDeOrdenamiento {
    
    public static void selectionSort(char[] arreglo){
    	//consiste en seleccionar repetidamente el elemento más pequeño(o mas grande) del arreglo no ordenado y lo coloca al principio del nuevo arreglo ordenado
        for (int i = 0; i < arreglo.length -1; i++){//iterra sobre todo el arreglo menos el ultimo elemento
            int minIdx = i;//asumimos que el elemento inicial es el menor de la lista no ordenada
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[minIdx]){//buscamos elementos mas pequeños y si lo encuentra actualiza la lista
                    minIdx = j;
                }  
            }
            char temp = arreglo[minIdx];//almacenamos los valores temporales
            arreglo[minIdx] = arreglo[i];//asignamos el primer valor elemento del arreglo no ordenado
            arreglo[i] = temp;//el primer valor del elemento al sub arreglo no odenado
        }
    }
    
    public static void bubbleSort(char[] arreglo){
    	//consiste en comparar dos elementos y los ordena y se repite el proceso hasta que no encuentre elementos desordenados
        for(int i = 0; i < arreglo.length - 1; i++){//recorremos todo el arreglo menos el ultimo elemento
            for(int j = 0; j < arreglo.length - i - 1; j++){//recorremos todos los elementos menos el anterior que ya fue ordenado
                if(arreglo[j] > arreglo[j+1]){//comparamos un elemento con el siguiente
                    char temp = arreglo[j];//almacena temporalmente el valor actual analisado
                    arreglo[j] = arreglo[j+1];//asignamos el valor del siguiente elemento al elemento actual
                    arreglo[j+1] = temp; //asignamos el valor almacenado temporalmente al valor actual
                }
            }
        }
    }
    
    public static void insertionSort(char[] arreglo){
    	//consiste en construir un gradualmente un arreglo con los elementos ordenados en su posicion correcta, seleccionados del arreglo de elementos desordenados
        for(int i = 1; i < arreglo.length; i++){
            char temp = arreglo[i];
            int j = i -1;
            for(; j >= 0 && arreglo[j] > temp; j++){
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[j+1] = temp;
        } 
    }
    
    public static void mergeSort(char[] arreglo) {
    	// consiste en dividir el arreglo en sub arreglos hasta que el ultimo sub arreglo solo tenga un elemento y luego los ordenara recursivamente haciendo comparaciones entre los sub arreglos
    	mergeSortAux(arreglo, 0, arreglo.length - 1);    	
    }
    
    public static void mergeSortAux(char[] arreglo, int inicio, int fin) {
    	if(inicio < fin) {// comprobamos si los subarreglos tienen mas de un elemento
            int medio = (inicio + fin)/ 2; // calculamos la mitad del arreglo
            mergeSortAux(arreglo, inicio, medio);//ordenamos recursivamente el sub arreglo izquierdo
            mergeSortAux(arreglo, medio + 1, fin);//Ordenamos recursivamente el sub arreglo derecho
            merge(arreglo, inicio, medio, fin); // combina los dos subarreglos
    	}
    }
    
    public static void merge(char[] arreglo, int inicio, int medio, int fin) {
    	int numero1 = medio - inicio + 1; // calculamos el tamaño del subarreglo izquierdo
    	int numero2 = fin - medio;// calculamos el tamaño del subarreglo derecho
    	char[] izquierdo = new char[numero1];//almacena el sub arreglo izquierdo
    	char[] derecho = new char [numero2];//almacenamos el sub arreglo derecho
    	for(int i = 0; i < numero1; i++) {//pasamos los elementos izquierdos del arreglo original al arreglo izquierdo
            izquierdo[i] = arreglo[inicio + i];
    	}
    	for(int j = 0; j < numero2; j++) {//pasamos los elementos derechos del arreglo original al arreglo derecho
            derecho[j] =  arreglo[medio + 1 + j];
    	}
    	//unimos los arreglos izquierdo y derecho
    	int i = 0, j = 0;
    	int k = inicio;
    	while(i < numero1 && j < numero2){
            if(izquierdo[i] <= derecho[j]) {// comparamos los elementos y los ordenamos
    		arreglo[k] = izquierdo[i];
    		i ++;
            }else {
                arreglo[k] = derecho[j];
    		j++;
            }
            k++;
    	}//agregamos los elementos del arreglo izquiedo que aun no han sido agregados
    	while(i < numero1) {
            arreglo[k] = izquierdo[i];
            i++;
            k++;		  	
    	}//agregamos los elementos del arreglo derecho que aun no han sido agregados
    	while(j < numero2){
            arreglo[k] = derecho[j];
            j++;
            k++;
    	}
    }
    
    public static void quickSort(char[] arreglo) {
    	// este metodo consiste en seleccionar un elemento como pivote y colocar los elementos menores a su izquierda y los mayores a su derecha
    	quickSortAux(arreglo, 0, arreglo.length -1);
    }
    
    public static void quickSortAux(char[] arreglo, int inicio, int fin) {
    	if(inicio < fin) {// comprobamos si hay mas de un elemnto en los subarreglos
            int pivote = particion(arreglo, inicio, fin);//el pivote sirve para dividir en dos subarreglos al rededor del pivote
            quickSortAux(arreglo, inicio, pivote - 1);//ordenamos recursivamente el sub arreglo izquierdo
            quickSortAux(arreglo, pivote + 1, fin);//ordenamos recursivamente el sub arreglo derecho
    	}
    }
    	
    public static int particion(char[] arreglo, int inicio, int fin) {
    	char pivote = arreglo[fin];//seleccionamos el pivote como ultimo elemento del arreglo
    	int i = inicio - 1;// el elemento más pequeño en el arreglo 
    	for(int j = inicio; j < fin; j++) {
            if(arreglo[j] <= pivote) {
    		i++;
    		intercambiar(arreglo, i, j);//intercambia posiciones entre i, j
            }
    	}
    	intercambiar(arreglo, i + 1, fin);
    	return i + 1;
    }
    
    public static void intercambiar(char[] arreglo, int i, int j) {
    	char temp = arreglo[i];//almacena temporalmente el arreglo
    	arreglo[i] = arreglo[j];//asignamos posicion a los elementos j e i
    	arreglo[j] = temp;// asignamos el valor temporal en el arreglo 
    }
    	
    public static void heapSort(char[] arreglo) {
    	//Este metodo funciona de manera siminal a un arbol binario, creando un monticulo con los datos de tal manera que los izuierdos sean menores y los derechos mayores
    	int n = arreglo.length;
    	for(int i = n / 2 - 1; i >= 0; i--) {
            amontonar(arreglo, n, i);
    	}
    	for(int i = n - 1; i > 0; i--) {
            char temp = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temp;
            amontonar(arreglo, i, 0);
    	}
    }
    
    public static void amontonar(char[] arreglo, int n, int i) {
    	int mayor = i;
    	int izquierdo = 2 * i + 1;
    	int derecho = 2 * i + 2;
    	if(izquierdo < n && arreglo[izquierdo] > arreglo[mayor]) {
            mayor = izquierdo;
    	}
    	if(derecho < n && arreglo[derecho] > arreglo[mayor]) {
            mayor = derecho;
    	}
    	if(mayor != i) {
            char temp = arreglo[i];
            arreglo[i] = arreglo[mayor];
            arreglo[mayor] = temp;
            amontonar(arreglo, n, mayor);
    	}
    }
    	
    public static void countingSort(char[] arreglo) {
    	//consiste en contar el numero de ocurrencias de los datos en un rango e irlos ordenando recursivamente
    	int n = arreglo.length;
    	int rango = 250;
    	int[] conteo = new int[rango];
    	for(int i = 0; i < rango; i++) {
            conteo[i] = 0;
    	}
    	for(int i = 0; i < n; i++) {
            ++conteo[arreglo[i]];
    	}
    	for(int i = 1; i < rango; i++){
            conteo[i] += conteo[i-1];
    	}
    	char[] resultado = new char[n];
    	for(int i = 0; i < n; i++) {
            resultado[conteo[arreglo[i]] - 1] = arreglo[i];
            --conteo[arreglo[i]];
    	}
    	for(int i = 0; i < n; i++) {
            arreglo[i] = resultado[i];
    	}
    }
    	
    public static void radixSort(char[] arreglo) {
    	//es un metodo no comparativo que se basa en los digitos individuales de los numeros
    	int n = arreglo.length;
    	int[] arregloEnteros = new int[n];
    	for(int i = 0; i < n; i++) {
            arregloEnteros[i] = arreglo[i];
    	}
    	int maximo = Arrays.stream(arregloEnteros).max().getAsInt();
    	for(int exp = 1; maximo / exp > 0; exp *= 10) {
            countingSortPorDigito(arregloEnteros, exp);
    	}
    	for(int i = 0; i < n; i++) {
            arreglo[i] = (char) arregloEnteros[i];
    	}
    }
    
    public static void countingSortPorDigito(int[] arreglo, int exp) {
    	int n = arreglo.length;
	int rango = 10;
	int[] conteo = new int[rango];
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
	    int digito = (arreglo[i] / exp) % 10;
	    conteo[digito]++;
	}
	for (int i = 1; i < rango; i++) {
            conteo[i] += conteo[i - 1];
	}
	for (int i = n - 1; i >= 0; i--) {
	    int digito = (arreglo[i] / exp) % 10;
	    resultado[conteo[digito] - 1] = arreglo[i];
	    conteo[digito]--;
	}
	for (int i = 0; i < n; i++) {
	    arreglo[i] = resultado[i];
	}
    }
    	
    public static void bucketSort(char[] arreglo) {
    	//consiste en dividir todos los datos en listas y luego ordena cada lista de forma recursiva
    	if (arreglo == null || arreglo.length == 0) return;
    	int n = arreglo.length;
    	int rango = 250; 
    	ArrayList<Character>[] buckets = new ArrayList[rango];
    	for(int i = 0; i < rango; i++) {
            buckets[i] = new ArrayList<>();
    	}
    	for(int i = 0; i < n ; i++) {
            int bucketIndex = arreglo[i];
            buckets[bucketIndex].add(arreglo[i]);
    	}
    	int index = 0;
    	for(int i = 0; i < rango; i++) {
            for (char c : buckets[i]) {
    		arreglo[index++] = c;
            }
    	}
    }
}
