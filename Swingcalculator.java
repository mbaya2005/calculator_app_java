import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Create a frame
    private JFrame frame;
    
    // Create a textfield
    private JTextField textField;
    
    // Store operator and operands
    private String operator;
    private double num1, num2, result;

    // Constructor
    public SimpleCalculator() {
        // Create a frame
        frame = new JFrame("Simple Calculator");
        
        // Create a textfield
        textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);
        
        // Create buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEqual = new JButton("=");
        JButton buttonClear = new JButton("C");
        
        // Set bounds for buttons
        button1.setBounds(30, 80, 50, 40);
        button2.setBounds(100, 80, 50, 40);
        button3.setBounds(170, 80, 50, 40);
        button4.setBounds(30, 130, 50, 40);
        button5.setBounds(100, 130, 50, 40);
        button6.setBounds(170, 130, 50, 40);
        button7.setBounds(30, 180, 50, 40);
        button8.setBounds(100, 180, 50, 40);
        button9.setBounds(170, 180, 50, 40);
        button0.setBounds(100, 230, 50, 40);
        buttonAdd.setBounds(240, 80, 50, 40);
        buttonSub.setBounds(240, 130, 50, 40);
        buttonMul.setBounds(240, 180, 50, 40);
        buttonDiv.setBounds(240, 230, 50, 40);
        buttonEqual.setBounds(170, 230, 50, 40);
        buttonClear.setBounds(30, 230, 50, 40);
        
        // Add action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);
        
        // Add components to the frame
        frame.add(textField);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEqual);
        frame.add(buttonClear);
        
        // Set frame properties
        frame.setLayout(null);
        frame.setSize(320, 320);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            // If the button pressed is a number
            textField.setText(textField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            // Clear the text field
            textField.setText("");
        } else if (
