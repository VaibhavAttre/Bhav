// Vaibhav Attre
// 22/24/22
// AP CSA
// Teacher: Mr. Thompson
// Bear Class
// this class extends the critter class and is the code for a "husky" critter

import java.awt.*;
import java.util.*;

public class Husky_VaibhavAttre extends Critter {
   //feilds
   private int myStepCount;
   private static int groupStepCount = 0;
   private int infectedCount;
   private String[] huskyForm = {"ruff","lycan","roar"};
   
   //constructor 
   public Husky_VaibhavAttre() {
      myStepCount = 0;
   }
   
   /////////////////////////////////////////////////////////////////////////////
   // Purpose: How the husky will respond to certain events
   //          The husky starts off by trying to eliminate as many targets as it possibly can, 
   //          and after a certain time, it moves like one big herd to north, and then again as
   //          one big herd to south, where it remains and spins
   // parameters: the CritterInfo 
   // output:  returns the action 
   public Action getMove(CritterInfo info) {
      //group step count increment
      myStepCount++;
      if(myStepCount > groupStepCount){
         groupStepCount++;
      }
      //code for infecting
      infectedCount = info.getInfectCount();
      
      if (info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      }
      if (info.getRight() == Neighbor.OTHER){
         return Action.RIGHT;
      }
      if (info.getLeft() == Neighbor.OTHER){
         return Action.LEFT;
      }
      if (info.getBack() == Neighbor.OTHER){
         return Action.RIGHT;
      }
      if ((info.getFront() == Neighbor.SAME) && (infectedCount == 0)){
         return Action.RIGHT;
      } else if (info.getFront() == Neighbor.WALL && infectedCount ==0 ) {
         return Action.RIGHT;
      }
      //code for herd movement
      if(infectedCount == 0) {
         return Action.HOP;
      } else { 
         if(groupStepCount >= 200) {
            if(groupStepCount >= 300 && groupStepCount < 400) {
               return turnSouth(info);
            } 
            if(groupStepCount == 400) {
               return Action.RIGHT;
            }
            if(groupStepCount == 700) {
               return Action.LEFT;
            }
            if(groupStepCount == 701) {
               return Action.LEFT;
            }
            return Action.HOP;
         } 
         return turnNorth(info);
      }
      
   }

   /////////////////////////////////////////////////////////////////////////////
   // Purpose: Colors the husky gray
   // parameters: none 
   // output:  returns the color of the husky
   public Color getColor(){
      if(infectedCount < 5) {
         return Color.GREEN;
      } else if (infectedCount >= 5 && infectedCount < 10) {
         return Color.YELLOW;
      } else {
         return Color.RED;
      }
   }
   
   
   
   /////////////////////////////////////////////////////////////////////////////
   // Purpose: look for huksy 
   //
   // parameters: none 
   // output:  returns string "*" which depics the husky in this case   
   public String toString() {      
      if(infectedCount < 5) {
         return huskyForm[0];
      } else if(infectedCount < 10) {
         return huskyForm[1];
      } else {
         return huskyForm[2];
      }
   }
   
   /////////////////////////////////////////////////////////////////////////////
   // Purpose: helper method to make the husky face north 
   //
   // parameters: takes in info 
   // output:  moves towards north by rotating   
   public Action turnNorth(CritterInfo info) {
      Direction critterDirection = info.getDirection();
      if(critterDirection != Direction.NORTH) {
         return Action.LEFT;
      } else {
         return null;
      }
   }

   /////////////////////////////////////////////////////////////////////////////
   // Purpose: helper method to make the husky face south 
   //
   // parameters: takes in info 
   // output:  moves towards south by rotating   
   public Action turnSouth(CritterInfo info) {
      Direction critterDirection = info.getDirection();
      if(critterDirection != Direction.SOUTH) {
         return Action.LEFT;
      } else {
         return Action.HOP;
      }
   }
}