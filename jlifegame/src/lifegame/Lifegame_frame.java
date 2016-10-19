package lifegame;

import javax.swing.JFrame;

/**
 * LifeGame
 * ’≈ÈÛ∫Î  «ÒÀ¨
 */

public class Lifegame_frame extends JFrame{

	Lifegame_frame(){
		this.setSize(340,360);
		this.setTitle("LifeGame");
		this.add(new Lifegame_map());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);  
        this.setResizable(false);  
	}
	
	public static void main(String[] args) {
		Lifegame_frame game=new Lifegame_frame();
		game.setVisible(true);
	}
}
