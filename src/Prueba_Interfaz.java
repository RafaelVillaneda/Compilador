import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Prueba_Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField caja_nom;
	private JTextField caja_apPaterno;
	private JTextField caja_apMaterno;
	private  JTextPane tokens;
	private JComboBox combo_dias;
	private JComboBox combo_años;
	private JComboBox combo_meses;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba_Interfaz frame = new Prueba_Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba_Interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/Imagenes/LOGO-sat-.jpeg")));
		setForeground(new Color(255, 255, 204));
		setTitle("Generador RFC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 684, 436);
		contentPane.add(tabbedPane);
		
		JPanel panel_RFC = new JPanel();
		tabbedPane.addTab("Optencion RFC", null, panel_RFC, null);
		panel_RFC.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(240, 255, 255));
		contentPane_1.setBounds(0, 0, 679, 408);
		panel_RFC.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Ingresa tu nombre: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 11, 172, 32);
		contentPane_1.add(lblNewLabel);
		
		caja_nom = new JTextField();
		caja_nom.setToolTipText("Evite ingresar caracteres que no sean letras");
		caja_nom.setColumns(10);
		caja_nom.setBounds(10, 54, 144, 32);
		contentPane_1.add(caja_nom);
		
		JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido paterno:");
		lblIngresaTuApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido.setBounds(10, 97, 202, 32);
		contentPane_1.add(lblIngresaTuApellido);
		
		caja_apPaterno = new JTextField();
		caja_apPaterno.setToolTipText("Ingresa unicamente letras ");
		caja_apPaterno.setColumns(10);
		caja_apPaterno.setBounds(10, 140, 144, 32);
		contentPane_1.add(caja_apPaterno);
		
		JLabel lblIngresaTuApellido_2 = new JLabel("Ingresa tu apellido materno: ");
		lblIngresaTuApellido_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido_2.setBounds(10, 182, 202, 32);
		contentPane_1.add(lblIngresaTuApellido_2);
		
		caja_apMaterno = new JTextField();
		caja_apMaterno.setToolTipText("Ingresa unicamente letras");
		caja_apMaterno.setColumns(10);
		caja_apMaterno.setBounds(10, 220, 144, 32);
		contentPane_1.add(caja_apMaterno);
		
		JLabel lblIngresaTuApellido_2_1 = new JLabel("Ingresa tu edad: ");
		lblIngresaTuApellido_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido_2_1.setBounds(10, 263, 202, 32);
		contentPane_1.add(lblIngresaTuApellido_2_1);
		
		combo_dias = new JComboBox();
		combo_dias.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combo_dias.setToolTipText("Elige tu d\u00EDa de nacimiento");
		combo_dias.setBounds(10, 355, 47, 22);
		contentPane_1.add(combo_dias);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(67, 348, 14, 32);
		contentPane_1.add(lblNewLabel_1);
		
		combo_meses = new JComboBox();
		combo_meses.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		combo_meses.setToolTipText("Elige tu mes de nacimiento\r\n");
		combo_meses.setBounds(79, 355, 47, 22);
		contentPane_1.add(combo_meses);
		
		JLabel lblNewLabel_1_1 = new JLabel("-");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(136, 348, 14, 32);
		contentPane_1.add(lblNewLabel_1_1);
		
		combo_años = new JComboBox();
		combo_años.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"}));
		combo_años.setToolTipText("Elige los dos ultimos n\u00FAmero de tu a\u00F1o de nacimiento");
		combo_años.setBounds(154, 355, 47, 22);
		contentPane_1.add(combo_años);
		
		JButton btn_generar_RFC = new JButton("Generar RFC");
		btn_generar_RFC.setEnabled(false);
		btn_generar_RFC.setBounds(45, 409, 122, 23);
		contentPane_1.add(btn_generar_RFC);
		
		JButton btn_analisador_lexico = new JButton("Analizador L\u00E9xico");
		btn_analisador_lexico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				analizadorLexico();
			}	
		});
		btn_analisador_lexico.setForeground(Color.BLUE);
		btn_analisador_lexico.setBounds(258, 11, 159, 23);
		contentPane_1.add(btn_analisador_lexico);
		
		JButton btn_sintactico = new JButton("An\u00E1lisis Sint\u00E1ctico");
		
		btn_sintactico.setForeground(Color.BLUE);
		btn_sintactico.setBounds(461, 11, 159, 23);
		contentPane_1.add(btn_sintactico);
		
		JLabel lblIngresaTuApellido_2_1_1 = new JLabel("Formato: dd-mm-aa");
		lblIngresaTuApellido_2_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido_2_1_1.setBounds(10, 312, 202, 32);
		contentPane_1.add(lblIngresaTuApellido_2_1_1);
		
		JLabel Label_nombre = new JLabel("_");
		Label_nombre.setBounds(187, 54, 431, 32);
		contentPane_1.add(Label_nombre);
		
		JLabel Label_primerAp = new JLabel("_");
		Label_primerAp.setBounds(187, 140, 433, 32);
		contentPane_1.add(Label_primerAp);
		
		JLabel label_segundoAp = new JLabel("_");
		label_segundoAp.setBounds(187, 220, 433, 32);
		contentPane_1.add(label_segundoAp);
		
		JPanel Panel_Tokens = new JPanel();
		tabbedPane.addTab("Tabla de Tokens", null, Panel_Tokens, null);
		Panel_Tokens.setLayout(null);
		
		btn_sintactico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				analizadorLexico();
				//Obtenemos los datos de las cajas de texto de la interfaz:
				String nombre=caja_nom.getText();
				String apellidoPaterno=caja_apPaterno.getText();
				String apellidoMaterno=caja_apMaterno.getText();
				
				//Mandamos a llamar el metodo "analizadorSintactico" para dar la respectiva retroalimentacion al usuario
				Label_nombre.setText(analizadorSintactico(nombre));
				
				Label_primerAp.setText(analizadorSintactico(apellidoPaterno));
				
				label_segundoAp.setText(analizadorSintactico(apellidoMaterno));
				
				//---------------------------------------------------Fin de funcionamiento---------------------------------------------------
				
			}
		});
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBackground(new Color(240, 255, 255));
		contentPane_2.setBounds(0, 0, 669, 397);
		Panel_Tokens.add(contentPane_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 649, 328);
		contentPane_2.add(scrollPane);
		
		tokens = new JTextPane();
		tokens.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		tokens.setEnabled(false);
		scrollPane.setViewportView(tokens);
		
		JLabel lblTablaDeTokenssimbolos = new JLabel("Tabla de tokens/s\u00EDmbolos");
		lblTablaDeTokenssimbolos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTablaDeTokenssimbolos.setBounds(232, 11, 232, 32);
		contentPane_2.add(lblTablaDeTokenssimbolos);
	}
	
	public void analizadorLexico() {
		//Aquí creamos el objeto de tipo Analisador_Lexico y le pasamos a su constructor las cadenas de texto que necesita
		Analisador_Lexico analixadorlexico=new Analisador_Lexico(caja_nom.getText().replace(" ",""), 
				caja_apPaterno.getText().replace(" ",""),caja_apMaterno.getText().replace(" ",""), 
				""+combo_dias.getSelectedItem().toString()+combo_meses.getSelectedItem().toString()+combo_años.getSelectedItem().toString());
		//Aqui llamamos el metodo analixadorLexivo el cual hace todo el análisis para la indentificaion de los tokens.
		analixadorlexico.analixadorLexivo();
		analixadorlexico.imprimir();
		
		/*
		 * Ahora aqui imprimimos los componentes en su respectivo orden en la GUI
		 */
		String tokensImprimir="====Tokens tipo Alfabético ===="+"\n";
		for (String posicion : analixadorlexico.listaTokenAlfabetico) {
			tokensImprimir+= posicion+"\n";
		}
		tokensImprimir+="====Tokens tipo Numérico===="+"\n";
		for (String posicion : analixadorlexico.listaTokenNumerico) {
			tokensImprimir+= posicion+"\n";
		}
		tokensImprimir+="====Tokens tipo desconosido===="+"\n";
		for (String posicion : analixadorlexico.listaTokenError) {
			tokensImprimir+= posicion+"\n";
		}
		tokens.setText(tokensImprimir);
	}
	
	
	//El presente metodo es el encargado de todo el analisis del analizador sintactico
	public String analizadorSintactico(String cadena) {
		System.out.println("Llego: "+cadena);
		//Obtenemos los datos de las cajas de texto de la interfaz:
		String nombre=caja_nom.getText();
		String apellidoPaterno=caja_apPaterno.getText();
		String apellidoMaterno=caja_apMaterno.getText();
		
		String resNom="Error contiene ";
		boolean verdaderoNumeros=false;
		boolean verdaderoEspecial=false;
		
		
		//Aquí comienza el funcionamiento respectivo del analizador sintactico 
		
		//---------------------------------------------------Analisis del nombre---------------------------------------------------
		for(int i=0;i<cadena.length();i++) {
			//En este for se verificara que la entrada del nombre sea sistacticamente correcta
			char car=cadena.charAt(i);
			if(!Character.isLetter(car)) {			//Primero preguntamos si el caracter leido es una letra si es una letra no indicara algun error
				if(Character.isDigit(car)) {		//Segundo preguntamos si el caracter leido es un digito en caso de serlo inicara un error en la variable "verdaderoNum"
					verdaderoNumeros=true;
				}else if(Character.isSpace(car)) {	//Tercero preguntamos si el caracter leido es un espacio en caso de serlo lo ignorara
				}else {
					verdaderoEspecial=true;				//Cuarto preguntamos si el caracter leido es un simbolo especial
				}
			}//If principal
		}//FOR Nombre
		System.out.println("Num: "+verdaderoNumeros+"  Esp: "+verdaderoEspecial);
		//Aqui se establece la retroalimentacion que recibira el usuario
		if(verdaderoEspecial==false && verdaderoNumeros==true) {
			resNom+="Error contiene Numeros";
		}
		if(verdaderoEspecial==true && verdaderoNumeros==false) {
			resNom+=" Error contiene caractere(s) desconocidos";
			
		}
		if(verdaderoEspecial==true && verdaderoNumeros==true) {
			resNom="Error el campo nombre contiene numeros y caracteres no validos";
		}
		if(verdaderoEspecial==false && verdaderoNumeros==false) {
			resNom="-";
		}
		System.out.println(resNom);
		return resNom;
	}
}
