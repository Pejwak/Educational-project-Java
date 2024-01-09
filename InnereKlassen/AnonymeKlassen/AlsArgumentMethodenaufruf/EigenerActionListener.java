package InnereKlassen.AnonymeKlassen.AlsArgumentMethodenaufruf;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EigenerActionListener extends JFrame implements ActionListener {
	public EigenerActionListener() {
		setSize(600, 400);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout());
		JButton button = new JButton();
		button.setText("Drück mich!");
		button.setActionCommand("actionCommand");
		button.addActionListener(this);
		getContentPane().add(button, BorderLayout.CENTER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(EigenerActionListener.this,
						"Mach mich wieder zu!", "Fehlermeldung",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		pack();
	}

	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String args[]) {
		EigenerActionListener e = new EigenerActionListener();
	}
}
