package Clases;

import java.io.*;
import javax.swing.*;

public class Libreria {
    public int ValidaCampoEntero(String campo){
        int n=2;
        do{
            System.out.print("Ingrese "+campo+": ");
            //return n=sc.nextInt();            
            try{                
                //n=Integer.parseInt(sc.next());
            }catch(NumberFormatException ex){
                n=-1;                
                System.out.print("Opción NO Válida, debe ingresar un tipo de Dato Númerico.");                
            }     
        }while(n<0);
        return n;
    }
    public String ValidaCampoString(String campo){        
        String cadena=null;        
        /*do{
            System.out.println("Ingrese "+campo+": ");     
            cadena=sc.nextLine();
        }while (!sc.hasNextLine());*/
        return cadena;
    }

    //Algoritmo InsertSort
    public int[] OrdenarArreglo(int nelementos){
        int arreglo[], posicion, aux;

        //numElementos = Integer.parseInt(JOptionPane.showInputDialog("Insertar numero de elementos"));
        arreglo = new int[nelementos];

        //JOptionPane.showMessageDialog(null, "Insertar valores de los elementos en el arreglo");
        //for (int i = 0; i < numElementos; i++) {
        //    arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Insertar valor del elemento " + (i + 1) + ": "));
        //}

        //Ordenación por inserción
        for (int i = 0; i < nelementos; i++) {
            posicion = i;
            aux = arreglo[i];

            while ((posicion > 0 && (arreglo[posicion - 1] > aux))) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
        return arreglo;
    }

    //Metodo de lectura para archivos .csv
    private BufferedReader lectura;//me permite leer el archivo
    private String lineas;//recibe la linea de cada fila
    private String almacenamiento[]=null;//almacena cada linea que leemos
    
    public void lecturaArchivo(String nombreArchivo){
        try{ //el try lo exige el bufferedreader
            lectura=new BufferedReader(new FileReader(nombreArchivo));//creamos el objeto con el parametro del archivo
            while((lineas=lectura.readLine()) !=null){ //leemos cada linea y la guardamos en nuestra variable lineas, en caso sea null
                almacenamiento=lineas.split(";"); //separara las lineas y las guardaremos en almacenamiento
                imprimirLineas();
                System.out.println();
                System.out.println();
            }
            lectura.close(); //cuando acabe cerraremos la lectura y daremos valores nulos a las variables
            lineas=null;
            almacenamiento=null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void imprimirLineas(){
        for(int i=0;i<almacenamiento.length;i++){
            System.out.print(almacenamiento[i]+"  |  ");
        }
    }

    //public static void main(String[] args) {
        //lectorCSV nombredeobjeto=new lectorCSV();
        //leer.lecturaArchivo("ruta del archivo.csv");
    //}
}
