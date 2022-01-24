/**
 * 
 */
package EjerciciosExamen;

import java.util.Scanner;

/**
 * @author MJotaCabezas
 *
 */
public class Ej1_cabezasarenas_manueljesus {

	//ver en https://github.com/MJotaCabezas/Ej1_cabezasarenas_manueljesus.git

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);

	double peso,altura,imc;
		 
	System.out.println("Cual es su peso (en kg)");
	peso= teclado.nextDouble();
	        
	System.out.println("Cual es tu estatura(en m)");
	altura= teclado.nextDouble();
	
	imc= peso/(altura*altura);
    System.out.println("SU IMC ES: "+imc);
    
    String diagnostico;
    
      if (imc<18.5) {
    	  
    	  diagnostico="Bajo peso";
    	  
     }
      
    
      else if (imc>=18.5 && imc<=24.9) {
    	  diagnostico="Peso normal(saludable)";
         
     } 
	  
	  else if (imc>=25 && imc<=29.9) {
		  diagnostico="Sobrepeso";
         
	  }
         
       else if (imc>=30 && imc<=40) {
    	   diagnostico="Obesidad premórbida";
         
     } 
       
       else {
    	 diagnostico="Obesidad mórbida";
     }
      
      System.out.printf("El paciente de %.2f kg y %.2f m de altura, tiene un IMC de %.2f y "
    		  + "tiene un diagnóstico de %s",peso,altura,imc,diagnostico);
      
     
      
	}

}
