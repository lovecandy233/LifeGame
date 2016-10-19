package lifegame;

import java.awt.Graphics;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Image;  
//import java.awt.event.ActionEvent;  
//import java.awt.event.ActionListener;  
  
import javax.swing.JPanel;  
//import javax.swing.Timer;  
import javax.swing.Timer;
  

public class Lifegame_map extends JPanel{
	

	 Lifegame_logic game_logic = new Lifegame_logic();
	    

	
	 public Lifegame_map() {  
		 this.startAnimation();         
	 }
	 
	  /** 
     * ��ͼ�ν��� 
     *  
     */  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (int i = 0; i < game_logic.nextStatus.length; i++) {  
            for (int j = 0; j < game_logic.nextStatus[i].length; j++) {  
                if (game_logic.nextStatus[i][j] == game_logic.WORLD_MAP_ALIVE) {  
                    g.fillRect( j * game_logic.width, i * game_logic.height, game_logic.width, game_logic.height);  
                   
                } else {  
                	 g.drawRect( j * game_logic.width, i * game_logic.height, game_logic.width, game_logic.height);  
                }  
            }  
        }  
    }
	 
    
    
    private Timer timer;  
	
	   // ����֮֡�����ʱ��ÿ��60֡  
 private final int DELAY_TIME = 1200;  
	/** 
  * ��ʼ���� 
  *  
      */  

 
 private void startAnimation() {  
     for (int row = 0; row < game_logic.world.length; row++) {  
         for (int col = 0; col < game_logic.world[0].length; col++) {  
        	 game_logic.nextStatus[row][col] = game_logic.world[row][col];  
        	 game_logic.tempStatus[row][col] = game_logic.world[row][col];  
         }  
     }  
     // ������ʱ��  
     timer = new Timer(DELAY_TIME, new ActionListener() {  

         public void actionPerformed(ActionEvent e) {  
        	 game_logic.changeCellStatus();  
             repaint();  
         }  
     });  
     // ������ʱ��  
     timer.start();  
 }  
 

	 
	 
}
