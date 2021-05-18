import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Zoo extends JFrame {
	
	ArrayList<Zvire> zvirata = new ArrayList<>();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zoo frame = new Zoo();
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
	public Zoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Zadejte druh zvirete");
		lblNewLabel.setBounds(10, 25, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zadejte vysku zvirete");
		lblNewLabel_1.setBounds(10, 65, 141, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Zadejte mnozstvi stravy");
		lblNewLabel_2.setBounds(10, 104, 141, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(187, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 62, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 101, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Pridat zvire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String druh = textField.getText();
				int vyska = Integer.parseInt(textField_1.getText());
				int spotrebaZradla = Integer.parseInt(textField_2.getText());
				zvirata.add(new Zvire(druh, vyska, spotrebaZradla));
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 163, 449, 157);
		contentPane.add(textArea);
		btnNewButton.setBounds(158, 129, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVypsatZvirata = new JButton("vypsat zvirata");
		btnVypsatZvirata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   textArea.setText(zvirata+" ");
			}
		});
		btnVypsatZvirata.setBounds(10, 129, 141, 23);
		contentPane.add(btnVypsatZvirata);
	}
}
