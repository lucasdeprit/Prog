package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import logica.Animaciones;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class ventana  {

	private JFrame frame;
	private JButton btnGoku ;
	private JLabel NarutoGrande;
	private JLabel GokuGrande;
	private JLabel LuffyGrande;
	private JLabel PersGrande;
	private JLabel fondo ;
	public int personajenum = 0;
	public int fondnum = 0;
	public ImageIcon fondpred = new ImageIcon(VentanaJuego.class.getResource("/images/fondo2.gif"));
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
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
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(0, 0, 1500, 1049);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		
		JButton btnStart = new JButton("Start");
		btnStart.setVisible(true);
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				if (personajenum == 4 && fondnum == 1){
				VentanaJuego j = new VentanaJuego();
				j.frame.setVisible(true);
				frame.dispose();
				}
				if (personajenum == 3 || personajenum == 2 || personajenum == 1){
					JOptionPane.showMessageDialog(null, "el personaje todavia no esta disponible, disculpe las molestias.");
				}
				if (personajenum == 0){
					JOptionPane.showMessageDialog(null, "no has escogido personaje");
				}
				if (fondnum == 0){
					JOptionPane.showMessageDialog(null, "no has escogido fondo");
				}
			}
		});
		btnStart.setBounds(556, 947, 295, 52);
		frame.getContentPane().add(btnStart);
		
		JButton btnEscenarioPredeterminado = new JButton("escenario predeterminado");
		btnEscenarioPredeterminado.setForeground(Color.DARK_GRAY);
		btnEscenarioPredeterminado.setFont(new Font("Viner Hand ITC", Font.PLAIN, 19));
		btnEscenarioPredeterminado.addMouseListener(new MouseAdapter() {
		@Override
			public void mouseClicked(MouseEvent e) {
			
			fondo.setVisible(true);
			fondo.setIcon(fondpred);
			fondnum = 1;
			}
		});
		btnEscenarioPredeterminado.setBounds(575, 717, 259, 29);
		frame.getContentPane().add(btnEscenarioPredeterminado);
		
		PersGrande = new JLabel("");
		PersGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/sprites_personajeEjemplo/personaje_agachado.png")));
		PersGrande.setBounds(161, 243, 527, 581);
		frame.getContentPane().add(PersGrande);
		PersGrande.setVisible(false);
		
		NarutoGrande = new JLabel("");
		NarutoGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/naruto_grande.png")));
		NarutoGrande.setBounds(20, -121, 547, 1180);
		frame.getContentPane().add(NarutoGrande);
		NarutoGrande.setVisible(false);
		
		JButton btnNaruto = new JButton("New button");
		btnNaruto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				NarutoGrande.setVisible(true);
				GokuGrande.setVisible(false);
				LuffyGrande.setVisible(false);
				PersGrande.setVisible(false);
				personajenum=1;
			}
			
		});
		
		LuffyGrande = new JLabel("New label");
		LuffyGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/luffy_grande.png")));
		LuffyGrande.setBounds(-3, 0, 544, 1098);
		LuffyGrande.setVisible(false);
		
		JLabel lblEscenarios = new JLabel("ESCENARIOS:");
		lblEscenarios.setForeground(Color.BLUE);
		lblEscenarios.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblEscenarios.setBounds(565, 675, 296, 42);
		frame.getContentPane().add(lblEscenarios);
		frame.getContentPane().add(LuffyGrande);
		
		
		GokuGrande = new JLabel("");
		GokuGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/Goku_grande.png")));
		GokuGrande.setBounds(-13, -8, 547, 1007);
		frame.getContentPane().add(GokuGrande);
		GokuGrande.setVisible(false);
		
		
		btnNaruto.setIcon(new ImageIcon(ventana.class.getResource("/images/Naruto_juego.png")));
		btnNaruto.setBounds(566, 315, 140, 101);
		frame.getContentPane().add(btnNaruto);
		
		JButton btnNaruto2 = new JButton("");
		btnNaruto2.setBounds(721, 315, 140, 101);
		frame.getContentPane().add(btnNaruto2);
		
		JButton btnLuffy = new JButton("");
		btnLuffy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LuffyGrande.setVisible(true);
				GokuGrande.setVisible(false);
				NarutoGrande.setVisible(false);
				PersGrande.setVisible(false);
				personajenum = 2;
			}
			
			
		});
		btnLuffy.setIcon(new ImageIcon(ventana.class.getResource("/images/luffy.jpg")));
		btnLuffy.setBounds(566, 427, 140, 101);
		frame.getContentPane().add(btnLuffy);
		
		JButton btnLuffy2 = new JButton("");
		btnLuffy2.setBounds(721, 427, 140, 101);
		frame.getContentPane().add(btnLuffy2);
		
		
		btnGoku = new JButton("New button");
		btnGoku.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GokuGrande.setVisible(true);
				NarutoGrande.setVisible(false);
				LuffyGrande.setVisible(false);
				PersGrande.setVisible(false);
				personajenum = 3;
			}
			
			});
		btnGoku.setIcon(new ImageIcon(ventana.class.getResource("/images/goku_juego.png")));
		btnGoku.setBounds(566, 198, 140, 101);
		frame.getContentPane().add(btnGoku);
		
		JButton btngoku2 = new JButton("");
		btngoku2.setBounds(721, 198, 140, 101);
		frame.getContentPane().add(btngoku2);
		
		JButton btnpers = new JButton("");
		btnpers.setBackground(SystemColor.window);
		btnpers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GokuGrande.setVisible(false);
				NarutoGrande.setVisible(false);
				LuffyGrande.setVisible(false);
				PersGrande.setVisible(true);
				personajenum=4;
			}
		});
		btnpers.setIcon(new ImageIcon(ventana.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png")));
		btnpers.setBounds(566, 544, 140, 115);
		frame.getContentPane().add(btnpers);
		
		fondo = new JLabel("");
		fondo.setBounds(-3, 0, 1463, 1028);
		
		frame.getContentPane().add(fondo);
		fondo.setVisible(false);
		
		
		
		
		
		
	}
}
