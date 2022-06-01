import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Toolkit;



public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField caja_nom;
	private JTextField caja_apPaterno;
	private JTextField caja_apMaterno;
	ImageIcon iconoRegresar=new ImageIcon("./recursosVisuales/LOGO-sat.jpeg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/Imagenes/LOGO-sat-.jpeg")));
		setForeground(new Color(255, 255, 204));
		setTitle("Generador RFC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa tu nombre: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 11, 172, 32);
		contentPane.add(lblNewLabel);
		
		caja_nom = new JTextField();
		caja_nom.setToolTipText("Evite ingresar caracteres que no sean letras");
		caja_nom.setBounds(10, 54, 144, 32);
		contentPane.add(caja_nom);
		caja_nom.setColumns(10);
		
		JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido paterno:");
		lblIngresaTuApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido.setBounds(10, 97, 202, 32);
		contentPane.add(lblIngresaTuApellido);
		
		caja_apPaterno = new JTextField();
		caja_apPaterno.setToolTipText("Ingresa unicamente letras ");
		caja_apPaterno.setColumns(10);
		caja_apPaterno.setBounds(10, 140, 144, 32);
		contentPane.add(caja_apPaterno);
		
		JLabel lblIngresaTuApellido_2 = new JLabel("Ingresa tu apellido materno: ");
		lblIngresaTuApellido_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido_2.setBounds(10, 182, 202, 32);
		contentPane.add(lblIngresaTuApellido_2);
		
		caja_apMaterno = new JTextField();
		caja_apMaterno.setToolTipText("Ingresa unicamente letras");
		caja_apMaterno.setColumns(10);
		caja_apMaterno.setBounds(10, 220, 144, 32);
		contentPane.add(caja_apMaterno);
		
		JLabel lblIngresaTuApellido_2_1 = new JLabel("Ingresa tu edad:");
		lblIngresaTuApellido_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIngresaTuApellido_2_1.setBounds(10, 263, 202, 32);
		contentPane.add(lblIngresaTuApellido_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(234, 54, 230, 393);
		contentPane.add(scrollPane);
		
		JTextPane tokens = new JTextPane();
		tokens.setEnabled(false);
		scrollPane.setViewportView(tokens);
		
		JLabel lblTablaDeTokenssimbolos = new JLabel("Tabla de tokens/s\u00EDmbolos");
		lblTablaDeTokenssimbolos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTablaDeTokenssimbolos.setBounds(232, 11, 232, 32);
		contentPane.add(lblTablaDeTokenssimbolos);
		
		JComboBox combo_dias = new JComboBox();
		combo_dias.setToolTipText("Elige tu d\u00EDa de nacimiento");
		combo_dias.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combo_dias.setBounds(10, 318, 47, 22);
		contentPane.add(combo_dias);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(67, 311, 14, 32);
		contentPane.add(lblNewLabel_1);
		
		JComboBox combo_meses = new JComboBox();
		combo_meses.setToolTipText("Elige tu mes de nacimiento\r\n");
		combo_meses.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		combo_meses.setBounds(79, 318, 47, 22);
		contentPane.add(combo_meses);
		
		JLabel lblNewLabel_1_1 = new JLabel("-");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(136, 311, 14, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox combo_años = new JComboBox();
		combo_años.setToolTipText("Elige los dos ultimos n\u00FAmero de tu a\u00F1o de nacimiento");
		combo_años.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"}));
		combo_años.setBounds(154, 318, 47, 22);
		contentPane.add(combo_años);
		
		JButton btn_generar_RFC = new JButton("Generar RFC");
		btn_generar_RFC.setEnabled(false);
		btn_generar_RFC.setBounds(45, 391, 122, 23);
		contentPane.add(btn_generar_RFC);
		
		JButton btn_analisador_lexico = new JButton("Analizador L\u00E9xico");
		btn_analisador_lexico.setForeground(Color.BLUE);
		btn_analisador_lexico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btn_analisador_lexico.setBounds(474, 59, 159, 23);
		contentPane.add(btn_analisador_lexico);
		
		JButton btn_sintactico = new JButton("An\u00E1lisis Sint\u00E1ctico");
		btn_sintactico.setForeground(Color.BLUE);
		btn_sintactico.setBounds(474, 132, 159, 23);
		contentPane.add(btn_sintactico);
	}
}
