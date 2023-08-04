
public class FizzBuzz {

	public static void main(String[] args) {
		
		String[] fizzBuzz = new String[0];
		int limite = 100;
		
		for(int i = 1; i <= limite; i++) {
			String elemento = "";
			if(i % 3 == 0) 
				elemento = "fizz";
			else if(i % 5 == 0) 
				elemento = "buzz";
			else
				elemento = String.valueOf(i);
			
			fizzBuzz = crearLista(fizzBuzz, elemento);
			
		}
	
		for(String i: fizzBuzz)
			System.out.println(i);
		
	}
	
    public static String[] crearLista(String[] array, String elemento) {
        String[] lista = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) 
            lista[i] = array[i];
        
        lista[array.length] = elemento;

        return lista;
    }
    
}
