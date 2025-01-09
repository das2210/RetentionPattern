import java.util.*;
import java.io.*;

public class RetentionPattern{

	public static void main(String[] args) {
      
	/* load csv file into this java program */
    
		   Scanner user_input = new Scanner(System.in);
		   System.out.println("what's the name of your csv file?\n");
		   String file_name = user_input.next();
		   
		   try {
		   File file = new File(file_name);
		   Scanner input = new Scanner(file);
		   System.out.println("you entered:\n" + input);
		   }
		   
		   catch(IOException e){
			   System.out.print("file does not exist");
			   System.exit(1); 
		   }

      
    }
	}
