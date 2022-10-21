package v;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import m.Pokemon;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Label;

public class Creation extends JFrame {

	private JPanel contentPane;
	private JTextField tFNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creation frame = new Creation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	ButtonGroup typeButton = new ButtonGroup();
	private JTextField tFPoids;
	private JTextField tFEnergie;

	/**
	 * Create the frame.
	 */
	public Creation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tFNom = new JTextField();
		tFNom.setBounds(30, 40, 96, 19);
		contentPane.add(tFNom);
		tFNom.setColumns(10);
		
		JLabel lbNom = new JLabel("Nom");
		lbNom.setHorizontalAlignment(SwingConstants.CENTER);
		lbNom.setBounds(60, 20, 32, 13);
		contentPane.add(lbNom);
		
		JLabel lbType = new JLabel("Type");
		lbType.setHorizontalAlignment(SwingConstants.CENTER);
		lbType.setBounds(290, 20, 65, 13);
		contentPane.add(lbType);
		
		JRadioButton rBAddict = new JRadioButton("Addict");
		rBAddict.setBounds(274, 39, 103, 21);
		contentPane.add(rBAddict);
		
		JRadioButton rbFeu = new JRadioButton("Feu");
		rbFeu.setBounds(274, 62, 103, 21);
		contentPane.add(rbFeu);
		
		JRadioButton rBInsecte = new JRadioButton("Insecte");
		rBInsecte.setBounds(274, 85, 103, 21);
		contentPane.add(rBInsecte);
		
		JRadioButton rBMer = new JRadioButton("Mer");
		rBMer.setBounds(274, 108, 103, 21);
		contentPane.add(rBMer);
		
		typeButton.add(rBAddict);
		typeButton.add(rbFeu);
		typeButton.add(rBInsecte);
		typeButton.add(rBMer);
		
		JLabel lblNewLabel = new JLabel("Poids");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 70, 45, 13);
		contentPane.add(lblNewLabel);
		
		tFPoids = new JTextField();
		tFPoids.setBounds(30, 86, 96, 19);
		contentPane.add(tFPoids);
		tFPoids.setColumns(10);
		
		tFEnergie = new JTextField();
		tFEnergie.setColumns(10);
		tFEnergie.setBounds(30, 135, 96, 19);
		contentPane.add(tFEnergie);
		
		JLabel lbEnergie = new JLabel("Energie");
		lbEnergie.setHorizontalAlignment(SwingConstants.CENTER);
		lbEnergie.setBounds(60, 119, 45, 13);
		contentPane.add(lbEnergie);
		
		JLabel lbError = new JLabel("");
		lbError.setHorizontalAlignment(SwingConstants.LEFT);
		lbError.setBounds(436, 20, 340, 233);
		contentPane.add(lbError);
		
		JButton btnNext = new JButton("");
		btnNext.setHorizontalAlignment(SwingConstants.LEADING);
		btnNext.setIcon(new ImageIcon("C:\\Users\\flori\\IdeaProjects\\Pokemon\\img\\Logo_Next.gif"));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			int choix = 0;
			    if (rBAddict.isSelected())
				{ choix=1;}
				if (rbFeu.isSelected())
				{ choix=2;}
				if(rBInsecte.isSelected())
				{ choix=3;}
				if (rBMer.isSelected())
				{ choix=4;}
			
				if(tFNom.getText().length() == 0 || tFPoids.getText().length() == 0 || tFEnergie.getText().length() == 0 || choix == 0)
					lbError.setText("Vous n'avez pas renseignez tout les informations.");
				
				switch(choix) {
				case 1 :
					Pokemon pokemonJAddict = new Pokemon(tFNom.getText(), Double.parseDouble(tFEnergie.getText()), Double.parseDouble(tFPoids.getText()));
					TaddictInfo pokeAddict = new TaddictInfo(pokemonJAddict);
					pokeAddict.setVisible(true);
					break;
				case 2 :
					Pokemon pokemonJFeu = new Pokemon(tFNom.getText(), Double.parseDouble(tFEnergie.getText()), Double.parseDouble(tFPoids.getText()));
					TFeuInfo pokeFeu = new TFeuInfo(pokemonJFeu);
					pokeFeu.setVisible(true);
					break;
				case 4 :
					Pokemon pokemonJMer = new Pokemon(tFNom.getText(), Double.parseDouble(tFEnergie.getText()), Double.parseDouble(tFPoids.getText()));
					TmerInfo pokeMer = new TmerInfo(pokemonJMer);
					pokeMer.setVisible(true);
					break;
				
				};
				
			}
		});
		btnNext.setBounds(173, 179, 253, 84);
		contentPane.add(btnNext);
		
		JLabel lbErrorTitle = new JLabel("ERROR");
		lbErrorTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbErrorTitle.setBounds(601, 10, 45, 13);
		contentPane.add(lbErrorTitle);
		
		
	}
}
