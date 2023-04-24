package Clases;

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
    public int[] OrdenarArreglo(int nelementos){
        int arreglo[], posicion, aux;
        System.out.println("Andy Viera");
        System.out.println("test");
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
}
