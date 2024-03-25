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

        
    }
}