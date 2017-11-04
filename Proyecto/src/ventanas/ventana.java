package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana {

	private JFrame frame;
	private JButton btnGoku ;

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
		frame.setBounds(100, 100, 1482, 1154);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel NarutoGrande = new JLabel("");
		NarutoGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/naruto_grande.png")));
		NarutoGrande.setBounds(10, -107, 527, 1180);
		frame.getContentPane().add(NarutoGrande);
		NarutoGrande.setVisible(false);
		
		JButton btnNaruto = new JButton("New button");
		btnNaruto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNaruto.setVisible(false);
				NarutoGrande.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			btnNaruto.setVisible(true);
			NarutoGrande.setVisible(false);
			}
		});
		
		JLabel LuffyGrande = new JLabel("New label");
		LuffyGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/luffy_grande.png")));
		LuffyGrande.setBounds(-3, 0, 544, 1098);
		LuffyGrande.setVisible(false);
		frame.getContentPane().add(LuffyGrande);
		
		
		JLabel GokuGrande = new JLabel("");
		GokuGrande.setIcon(new ImageIcon(ventana.class.getResource("/images/Goku_grande.png")));
		GokuGrande.setBounds(-13, -8, 547, 1007);
		frame.getContentPane().add(GokuGrande);
		GokuGrande.setVisible(false);
		
		
		btnNaruto.setIcon(new ImageIcon(ventana.class.getResource("/images/Naruto_juego.png")));
		btnNaruto.setBounds(566, 315, 140, 101);
		frame.getContentPane().add(btnNaruto);
		
		JButton btnNaruto2 = new JButton("New button");
		btnNaruto2.setBounds(721, 315, 140, 101);
		frame.getContentPane().add(btnNaruto2);
		
		JButton btnLuffy = new JButton("");
		btnLuffy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				LuffyGrande.setVisible(true);
				btnLuffy.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LuffyGrande.setVisible(false);
				btnLuffy.setVisible(true);
			}
		});
		btnLuffy.setIcon(new ImageIcon(ventana.class.getResource("/images/luffy.jpg")));
		btnLuffy.setBounds(566, 427, 140, 101);
		frame.getContentPane().add(btnLuffy);
		
		JButton btnLuffy2 = new JButton("New button");
		btnLuffy2.setBounds(721, 427, 140, 101);
		frame.getContentPane().add(btnLuffy2);
		
		
		btnGoku = new JButton("New button");
		btnGoku.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				GokuGrande.setVisible(true);
				btnGoku.setVisible(false);
			}
			public void mouseExited(MouseEvent e) {
				GokuGrande.setVisible(false);
				btnGoku.setVisible(true);	
			}
			});
		btnGoku.setIcon(new ImageIcon(ventana.class.getResource("/images/goku_juego.png")));
		btnGoku.setBounds(566, 198, 140, 101);
		frame.getContentPane().add(btnGoku);
		
		JButton btngoku2 = new JButton("New button");
		btngoku2.setBounds(721, 198, 140, 101);
		frame.getContentPane().add(btngoku2);
		
		
		
		
		
		
	}
}
