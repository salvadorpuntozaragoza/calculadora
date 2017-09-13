package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.StringTokenizer;
import java.awt.GridLayout;

public class Calcu extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	private String numero1;
	private String numero2;
	private int numero1int;
	private int numero2int;
	private boolean numeroState = true;
	private int resultado;
	private String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu frame = new Calcu();
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
	public Calcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlBotones = new JPanel();
		pnlBotones.setBounds(35, 112, 232, 139);
		contentPane.add(pnlBotones);
		pnlBotones.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton btnOne = new JButton("1");
		pnlBotones.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		pnlBotones.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		pnlBotones.add(btnThree);
		
		JButton btnFour = new JButton("4");
		pnlBotones.add(btnFour);
		
		JButton btnFive = new JButton("5");
		pnlBotones.add(btnFive);
		
		JButton btnSix = new JButton("6");
		pnlBotones.add(btnSix);
		
		JButton btnSeven = new JButton("7");
		pnlBotones.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		pnlBotones.add(btnEight);
		
		JButton btnNine = new JButton("9");
		pnlBotones.add(btnNine);
		
		JButton btnBlank = new JButton("");
		pnlBotones.add(btnBlank);
		
		JButton btnZero = new JButton("0");
		pnlBotones.add(btnZero);
		
		txtPantalla = new JTextField();
		txtPantalla.setEnabled(false);
		txtPantalla.setBounds(56, 28, 130, 26);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JPanel pnlOperaciones = new JPanel();
		pnlOperaciones.setBounds(326, 112, 68, 139);
		contentPane.add(pnlOperaciones);
		pnlOperaciones.setLayout(new GridLayout(4, 2, 0, 0));
		
		JButton btnMas = new JButton("+");
		pnlOperaciones.add(btnMas);
		
		JButton btnMenos = new JButton("-");
		pnlOperaciones.add(btnMenos);
		
		JButton btnPor = new JButton("x");
		pnlOperaciones.add(btnPor);
		
		JButton btnDivision = new JButton("/");
		pnlOperaciones.add(btnDivision);
		
		JButton btnCuadrado = new JButton("^");
		pnlOperaciones.add(btnCuadrado);
		
		JButton btnRaiz = new JButton("Sq");
		pnlOperaciones.add(btnRaiz);
		
		JButton btnIgual = new JButton("=");
		pnlOperaciones.add(btnIgual);
		
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "1";
					else
						numero1 = numero1 + "1";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "1";
					else
						numero2 = numero2 + "1";
					
					txtPantalla.setText(numero2);
				}
				
			}
		});
		
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "2";
					else
						numero1 = numero1 + "2";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "2";
					else
						numero2 = numero2 + "2";
					
					txtPantalla.setText(numero2);
				}
				
			}
		});
		
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "3";
					else
						numero1 = numero1 + "3";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "3";
					else
						numero2 = numero2 + "3";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "4";
					else
						numero1 = numero1 + "4";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "4";
					else
						numero2 = numero2 + "4";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "5";
					else
						numero1 = numero1 + "5";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "5";
					else
						numero2 = numero2 + "5";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "6";
					else
						numero1 = numero1 + "6";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "6";
					else
						numero2 = numero2 + "6";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "7";
					else
						numero1 = numero1 + "7";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "7";
					else
						numero2 = numero2 + "7";
					
					txtPantalla.setText(numero2);
				}
				
			
			}
		});
		
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "8";
					else
						numero1 = numero1 + "8";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "8";
					else
						numero2 = numero2 + "8";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "9";
					else
						numero1 = numero1 + "9";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "9";
					else
						numero2 = numero2 + "9";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numeroState == true){
					if(numero1 == null)
						numero1 = "0";
					else
						numero1 = numero1 + "0";
					
					txtPantalla.setText(numero1);
				}else{
					if(numero2 == null)
						numero2 = "0";
					else
						numero2 = numero2 + "0";
					
					txtPantalla.setText(numero2);
				}
				
				
			}
		});
		
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("0");
				numeroState = false;
				operacion = "suma";
			}
		});
		
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("0");
				numeroState = false;
				operacion = "resta";
			}
		});
		
		btnPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("0");
				numeroState = false;
				operacion = "multiplicacion";
			}
		});
		
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("0");
				numeroState = false;
				operacion = "division";
			}
		});
		
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1int = Integer.parseInt(numero1);
				resultado = numero1int * numero1int;
				txtPantalla.setText(String.valueOf(resultado));
				numero1 = null;
			}
		});
		
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1int = Integer.parseInt(numero1);
				resultado = (int)Math.sqrt((double)numero1int);
				txtPantalla.setText(String.valueOf(resultado));
				numero1 = null;
			}
		});
		
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1int = Integer.parseInt(numero1);
				numero2int = Integer.parseInt(numero2);
				
				if(operacion == "suma")
					resultado = numero1int + numero2int;
				if(operacion == "resta")
					resultado = numero1int - numero2int;
				if(operacion == "multiplicacion")
					resultado = numero1int * numero2int;
				if(operacion == "division")
					resultado = numero1int / numero2int;
				if(operacion == "raiz")
					resultado = numero1int - numero2int;
				
				txtPantalla.setText(String.valueOf(resultado));
				numeroState = true;
				numero1 = null;
				numero2 = null;
			}
		});
	}
}
