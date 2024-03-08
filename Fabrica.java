
import java.util.ArrayList;

public class Fabrica
{
    private int[] metales;
    private ArrayList<String> estados;
    public int cantidadMaterial;
    public Fabrica(){
        metales = new int[5];
        estados = new ArrayList();
    }
    
    public String agregarMaterial(int cantidad, int contenedor)
    {
        String mensaje = "Ingreso exitoso";
        if(cantidad >= 0 && contenedor >= 4)
        {
            metales[contenedor] = cantidad;
          System.out.println("Ingreso exitoso"); 
          return mensaje;
        } 
        if(contenedor >= 0 || contenedor<= 4)
        {
            metales[contenedor]= cantidad;
            System.out.println("Error al ingresar");
            return mensaje;
        }
        return "Ingresar material";
        }
        
    public String Fabricar(int cantidadMaterial)
       {
       
        int total = 0;
         for( int i = 0 ; i< metales.length; i++)
         {
            int cantidadMetal = metales[i];
            total += cantidadMetal;
         }
         StringBuilder salida = new StringBuilder();
         if(total < cantidadMaterial)
         {
             salida.append("Falta Material");
             estados.add(salida.toString());
             System.out.println(salida.toString());
             return salida.toString();
         }
         else
         {
             salida.append("Es posible Fabricar") ;
             estados.add(salida.toString());
             System.out.println(salida.toString());
             return salida.toString();
        }
    }
    
        public int getOKs()
      {
        // Aqui reemplaza tu codigo
        int Oks = 0;
        for(String cadena:estados)
      {
        if(cadena == "Oks")
        { 
           Oks++;
       }
      }
      if(cantidadMaterial > 0)
     { 
        return 1;
    
       }
       else
       {
          return -1;
      }
    
   }
         
   public int getFallidos()
    {
        // Aqui reemplaza tu codigo
        int fallidos = 0;   
     for(int i = 0; i<estados.size(); i++)
        {
         String estado = estados.get(i);
        if(estado.equals("Falta material"))
        {  
          fallidos++;
        }
     }
     if(cantidadMaterial == 0)
     {
         return -1;
     }
     return fallidos;
   }
}   




