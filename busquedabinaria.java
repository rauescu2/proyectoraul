package busquedabinaria;

/**
 * 
 * @author Raul
 * @version 1.0
 */

public class busquedabinaria {

	
	public static int contador;

	/**
	 * Esta es la llamada a la funcion buscab, en la cual creamos un vector con el numero maximo donde vamos a buscar.
	 * @param args este es un parametro de los argumentos en str que le pasamos para la llamada de la funcion
	 * @throws Exception esta sirve para lanzar una excepcion 
	 */
	public static void main(String[] args) throws Exception {

		int[] v = new int[100];

		for(int j=0;j<v.length; j++) {

			v[j] = j;

		}

		int busca = 3;

		System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento " + contador);

	}
	
	/**
	 * Esta funcion, va a realizar la accion de buscar el numero que le pasemos
	 * @param vector este es un int el cual es una lista con los numeros posibles hasta el maximo
	 * @param valorabuscar este es un valor int el cual le pasamos para ver si el numero se encuentra dentro del vector
	 * @return este, hay dos opciones, si el valor se encuentra dentro del vector nos devolvera en que intento lo encontro, y si no se encuentra
	 * devolvera -1
	 */

	public static int buscab(int[] vector, int valorabuscar) {

	
		int mitad, inferior = 0;

		int superior = vector.length - 1;

		contador = 0;
		do {

			contador++;

			mitad = (inferior + superior) >>> 1;

			if(valorabuscar > vector[mitad]) {

				inferior = mitad + 1;
			} else {

				superior = mitad - 1;
			}

		} while(vector[mitad] != valorabuscar && inferior <= superior);

		if(vector[mitad] == valorabuscar) {

			return mitad;

		} else {

			return -1;
		}
	}
}
