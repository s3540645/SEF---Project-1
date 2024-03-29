import java.util.*;





public abstract class MovableItem extends Item {
	
	
	public static int tempInt;
	public static Item[][] gameBoard ;
	public static int[] results;

	public MovableItem(String itemChar) 
	{
		super(itemChar);
		
	}

	
	/*-----------------------------Using two dimensional----------------------------------*/
	
	public static int[] findNewXAndY(int XCoord, int YCoord, String direction
			           , int boardSize) throws outOfBoundsException
    {   //Changed now to return x and y coords after move. n
		
		
		results = new int[2];
		
        if (direction == "Up")
        	{
        	   if ((YCoord == 0) && (XCoord != ((boardSize/2) )))
        		   {
        		   	 throw new outOfBoundsException("Out of Bounds Top");
        		    }
        	   
   	           else if ((YCoord == 0) && (XCoord == ((boardSize/2) )))
   	                {
   		             YCoord = (boardSize-1);
   		             
   	                 }
   	           else
   	                 {
   		             tempInt = YCoord - 1;
   		             YCoord =tempInt;
   		              
   		        	 }
        	   results[0] = XCoord;
        	   results[1] = YCoord;
        	   return results;
	         }
        
        else if (direction =="Down")
            {
   	           if ((YCoord == boardSize-1) && (XCoord != boardSize/2))
   	               {
   		            throw new outOfBoundsException("Out of Bounds Bottom");
   	               }
   	           else if ((YCoord == boardSize-1) && (XCoord == boardSize/2))
   	               {
   		           YCoord = 0;
   		           
   	                }
   	          else
   	               {
   		           tempInt = YCoord + 1;
   		           YCoord = tempInt;
   		           
   		           }
   	        results[0] = XCoord;
     	    results[1] = YCoord;
   	        return results;
	       }

        else if (direction =="Left")
        	{
        	   if ((XCoord == 0) && (YCoord != ((boardSize/2) )))
        	   {
        		   throw new outOfBoundsException("Out of Bounds Left");
        	   }
   	           else if ((XCoord == 0) && (YCoord == ((boardSize/2) )))
   	           {
   		           XCoord = (boardSize-1);
   		          
   	           }
   	           else
   	          {
		           tempInt = XCoord - 1;
		           XCoord =(tempInt); 
		           
   	           }
        	   results[0] = XCoord;
        	   results[1] = YCoord;
        	   return results;

        	   
	     
    }

    else if (direction =="Right")
    {
   	     if ((XCoord  == (boardSize - 1))&& 
		     (YCoord != ((boardSize/2) )))
   	     {
   		        throw new outOfBoundsException("Out of Bounds Right");
   	     }
   	     else if ((XCoord  == (boardSize - 1)) && (YCoord == (boardSize/2) ))
   	     {
   		         XCoord = (0);
   	    
   	      }
   	     else
   	     {
   		      tempInt = XCoord + 1;
   		      XCoord = (tempInt);
   	     }
   	 
           results[0] = XCoord;
	       results[1] = YCoord;
   	       return results;  
	     
	  
     }
    else
    {
        results[0] = XCoord;
 	    results[1] = YCoord;
		return results;
    }
  	 
  }
}

/*-----------------------------Using Arraylists----------------------------------
public static void moveItem(String direction , Square objectSquare 
         , int boardSize) throws outOfBoundsException

{
	
	
	
	{
         if (direction == "Up")
	     {
        	 if ((objectSquare.getY() - 1 < 1) && 
        	 (objectSquare.getX() != ((boardSize/2) + 1)))
        	 {
        		 throw new outOfBoundsException("Out of Bounds Top");
        	 }
        	 else if (objectSquare.getX() == ((boardSize/2) + 1))
        	 {
        		 objectSquare.changeYCoord(boardSize);
        	 }
        	 else
        	 {
        		 tempInt = objectSquare.getY() - 1;
			     objectSquare.changeYCoord(tempInt);
        	 }
		     
		     
		
	     }
	    else if (direction =="Down")
	     {
	    	 if ((objectSquare.getY() + 1 > boardSize) && 
        	 (objectSquare.getX() != ((boardSize/2) + 1)))
        	 {
        		 throw new outOfBoundsException("Out of Bounds Bottom");
        	 }
	    	 else if (objectSquare.getX() == ((boardSize/2) + 1))
        	 {
        		 objectSquare.changeYCoord(1);
        	 }
        	 else
        	 {
        		 tempInt = objectSquare.getY() + 1;
			     objectSquare.changeYCoord(tempInt);
        	 }
		      
		
	     }
	
	
	
	
	
	     else if (direction =="Left")
	     {
	    	 if ((objectSquare.getX() - 1 < 1) && 
	    			 (objectSquare.getY() != ((boardSize/2) + 1)))
	    			 
        	 {
        		 throw new outOfBoundsException("Out of Bounds Left");
        	 }
	    	 else if (objectSquare.getY() == ((boardSize/2) + 1))
        	 {
        		 objectSquare.changeXCoord(boardSize);
        	 }
	    	 else
	    	 {
			      tempInt = objectSquare.getX() - 1;
			      objectSquare.changeXCoord(tempInt); 
	    	 }

		     
	     }
	
	     else if (direction =="Right")
	     {
	    	 if ((objectSquare.getX() - 1 > boardSize)&& 
			     (objectSquare.getY() != ((boardSize/2) + 1)))
        	 {
        		 throw new outOfBoundsException("Out of Bounds Right");
        	 }
	    	 else if (objectSquare.getY() == ((boardSize/2) + 1))
        	 {
        		 objectSquare.changeXCoord(1);
        	 }
	    	 else
	    	 {
	    		 tempInt = objectSquare.getX() + 1;
			     objectSquare.changeXCoord(tempInt);
	    	 }
		     
		     
	     }

	   	 
	}
}

*/	