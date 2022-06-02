import java.util.ArrayList;
import java.util.Iterator;

public class Analisador_Lexico {
	/*
	 * Creamos las variables necesarias para el funcionamiento del analixador lexico
	 */
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String fechaNac;
	/*
	 * Se crean 3 listas de tipo String para la separacion de cada componente lexico optamos que fuera ArrayList ya que no sabemos cuantos componentes puedan llegar
	 */
	ArrayList<String> listaTokenAlfabetico=new ArrayList<String>();
	ArrayList<String> listaTokenNumerico=new ArrayList<String>();
	ArrayList<String> listaTokenError=new ArrayList<String>();
	
	//Contructor del analisador
	public Analisador_Lexico(String nombre, String apPaterno, String apMaterno, String fechaNac) {
		super();
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.fechaNac = fechaNac;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	//El presente metodo ara el analixis lexico 
	public void analixadorLexivo() {
		//Hacemos el analisis para la cadena nombre y asi sacar los diferentes componetes que existan
		for (int i = 0; i < nombre.length(); i++) {
			if(Character.isLetter(nombre.charAt(i))) {
				listaTokenAlfabetico.add(nombre.charAt(i)+" --> Letra encontrada en el campo nombre");
			}else if(Character.isDigit(nombre.charAt(i))) {
				listaTokenNumerico.add(nombre.charAt(i)+"--> Numero encontrado en nombre");
			}else {
				listaTokenError.add(nombre.charAt(i)+" --> caracter desconocido en nombre");
			}
			
		}
		//Hacemos el analisis para la cadena apPaterno y asi sacar los diferentes componetes que existan
		for (int i = 0; i < apPaterno.length(); i++) {
			if(Character.isLetter(apPaterno.charAt(i))) {
				listaTokenAlfabetico.add(apPaterno.charAt(i)+" --> Letra encontrada en el campo apellido paterno");
			}else if(Character.isDigit(apPaterno.charAt(i))) {
				listaTokenNumerico.add(apPaterno.charAt(i)+"--> Numero encontrado en el campo apellido paterno");
			}else {
				listaTokenError.add(apPaterno.charAt(i)+"--> caracter desconocido en apellido paterno");
			}
			
		}
		//Hacemos el analisis para la cadena apMaterno y asi sacar los diferentes componetes que existan
		for (int i = 0; i < apMaterno.length(); i++) {
			if(Character.isLetter(apMaterno.charAt(i))) {
				listaTokenAlfabetico.add(apMaterno.charAt(i)+" --> Letra encontrada en el campo apellido materno");
			}else if(Character.isDigit(apMaterno.charAt(i))) {
				listaTokenNumerico.add(apMaterno.charAt(i)+"--> Numero encontrado en el campo apellido materno");
			}else {
				listaTokenError.add(apMaterno.charAt(i)+" --> caracter desconocido en el campo apellido materno");
			}
			
		}
		//Hacemos el analisis para la cadena fechaNac y asi sacar los diferentes componetes que existan
		for (int i = 0; i < fechaNac.length(); i++) {
			if(Character.isLetter(fechaNac.charAt(i))) {
					listaTokenAlfabetico.add(fechaNac.charAt(i)+"");
			}else if(Character.isDigit(fechaNac.charAt(i))) {
					listaTokenNumerico.add(fechaNac.charAt(i)+"--> Numero encontrado en los campos de fecha");
			}else {
					listaTokenError.add(fechaNac.charAt(i)+"");
				}
					
			}
		
		
		
		
	}// analisador Lexico

	public void imprimir() {
		System.out.println(listaTokenAlfabetico);
		System.out.println(listaTokenNumerico);
		System.out.println(listaTokenError);
		
	}
	

}
