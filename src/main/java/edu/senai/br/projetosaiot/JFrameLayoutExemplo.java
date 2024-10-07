/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.senai.br.projetosaiot;

/**
 *
 * @author davi_galvao
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JFrameLayoutExemplo extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Nome:");
    private JTextField textField = new JTextField(10); // 10 é o tamanho da caixa de texto
    private JButton button = new JButton("Enviar");

    JFrameLayoutExemplo() {
        
        
        // Adiciona os componentes ao painel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

             // Adiciona o ActionListener ao botão
        button.addActionListener((ActionEvent e) -> {
            String nome = textField.getText();
            JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
        });
        
        // Adiciona o painel ao frame
        add(panel); 
        
        // Configurações da janela
        setTitle("Minha Janela FrameLayout");
        setSize(500, 400); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        setLocationRelativeTo(null); // Centralizar a janela
        setVisible(true); // Torna a janela visível
    }

    public static void main(String[] args) {
        // Criando e exibindo a janela
        SwingUtilities.invokeLater(() -> {
            new JFrameLayoutExemplo().setVisible(true);
        });
    }
    
    
}