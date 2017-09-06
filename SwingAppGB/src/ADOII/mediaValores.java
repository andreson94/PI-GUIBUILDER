package ADOII;

import static ADOII.cadastroUsuarios.criarGUI;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Andreson
 */
public class mediaValores {
    public static void main(String[] args) {
        Runnable t= new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(t);
    }
    public static void criarGUI(){
       
        JFrame frame = new JFrame();
        Dimension d = new Dimension(500,300);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cadastro de Dados dos Usúarios");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JLabel lblValor1 = new JLabel("Valor 1: ");
        panel.add(lblValor1);
        
        final JTextField txtValor1 = new JTextField(5);
        panel.add(txtValor1);
        
        JLabel lblValor2 = new JLabel("Valor 2: ");
        panel.add(lblValor2);
        
        final JTextField txtValor2 = new JTextField(5);
        panel.add(txtValor2);
       
        JLabel lblValor3 = new JLabel("Valor 3: ");
        panel.add(lblValor3);
        
        final JTextField txtValor3 = new JTextField(5);
        panel.add(txtValor3);
        
        JButton btncalcular = new JButton("Calcular");
        panel.add(btncalcular);
         
        ActionListener listenerMostrar = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                float media=0,valor1=0,valor2=0,valor3=0;
                
                valor1=Float.parseFloat(txtValor1.getText());
                valor2=Float.parseFloat(txtValor2.getText());
                valor3=Float.parseFloat(txtValor3.getText());
                
                media = (valor1 + valor2 + valor3)/3;
                
                JOptionPane.showMessageDialog(panel,"Valor 1:  "+txtValor1.getText()+
                        "\nValor 2: "+txtValor2.getText()+
                        "\nValor 3: "+txtValor3.getText()+"\nMédia: "+media);
            }
        };
            btncalcular.addActionListener(listenerMostrar);
        
        frame.pack();
        frame.setVisible(true);
    }
}
