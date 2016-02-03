//PRIME GAME MAIN
import javax.swing.*;

import java.lang.Math;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.*;
import java.awt.event.*;

public class mainGame extends JFrame{
	public static int x1;
	public static int y1;
	private JPanel background1;
	public JLabel statusBar;
	public JLabel cursorSquare;
	public JLabel enemyTest;
	public JLabel enemyTest1;
	public JLabel enemyTest2;
	public JLabel enemyTest3;
	public JLabel enemyTest4;
	public JLabel enemyTest5;
	public JLabel enemyTest6;
	public JLabel enemyTest7;
	Toolkit toolkit;
	Timer timer;
	Toolkit toolkit2;
	Timer timer2;
	public static int enX1 = 10;
	public static int enY1 = 10;
	public static int enX2 = 10;
	public static int enY2 = 10;	
	public static int enX3 = 10;
	public static int enY3 = 10;
	public static int enX4 = 10;
	public static int enY4 = 10;
	public static int enX5 = 10;
	public static int enY5 = 10;
	public static int enX6 = 10;
	public static int enY6 = 10;
	public static int enX7 = 10;
	public static int enY7 = 10;
	public static int enX8 = 10;
	public static int enY8 = 10;
	public int enemySize;
	//********************************CHANGING VARIABLES*********************************************
	public static int speedProgress = 5;
	public static int enemyResizeRate = 10;
	
	String[] nonPrimeArray = {
		"1","4","6","8","9","10","12","14","15","16","18","20","21","22","24","25","26","27","28","30","32",
		"33","34","35","36","38","39","40"
	};
	int[] nonPrimeArrayInt = {
		1,4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30,32,
		33,34,35,36,38,39,40
	};
	String[] primeArray = {
			"2","3","5","7","11","13","17","19","23","29","31","37"
	};
	int[] primeArrayInt = {
			2,3,5,7,11,13,17,19,23,29,31,37
	};
	public int r1;
	public int r2;

	public int r3;
	public int r4;
	public int r5;
	public int r6;
	//*******************TEST******************
	//public double r2D;
	public int cX;
	public int cY;
	int gameModeVar;
	int previousScoreMode1Var;
	int previousScoreMode2Var;
	public static int progress;
	
	int[] currentE0 = {0,0};
	int[] currentE1 = {0,0};
	int[] currentE2 = {0,0};
	int[] currentE3 = {0,0};
	int[] currentE4 = {0,0};
	int[] currentE5 = {0,0};
	int[] currentE6 = {0,0};
	int[] currentE7 = {0,0};
	
	public static int score;
	public static int timeAttackScore;
	
	//public void paint(Graphics g){
		
		//g.setColor(Color.BLACK);
		//g.drawOval(50, 50, 50, 50);
	//}
	

	
	//******************************START OF CONSTRUCTOR****************************************
	public mainGame(int gameMode, int previousScoreMode1, int previousScoreMode2){
	
	setTitle("Prime Time!!");
	setSize(1350,700);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	
	score = 0;
	progress = 0;
	timeAttackScore = 0;
	enemySize = 50;
	
	background1 = new JPanel();
	background1.setBackground(new Color(228, 131, 255));
	add(background1);
	background1.setBounds(0,50,1350,650);
	background1.setLayout(null);
	
	statusBar = new JLabel("default");
	add(statusBar);
	statusBar.setBounds(0,0,300,50);

	cursorSquare = new JLabel();
	background1.add(cursorSquare);
	cursorSquare.setBackground(Color.MAGENTA);
	cursorSquare.setOpaque(true);
	gameModeVar = gameMode;
	previousScoreMode1Var = previousScoreMode1;
	previousScoreMode2Var = previousScoreMode2;
	//******************ENEMIES ADDED AT START*****************************
	enemyTest = new JLabel();
	background1.add(enemyTest);
	enemyTest.setBackground(new Color(238,176,250));
	enemyTest.setOpaque(true);
	enemyTest.setBounds(100,100,50,50);
	r1 = (int )(Math.random()*12);
	r5 = (int )(Math.random()*2);
	r6 = (int )(Math.random()*26);
	
	
	if(r5==0){
		enemyTest.setText(primeArray[r1]);
		currentE0[1] = primeArrayInt[r1];}
	else{
		enemyTest.setText(nonPrimeArray[r6]);
		currentE0[1] = nonPrimeArrayInt[r6];
	}
	enemyTest.setFont(new Font("Arial", Font.PLAIN, 30));
	enemyTest.setHorizontalAlignment(SwingConstants.CENTER);
	currentE0[0] = r5;
	
	
	enemyTest5 = new JLabel();
	background1.add(enemyTest5);
	enemyTest5.setBackground(new Color(238,176,250));
	enemyTest5.setOpaque(true);
	enemyTest5.setBounds(700, 100, 50, 50);
	r1 = (int )(Math.random()*12);
	r5 = (int )(Math.random()*2);
	r6 = (int )(Math.random()*26);
	
	
	if(r5==0){
		enemyTest5.setText(primeArray[r1]);
		currentE5[1] = primeArrayInt[r1];}
	else{
		enemyTest5.setText(nonPrimeArray[r6]);
		currentE5[1] = nonPrimeArrayInt[r6];
		}
	enemyTest5.setFont(new Font("Arial", Font.PLAIN, 30));
	enemyTest5.setHorizontalAlignment(SwingConstants.CENTER);
	currentE5[0] = r5;
	
	enemyTest6 = new JLabel();
	background1.add(enemyTest6);
	enemyTest6.setBackground(new Color(238,176,250));
	enemyTest6.setOpaque(true);
	enemyTest6.setBounds(100, 400, 50, 50);
	r1 = (int )(Math.random()*12);
	r5 = (int )(Math.random()*2);
	r6 = (int )(Math.random()*26);
	
	
	if(r5==0){
		enemyTest6.setText(primeArray[r1]);
		currentE6[1] = primeArrayInt[r1];}
	else{
		enemyTest6.setText(nonPrimeArray[r6]);
		currentE6[1] = nonPrimeArrayInt[r6];
		}
	enemyTest6.setFont(new Font("Arial", Font.PLAIN, 30));
	enemyTest6.setHorizontalAlignment(SwingConstants.CENTER);
	currentE6[0] = r5;
	
	
	enemyTest7 = new JLabel();
	background1.add(enemyTest7);
	enemyTest7.setBackground(new Color(238,176,250));
	enemyTest7.setOpaque(true);
	enemyTest7.setBounds(600, 400, 50, 50);
	r1 = (int )(Math.random()*12);
	r5 = (int )(Math.random()*2);
	r6 = (int )(Math.random()*26);
	
	
	if(r5==0){
		enemyTest7.setText(primeArray[r1]);
		currentE7[1] = primeArrayInt[r1];}
	else{
		enemyTest7.setText(nonPrimeArray[r6]);
		currentE7[1] = nonPrimeArrayInt[r6];
		}
	enemyTest7.setFont(new Font("Arial", Font.PLAIN, 30));
	enemyTest7.setHorizontalAlignment(SwingConstants.CENTER);
	currentE7[0] = r5;
	
	//*************************************************************************

	
	
	
	Handlerclass handler = new Handlerclass();
	background1.addMouseListener(handler);
	background1.addMouseMotionListener(handler);
	//Handlerclass handler = new Handlerclass();
	
	//addMouseListener(handler);
	
	ReminderBeep(40);
	ProgressIndicator(speedProgress);

	}
	


	private class Handlerclass implements MouseListener, MouseMotionListener{
		
		public void mouseClicked(MouseEvent event){
			//statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			//statusbar.setText("you pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event){
			//statusbar.setText("you released the button");
		}
		public void mouseEntered(MouseEvent event){
			//statusbar.setText("you entered the area");
			//mousepanel.setBackground(Color.WHITE);
		}
		public void mouseExited(MouseEvent event){
			//statusbar.setText("the mouse has left the building");
			//mousepanel.setBackground(Color.MAGENTA);
		}
		
		public void mouseDragged(MouseEvent event){
			//statusBar.setText(String.format("You are dragging the mouse at %d,%d", event.getX(), event.getY()));
			x1 = event.getX();
			y1 = event.getY();
			
			cursorSquare.setBounds(x1-25, y1-25, 50,50);
			
		}
		public void mouseMoved(MouseEvent event){
			//statusBar.setText(String.format("you are moving the mouse at %d,%d", event.getX(), event.getY()));
			x1 = event.getX();
			y1 = event.getY();
			
			cursorSquare.setBounds(x1-25, y1-25, 50,50);
		}
		}
	
	//***********************TIMER CREATIONS****************************************************************
	public void ReminderBeep(int seconds) {
	    toolkit = Toolkit.getDefaultToolkit();
	    timer = new Timer();
	    timer.schedule(new RemindTask(),50, seconds);
	  	}
	
	public void ProgressIndicator(int seconds) {
		toolkit2 = Toolkit.getDefaultToolkit();
		timer2 = new Timer();
		timer2.schedule(new ProgressTask(),999, seconds*1000);
		}
	
  
  class RemindTask  extends TimerTask {
	    public void run() {
    		timeAttackScore++;
//**************************ENEMY ONE***********************************************
//**************************HOW THINGS MOVE ATM**************************************

	    	statusBar.setText(""+score);
	    	
	    	
	    	if(enemyTest.getX()>1299){
	    		enX1 = enX1 * -1;
	    	}
	    	if(enemyTest.getX()<1){
	    		enX1 = enX1 * -1;
	    	}
	    	if(enemyTest.getY()>579){
	    		enY1 = enY1 * -1;
	    	}
	    	if(enemyTest.getY()<1){
	    		enY1 = enY1 * -1;
	    	}
	    	
	    	enemyTest.setBounds(enemyTest.getX() + enX1, enemyTest.getY()+enY1, enemySize, enemySize);
//*****************************EVENTS ON COLLISION********************************************
	    	
	    	if((enemyTest.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest.getX()<(cursorSquare.getX() + 49))&&
	    			(enemyTest.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest.getY()<(cursorSquare.getY() + 49))){
	    		

	    		//SCORING CHANGES
	    		if(gameModeVar == 1){
	    			if(currentE0[0]==0){
	    				score = score+5;
	    			}
	    			else if(currentE0[0]==1){
	    				score = score-10;
	    			}
	    		}//end of gamemode1 if
	    		else if(gameModeVar == 2){
	    			if(currentE0[0]==0){
	    				score = score+ currentE0[1];
	    			}
	    			else if(currentE0[0]==1){
	    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
		    			timer.cancel();
		                timer.purge();
		                timer2.cancel();
		                timer2.purge();
		    			dispose();
		    			if(score >= previousScoreMode2Var){
		    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
		    			}
		    			else{
		    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
		    			}
	    			}
	    		}//end of gamemode2if	
	    		
	    		
	    		r1 = (int )(Math.random()*12);
	    		r5 = (int )(Math.random()*2);
	    		r6 = (int )(Math.random()*26);
	    		
	    		
	    		if(r5==0){
	    		enemyTest.setText(primeArray[r1]);
	    		currentE0[1] = primeArrayInt[r1];
	    		}
	    		else{
	    			enemyTest.setText(nonPrimeArray[r6]);
	    			currentE0[1] = nonPrimeArrayInt[r6];
	    		}
	    		
	    		
	    		enemyTest.setFont(new Font("Arial", Font.PLAIN, 30));
	    		enemyTest.setHorizontalAlignment(SwingConstants.CENTER);
	    		r2 = (int )(Math.random()*1270+10);
	    		r3 = (int )(Math.random()*550+10);
	    		//r2D = (double )r2*1;
	    		cX = (int)(cursorSquare.getX());
	    		cY = (int)(cursorSquare.getY());
	    		
	    		
	    		while(r2>(cX - 75)&&r2<(cX + 75)&&
	    			(r3>cY - 75)&&(r3<cY + 75)){
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
	    				
	    			}
	    		r4 = (int )(Math.random()*2)+1;
	    		enemyTest.setBounds(r2,r3,50,50);
	    		enX1 = enX1 * -1^r1;
	    		enY1 = enY1 * -1^r4;
	    	
	    		currentE0[0] = r5;


	    	}
	    	
	    	
//*****************************ENEMY TWO**************************************************
	    	if(currentE1[1] != 0){
	    		
	    		if(enemyTest1.getX()>1299){
		    		enX2 = enX2 * -1;
		    	}
		    	if(enemyTest1.getX()<1){
		    		enX2 = enX2 * -1;
		    	}
		    	if(enemyTest1.getY()>579){
		    		enY2 = enY2 * -1;
		    	}
		    	if(enemyTest1.getY()<1){
		    		enY2 = enY2 * -1;
		    	}
		    	
		    	enemyTest1.setBounds(enemyTest1.getX() + enX2, enemyTest1.getY()+enY2, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 2********************************************
		    	
		    	if((enemyTest1.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest1.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest1.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest1.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE1[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE1[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE1[0]==0){
		    				score = score+ currentE1[1];
		    			}
		    			else if(currentE1[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest1.setText(primeArray[r1]);
		    		currentE1[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest1.setText(nonPrimeArray[r6]);
		    			currentE1[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest1.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest1.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest1.setBounds(r2,r3,50,50);
		    		enX2 = enX2 * -1^r1;
		    		enY2 = enY2 * -1^r4;
		    	
		    		currentE1[0] = r5;
		    		

		    		
		    	}//end of if
		    	
	    		
	    		
	    		
	    	}//end of enemy2 if
	    	
	  //*********************************ENEMY 3***********************************************
	    	if(currentE2[1] != 0){
	    		
	    		if(enemyTest2.getX()>1299){
		    		enX3 = enX3 * -1;
		    	}
		    	if(enemyTest2.getX()<1){
		    		enX3 = enX3 * -1;
		    	}
		    	if(enemyTest2.getY()>579){
		    		enY3 = enY3 * -1;
		    	}
		    	if(enemyTest2.getY()<1){
		    		enY3 = enY3 * -1;
		    	}
		    	
		    	enemyTest2.setBounds(enemyTest2.getX() + enX3, enemyTest2.getY()+enY3, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 3********************************************
		    	
		    	if((enemyTest2.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest2.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest2.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest2.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE2[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE2[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE2[0]==0){
		    				score = score+ currentE2[1];
		    			}
		    			else if(currentE2[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest2.setText(primeArray[r1]);
		    		currentE2[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest2.setText(nonPrimeArray[r6]);
		    			currentE2[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest2.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest2.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest2.setBounds(r2,r3,50,50);
		    		enX3 = enX3 * -1^r1;
		    		enY3 = enY3 * -1^r4;
		    	
		    		currentE2[0] = r5;
		    		

		    	}//end of if
		    	
	    		
	    		
	    		
	    	}//end of enemy3 if  	
	    


	  	  //*********************************ENEMY 4***********************************************
	    	if(currentE3[1] != 0){
	    		
	    		if(enemyTest3.getX()>1299){
		    		enX4 = enX4 * -1;
		    	}
		    	if(enemyTest3.getX()<1){
		    		enX4 = enX4 * -1;
		    	}
		    	if(enemyTest3.getY()>579){
		    		enY4 = enY4 * -1;
		    	}
		    	if(enemyTest3.getY()<1){
		    		enY4 = enY4 * -1;
		    	}
		    	
		    	enemyTest3.setBounds(enemyTest3.getX() + enX4, enemyTest3.getY()+enY4, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 4********************************************
		    	
		    	if((enemyTest3.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest3.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest3.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest3.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE3[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE3[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE3[0]==0){
		    				score = score+ currentE3[1];
		    			}
		    			else if(currentE3[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest3.setText(primeArray[r1]);
		    		currentE3[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest3.setText(nonPrimeArray[r6]);
		    			currentE3[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest3.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest3.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest3.setBounds(r2,r3,50,50);
		    		enX4 = enX4 * -1^r1;
		    		enY4 = enY4 * -1^r4;
		    	
		    		currentE3[0] = r5;
		    		

		    	}//end of if
		    	
	    		
	    		
	    		
	    	}//end of enemy4 if  	
	    
	    	 //*********************************ENEMY 5***********************************************
	    	if(currentE4[1] != 0){
	    		
	    		if(enemyTest4.getX()>1299){
		    		enX5 = enX5 * -1;
		    	}
		    	if(enemyTest4.getX()<1){
		    		enX5 = enX5 * -1;
		    	}
		    	if(enemyTest4.getY()>579){
		    		enY5 = enY5 * -1;
		    	}
		    	if(enemyTest4.getY()<1){
		    		enY5 = enY5 * -1;
		    	}
		    	
		    	enemyTest4.setBounds(enemyTest4.getX() + enX5, enemyTest4.getY()+enY5, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 5********************************************
		    	
		    	if((enemyTest4.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest4.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest4.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest4.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE4[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE4[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE4[0]==0){
		    				score = score+ currentE4[1];
		    			}
		    			else if(currentE4[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest4.setText(primeArray[r1]);
		    		currentE4[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest4.setText(nonPrimeArray[r6]);
		    			currentE4[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest4.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest4.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest4.setBounds(r2,r3,50,50);
		    		enX5 = enX5 * -1^r1;
		    		enY5 = enY5 * -1^r4;
		    	
		    		currentE4[0] = r5;
		    		

		    	}//end of if
		    	
	    		
	    		
	    		
	    	}//end of enemy5 if  	

      //*********************************ENEMY 6*******************************************************************
	    	
	    		
	    		if(enemyTest5.getX()>1299){
		    		enX6 = enX6 * -1;
		    	}
		    	if(enemyTest5.getX()<1){
		    		enX6 = enX6 * -1;
		    	}
		    	if(enemyTest5.getY()>579){
		    		enY6 = enY6 * -1;
		    	}
		    	if(enemyTest5.getY()<1){
		    		enY6 = enY6 * -1;
		    	}
		    	
		    	enemyTest5.setBounds(enemyTest5.getX() + enX6, enemyTest5.getY()+enY6, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 6********************************************
		    	
		    	if((enemyTest5.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest5.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest5.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest5.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE5[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE5[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE5[0]==0){
		    				score = score+ currentE5[1];
		    			}
		    			else if(currentE5[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest5.setText(primeArray[r1]);
		    		currentE5[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest5.setText(nonPrimeArray[r6]);
		    			currentE5[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest5.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest5.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest5.setBounds(r2,r3,50,50);
		    		enX6 = enX6 * -1^r1;
		    		enY6 = enY6 * -1^r4;
		    	
		    		currentE5[0] = r5;
		    		

		    	}//end of if
		    	
      //*********************************ENEMY 7*******************************************************************
	    	
	    		
	    		if(enemyTest6.getX()>1299){
		    		enX7 = enX7 * -1;
		    	}
		    	if(enemyTest6.getX()<1){
		    		enX7 = enX7 * -1;
		    	}
		    	if(enemyTest6.getY()>579){
		    		enY7 = enY7 * -1;
		    	}
		    	if(enemyTest6.getY()<1){
		    		enY7 = enY7 * -1;
		    	}
		    	
		    	enemyTest6.setBounds(enemyTest6.getX() + enX7, enemyTest6.getY()+enY7, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 7********************************************
		    	
		    	if((enemyTest6.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest6.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest6.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest6.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE6[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE6[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE6[0]==0){
		    				score = score+ currentE6[1];
		    			}
		    			else if(currentE6[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest6.setText(primeArray[r1]);
		    		currentE6[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest6.setText(nonPrimeArray[r6]);
		    			currentE6[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest6.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest6.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest6.setBounds(r2,r3,50,50);
		    		enX7 = enX7 * -1^r1;
		    		enY7 = enY7 * -1^r4;
		    	
		    		currentE6[0] = r5;
		    		

		    	}//end of if  		
	    		
      //*********************************ENEMY 8*******************************************************************
	    	
	    		
	    		if(enemyTest7.getX()>1299){
		    		enX8 = enX8 * -1;
		    	}
		    	if(enemyTest7.getX()<1){
		    		enX8 = enX8 * -1;
		    	}
		    	if(enemyTest7.getY()>579){
		    		enY8 = enY8 * -1;
		    	}
		    	if(enemyTest7.getY()<1){
		    		enY8 = enY8 * -1;
		    	}
		    	
		    	enemyTest7.setBounds(enemyTest7.getX() + enX8, enemyTest7.getY()+enY8, enemySize, enemySize);
	//*****************************EVENTS ON COLLISION ENEMY 8********************************************
		    	
		    	if((enemyTest7.getX()>(cursorSquare.getX() - (enemySize - 1)))&&(enemyTest7.getX()<(cursorSquare.getX() + 49))&&
		    			(enemyTest7.getY()>(cursorSquare.getY() - (enemySize - 1)))&&(enemyTest7.getY()<(cursorSquare.getY() + 49))){
		    		
		    		
		    		//SCORING CHANGES
		    		if(gameModeVar == 1){
		    			if(currentE7[0]==0){
		    				score = score+5;
		    			}
		    			else if(currentE7[0]==1){
		    				score = score-10;
		    			}
		    		}//end of gamemode1 if
		    		else if(gameModeVar == 2){
		    			if(currentE7[0]==0){
		    				score = score+ currentE7[1];
		    			}
		    			else if(currentE7[0]==1){
		    				JOptionPane.showMessageDialog(null,  "You lose sucka!");
			    			timer.cancel();
			                timer.purge();
			                timer2.cancel();
			                timer2.purge();
			    			dispose();
			    			if(score >= previousScoreMode2Var){
			    				homeScreen home = new homeScreen(previousScoreMode1Var,score);
			    			}
			    			else{
			    				homeScreen home = new homeScreen(previousScoreMode1Var,previousScoreMode2Var);
			    			}
		    			}
		    		}//end of gamemode2if	
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest7.setText(primeArray[r1]);
		    		currentE7[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest7.setText(nonPrimeArray[r6]);
		    			currentE7[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest7.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest7.setHorizontalAlignment(SwingConstants.CENTER);
		    		r2 = (int )(Math.random()*1270+10);
		    		r3 = (int )(Math.random()*550+10);
		    		cX = (int)(cursorSquare.getX());
		    		cY = (int)(cursorSquare.getY());
		    		
		    		
		    		while(r2>(cX - 75)&&r2<(cX + 75)&&
		    			(r3>cY - 75)&&(r3<cY + 75)){
			    		r2 = (int )(Math.random()*1270+10);
			    		r3 = (int )(Math.random()*550+10);
		    				
		    			}
		    		
		    		
		    		
		    		r4 = (int )(Math.random()*2);
		    		enemyTest7.setBounds(r2,r3,50,50);
		    		enX8 = enX8 * -1^r1;
		    		enY8 = enY8 * -1^r4;
		    	
		    		currentE7[0] = r5;
		    		


		    	}//end of if  		
	    		
	//******************ALL THE SAME CHECK**************************************************************************    	
		    	if(currentE4[1] != 0){
		    		
		    
		    		
		    		if(currentE0[0]==1&&currentE1[0]==1&&currentE2[0]==1&&currentE3[0]==1&&currentE4[0]==1&&currentE5[0]==1&&
		    				currentE6[0]==1&&currentE7[0]==1){
		    			
		    			enemyTest.setText(primeArray[1]);
		    			currentE0[0] = 0;
		    			currentE0[1] = primeArrayInt[1];
		    			enemyTest1.setText(primeArray[2]);
		    			currentE1[0] = 0;
		    			currentE1[1] = primeArrayInt[2];
		    			enemyTest2.setText(primeArray[3]);
		    			currentE2[0] = 0;
		    			currentE2[1] = primeArrayInt[3];
		    			enemyTest3.setText(primeArray[4]);
		    			currentE3[0] = 0;
		    			currentE3[1] = primeArrayInt[4];
		    			enemyTest4.setText(primeArray[5]);
		    			currentE4[0] = 0;
		    			currentE4[1] = primeArrayInt[5];
		    			enemyTest5.setText(primeArray[6]);
		    			currentE5[0] = 0;
		    			currentE5[1] = primeArrayInt[6];
		    			enemyTest6.setText(primeArray[7]);
		    			currentE6[0] = 0;
		    			currentE6[1] = primeArrayInt[7];
		    			enemyTest7.setText(primeArray[8]);
		    			currentE7[0] = 0;
		    			currentE7[1] = primeArrayInt[8];
		    			
		    		}
		    		
		    		
		    		
		    	}//end of check there is eight enemies 
		    	
		    	
		    	
		    	else if(currentE3[1] != 0){
		    		
		    
		    		
		    		if(currentE0[0]==1&&currentE1[0]==1&&currentE2[0]==1&&currentE3[0]==1&&currentE5[0]==1&&
		    				currentE6[0]==1&&currentE7[0]==1){
		    			
		    			enemyTest.setText(primeArray[1]);
		    			currentE0[0] = 0;
		    			currentE0[1] = primeArrayInt[1];
		    			enemyTest1.setText(primeArray[2]);
		    			currentE1[0] = 0;
		    			currentE1[1] = primeArrayInt[2];
		    			enemyTest2.setText(primeArray[3]);
		    			currentE2[0] = 0;
		    			currentE2[1] = primeArrayInt[3];
		    			enemyTest3.setText(primeArray[4]);
		    			currentE3[0] = 0;
		    			currentE3[1] = primeArrayInt[4];
		    			enemyTest5.setText(primeArray[6]);
		    			currentE5[0] = 0;
		    			currentE5[1] = primeArrayInt[6];
		    			enemyTest6.setText(primeArray[7]);
		    			currentE6[0] = 0;
		    			currentE6[1] = primeArrayInt[7];
		    			enemyTest7.setText(primeArray[8]);
		    			currentE7[0] = 0;
		    			currentE7[1] = primeArrayInt[8];
		    			
		    		}
		    		
		    		
		    		
		    	}//end of seven enemies check
		    	
		    	
		    	else if(currentE2[1] != 0){
		    		
		    
		    		
		    		if(currentE0[0]==1&&currentE1[0]==1&&currentE2[0]==1&&currentE5[0]==1&&
		    				currentE6[0]==1&&currentE7[0]==1){
		    			
		    			enemyTest.setText(primeArray[1]);
		    			currentE0[0] = 0;
		    			currentE0[1] = primeArrayInt[1];
		    			enemyTest1.setText(primeArray[2]);
		    			currentE1[0] = 0;
		    			currentE1[1] = primeArrayInt[2];
		    			enemyTest2.setText(primeArray[3]);
		    			currentE2[0] = 0;
		    			currentE2[1] = primeArrayInt[3];
		    			enemyTest5.setText(primeArray[6]);
		    			currentE5[0] = 0;
		    			currentE5[1] = primeArrayInt[6];
		    			enemyTest6.setText(primeArray[7]);
		    			currentE6[0] = 0;
		    			currentE6[1] = primeArrayInt[7];
		    			enemyTest7.setText(primeArray[8]);
		    			currentE7[0] = 0;
		    			currentE7[1] = primeArrayInt[8];
		    			
		    		}
		    		
		    		
		    		
		    	}//end of six enemies check
		    	
		    	else if(currentE1[1] != 0){
		    		
		    
		    		
		    		if(currentE0[0]==1&&currentE1[0]==1&&currentE5[0]==1&&
		    				currentE6[0]==1&&currentE7[0]==1){
		    			
		    			enemyTest.setText(primeArray[1]);
		    			currentE0[0] = 0;
		    			currentE0[1] = primeArrayInt[1];
		    			enemyTest1.setText(primeArray[2]);
		    			currentE1[0] = 0;
		    			currentE1[1] = primeArrayInt[2];
		    			enemyTest5.setText(primeArray[6]);
		    			currentE5[0] = 0;
		    			currentE5[1] = primeArrayInt[6];
		    			enemyTest6.setText(primeArray[7]);
		    			currentE6[0] = 0;
		    			currentE6[1] = primeArrayInt[7];
		    			enemyTest7.setText(primeArray[8]);
		    			currentE7[0] = 0;
		    			currentE7[1] = primeArrayInt[8];
		    			
		    		}
		    		
		    		
		    		
		    	}//end of 5 enemy check
		    	
    			
		    	else {
		    		
		    
		    		
		    		if(currentE0[0]==1&&currentE5[0]==1&&
		    				currentE6[0]==1&&currentE7[0]==1){
		    			
		    			enemyTest.setText(primeArray[1]);
		    			currentE0[0] = 0;
		    			currentE0[1] = primeArrayInt[1];
		    			enemyTest5.setText(primeArray[6]);
		    			currentE5[0] = 0;
		    			currentE5[1] = primeArrayInt[6];
		    			enemyTest6.setText(primeArray[7]);
		    			currentE6[0] = 0;
		    			currentE6[1] = primeArrayInt[7];
		    			enemyTest7.setText(primeArray[8]);
		    			currentE7[0] = 0;
		    			currentE7[1] = primeArrayInt[8];
		    			
		    		}
		    		
		    		
		    		
		    	}
    		
	    }
  }

  
  
  
  
  //********************SLOW COUNTER******************************************
	    class ProgressTask  extends TimerTask {
		    public void run() {
		    	
		    	progress = progress+1;
		    	
		    	if(progress == 2){
		    		enemyTest1 = new JLabel();
		    		background1.add(enemyTest1);
		    		enemyTest1.setBackground(new Color(238,176,250));
		    		enemyTest1.setOpaque(true);
		    		enemyTest1.setBounds(500, 500, 50, 50);
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest1.setText(primeArray[r1]);
		    		currentE1[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest1.setText(nonPrimeArray[r6]);
		    			currentE1[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest1.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest1.setHorizontalAlignment(SwingConstants.CENTER);
		    		currentE1[0] = r5;
		    	}
		    	if(progress == 4){
		    		enemyTest2 = new JLabel();
		    		background1.add(enemyTest2);
		    		enemyTest2.setBackground(new Color(238,176,250));
		    		enemyTest2.setOpaque(true);
		    		enemyTest2.setBounds(500, 500, 50, 50);
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest2.setText(primeArray[r1]);
		    		currentE2[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest2.setText(nonPrimeArray[r6]);
		    			currentE2[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest2.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest2.setHorizontalAlignment(SwingConstants.CENTER);
		    		currentE2[0] = r5;
		    	}
		    	if(progress == 6){
		    		enemyTest3 = new JLabel();
		    		background1.add(enemyTest3);
		    		enemyTest3.setBackground(new Color(238,176,250));
		    		enemyTest3.setOpaque(true);
		    		enemyTest3.setBounds(500, 500, 50, 50);
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    		enemyTest3.setText(primeArray[r1]);
		    		currentE3[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest3.setText(nonPrimeArray[r6]);
		    			currentE3[1] = nonPrimeArrayInt[r6];
		    		}
		    		enemyTest3.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest3.setHorizontalAlignment(SwingConstants.CENTER);
		    		currentE3[0] = r5;
		    	}
		    	if(progress == 8){
		    		enemyTest4 = new JLabel();
		    		background1.add(enemyTest4);
		    		enemyTest4.setBackground(new Color(238,176,250));
		    		enemyTest4.setOpaque(true);
		    		enemyTest4.setBounds(500, 500, 50, 50);
		    		r1 = (int )(Math.random()*12);
		    		r5 = (int )(Math.random()*2);
		    		r6 = (int )(Math.random()*26);
		    		
		    		
		    		if(r5==0){
		    			enemyTest4.setText(primeArray[r1]);
		    			currentE4[1] = primeArrayInt[r1];}
		    		else{
		    			enemyTest4.setText(nonPrimeArray[r6]);
		    			currentE4[1] = nonPrimeArrayInt[r6];
		    			}
		    		enemyTest4.setFont(new Font("Arial", Font.PLAIN, 30));
		    		enemyTest4.setHorizontalAlignment(SwingConstants.CENTER);
		    		currentE4[0] = r5;
		    	}//end of progress8 enemy add
		    	
		    	if(progress >= 10){
		    		enemySize = enemySize + enemyResizeRate;
		    	}
		    	
		    	if(gameModeVar==1){
		    		if(score >= 100){
		    			JOptionPane.showMessageDialog(null,  "Congrats! You made it to 100!");
		    			timer.cancel();
		                timer.purge();
		                timer2.cancel();
		                timer2.purge();
		    			dispose();
		    			homeScreen home = new homeScreen(timeAttackScore/25,previousScoreMode2Var);
		    		}
		    	}
		    	
		    	
		    }
	    }
}
  
	  
	

	
	
	
	
	
	
	

