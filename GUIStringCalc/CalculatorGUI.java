
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    static JTextField num1Field = new JTextField("Integer 1");
    static JTextField num2Field = new JTextField("Integer 2");
    static Container container = new Container();
    static JFrame frame = new JFrame("Calculator");
    static JTextField sumOut = new JTextField();


    public static void start() {
        GridBagLayout gbl = new GridBagLayout();
        Container container = new Container();
        container.setLayout(gbl);

        GridBagConstraints startConstraints = new GridBagConstraints();

        startConstraints.gridheight = 2;
        startConstraints.gridwidth = 2;
        startConstraints.gridx = 2;
        startConstraints.gridy = 2;
        startConstraints.weightx = 1;
        startConstraints.weighty = 1;
        startConstraints.anchor = GridBagConstraints.CENTER;
        startConstraints.fill = GridBagConstraints.BOTH;
        startConstraints.insets = new Insets(10, 10, 10, 10);

        JButton startButton = new JButton("Add!");
        startButton.addActionListener(new StartButtonAction());

        GridBagConstraints greetingConstraints = new GridBagConstraints();
        JTextField greeting = new JTextField("Welcome to Jayden's String Calculator!\nEnter two postive digits to add together.");
        greetingConstraints.gridheight = 1;
        greetingConstraints.gridwidth = 2;
        greetingConstraints.gridx = 0;
        greetingConstraints.gridy = 0;
        greetingConstraints.weightx = 1;
        greetingConstraints.weighty = 1;
        greetingConstraints.anchor = GridBagConstraints.CENTER;
        greetingConstraints.fill = GridBagConstraints.BOTH;
        greetingConstraints.insets = new Insets(10, 10, 10, 10);


        GridBagConstraints num1Constraints = new GridBagConstraints();
        GridBagConstraints num2Constraints = new GridBagConstraints();
        num1Constraints.gridheight = 1;
        num1Constraints.gridwidth = 1;
        num1Constraints.gridx = 0;
        num1Constraints.gridy = 1;
        num1Constraints.weightx = 1;
        num1Constraints.weighty = 1;
        num1Constraints.anchor = GridBagConstraints.CENTER;
        num1Constraints.fill = GridBagConstraints.BOTH;
        num1Constraints.insets = new Insets(10, 10, 10, 10);

        num2Constraints.gridheight = 1;
        num2Constraints.gridwidth = 2;
        num2Constraints.gridx = GridBagConstraints.RELATIVE;
        num2Constraints.gridy = 1;
        num2Constraints.weightx = 1;
        num2Constraints.weighty = 1;
        num2Constraints.anchor = GridBagConstraints.CENTER;
        num2Constraints.fill = GridBagConstraints.BOTH;
        num2Constraints.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints sumOutConstraints = new GridBagConstraints();

        sumOutConstraints.gridheight = 1;
        sumOutConstraints.gridwidth = 1;
        sumOutConstraints.gridx = 0;
        sumOutConstraints.gridy = 2;
        sumOutConstraints.weightx = 1;
        sumOutConstraints.weighty = 1;
        sumOutConstraints.anchor = GridBagConstraints.CENTER;
        sumOutConstraints.fill = GridBagConstraints.BOTH;
        sumOutConstraints.insets = new Insets(10, 10, 10, 10);
        sumOut.setEditable(false);



        container.add(sumOut, sumOutConstraints);
        container.add(num1Field, num1Constraints);
        container.add(num2Field, num2Constraints);
        container.add(greeting);
        container.add(startButton, startConstraints);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(container);
        frame.setLocation(700, 560);
        frame.pack();
        frame.setSize(1200, 200);
        frame.setVisible(true);
        

    }

    public static void calculateString () {
        String sum = Calc.add(num1Field.getText(), num2Field.getText());

        sumOut.setText("Sum: " + sum);

        container.revalidate();
        container.repaint();
        
        
    }

    
}

class StartButtonAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CalculatorGUI.calculateString();
    }
}
