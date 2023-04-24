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
}
