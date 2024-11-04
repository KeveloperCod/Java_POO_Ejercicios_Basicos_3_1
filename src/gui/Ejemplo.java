package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Factura;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 73, 376, 333);
			contentPane.add(scrollPane);
			{
				txtReporte = new JTextArea();
				scrollPane.setViewportView(txtReporte);
			}
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Factura a = new Factura("814866168", "PepeSac", 80, 50.6);
					
					Factura b = new Factura("1148418", "KBRsac");
					
					Factura c = new Factura();
					
					
					listado(a);
					listado(b);
					listado(c);
					
				}
				
				void imprimir (String s){
					txtReporte.append(s + "\n");
				};
				
				void listado (Factura x) {
					imprimir("DirMem    :   "   +  x);
					imprimir("Empresa    :   "   +  x.getEmpresa());
					imprimir("Ruc    :   "   +  x.getRuc());
					imprimir("Unidades    :   "   +  x.getUnidades());
					imprimir("Precio Unitario    :   "   +  x.getpUnitario());
					imprimir("Cantidad de Facturas    :   "   +  x.getCantFactu());
					imprimir("Importe Facturados    :   "   +  x.getImpFacturados());
					imprimir("");
				}
			
			});
			btnProcesar.setBounds(149, 28, 89, 23);
			contentPane.add(btnProcesar);
		}
	}
}
