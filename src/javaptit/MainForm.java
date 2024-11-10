/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 *
 * @author 84971
 */
public class MainForm extends JFrame {
    private JTextField txt1, txt2;
    private JLabel lbKQ;
    private JButton btnBQ, btnTong;
    private JComboBox cbTinh;
    public MainForm(){
        super("Tinh toan");
        initGUI();
    }

    private void initGUI() {
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
//        setLocation(100, 100);
        JPanel pMain = new JPanel();
        pMain.setLayout(new BorderLayout());
        JPanel pTren = new JPanel(new GridLayout(3, 2));
        Border bd1 = BorderFactory.createLineBorder(Color.blue);
        TitledBorder tt = new TitledBorder(bd1, "Nhap gia tri");
        pTren.setBorder(tt);
        pTren.add(new JLabel ("Nhap so thu nhat:"));
        txt1 = new JTextField();
        pTren.add(txt1);
        pTren.add(new JLabel ("Nhap so thu hai:"));
        txt2 = new JTextField();
        pTren.add(txt2);
        pTren.add(new JLabel());
        lbKQ = new JLabel("Ket qua:");
        pTren.add(lbKQ);
        pMain.add(pTren, BorderLayout.NORTH);
        add(pMain);
        JPanel pDuoi = new JPanel();
        btnBQ = new JButton("Bo qua");
        btnTong = new JButton("Tong");
        cbTinh = new JComboBox();
        pDuoi.add(btnBQ);
        pDuoi.add(btnTong);
        pDuoi.add(cbTinh);
        pMain.add(pDuoi, BorderLayout.SOUTH);
        add(pMain);

    }
    public static void main(String[] args) {
        MainForm m = new MainForm();
        m.setVisible(true);
        
    }
}
