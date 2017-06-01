package appPrueba;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Prueba extends JFrame {
	 
	private JButton boton = new JButton("Descúbrelo!");
	private JLabel label = new JLabel("¿En qué asignatura estamos?");
 
	public Prueba() {
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(boton);
		this.getContentPane().add(label);
		boton.setName("miBoton");
		label.setName("miLabel");
		boton.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				label.setText("Herramientas y Métodos de IS");
			}
		});
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Prueba();
	}
}