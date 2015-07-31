import org.newdawn.slick.*;

public class SimpleGame extends BasicGame {

    private KeyActions keys;
    private Emitter emitter;
    private Font particleCountText;

    public SimpleGame()
    {
        super("Particles");
    }

    public static void main(String[] args) {
        App myapp = new App();
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        emitter = new Emitter();
        emitter.addParticle();
        keys = new KeyActions(emitter);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        emitter.checkWallCollisions();
        emitter.updateParticles();
        keys.update(delta, container);
    }

    public void render(GameContainer container, Graphics g) throws SlickException {
        emitter.drawParticles();

        g.setColor(new Color(0xff00ff));
        g.drawString("Particles: " + Integer.toString(emitter.getNumParticles()), 10, 25);
    }
}
