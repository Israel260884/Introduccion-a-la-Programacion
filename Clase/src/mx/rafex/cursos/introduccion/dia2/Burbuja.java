package mx.rafex.cursos.introduccion.dia2;

/**
 * Esta clase implementa el m�todo de la burbuja.
 * La clase se implementa con arreglos.
 * @author leon
 *
 */
public class Burbuja {
	
	/**
	 * M�todo para ordenar mediante "la burbuja"
	 * @param arreglo El arreglo a ordenar.
	 * @return El mismo arreglo ya ordenado.
	 */
	public static Integer[] burbuja(Integer[] arreglo){
		int intercambios = 0, comparaciones = 0;
		
		int aux = 0;
		for(int i = 1; i<arreglo.length; i++){
			for(int j= arreglo.length-1; j>=i; j-- ){
				comparaciones++;
				if (arreglo[j-1]>arreglo[j]){
					intercambios++;
					aux = arreglo[j-1];
					arreglo[j-1] = arreglo[j];
					arreglo[j] = aux;			
				}
			}
		}	
		System.out.println("Numero de intercambios:"+intercambios);
		System.out.println("Numero de comparaciones:"+comparaciones);
		return arreglo;
	}
	
	
	

}