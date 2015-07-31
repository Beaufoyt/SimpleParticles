import org.newdawn.slick.geom.Vector2f;

/**
 * Created by thomas.beaufoy on 29/07/15.
 */
public class BoundingCircle {

	private float centerX;
	private float centerY;
	private float radius;

	public BoundingCircle(Vector2f positon, float width, float height) {
		this.centerX = positon.getX() + (width/2);
		this.centerY = positon.getY() + (height/2);
		this.radius = width / 2;
	}
}
