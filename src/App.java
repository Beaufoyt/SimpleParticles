import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class App {

	public App() {
		try
		{
			AppGameContainer app = new AppGameContainer(new SimpleGame());
			app.setDisplayMode((int)Constants.SCREEN_WIDTH,(int)Constants.SCREEN_HEIGHT,false);
			app.start();
		}
		catch (SlickException e)
		{
			e.printStackTrace();
		}
	}
}
