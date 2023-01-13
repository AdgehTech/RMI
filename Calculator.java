import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.border.EmptyBorder;

import java.awt.Color; 

public class Calculator extends JFrame implements ActionListener{
 
        private JTextField workingArea, history, currentValueJLabel;
        private JButton addJButton, minusJButton, mulJButton, divJButton,
                        num1, num2, num3, num4, num5, num6, num7, num8, num9,
                        equalButton, clear, module, zero, dot, backJButton, empty;
        int currentValue;
        JLabel operator;

    public Calculator(){
        operator = new JLabel("");
        setTitle("Calculator"); 
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setBackground(Color.white);
        setForeground(Color.black);
        setFont(new Font("Arial",Font.BOLD,20));
        currentValue = 0;

        workingArea = new JTextField();
        workingArea.setBackground(Color.white);
        workingArea.setForeground(Color.DARK_GRAY);
        workingArea.setFont(new Font("Arial",Font.BOLD,20)); 
        workingArea.setBorder(new EmptyBorder(0,25,0,0));
        
        history = new JTextField("History: ");
        history.setBackground(Color.white);
        history.setForeground(Color.DARK_GRAY);
        history.setFont(new Font("Arial",Font.BOLD,20));
        history.setEditable(false); 

        currentValueJLabel = new JTextField();
        currentValueJLabel.setBackground(Color.white);
        currentValueJLabel.setForeground(Color.DARK_GRAY);
        currentValueJLabel.setFont(new Font("Arial",Font.BOLD,20));
        currentValueJLabel.setEditable(false); 
        currentValueJLabel.setBorder(new EmptyBorder(0,25,0,0));
        
        addJButton = new JButton("+");
        addJButton.setFocusable(false);
        addJButton.setBackground(Color.GRAY);
        addJButton.setForeground(Color.WHITE);
        addJButton.setFont(new Font("Arial", Font.BOLD, 30));
        addJButton.setBorder(new EmptyBorder(0,0,0,0));

        minusJButton = new JButton("-");
        minusJButton.setFocusable(false); 
        minusJButton.setBackground(Color.GRAY);
        minusJButton.setForeground(Color.WHITE);
        minusJButton.setFont(new Font("Arial", Font.BOLD, 30));
        minusJButton.setBorder(new EmptyBorder(0,0,0,0));

        mulJButton = new JButton("*");
        mulJButton.setFocusable(false);
        mulJButton.setBackground(Color.GRAY);
        mulJButton.setForeground(Color.WHITE);
        mulJButton.setFont(new Font("Arial", Font.BOLD, 30));
        mulJButton.setBorder(new EmptyBorder(0,0,0,0));

        divJButton = new JButton("/");
        divJButton.setFocusable(false);
        divJButton.setBackground(Color.GRAY);
        divJButton.setForeground(Color.WHITE);
        divJButton.setFont(new Font("Arial", Font.BOLD, 20));
        divJButton.setBorder(new EmptyBorder(0,0,0,0));
        
        setLayout(new GridLayout(2,1));
        setTitle("This is simple example of a calculator");
        setBackground(Color.GRAY);
        setResizable(true); 
        
        JPanel topPanel = new JPanel(), buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4));
        topPanel.setLayout(new GridLayout(3,1));
        add(topPanel); 
            topPanel.add(history);
            topPanel.add(currentValueJLabel);
            topPanel.add(workingArea);
        
                num1 = new JButton("1");
                num1.setBackground(Color.DARK_GRAY);
                num1.setForeground(Color.WHITE);
                num1.setFont(new Font("Arial",Font.BOLD,25));
                num1.setFocusable(false);
                num1.setBorder(new EmptyBorder(0,0,0,0));

                num2 = new JButton("2"); 
                num2.setBackground(Color.DARK_GRAY);
                num2.setForeground(Color.WHITE);
                num2.setFont(new Font("Arial",Font.BOLD,25));
                num2.setFocusable(false);
                num2.setBorder(new EmptyBorder(0,0,0,0));

                num3 = new JButton("3");
                num3.setBackground(Color.DARK_GRAY);
                num3.setForeground(Color.WHITE);
                num3.setFont(new Font("Arial",Font.BOLD,25));
                num3.setFocusable(false);
                num3.setBorder(new EmptyBorder(0,0,0,0));

                num4 = new JButton("4");
                num4.setBackground(Color.DARK_GRAY);
                num4.setForeground(Color.WHITE);
                num4.setFont(new Font("Arial",Font.BOLD,25));
                num4.setFocusable(false);
                num4.setBorder(new EmptyBorder(0,0,0,0));

                num5 = new JButton("5");
                num5.setBackground(Color.DARK_GRAY);
                num5.setForeground(Color.WHITE);
                num5.setFont(new Font("Arial",Font.BOLD,25));
                num5.setFocusable(false);
                num5.setBorder(new EmptyBorder(0,0,0,0));

                num6 = new JButton("6");
                num6.setBackground(Color.DARK_GRAY);
                num6.setForeground(Color.WHITE);
                num6.setFont(new Font("Arial",Font.BOLD,25));
                num6.setFocusable(false);
                num6.setBorder(new EmptyBorder(0,0,0,0));

                num7 = new JButton("7");
                num7.setBackground(Color.DARK_GRAY);
                num7.setForeground(Color.WHITE);
                num7.setFont(new Font("Arial",Font.BOLD,25));
                num7.setFocusable(false);
                num7.setBorder(new EmptyBorder(0,0,0,0));

                num8 = new JButton("8");
                num8.setBackground(Color.DARK_GRAY);
                num8.setForeground(Color.WHITE);
                num8.setFont(new Font("Arial",Font.BOLD,25));
                num8.setFocusable(false);
                num8.setBorder(new EmptyBorder(0,0,0,0));

                num9 = new JButton("9");
                num9.setBackground(Color.DARK_GRAY);
                num9.setForeground(Color.WHITE);
                num9.setFont(new Font("Arial",Font.BOLD,25));
                num9.setFocusable(false);
                num9.setBorder(new EmptyBorder(0,0,0,0));

                zero = new JButton("0");
                zero.setBackground(Color.DARK_GRAY);
                zero.setForeground(Color.WHITE);
                zero.setFont(new Font("Arial",Font.BOLD,25));
                zero.setFocusable(false);
                zero.setBorder(new EmptyBorder(0,0,0,0));

                equalButton = new JButton("="); 
                equalButton.setBackground(Color.GRAY);
                equalButton.setForeground(Color.WHITE);
                equalButton.setFont(new Font("Arial",Font.BOLD,25));
                equalButton.setFocusable(false);
                equalButton.setBorder(new EmptyBorder(0,0,0,0));

                clear = new JButton("C");
                clear.setBackground(Color.GRAY);
                clear.setForeground(Color.WHITE);
                clear.setFont(new Font("Arial",Font.BOLD,25));
                clear.setFocusable(false);
                clear.setBorder(new EmptyBorder(0,0,0,0));

                module = new JButton("%");
                module.setBackground(Color.DARK_GRAY);
                module.setForeground(Color.WHITE);
                module.setFont(new Font("Arial",Font.BOLD,25));
                module.setFocusable(false);
                module.setBorder(new EmptyBorder(0,0,0,0));
                
                dot = new JButton("");
                dot.setBackground(Color.DARK_GRAY);
                dot.setEnabled(false);
                dot.setBorder(new EmptyBorder(0,0,0,0));

                backJButton = new JButton("<=");
                backJButton.setBackground(Color.GRAY);
                backJButton.setForeground(Color.WHITE);
                backJButton.setFont(new Font("Arial",Font.BOLD,25));
                backJButton.setFocusable(false);
                backJButton.setBorder(new EmptyBorder(0,0,0,0));
                
                empty = new JButton("");
                empty.setBackground(Color.GRAY); 
                empty.setBorder(new EmptyBorder(0,0,0,0));
                empty.setEnabled(false); 
 

        add(buttonPanel);
            buttonPanel.add(clear);
            buttonPanel.add(divJButton);
            buttonPanel.add(mulJButton);
            buttonPanel.add(backJButton);  
            clear.addActionListener(this);
            divJButton.addActionListener(this);
            mulJButton.addActionListener(this);
            backJButton.addActionListener(this);

            buttonPanel.add(num1);
            buttonPanel.add(num2);
            buttonPanel.add(num3);
            buttonPanel.add(minusJButton);
            num1.addActionListener(this);
            num2.addActionListener(this);
            num3.addActionListener(this);
            minusJButton.addActionListener(this);
            
            buttonPanel.add(num4);
            buttonPanel.add(num5);
            buttonPanel.add(num6);
            buttonPanel.add(addJButton);
            num4.addActionListener(this);
            num5.addActionListener(this);
            num6.addActionListener(this);
            addJButton.addActionListener(this);
            
            buttonPanel.add(num7);
            buttonPanel.add(num8);
            buttonPanel.add(num9);
            buttonPanel.add(equalButton);
            num7.addActionListener(this);
            num8.addActionListener(this);
            num9.addActionListener(this);
            equalButton.addActionListener(this);
            
            buttonPanel.add(module);
            buttonPanel.add(zero);
            buttonPanel.add(dot);
            buttonPanel.add(empty); 
            module.addActionListener(this);
            zero.addActionListener(this); 

        setSize(500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            if(e.getActionCommand().equals("1")){
                workingArea.setText(workingArea.getText() + "1");
            }

            if(e.getActionCommand().equals("2")){
                workingArea.setText(workingArea.getText() + "2");
            }

            if(e.getActionCommand().equals("3")){
                workingArea.setText(workingArea.getText() + "3");
            }

            if(e.getActionCommand().equals("4")){
                workingArea.setText(workingArea.getText() + "4");
            }

            if(e.getActionCommand().equals("5")){
                workingArea.setText(workingArea.getText() + "5");
            }

            if(e.getActionCommand().equals("6")){
                workingArea.setText(workingArea.getText() + "6");
            }

            if(e.getActionCommand().equals("7")){
                workingArea.setText(workingArea.getText() + "7");
            }

            if(e.getActionCommand().equals("8")){
                workingArea.setText(workingArea.getText() + "8");
            }

            if(e.getActionCommand().equals("9")){
                workingArea.setText(workingArea.getText() + "9");
            }

            if(e.getActionCommand().equals("0")){
                workingArea.setText(workingArea.getText() + "0");
            } 

            if(e.getActionCommand().equals("+")){
                operator.setText("+");
                currentValue += Integer.parseInt(workingArea.getText());
                currentValueJLabel.setText(Integer.toString(currentValue));
                history.setText(history.getText() + workingArea.getText() + "+"); 
                workingArea.setText("");
            }
            
            if(e.getActionCommand().equals("-")){
                operator.setText("-"); 
                if(currentValue==0){
                    currentValue = Integer.parseInt(workingArea.getText());
                }else{
                    currentValue -= Integer.parseInt(workingArea.getText());
                }
                currentValueJLabel.setText(Integer.toString(currentValue));
                history.setText(history.getText() + workingArea.getText() + "-"); 
                workingArea.setText("");
            }
            
            if(e.getActionCommand().equals("*")){
                operator.setText("*");
                if(currentValue==0){
                    currentValue = Integer.parseInt(workingArea.getText());
                }else{
                    currentValue *= Integer.parseInt(workingArea.getText());
                } 
                currentValueJLabel.setText(Integer.toString(currentValue));
                history.setText(history.getText() + workingArea.getText() + "*"); 
                workingArea.setText("");
            }
            
            if(e.getActionCommand().equals("/")){
                operator.setText("/");
                if(currentValue==0){
                    currentValue = Integer.parseInt(workingArea.getText());
                }else{
                    currentValue /= Integer.parseInt(workingArea.getText());
                }  
                currentValueJLabel.setText(Integer.toString(currentValue));
                history.setText(history.getText() + workingArea.getText() + "/"); 
                workingArea.setText("");
            } 

            if(e.getActionCommand().equals("%")){
                operator.setText("%");
                if(currentValue==0){
                    currentValue = Integer.parseInt(workingArea.getText());
                }else{
                    currentValue %= Integer.parseInt(workingArea.getText());
                }  
                currentValueJLabel.setText(Integer.toString(currentValue));
                history.setText(history.getText() + workingArea.getText() + "%"); 
                workingArea.setText("");
            } 
            
            if(e.getActionCommand().equals("=")){  

                if(operator.getText().equals("+")){
                    currentValueJLabel.setText(Integer.toString(currentValue + Integer.parseInt(workingArea.getText())));
                    workingArea.setText(Integer.toString(currentValue + Integer.parseInt(workingArea.getText())));
                    history.setText(history.getText() + workingArea.getText() + "+"); 

                }else if(operator.getText().equals("-")){
                    currentValueJLabel.setText(Integer.toString(currentValue - Integer.parseInt(workingArea.getText())));
                    workingArea.setText(Integer.toString(currentValue - Integer.parseInt(workingArea.getText())));

                }else if(operator.getText().equals("*")){
                    currentValueJLabel.setText(Integer.toString(currentValue * Integer.parseInt(workingArea.getText())));
                    workingArea.setText(Integer.toString(currentValue * Integer.parseInt(workingArea.getText())));

                }else if(operator.getText().equals("/")){
                    currentValueJLabel.setText(Integer.toString(currentValue / Integer.parseInt(workingArea.getText())));
                    workingArea.setText(Integer.toString(currentValue / Integer.parseInt(workingArea.getText())));

                }else if(operator.getText().equals("%")){
                    currentValueJLabel.setText(Integer.toString(currentValue % Integer.parseInt(workingArea.getText())));
                    workingArea.setText(Integer.toString(currentValue % Integer.parseInt(workingArea.getText())));
                }
            } 
            
            if(e.getActionCommand().equals("<=")){  
                workingArea.setText(workingArea.getText().substring(0, workingArea.getText().length()-1));
            } 

            if(e.getActionCommand().equals("C")){
                currentValue = 0;
                currentValueJLabel.setText("");
                history.setText("History: "); 
                workingArea.setText("");
            }    

        }catch (Exception r){ 
            currentValueJLabel.setText("  Error"); 
        }

    }  
}
