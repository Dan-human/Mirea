package ru.mirea.task4;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Football extends JFrame{
    private JButton RMbutton= new JButton("Real Madrid");
    private JButton ACbutton = new JButton("AC Milan");
    private JLabel result=new JLabel ("Result: 0 X 0 ");
    private JLabel last_scorer=new JLabel ("Last scorer: N/A");
    private JLabel winner=new JLabel ("Winner: DRAW");
    int RM=0;
    int AC=0;
    public void checkRes(){
        if (RM>AC){
            winner.setText("Winner: Real Madrid");
        }
        if(RM<AC){
            winner.setText("Winner: AC Milan");
        }
        if(RM==AC){
            winner.setText("Winner: DRAW");
        }
    }
    public Football(){

        super("Football score");
        setLayout(new BorderLayout());
        add(last_scorer, BorderLayout.SOUTH);
        add(RMbutton, BorderLayout.EAST);
        add(ACbutton, BorderLayout.WEST);
        add(result, BorderLayout.NORTH);
        add(winner, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);


        RMbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RM++;
                result.setText("Result: "+RM+" X "+AC);
                last_scorer.setText("Last scorer: Real Madrid");
                checkRes();
            }
        });
        ACbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AC++;
                result.setText("Result: "+RM+" X "+AC);
                last_scorer.setText("Last scorer: AC Milan");
                checkRes();
            }
        });


    }
}