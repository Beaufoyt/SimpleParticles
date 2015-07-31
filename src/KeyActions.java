import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

public class KeyActions {

	private Emitter emitter;
	float newTime, oldTime, td;

	public KeyActions(Emitter emitter) {
		this.emitter = emitter;
	}

	public void update(int delta, GameContainer container) {
		Input input = container.getInput();
		newTime+=0.01;
//		if((newTime - oldTime) > 1) {
			if (input.isKeyDown(Input.KEY_A)) {
				emitter.addParticle();
				oldTime = newTime;
			}
			if (input.isKeyDown(Input.KEY_D)) {
				emitter.removeParticle();
				oldTime = newTime;
			}
//		}

		if (input.isKeyDown(Input.KEY_C)) {
			emitter.clearParticles();
		}
	}
}
