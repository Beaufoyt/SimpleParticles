
public class Collision {

	public static boolean aabbIntersect(BoundingSquare a, BoundingSquare b) {

//		return ! ( b.getxMin() > a.getxMax() || b.getxMax() < a.getxMin() || b.getyMin() < a.getyMax() || b.getyMax() > a.getyMin());

//		return (Math.abs(a.getxMin() - b.getxMin()) * 2 < (a.getWidth() + b.getWidth())) &&
//				(Math.abs(a.getyMin() - b.getyMin()) * 2 < (a.getHeight() + b.getHeight()));

		return (a.getxMin() < b.getxMin() + b.getWidth() &&
				a.getxMin() + a.getWidth() > b.getxMin() &&
				a.getyMin() < b.getyMin() + b.getHeight() &&
				a.getHeight() + a.getyMin() > b.getyMin());
	}
}
