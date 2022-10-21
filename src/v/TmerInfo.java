package v;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import m.Pokemon;
import m.TAddict;
import m.TMer;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TmerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField tFNbrNageoire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TmerInfo frame = new TmerInfo(null);
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
	public TmerInfo(Pokemon prmPokemonJMer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NameLabel = new JLabel("MER");
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setBounds(161, 0, 82, 48);
		contentPane.add(NameLabel);
		
		JLabel lbNbrNagoir = new JLabel("Nombre de nageoire");
		lbNbrNagoir.setHorizontalAlignment(SwingConstants.CENTER);
		lbNbrNagoir.setBounds(151, 93, 106, 13);
		contentPane.add(lbNbrNagoir);
		
		tFNbrNageoire = new JTextField();
		tFNbrNageoire.setBounds(151, 113, 106, 19);
		contentPane.add(tFNbrNageoire);
		tFNbrNageoire.setColumns(10);
		
		JLabel lbError = new JLabel("New label");
		lbError.setBounds(10, 168, 45, 13);
		contentPane.add(lbError);
		
		JButton btnBattle = new JButton("COMBATTRE");
		btnBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tFNbrNageoire.getText().length() == 0) {
					lbError.setText("Vous n'avez pas renseignez tout les informations");			
				}
					
				TMer PokemonMerJ = new TMer(prmPokemonJMer, Integer.parseInt(tFNbrNageoire.getText()));
				Combat combat = new Combat(PokemonMerJ);
				combat.setVisible(true);
			}
		});
		btnBattle.setBounds(303, 204, 133, 59);
		contentPane.add(btnBattle);
		
		
	}
}
