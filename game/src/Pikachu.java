import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton; 
import javax.swing.JLabel; 

import javax.swing.ImageIcon;

import javax.swing.Timer;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;


import java.util.Random;

import java.awt.Color;
import javax.swing.JToggleButton;

/*Dang Thi My Tham*/

public class Pikachu extends JFrame {
	public JButton tieptuc;
	public int A[] = new int [72];
	public JButton btnimg[] = new JButton[72];
	
	public JPanel contentPane;
	public Timer time;
	
	
	
	/**
	 * Launch the application.
	 */
	public int flag = 0, bodem, map = 0;
	public int click1, click2;
	public JButton b1, b2;
	public Border slBorder = new LineBorder(Color.red, 3);
	public static int gamemap = 0;
	public JMenuItem mntmNewGame = new JMenuItem(" New game");	
	public int newgame = 0;
	public long score = 0;
	
	public JLabel scorelabel = new JLabel("Score = "+score);
	public JLabel timelabel = new JLabel("Time = "+bodem);
	public JLabel maplabel = new JLabel("Map = "+score);
	
	Random ran = new Random();
	
	
	
	public JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pikachu frame = new Pikachu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Pikachu() 
	{
		
		setResizable(false);
		setTitle("Pikachu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 750, 600);
		contentPane = new ImagePanel(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\bg.jpg").getImage());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 744, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		
				
			
		
		
		
		mntmNewGame.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
				
			
			
			if(e.getSource()==mntmNewGame)
			{ 

				
				score = 0;
				map = 0;
				scorelabel.setText("Score = "+score);
				maplabel.setText("Map = "+(map+1));
				bodem = 120;
				checkRandom();
				panel.removeAll();
				gamemap = 0;
				ActionListener aTime = new ActionListener() {
				      public void actionPerformed(ActionEvent e) {
				    	  --bodem;
				    	   timelabel.setText("Time = "+bodem);
				    	   if(bodem == 0)
				    	   {
				    		   JOptionPane.showMessageDialog(null, "Het gio ban thua roi");
				    		   time.stop();
				    		   panel.removeAll();
				    	   }
				    	   

				        
				      }
				    };
				time = new Timer(1000, aTime);
				time.start();
				
				panel.setBounds(100, 80, 530,390);
				contentPane.add(panel);
				panel.setLayout(new GridLayout(6, 10, 0, 0));
				panel.setOpaque(false);
				
				scorelabel.setBounds(10, 32, 98, 14);
				contentPane.add(scorelabel);
				scorelabel.setForeground(Color.WHITE);
				
				timelabel.setBounds(200, 32, 98, 14);
				contentPane.add(timelabel);
				timelabel.setForeground(Color.GREEN);
				
				maplabel.setBounds(400, 32, 98, 14);
				contentPane.add(maplabel);
				maplabel.setForeground(Color.RED);
				
				for(int i = 0; i <60; i++)
				{				
					btnimg[i]= new JButton(); 
					switch(A[i])
					{
						case 0:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h0.jpg"));
						break;
					case 1:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h1.jpg"));
						break;
					case 2:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h2.jpg"));
						break;
					case 3:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h3.jpg"));
						break;
					case 4:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h4.jpg"));
						break;
					case 5:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h5.jpg"));
						break;
					case 6:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h6.jpg"));
						break;
					case 7:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h7.jpg"));
						break;
					case 8:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h8.jpg"));
						break;
					case 9:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h9.jpg"));
						break;
					case 10:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h10.jpg"));
						break;
					case 11:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h11.jpg"));
						break;
					case 12:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h12.jpg"));
						break;
					case 13:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h13.jpg"));
						break;
					case 14:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h14.jpg"));
						break;
					case 15:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h15.jpg"));
						break;
					};
					
					panel.add(btnimg[i]);
					btnimg[i].addActionListener(this);

				}panel.validate();
				
			}
		for(int i = 0; i < 60; i++)
		{
			if(e.getSource()==btnimg[i]){ 
				
				if(flag == 0)
				{
					b1 = btnimg[i];
					b1.setBorder(slBorder);
					click1 = A[i];
					flag = 1;
					return;
				}
				if(flag == 1)
				{
					b2 = btnimg[i];
					b2.setBorder(slBorder);
					if(click1 == A[i])
					{
						if(b1 == b2)
						{
							flag =0;
							b1.setBorder(null);
							b2.setBorder(null);
							b1 = null;
							b2 = null;
							return;
						}
						b2.setVisible(false);
						b2 = null;
						b1.setVisible(false);
						b1 = null;
						flag = 0;
						score = score + 100;
						scorelabel.setText("Score = "+score);
						gamemap = gamemap + 1;
						
						if(gamemap == 30)
						{
							map = map + 1;
							if(map == 3)
							{
								time.stop();
								JOptionPane.showMessageDialog(null, "WINER NEW SCORE "+score);
								panel.removeAll();
								
								score = 0;
								map = 0;
								gamemap = 0;
								return;
							}
							score = score + 500 + (10*bodem);
							scorelabel.setText("Score = "+score);
							maplabel.setText("Map = "+(map+1));
							bodem = 120 - (map * 20);
							gamemap = 0;
							panel.removeAll();
							checkRandom();
							for(int k = 0; k <60; k++)
							{				
								btnimg[k]= new JButton(); 
								switch(A[k])
								{
									case 0:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h0.jpg"));
						break;
					case 1:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h1.jpg"));
						break;
					case 2:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h2.jpg"));
						break;
					case 3:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h3.jpg"));
						break;
					case 4:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h4.jpg"));
						break;
					case 5:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h5.jpg"));
						break;
					case 6:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h6.jpg"));
						break;
					case 7:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h7.jpg"));
						break;
					case 8:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h8.jpg"));
						break;
					case 9:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h9.jpg"));
						break;
					case 10:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h10.jpg"));
						break;
					case 11:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h11.jpg"));
						break;
					case 12:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h12.jpg"));
						break;
					case 13:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h13.jpg"));
						break;
					case 14:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h14.jpg"));
						break;
					case 15:
						btnimg[i].setIcon(new ImageIcon("E:\\\\[Project] DSA\\\\[Update] GitHub\\\\projADS\\\\ADS-project-main\\\\ADS-project-main\\\\Game pikachu full\\\\game\\\\images\\\\h15.jpg"));
						break;
								};
								
								panel.add(btnimg[k]);
								btnimg[k].addActionListener(this);
							}panel.validate();			
						}
						return;
					}
					else
					{
						flag = 0;
						b1.setBorder(null);
						b2.setBorder(null);
						b1 = null;
						b2 = null;
						return;
					}
				}
			}
		}
	
		}

	});//ket thuc ham action
		mnFile.add(mntmNewGame);
		final JMenuItem mntmExitGame = new JMenuItem("AAAAAAAA");
		mntmExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);					
			}
		});
		
		
		mnFile.add(mntmExitGame);
		

	}
	
	
		
	
	

	public void checkRandom()
	{
		//check random
		
		for(int i = 0; i < 60;i++)
		{
			int r = ran.nextInt(15);
			A[i] = r;
			
		}
		
		for(int i = 0; i < 16; i++)
		{
				
			if(DemPT(i) % 2 != 0)
			{
				Chuyen(i);
					
					
			}	
		}
	}
	
	
	
	

	public int DemPT(int m)
	{
		int d=0;
		for(int i=0;i<60;i++)
		{
			if(m == A[i])
			{
				d++;
			}
		}
		return d;	
	}
	
	
	
	public void Chuyen(int m)
	{
		for(int i = 0; i < 60; i++)
		{
			if(A[i] == m)
			{
				A[i]++;
				return;
			}
		}
		
		
	}
}

class ImagePanel extends JPanel {

	/**
		 * 
		 */
	private Image img;

	public ImagePanel(String img) {
	this(new ImageIcon(img).getImage());
	}

	public ImagePanel(Image img) {
	this.img = img;
	Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	setPreferredSize(size);
	setMinimumSize(size);
	setMaximumSize(size);
	setSize(size);
	setLayout(null);
	}

	public void paintComponent(Graphics g) {
	g.drawImage(img, 0, 0, null);
	}

	}
	





