package v;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import m.Pokemon;
import m.TAddict;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaddictInfo extends JFrame {

	private JPanel contentPane;
	private JTextField tFNbrPatte;
	private JTextField tFLvlJeu;
	private JLabel lbLvlJeu;
	private JTextField tFNbrHeure;
	private JLabel lbNbrHeure;
	private JTextField tFTaille;
	private JLabel lbTaille;
	private JButton btnBattle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaddictInfo frame = new TaddictInfo(null);
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
	public TaddictInfo(Pokemon prmPokemonJ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNbrPatte = new JLabel("Nombre Patte :");
		lbNbrPatte.setBounds(10, 10, 96, 13);
		contentPane.add(lbNbrPatte);
		
		tFNbrPatte = new JTextField();
		tFNbrPatte.setBounds(100, 6, 96, 19);
		contentPane.add(tFNbrPatte);
		tFNbrPatte.setColumns(10);
		
		tFLvlJeu = new JTextField();
		tFLvlJeu.setColumns(10);
		tFLvlJeu.setBounds(80, 33, 96, 19);
		contentPane.add(tFLvlJeu);
		
		lbLvlJeu = new JLabel("Level jeux :");
		lbLvlJeu.setHorizontalAlignment(SwingConstants.LEFT);
		lbLvlJeu.setBounds(10, 36, 96, 13);
		contentPane.add(lbLvlJeu);
		
		tFNbrHeure = new JTextField();
		tFNbrHeure.setColumns(10);
		tFNbrHeure.setBounds(160, 60, 96, 19);
		contentPane.add(tFNbrHeure);
		
		lbNbrHeure = new JLabel("Nombre d'heure par jour :");
		lbNbrHeure.setHorizontalAlignment(SwingConstants.LEFT);
		lbNbrHeure.setBounds(10, 65, 175, 13);
		contentPane.add(lbNbrHeure);
		
		tFTaille = new JTextField();
		tFTaille.setColumns(10);
		tFTaille.setBounds(81, 85, 96, 19);
		contentPane.add(tFTaille);
		
		lbTaille = new JLabel("Taille :");
		lbTaille.setHorizontalAlignment(SwingConstants.LEFT);
		lbTaille.setBounds(11, 88, 96, 13);
		contentPane.add(lbTaille);
		
		JLabel lbError = new JLabel("");
		lbError.setHorizontalAlignment(SwingConstants.LEFT);
		lbError.setBounds(10, 135, 45, 13);
		contentPane.add(lbError);
		
		btnBattle = new JButton("COMBATTRE");
		btnBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tFNbrPatte.getText().length() == 0 || tFLvlJeu.getText().length() == 0 || tFNbrHeure.getText().length() == 0 || tFTaille.getText().length() == 0) {
					lbError.setText("Vous n'avez pas renseignez tout les informations");			
				}
					
				TAddict PokemonAddictJ = new TAddict(prmPokemonJ, Integer.parseInt(tFNbrPatte.getText()), Integer.parseInt(tFLvlJeu.getText()), Integer.parseInt(tFNbrHeure.getText()), Double.parseDouble(tFTaille.getText()));
				Combat combat = new Combat(PokemonAddictJ);
				combat.setVisible(true);
			}
		});
		btnBattle.setBounds(304, 205, 133, 59);
		contentPane.add(btnBattle);
		
		
	}
}
