package ntu.MSSV63135728;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChuyenDoiSoNhiPhan extends JFrame {
    private JTextField inputTextField;
    private JLabel resultLabel;
    private JRadioButton binaryRadioButton;
    private JRadioButton decimalRadioButton;
    private JRadioButton hexadecimalRadioButton;

    public ChuyenDoiSoNhiPhan() {
        super("chuyen doi so");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 1));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        add(inputPanel);

        inputTextField = new JTextField(20);
        inputPanel.add(inputTextField);

        JPanel radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new FlowLayout());
        add(radioButtonPanel);

        binaryRadioButton = new JRadioButton("Số nhị phân");
        decimalRadioButton = new JRadioButton("Số thập phân");
       
        ButtonGroup group = new ButtonGroup();
        group.add(binaryRadioButton);
        group.add(decimalRadioButton);
        
        radioButtonPanel.add(binaryRadioButton);
        radioButtonPanel.add(decimalRadioButton);
        
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout());
        add(resultPanel);

        resultLabel = new JLabel("Kết quả:");
        resultPanel.add(resultLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        add(buttonPanel);

        
    }
}