import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

public class Particle {

	private float gravity = 0.1f;
	private float dt = 1.0f;
	private Vector2f position = new Vector2f(250.0f, 200.0f);
	private Vector2f velocity = new Vector2f(0.0f, 0.0f);
	private Vector2f acceleration = new Vector2f(0.0f, 0.0f);
	private Vector2f force = new Vector2f(0.0f, 0.0f);
	private float mass = 1.0f;
	private Image sprite;
	private BoundingSquare bbox;


	public Particle() throws SlickException {
		sprite = new Image("data/images/ball.png");
		this.bbox = new BoundingSquare(position, sprite.getWidth(), sprite.getHeight());
		this.velocity = new Vector2f((float)Math.random() - 0.5f, (float)Math.random()-0.5f);
		System.out.println((float)Math.random() - 0.5);
	}

	public void update() {

		velocity = velocity.add(acceleration.scale(dt));
		position = position.add(velocity.scale(dt));
//		position = cross(position.add(dt), velocity);
//		velocity = cross(velocity.add(dt), force.scale(mass));
		this.bbox.updateBoundingBox(position, sprite.getWidth(), sprite.getHeight());
	}

	public void setYPos(float value) { this.position.y = value; }

	public void setVelocity(Vector2f velocity) { this.velocity = velocity; }

	public void draw() { sprite.draw(position.getX(), position.getY()); }

	public float getYPos() { return this.position.y; }

	public float getXPos() { return this.position.x; }

	public BoundingSquare getBbox() { return this.bbox; }


	public Vector2f getVelocity() { return this.velocity; }

	public Vector2f cross(Vector2f first, Vector2f second) {
		return new Vector2f(first.x * second.y, first.y * second.x);
	}
}
