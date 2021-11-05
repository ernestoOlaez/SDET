package Mouse;
import java.awt.*;
import java.util.*;
public class Hal 
{

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		Robot hal = new Robot();
	    Random random = new Random();
	    int c=0;
	    while(true)
	    {
	      hal.delay(1000 * 60);
	      c++;
	      int x = random.nextInt() % 640;
	      int y = random.nextInt() % 480;
	      hal.mouseMove(x,y);
	      System.out.println("..."+c);

	}

}
}
