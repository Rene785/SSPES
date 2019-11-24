import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spielfeld {
    private JPanel jPanel;
    private JButton papierButton;
    private JButton echseButton;
    private JButton steinButton;
    private JButton spockButton;
    private JButton schereButton;
    private JLabel label;
    private JLabel scenarioLabel;
    private JLabel cLabel;
    private JLabel pLabel;
    private JFrame jFrame;
    private MainController mc;

    private int cScore;
    private int pScore;

    public Spielfeld(MainController mc){
        jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(800,800);
        jFrame.setContentPane(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.mc = mc;

        steinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(mc.getTopString());
                mc.checkAndHandleSSPES(steinButton.getText(),label.getText());
            }
        });

        papierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(mc.getTopString());
                mc.checkAndHandleSSPES(papierButton.getText(),label.getText());
            }
        });

        schereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(mc.getTopString());
                mc.checkAndHandleSSPES(schereButton.getText(), label.getText());
            }
        });

        echseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(mc.getTopString());
                mc.checkAndHandleSSPES(echseButton.getText(),label.getText());
            }
        });

        spockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(mc.getTopString());
                mc.checkAndHandleSSPES(spockButton.getText(),label.getText());
            }
        });
    }

    public JLabel getScenarioLabel(){
        return scenarioLabel;
    }
}
