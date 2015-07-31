import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import java.util.ArrayList;
import java.util.List;

public class Emitter {

	private List<Particle> particles;
	private int numParticles;

	public Emitter() {
		particles = new ArrayList<Particle>();
	}

	public void addParticle() {
		Particle p;
		try {
			p = new Particle();
			this.particles.add(p);
		} catch (SlickException e) {
			e.printStackTrace();
		}
		this.numParticles++;
	}

	public void updateParticles() {
		for(Particle p : this.particles) {
			p.update();
		}
	}

	public void drawParticles() {
		for(Particle p : this.particles) {
			p.draw();
		}
	}

	public void checkWallCollisions() {
		for(Particle p : this.particles) {
			if (p.getYPos() > 400 - p.getBbox().getWidth() || p.getYPos() < 0) {
				p.setVelocity(new Vector2f(p.getVelocity().getX(), -p.getVelocity().getY()));
			} else if (p.getXPos() > 500 - p.getBbox().getWidth() || p.getXPos() < 0) {
				p.setVelocity(new Vector2f(-p.getVelocity().getX(), p.getVelocity().getY()));
			}
		}
	}

	public void removeParticle() {
		if(this.numParticles > 0) {
			int index = MathUtils.randInt(0, this.particles.size()-1);
			this.particles.remove(index);
			this.numParticles--;
		}
	}

	public int getNumParticles() {
		return this.numParticles;
	}

	public void clearParticles() {
		this.particles.clear();
		this.numParticles = 0;
	}
}
