public class SpawnShieldCommand extends Command {

    public SpawnShieldCommand(Object receiver, String[] args) {
        super(receiver, args);
    }

    @Override
    public void Execute() {
        // The receiver for the SpawnShieldCommand is the Square to spawn the asteroid in.
        Square square = (Square) receiver;

        // The args for SpawnShieldCommand are the X,Y coordinates for the Shield,
        // the square object it is decorating as we need its children to attach to the Shield instead
        // we also need it to be re-added to the composite after the shield dies
        IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
        System.out.println("---------------------------------------------");
        System.out.println("Spawning shield at (" + args[0] + "," + args[1] + ")");
        factory.MakeShield(square, Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        AsteroidImpacts.instance().detach(square);
    }
}
