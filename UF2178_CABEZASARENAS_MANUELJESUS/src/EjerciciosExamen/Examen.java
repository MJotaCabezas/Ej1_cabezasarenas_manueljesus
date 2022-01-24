/**
 * 
 */
package EjerciciosExamen;

/**
 * @author MJotaCabezas
 *
 */
public class Examen {

	/**@param matriz para los datos.
	 * @param paciente se cuenta desde 0.
	 * @return media del IMC anual */
	
		

			

			
			public static void mostrar_imcs(double matriz[][]) { 
				
			for (int i = 0; i < matriz.length; i++) {
			}
				for (int j = 0; j < matriz[0].length; j++) {
					
					int i = 0;
					System.out.printf(" %.2f ", matriz[i][j]);
			}
					System.out.println();
			 
			}

			
		
				
		
			public static double media_paciente(double matriz[][], int paciente) {
				double media = 0;
				for (int i = 0; i < matriz[0].length; i++) {
					media += matriz[paciente][i];
				}
				return media/matriz[0].length;
	}


}