package logica;

/**
 * 
 * @author Luisa Suarez
 * lsuarezzapata5@gmail.com
 *
 */
public class Convertidor {
	
	public int convertirRomanoADecimal(String romano) {
		char romanos[]= {' ','I','V','X','L','C','D','M'}; 
	       int decimales[] = {0,1,5,10,50,100,500,1000};
	       int anterior = 0;
	       int decimal = 0;
	       char letra = ' ';
	       for(int i = 0; i < romano.length(); i++){
	               letra = romano.charAt(i);
	               for(int j = 0; j < romanos.length; j++){
	                   if(letra == romanos[j]){                 
	                               decimal = decimal + decimales [j]; 
	                           if( anterior < decimales[j]){ 
	                                   decimal = decimal - anterior*2 ; 
	                                   anterior = decimales[j]; 
	                           }else {
	                        	   anterior = decimales[j];
	                           }              
	                   }
	               }
		   }
	    return decimal; 
	}
}
