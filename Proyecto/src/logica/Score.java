package logica;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class Score {

	private JFrame frame;
	private JTextField letra1;
	private JTextField letra2;
	private JTextField letra3;
	private JLabel texto;
	private JLabel fondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score window = new Score();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Score() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		letra1 = new JTextField();
		letra1.setFont(new Font("Impact", Font.PLAIN, 18));
		letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				letra2.requestFocus();
				
				
			}
		});
		letra1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				letra1.setText("");
			}
		});
		letra1.setBounds(104, 84, 50, 50);
		frame.getContentPane().add(letra1);
		letra1.setColumns(10);
		
		letra2 = new JTextField();
		letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				letra3.requestFocus();
				
				
			}
		});
		letra2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				letra2.setText("");
			}
		});
		letra2.setFont(new Font("Impact", Font.PLAIN, 18));
		letra2.setColumns(10);
		letra2.setBounds(196, 84, 50, 50);
		frame.getContentPane().add(letra2);
		
		
		JButton confirmarNombre = new JButton("Confirmar");
		confirmarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre2=null;
				String nombre1=null;
			
				nombre1=letra1.getText()+letra2.getText()+letra3.getText();
				int victorias1=1;
				int derrotas1=0;
				System.out.println(nombre1);
				BDD jugador = new BDD(victorias1,derrotas1,nombre1);
				jugador.escribirArchivo(victorias1, derrotas1, nombre1);
				if(nombre2.equals(null) && nombre1!=null) {
					nombre2=letra1.getText()+letra2.getText()+letra3.getText();
					int victorias2=1;
					int derrotas2=1;
					System.out.println(nombre2);
					jugador.escribirArchivo(victorias2, derrotas2, nombre2);
				
				 
			}
			}
		});
		confirmarNombre.setBounds(179, 198, 105, 23);
		frame.getContentPane().add(confirmarNombre);
        confirmarNombre.requestFocus();
		
		letra3 = new JTextField();
		letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				
				confirmarNombre.requestFocus();
				
			}
		});
		letra3.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				letra3.setText("");
			}
		});
		letra3.setFont(new Font("Impact", Font.PLAIN, 18));
		letra3.setColumns(10);
		letra3.setBounds(287, 84, 50, 50);
		frame.getContentPane().add(letra3);
		
		
		
		texto = new JLabel("Introduce tu nombre:");
		texto.setForeground(new Color(255, 255, 255));
		texto.setFont(new Font("Impact", Font.PLAIN, 14));
		texto.setBounds(152, 31, 132, 23);
		frame.getContentPane().add(texto);
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Score.class.getResource("/imagenes/fondonombre.png")));
		fondo.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(fondo);
		
		
		
		
	}
	}
