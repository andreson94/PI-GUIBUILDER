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
public class Calculadora {
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
                int resultado=0,valor1=0,valor2=0,valor3;
                
                valor1=(int) Float.parseFloat(txtValor1.getText());
                valor2=(int) Float.parseFloat(txtValor2.getText());
                float opcao = Float.parseFloat(txtValor3.getText());
                switch((int)opcao){
                    case 1:
                        resultado=valor1+valor2;
                        break;
                    case 2:
                        resultado=valor1-valor2;
                        break;
                    case 3:
                        resultado=valor1*valor2;
                        break;
                        case 4:
                            resultado=valor1/valor2;
                            break;
                            default:
                                JOptionPane.showMessageDialog(frame,"Opção invalida");
                            
                            
                }
                resultado = (valor1 + valor2 );
                
                JOptionPane.showMessageDialog(panel,"Valor 1:  "+txtValor1.getText()+
                        "\nValor 2: "+txtValor2.getText()+
                        "\nValor 3: "+txtValor3.getText()+"\nresultado: "+resultado);
            }
        };
            btncalcular.addActionListener(listenerMostrar);
        
        frame.pack();
        frame.setVisible(true);
    }
}

