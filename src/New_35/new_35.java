package New_35;

import java.util.Scanner;

public class new_35 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int lineNumber = 0;
        
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            
            System.out.println(++lineNumber + " " + line);
        }

	}

}
