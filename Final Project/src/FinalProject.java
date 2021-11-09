import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FinalProject extends JFrame
	{
static ArrayList<TimePeriod> time = new ArrayList<TimePeriod>();
static ArrayList<TimeTravelers>	 people = new ArrayList<TimeTravelers>();
static String name; 
static int era; 
static String strength;
static String weakness;
static int pointCounter;
static boolean play = true;



static String moveOne;
static String moveTwo;
static String moveThree;
static String moveFour;
static String moveFive;
static String moveSix;
static String moveSeven;
static String moveEight;
static String moveNine;
static String moveTen;
static String moveEleven;
static String moveTwelve;
static String moveThirteen;
static String moveFourteen;
static String moveFifteen;
static String moveSixteen;
static String moveSeventeen;
static String moveEighteen;
static String moveNineteen;
static String moveTwenty;
static String moveTwentyOne;


static String guessOne;
static String guessTwo;
static String guessThree;
static String guessFour;
static String guessFive;

static JFrame frame = new JFrame();		
public static void main(String[] args)
	{
		setTimePeriod();
		setTimeTravelers();
		greetUser(null);
		
		introduction(null);
		while (play) 
			{
				if(people.get(0).getPoints() < 10000)
					{
						RenaissanceGame();
						IndustrialRevolutionGame();
						RoaringTwentiesGame();
						FutureGame();
					}
				if(people.get(0).getPoints() >= 10000)
					{
						play = false;
					}
			}
		JOptionPane.showMessageDialog(
	    		frame, 
	    		"Congrats, time traveler! You won the game!");  
	}

public static void setTimeTravelers()
{
	people.add(new TimeTravelers(name, era, strength, weakness, 0));
}
public static void setTimePeriod()
{
	time.add(new TimePeriod("Renaissance", 1300, 1600, 100));
	time.add(new TimePeriod ("Industrial Revolution", 1760, 1840, 200));
	time.add(new TimePeriod("Roaring Twenties", 1920, 1929, 300));
	time.add(new TimePeriod("Future", 2050, 2100, 400));
}
public static void greetUser (String[] args) 
{
	name = JOptionPane.showInputDialog(
			" Welcome to Time Travel Adventure! What is your name?");  
	JOptionPane.showMessageDialog(
			frame, 
			"Hi, " + name);
	Object[] options = {"Reanaissance", "Industrial Revolution", "Roaring Twenties", "Future"};
	era = JOptionPane.showOptionDialog(
			frame, 
			"What era would you like to be from?",
			"Your Era",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, 
			options, 
			options[2]);
	switch(era)
	{
	case 0:
		{
		JOptionPane.showMessageDialog(
				frame, 
				"A future king or queen I see. . .");
		break;
		}
	case 1:
		{
		JOptionPane.showMessageDialog(
				frame, 
				"Another rags to riches story?");
		break;
		}
	case 2:
		{
		JOptionPane.showMessageDialog(
				frame, 
				"Someone who loves to party?");
		break;
		}
	case 3:
		{
		JOptionPane.showMessageDialog(
				frame, 
				"Can you even imagine the future?");
				break;
			}
	}
	final String[] strengthOptions = { "Courage", "Wit", "Determination", "Trustworthiness" };
	final JFrame frame = new JFrame();
    String choices = (String) JOptionPane.showInputDialog(frame, 
            "Pick your strength",
            "Strength",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            strengthOptions, 
            strengthOptions[0]);
  
    if (choices.equals(strengthOptions[0]))
    	{
    		people.get(0).setStrengths("Courage");
    	}
   
    else if (choices.equals(strengthOptions[1]))
    	{
    		people.get(0).setStrengths("Wit");
    	}
    else if (choices.equals(strengthOptions[2]))
    	{
    		people.get(0).setStrengths("Determination");
    	}
    else
    	{
    		people.get(0).setStrengths("Trustworthiness");
    	}
   
    final String[] weaknessOptions = { "Fearful", "Slow", "Weak Hearted", "Controlling" };
	String weaknessChoices = (String) JOptionPane.showInputDialog(frame, 
            "Pick your strength",
            "Strength",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            weaknessOptions, 
            weaknessOptions[0]);
	
	if (weaknessChoices.equals(weaknessOptions[0]))
    	{
    		people.get(0).setWeaknesses("Fearful");
    	}
	else if (weaknessChoices.equals(weaknessOptions[1]))
    	{
    		people.get(0).setWeaknesses("Slow");;
    	}
	else if (weaknessChoices.equals(weaknessOptions[2]))
    	{
    		people.get(0).setWeaknesses("Weak Hearted");;
    	}
	else
		{
			people.get(0).setWeaknesses("Controlling");
		}
    
	JOptionPane.showMessageDialog(
    		frame, 
    		"Congrats! You just finished creating your character!");    
	      
}
public static void introduction (String[] args)
{
	JOptionPane.showMessageDialog(
    		frame, 
    		"Stats- "+"\nName: " + name + "\n" + "Strength: " + people.get(0).getStrengths() +"\n" + "Weakness: " + people.get(0).getWeaknesses() + "\n Point Total: " + people.get(0).getPoints());    
	JOptionPane.showMessageDialog(
    		frame, 
    		"Goals - "+"In order to win the game, you will have to earn at least 10,000 points!\n You will earn these points by traveling through time and winning challenges from different eras. \n Each era will get increasly hard, but you will gain more points."); 
	JOptionPane.showMessageDialog(
    		frame, 
    		"Good luck!");  
}
public static void RenaissanceGame()
{
	String message = "False face must hide what the false heart doth know";
	 ImageIcon icon = new ImageIcon("Reanaissance.jpg");
	    JOptionPane.showMessageDialog(
	    		frame,
	    		"Your adventure begins in the Renaissance!",
	    		"Renaissance era",
	    		JOptionPane.INFORMATION_MESSAGE,
	    		icon
	    		);
	    JOptionPane.showMessageDialog(
	    		frame, 
	    		"Welcome to the Renaissance era! \n For this challenge, you will be able to earn up to 100 points!");
	    JOptionPane.showMessageDialog(
	    		frame, 
	    		"Fellow knight, you are being sent on a critical mission to deliver a message to the queen. \n To deliver the message you will have to navagate through the forest. \n Type in R for right and L for left in order to navagiate.");
	    JOptionPane.showMessageDialog(
	    		frame, 
	    		"Oh, I almost forgot!  \n Remember this message for bonus points: False face must hide what the false heart doth know. . . Good luck!");
	    moveOne = JOptionPane.showInputDialog(
				"It is early morning, and the birds are singing. Time to start your journey. Which way?"); 
	    if (moveOne.toUpperCase().equals("R"))
	    	{
	    		moveTwo =  JOptionPane.showInputDialog(
	    				"You make a right turn and walk a ways until you come upon a fork in the path. Which way do you choose?"); 
	    		if (moveTwo.toUpperCase().equals("R"))
	    			{
	    				moveThree = JOptionPane.showInputDialog(
	    	    				"You see a injured deer on the right side of the road. Do you go over to help or turn the opposite direction?"); 
	    				if(moveThree.toUpperCase().equals("R"))
	    					{
	    						moveFour = JOptionPane.showInputDialog(
	    	    	    				"You go over and help the injured deer, but you hear something rustling in ther bushes. \n You should probably get out of here. Left or Right?"); 	
	    					
	    					if(moveFour.toUpperCase().equals("R"))
	    						{
	    							moveFive =  JOptionPane.showInputDialog(
		    	    	    				"The noise gets louder. . . Quickly, left? Right?"); 		
	    							if (moveFive.toUpperCase().equals("L"))
	    								{
	    									JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You a twig snap behind you. . . \n You turn around to face a bear. . . The bear attacks you!");
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Game over!");
	    									pointCounter = +0;
	    									guessOne = JOptionPane.showInputDialog(
	    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	    									if (guessOne.equals(message))
	    										{
	    											people.get(0).setPoints(pointCounter + 10);
	    											JOptionPane.showMessageDialog(
		    									    		frame, 
		    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	    										}
	    									else
	    										{
	    											people.get(0).setPoints(pointCounter);
	    											JOptionPane.showMessageDialog(
		    									    		frame, 
		    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	    										}
	    								}
	    							if(moveFive.toUpperCase().equals("R"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You start running and see a straight path to the castle. . . \n The noise is gone . . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You make it to the castle and deliver the message! The queen thanks you for your courage!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You win this game!");
    									pointCounter = +10000;
    									guessTwo = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessTwo.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
    									
	    								}
	    						}
	    					if(moveFour.toUpperCase().equals("L"))
	    						{
	    							moveSix = JOptionPane.showInputDialog(
		    	    	    				"The rustling ceases, but you see two paths leading to the castle. \n The path to the right is a field of flowers, and the path to the left is a rocky hill. \n Which path do you choose?");
	    							if(moveSix.toUpperCase().equals("R"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You glide through the field of flowers. . . But you start to feel sleepy. . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"Oh, no! It's a trap! The flowers are enchanted!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You fall asleep. . . never to awake again. . . Game over!");
    									pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    								}
	    							if(moveSix.toUpperCase().equals("L"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Your muscles start to ache as you scale the large boulders to get over the hill to the castle . . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You pull yourself over the last boulder and stare at the castle in awe. . . Almost there. . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"It is an easy walk to the castle from here. . . ");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You make it to the castle and deliver the message to the queen! The queen thanks you for your service!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"Congrats! You win this game!!");
    									pointCounter = +90;
    									guessFour = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessFour.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    								}
	    						}
	    					}
	    				if(moveThree.toUpperCase().equals("L"))
	    					{
	    						moveSeven = JOptionPane.showInputDialog(
	    	    	    				"You pass the deer, but a cave appears to the right. Maybe this is a shortcut. . . \n Do you attempt it?");
	    						if(moveSeven.toUpperCase().equals("R"))
	    							{
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You enter the cave and darkness consumes you. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"But wait. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"There is a light at the end of the tunnel!. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You are at the castle! This was a shortcut!");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Congrats! You win this game!");
	    								pointCounter = +90;
    									guessFive = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessFive.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    						if(moveSeven.toUpperCase().equals("L"))
	    							{
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You part ways with the cave, but none of your surroundings look famaliar anymore. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Every tree, path, rock looks the same. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Oh, no! You are lost!");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Game over!");
	    								pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    					}
	    			}
	    		if (moveTwo.toUpperCase().equals("L"))
	    			{
	    				moveEight =   JOptionPane.showInputDialog(
	    	    				"You walk for awhile and start to feel hungry. . . \n There is an apple orchard to your right. . . \n Do you take a detour for a snack?");
	    				if (moveEight.toUpperCase().equals("R"))
	    					{
	    						moveNine =  JOptionPane.showInputDialog(
	    	    	    				"You walk over to the orchard and take an apple. It tastes delicous and gives you new energy! Which way onward?");
	    						if(moveNine.toUpperCase().equals("R"))
	    							{
	    								moveTen =  JOptionPane.showInputDialog(
	    	    	    	    				"With this new energy, you skipped through the forest, but you see a river to the right. Do you go towards the river or stay on the path? \n The orchard was not a bad choice last time. . .");
	    								if(moveTen.toUpperCase().equals("R"))
	    									{
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You walk towards the river and the the current is rushing down. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You slip and fall into the river. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are drowned! :(");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Game over!");
	    										pointCounter = +0;
	        									guessThree = JOptionPane.showInputDialog(
	        		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	        									if (guessThree.equals(message))
	        										{
	        											people.get(0).setPoints(pointCounter + 10);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	        										}
	        									else
	        										{
	        											people.get(0).setPoints(pointCounter);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	        										}
	    									}
	    								if(moveTen.toUpperCase().equals("L"))
	    									{
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You skip the river, and what a great choice!");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You see the castle draw bridge right in front of you with the rushing river below. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You enter the castle and deliver the queen her message. The queen thanks you for your bravery!");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Yay! You win the game!");
	    										pointCounter = +90;
	        									guessFive = JOptionPane.showInputDialog(
	        		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	        									if (guessFive.equals(message))
	        										{
	        											people.get(0).setPoints(pointCounter + 10);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	        										}
	        									else
	        										{
	        											people.get(0).setPoints(pointCounter);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	        										}
	
	    									}
	    							}
	    						if(moveNine.toUpperCase().equals("L"))
	    							{

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"With this new energy you begin to become clumsy. . .");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You stumble and fall rolling into a pit filled with sleeping snakes. . .");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You try to be quite, but one of the snakes wakes up and bites you!");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"The bite is infected with poison. . .");
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You let your foolishness kill you! You die! Game Over!!");
										pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    					}
	    				if (moveEight.toUpperCase().equals("L"))
	    				{
	    					moveEleven = JOptionPane.showInputDialog(
    	    	    				"You skip the apple orchard, but find a farmer walking by. Maybe he could give some directions to get to the castle faster. \n Do you ask for directions? (The farmer is to the right)");
	    					if (moveEleven.toUpperCase().equals("R"))
	    						{
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You talk to the farmer, and he is actually going to the castle himself!");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"He offers to escort you to the castle and you except in exchange for protecting him. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"As you walk, you begin telling eachother your stories and become good friends. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"The time passes quickly and before you know it, you are at the castle. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You tell your new friend goodbye and promise to write. . .");

	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You enter the castle and deliver the message. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You win the game!!");
	    							pointCounter = +90;
									guessFive = JOptionPane.showInputDialog(
		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
									if (guessFive.equals(message))
										{
											people.get(0).setPoints(pointCounter + 10);
											JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
										}
									else
										{
											people.get(0).setPoints(pointCounter);
											JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
										}
	    						}
	    					if (moveEleven.toUpperCase().equals("L"))
	    						{
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You should have stopped to ask for directions because now you are lost!");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"It is getting dark and you hear howls in the distance. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"Wolves! You will not last the night. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"Game over!!");
	    				  		pointCounter = +0;
								guessThree = JOptionPane.showInputDialog(
	    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
								if (guessThree.equals(message))
									{
										people.get(0).setPoints(pointCounter + 10);
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
									}
								else
									{
										people.get(0).setPoints(pointCounter);
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
									}
	    						}
	    				}
	    			}
	    	}
	    if (moveOne.toUpperCase().equals("L"))
	    	{
	    		moveTwelve =  JOptionPane.showInputDialog(
	    				"You make a right turn and walk a ways until you come upon a fork in the path. Which way do you choose?"); 
	    		if (moveTwelve.toUpperCase().equals("R"))
	    			{
	    				moveThirteen = JOptionPane.showInputDialog(
	    	    				"You see a injured deer on the right side of the road. Do you go over to help or turn the opposite direction?"); 
	    				if(moveThirteen.toUpperCase().equals("R"))
	    					{
	    						moveFourteen = JOptionPane.showInputDialog(
	    	    	    				"You go over and help the injured deer, but you hear something rustling in ther bushes. \n You should probably get out of here. Left or Right?"); 	
	    					
	    					if(moveFourteen.toUpperCase().equals("R"))
	    						{
	    							moveFifteen =  JOptionPane.showInputDialog(
		    	    	    				"The noise gets louder. . . Quickly, left? Right?"); 		
	    							if (moveFifteen.toUpperCase().equals("L"))
	    								{
	    									JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You a twig snap behind you. . . \n You turn around to face a bear. . . The bear attacks you!");
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Game over!");
	    									pointCounter = +0;
	    									guessOne = JOptionPane.showInputDialog(
	    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	    									if (guessOne.equals(message))
	    										{
	    											people.get(0).setPoints(pointCounter + 10);
	    											JOptionPane.showMessageDialog(
		    									    		frame, 
		    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	    										}
	    									else
	    										{
	    											people.get(0).setPoints(pointCounter);
	    											JOptionPane.showMessageDialog(
		    									    		frame, 
		    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	    										}
	    								}
	    							if(moveFifteen.toUpperCase().equals("R"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You start running and see a straight path to the castle. . . \n The noise is gone . . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You make it to the castle and deliver the message! The queen thanks you for your courage!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You win this game!");
    									pointCounter = +10000;
    									guessTwo = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessTwo.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
    									
	    								}
	    						}
	    					if(moveFourteen.toUpperCase().equals("L"))
	    						{
	    							moveSixteen = JOptionPane.showInputDialog(
		    	    	    				"The rustling ceases, but you see two paths leading to the castle. \n The path to the right is a field of flowers, and the path to the left is a rocky hill. \n Which path do you choose?");
	    							if(moveSixteen.toUpperCase().equals("R"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You glide through the field of flowers. . . But you start to feel sleepy. . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"Oh, no! It's a trap! The flowers are enchanted!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You fall asleep. . . never to awake again. . . Game over!");
    									pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    								}
	    							if(moveSixteen.toUpperCase().equals("L"))
	    								{
	    									JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Your muscles start to ache as you scale the large boulders to get over the hill to the castle . . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You pull yourself over the last boulder and stare at the castle in awe. . . Almost there. . .");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"It is an easy walk to the castle from here. . . ");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"You make it to the castle and deliver the message to the queen! The queen thanks you for your service!");
    									JOptionPane.showMessageDialog(
									    		frame, 
									    		"Congrats! You win this game!!");
    									pointCounter = +90;
    									guessFour = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessFour.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    								}
	    						}
	    					}
	    				if(moveThirteen.toUpperCase().equals("L"))
	    					{
	    						moveSeventeen = JOptionPane.showInputDialog(
	    	    	    				"You pass the deer, but a cave appears to the right. Maybe this is a shortcut. . . \n Do you attempt it?");
	    						if(moveSeventeen.toUpperCase().equals("R"))
	    							{
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You enter the cave and darkness consumes you. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"But wait. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"There is a light at the end of the tunnel!. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You are at the castle! This was a shortcut!");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Congrats! You win this game!");
	    								pointCounter = +90;
    									guessFive = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessFive.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    						if(moveSeventeen.toUpperCase().equals("L"))
	    							{
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"You part ways with the cave, but none of your surroundings look famaliar anymore. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Every tree, path, rock looks the same. . .");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Oh, no! You are lost!");
	    								JOptionPane.showMessageDialog(
									    		frame, 
									    		"Game over!");
	    								pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    					}
	    			}
	    		if (moveTwelve.toUpperCase().equals("L"))
	    			{
	    				moveEighteen =   JOptionPane.showInputDialog(
	    	    				"You walk for awhile and start to feel hungry. . . \n There is an apple orchard to your left. . . \n Do you take a detour for a snack?");
	    				if (moveEighteen.toUpperCase().equals("R"))
	    					{
	    						moveNineteen =  JOptionPane.showInputDialog(
	    	    	    				"You walk over to the orchard and take an apple. It tastes delicous and gives you new energy! Which way onward?");
	    						if(moveNineteen.toUpperCase().equals("R"))
	    							{
	    								moveTwenty =  JOptionPane.showInputDialog(
	    	    	    	    				"With this new energy, you skipped through the forest, but you see a river to the right. Do you go towards the river or stay on the path? \n The orchard was not a bad choice last time. . .");
	    								if(moveTwenty.toUpperCase().equals("R"))
	    									{
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You walk towards the river and the the current is rushing down. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You slip and fall into the river. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are drowned! :(");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Game over!");
	    										pointCounter = +0;
	        									guessThree = JOptionPane.showInputDialog(
	        		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	        									if (guessThree.equals(message))
	        										{
	        											people.get(0).setPoints(pointCounter + 10);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	        										}
	        									else
	        										{
	        											people.get(0).setPoints(pointCounter);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	        										}
	    									}
	    								if(moveTwenty.toUpperCase().equals("L"))
	    									{
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You skip the river, and what a great choice!");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You see the castle draw bridge right in front of you with the rushing river below. . .");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You enter the castle and deliver the queen her message. The queen thanks you for your bravery!");
	    										JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Yay! You win the game!");
	    										pointCounter = +90;
	        									guessFive = JOptionPane.showInputDialog(
	        		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
	        									if (guessFive.equals(message))
	        										{
	        											people.get(0).setPoints(pointCounter + 10);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
	        										}
	        									else
	        										{
	        											people.get(0).setPoints(pointCounter);
	        											JOptionPane.showMessageDialog(
	    	    									    		frame, 
	    	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
	        										}
	
	    									}
	    							}
	    						if(moveNineteen.toUpperCase().equals("L"))
	    							{

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"With this new energy you begin to become clumsy. . .");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You stumble and fall rolling into a pit filled with sleeping snakes. . .");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You try to be quite, but one of the snakes wakes up and bites you!");

										JOptionPane.showMessageDialog(
									    		frame, 
									    		"The bite is infected with poison. . .");
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You let your foolishness kill you! You die! Game Over!!");
										pointCounter = +0;
    									guessThree = JOptionPane.showInputDialog(
    		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
    									if (guessThree.equals(message))
    										{
    											people.get(0).setPoints(pointCounter + 10);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
    										}
    									else
    										{
    											people.get(0).setPoints(pointCounter);
    											JOptionPane.showMessageDialog(
	    									    		frame, 
	    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
    										}
	    							}
	    					}
	    				if (moveEighteen.toUpperCase().equals("L"))
	    				{
	    					moveTwentyOne = JOptionPane.showInputDialog(
    	    	    				"You skip the apple orchard, but find a farmer walking by. Maybe he could give some directions to get to the castle faster. \n Do you ask for directions? (The farmer is to the right)");
	    					if (moveTwentyOne.toUpperCase().equals("R"))
	    						{
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You talk to the farmer, and he is actually going to the castle himself!");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"He offers to escort you to the castle and you except in exchange for protecting him. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"As you walk, you begin telling eachother your stories and become good friends. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"The time passes quickly and before you know it, you are at the castle. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You tell your new friend goodbye and promise to write. . .");

	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You enter the castle and deliver the message. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You win the game!!");
	    							pointCounter = +90;
									guessFive = JOptionPane.showInputDialog(
		    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
									if (guessFive.equals(message))
										{
											people.get(0).setPoints(pointCounter + 10);
											JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
										}
									else
										{
											people.get(0).setPoints(pointCounter);
											JOptionPane.showMessageDialog(
    									    		frame, 
    									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
										}
	    						}
	    					if (moveTwentyOne.toUpperCase().equals("L"))
	    						{
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"You should have stopped to ask for directions because now you are lost!");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"It is getting dark and you hear howls in the distance. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"Wolves! You will not last the night. . .");
	    							JOptionPane.showMessageDialog(
								    		frame, 
								    		"Game over!!");
	    				  		pointCounter = +0;
								guessThree = JOptionPane.showInputDialog(
	    	    	    				"Do you remember the message from the beginning? If so, type it in now for bonus points!"); 		
								if (guessThree.equals(message))
									{
										people.get(0).setPoints(pointCounter + 10);
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You are correct you get 10 extra bonus points! Your new total is " + people.get(0).getPoints() + "!");
									}
								else
									{
										people.get(0).setPoints(pointCounter);
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"Sorry, you are incorrect. Your new point total is " + people.get(0).getPoints() + "!");
									}
	    						}
	    				}
	    			}
	    	}
}

public static void IndustrialRevolutionGame()
{
	
}
public static void RoaringTwentiesGame()
{
	
}
public static void FutureGame()
{
	
}
	}
