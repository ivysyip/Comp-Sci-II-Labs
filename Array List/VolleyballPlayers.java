// Explanation of the import statement
// java is a folder on your computer
// util is a folder inside of the java folder
// The * means that we have access to all classes
//     inside the util folder.
import java.util.*; // for the ArrayList


public class Main // Volleyball 
{
    // Declare a variable called players which can
    // refer to an ArrayList of Player objects.    
    private  ArrayList<Player> players;
    
    // default constructor
    // same name as the class and no parameters
    public Main()
    {
      // Create a new ArrayList which can contain
      // Player objects.
      players = new ArrayList<Player>();
    } // end of method
    
    // given addPlayer method
    public void addPlayer(Player player)
    {
      // Add this player to your players list.
      players.add(player);
    } // end of method
    
    
    // *******************************
    // *******************************
    // *******************************
    // ****** to be written for part a
    // *******************************
    // *******************************
    // *******************************
    // Gets the total number of spikes
    // of all players.
    public int getTotalSpikes()
    {

      // define a variable called totalSpikes that 
      // will hold the total number of spikes for
      // all players
      int totalSpikes = 0;

      // Loop through all the Player objects 
      for (Player player : players)
      {
          // get the number of spikes for this player
          int spikes = player.getNumSpikes();

          totalSpikes = totalSpikes + spikes;

      }

      // return the total number of spikes
      return totalSpikes;
    } // end of method
    
    
    // *******************************
    // *******************************
    // *******************************
    // ****** to be written for part b
    // *******************************
    // *******************************
    // *******************************
    // returns a list of Player objects (or 1)
    // that have the highest number of spikes
    public ArrayList <Player> getPlayersWithMostSpikes()
    {
      // create a new ArrayList that can hold Player objects
      // that have the most spikes (there may be only 1)
      ArrayList <Player> list = new ArrayList<Player>();

      int mostSpikes = 0;

      // Loop through all the Player objects (in players)
      // and see if we
      // can find a player with more spikes or the same
      // number of spikes as the mostSpikes variable. 
      for (Player player : players)
      {
          // get the number of spikes for this player
          int spikes = player.getNumSpikes();

          // see if spikes is greater than mostSpikes
          if (spikes > mostSpikes)
          {
            // We have a new leader.
            // So clear your list and add this
            // player object to list
            list.clear();
            list.add(player);

            // update your mostSpikes
            mostSpikes = spikes;

          }
          else if (spikes == mostSpikes)
          {
            // We have a tie for the most spikes.
            // So add this
            // player object to list
            list.add(player);

            // update your mostSpikes?
            // well no since it will stay the same


          }
      }

      // return this list of players (or maybe just 1)
      return list;

    } // end of method
    

    // *******************************
    // *******************************
    // *******************************
    // ****** to be written for part c
    // *******************************
    // *******************************
    // *******************************
    public double getAvgNumberOfSpikes()
    {
      int arraySize = players.size();
      
      
      return getTotalSpikes()/(double)arraySize;
    } // end of method
    
    
    
    public String toString()
    {
        // call the toString() method of the players object
        return players.toString();
    }
    
    
    
    // given
    // a main method to test it
    public static void main(String[] args) {
       Main volleyball = new Main();
       
       System.out.println();
       System.out.println("Volleyball Players");
       System.out.println();
       System.out.println("Written by YOUR NAME Ivy Yip");
       System.out.println();

       volleyball.addPlayer(new Player("Sophia",29));
       volleyball.addPlayer(new Player("Sue",21));
       volleyball.addPlayer(new Player("Sally",29));
       volleyball.addPlayer(new Player("Maria",23));


       // test for part a - get the total number of spikes
       System.out.println("The total number of spikes:");
       System.out.println(volleyball.getTotalSpikes());       
       System.out.println();
       System.out.println();

       // test for part a - get the total number of spikes
       System.out.println("The player(s) with the highest spikes:");
       System.out.println(volleyball.getPlayersWithMostSpikes());       
       System.out.println();
       System.out.println();

       // test for part c - get the average number of spikes
       System.out.println("The average number of spikes:");
       System.out.println(volleyball.getAvgNumberOfSpikes());       
       System.out.println();
       System.out.println();
            
    } // end of main for testing
    
} // end of class

// this class is given 
// notice it is immutable
public class Player
{
    String name;
    int numSpikes;
    
    // constructor
    public Player(String name, int numSpikes)
    {
      this.name = name;
      this.numSpikes = numSpikes;
    }
    
    public String getName()
    {
      return name;
    }
    
    public int getNumSpikes()
    {
      return numSpikes;
    }
    
    // for testing results
    public String toString()
    {
      // return the name plus a space plus the numSpikes
      return name + " " + numSpikes;
    }
    
} // end of class
