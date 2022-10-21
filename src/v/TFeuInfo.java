package v;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import m.Pokemon;
import m.TAddict;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TFeuInfo extends JFrame {

	private JPanel contentPane;
	private JTextField tFNbrPatte;
	private JTextField tFNbrBDF;
	private JTextField tFPuissance;
	private JTextField tFTaille;
	private JLabel lbTitre;
	private JButton btnBattle;
	private JLabel lbError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TFeuInfo frame = new TFeuInfo(null);
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
	public TFeuInfo(Pokemon prmPokemonJ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNbrPatte = new JLabel("Nombre de patte");
		lbNbrPatte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNbrPatte.setHorizontalAlignment(SwingConstants.CENTER);
		lbNbrPatte.setBounds(24, 74, 114, 23);
		contentPane.add(lbNbrPatte);
		
		JLabel lbNbrBDF = new JLabel("Nombre bdf");
		lbNbrBDF.setHorizontalAlignment(SwingConstants.CENTER);
		lbNbrBDF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbNbrBDF.setBounds(148, 74, 114, 23);
		contentPane.add(lbNbrBDF);
		
		JLabel lbPuissance = new JLabel("Puissance");
		lbPuissance.setHorizontalAlignment(SwingConstants.CENTER);
		lbPuissance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbPuissance.setBounds(272, 74, 114, 23);
		contentPane.add(lbPuissance);
		
		JLabel lbTaille = new JLabel("Taille");
		lbTaille.setHorizontalAlignment(SwingConstants.CENTER);
		lbTaille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbTaille.setBounds(396, 74, 114, 23);
		contentPane.add(lbTaille);
		
		tFNbrPatte = new JTextField();
		tFNbrPatte.setBounds(24, 107, 114, 19);
		contentPane.add(tFNbrPatte);
		tFNbrPatte.setColumns(10);
		
		tFNbrBDF = new JTextField();
		tFNbrBDF.setColumns(10);
		tFNbrBDF.setBounds(148, 107, 114, 19);
		contentPane.add(tFNbrBDF);
		
		tFPuissance = new JTextField();
		tFPuissance.setColumns(10);
		tFPuissance.setBounds(272, 107, 114, 19);
		contentPane.add(tFPuissance);
		
		tFTaille = new JTextField();
		tFTaille.setColumns(10);
		tFTaille.setBounds(396, 107, 114, 19);
		contentPane.add(tFTaille);
		
		lbTitre = new JLabel("FEU");
		lbTitre.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lbTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitre.setBounds(189, 10, 137, 54);
		contentPane.add(lbTitre);
		
		btnBattle = new JButton("COMBATTRE");
		btnBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tFTaille.getText().length() == 0 || tFPuissance.getText().length() == 0 || tFNbrBDF.getText().length() == 0 || tFNbrPatte.getText().length() == 0) {
					//lbError.setText("Vous n'avez pas renseignez tout les informations");			
				}
					
				TAddict PokemonAddictJ = new TAddict(prmPokemonJ, Integer.parseInt(tFNbrPatte.getText()), Integer.parseInt(tFLvlJeu.getText()), Integer.parseInt(tFNbrHeure.getText()), Double.parseDouble(tFTaille.getText()));
				Combat combat = new Combat(PokemonAddictJ);
				combat.setVisible(true);
			}
		});
		btnBattle.setBounds(407, 194, 133, 59);
		contentPane.add(btnBattle);
		
		lbError = new JLabel("");
		lbError.setBounds(10, 141, 45, 13);
		contentPane.add(lbError);
	}

}
