import org.newdawn.slick.geom.Vector2f;

public class BoundingSquare {

	private float xMin;
	private float xMax;
	private float yMin;
	private float yMax;
	private float height;
	private float width;

	public BoundingSquare() {

	}

	public BoundingSquare(float xMin, float xMax, float yMin, float yMax) {
		this.xMin = xMin;
		this.xMax = xMax;
		this.yMin = yMin;
		this.yMax = yMax;
		this.width = this.xMax - this.xMin;
		this.height = this.yMax - this.yMin;
	}

	public BoundingSquare(Vector2f position, float width, float height) {
		this.xMin = position.getX();
		this.xMax = position.getX() + width;
		this.yMin = position.getY();
		this.yMax = position.getY() + height;
		this.width = this.xMax - this.xMin;
		this.height = this.yMax - this.yMin;
	}

	public void updateBoundingBox(Vector2f position, float width, float height) {
		this.xMin = position.getX();
		this.xMax = position.getX() + width;
		this.yMin = position.getY();
		this.yMax = position.getY() + height;
		this.width = this.xMax - this.xMin;
		this.height = this.yMax - this.yMin;
	}

	public float getxMin() {
		return xMin;
	}

	public float getxMax() {
		return xMax;
	}

	public float getyMin() {
		return yMin;
	}

	public float getyMax() {
		return yMax;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWidth() {
		return this.width;
	}
}
