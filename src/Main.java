import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	Label text;
	JButton [] gameButtons= new JButton[9];
	Font myFont=  new Font("Ink Free",Font.BOLD,42);
	Font font=  new Font("Ink Free",Font.BOLD,24);
	int turn=1;
	JButton playagainButton;
	

	 Main() {
	
	
		
		 
		frame = new JFrame("Tic-tac-toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,720);
		frame.setLayout(null);
		
		playagainButton = new JButton("Play again");
		
		 // remove border around text
		playagainButton.setFocusPainted(false);
		playagainButton.setFont(font);
		playagainButton.setBackground(Color.blue);
		playagainButton.setForeground(Color.BLACK);
		playagainButton.addActionListener(this);
		playagainButton.setBounds(100, 70, 200, 50);
		
		text = new Label();
		text.setBounds(500,25,200,50);
		text.setFont(font);
		text.setForeground(Color.BLUE);
		
		
		panel = new JPanel();
		panel.setBounds(400,100,500,500);
		panel.setLayout(new GridLayout(3,3));
		
		
		for (int i = 0; i < gameButtons.length; i++) {
			 
			 gameButtons[i]= new JButton("") ;
			 // remove border around text
			 gameButtons[i].setFocusPainted(false);
			 gameButtons[i].setFont(myFont);
			 gameButtons[i].setBackground(Color.darkGray);
			 gameButtons[i].addActionListener(this);
			 panel.add(gameButtons[i]);
				
		}
		
	     frame.add(playagainButton);
		 frame.add(text);
		 frame.add(panel);
		 frame.setVisible(true);
	}

	public static void main(String[] args) {
		Main tic= new Main();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==playagainButton) {
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setText("");
				gameButtons[i].setEnabled(true);
				gameButtons[i].setBackground(Color.DARK_GRAY);
				text.setText("");
			}
		}
	
		 for (int i = 0; i < 9; i++) {
			if (e.getSource()== gameButtons[i]) {
				
				switch (turn) {
				case 1:
					gameButtons[i].setBackground(Color.cyan);
					gameButtons[i].setText("X");
					gameButtons[i].setEnabled(false);
					turn=2;
					break;
				case 2:
					gameButtons[i].setBackground(Color.magenta);
					gameButtons[i].setText("O");
					gameButtons[i].setEnabled(false);
					turn=1;
					break;
                default:
                	break;
			
				}
				
				
			}
			
			
		}
		 
		 if (gameButtons[0].getText()=="O" & gameButtons[1].getText()=="O" & gameButtons[2].getText()=="O" ) {
				
				text.setText("Player 2  wins");
				for (int i = 0; i < gameButtons.length; i++) {
					gameButtons[i].setEnabled(false);
				}
				
			}
        if (gameButtons[0].getText()=="O" & gameButtons[3].getText()=="O" & gameButtons[6].getText()=="O" ) {
				
				text.setText("Player 2  wins");
				for (int i = 0; i < gameButtons.length; i++) {
					gameButtons[i].setEnabled(false);
				}
				
			}
        if (gameButtons[0].getText()=="O" & gameButtons[4].getText()=="O" & gameButtons[8].getText()=="O" ) {
				
				text.setText("Player 2  wins");
				for (int i = 0; i < gameButtons.length; i++) {
					gameButtons[i].setEnabled(false);
				}
				
				
			}
        if (gameButtons[2].getText()=="O" & gameButtons[5].getText()=="O" & gameButtons[8].getText()=="O" ) {
				
				text.setText("Player 2  wins");
				for (int i = 0; i < gameButtons.length; i++) {
					gameButtons[i].setEnabled(false);
				}
				
				
			}
        if (gameButtons[6].getText()=="O" & gameButtons[7].getText()=="O" & gameButtons[8].getText()=="O" ) {
				
				text.setText("Player 2  wins");
				for (int i = 0; i < gameButtons.length; i++) {
					gameButtons[i].setEnabled(false);
				}
				
				
			}
        if (gameButtons[3].getText()=="O" & gameButtons[4].getText()=="O" & gameButtons[5].getText()=="O" ) {
			
			text.setText("Player 2  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
			
		}
  if (gameButtons[2].getText()=="O" & gameButtons[4].getText()=="O" & gameButtons[6].getText()=="O" ) {
			
			text.setText("Player 2  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
			
		}
            // Player 1
    	if (gameButtons[0].getText()=="X" & gameButtons[1].getText()=="X" & gameButtons[2].getText()=="X" ) {
			
			text.setText("Player 1  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
		}
    if (gameButtons[0].getText()=="X" & gameButtons[3].getText()=="X" & gameButtons[6].getText()=="X" ) {
			
			text.setText("Player 1  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
		}
    if (gameButtons[0].getText()=="X" & gameButtons[4].getText()=="X" & gameButtons[8].getText()=="X" ) {
			
			text.setText("Player 1  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
			
		}
    if (gameButtons[2].getText()=="X" & gameButtons[5].getText()=="X" & gameButtons[8].getText()=="X" ) {
			
			text.setText("Player 1 wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
			
		}
    if (gameButtons[6].getText()=="X" & gameButtons[7].getText()=="X" & gameButtons[8].getText()=="X" ) {
			
			text.setText("Player 1  wins");
			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setEnabled(false);
			}
			
			
		}
    if (gameButtons[3].getText()=="X" & gameButtons[4].getText()=="X" & gameButtons[5].getText()=="X" ) {
		
		text.setText("Player 1  wins");
		for (int i = 0; i < gameButtons.length; i++) {
			gameButtons[i].setEnabled(false);
		}
		
		
	}
    if (gameButtons[2].getText()=="X" & gameButtons[4].getText()=="X" & gameButtons[6].getText()=="X" ) {
		
  		text.setText("Player 1  wins");
  		for (int i = 0; i < gameButtons.length; i++) {
  			gameButtons[i].setEnabled(false);
  		}
  		
  		
  	}
		
		
	}

}
