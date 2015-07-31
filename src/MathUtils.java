import java.util.Random;

public class MathUtils {

	private static Random random;

	public static int randInt(int min, int max) {
		int randomNum = getRandom().nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static double nanoToSecs(double nanoSeconds) {
		return nanoSeconds / 1_000_000_000;
	}

	public static Random getRandom() {
		if(null == random) {
			random = new Random();
		}
		return random;
	}

}
