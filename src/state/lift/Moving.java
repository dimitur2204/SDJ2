package state.lift;

public class Moving implements LiftState{
    @Override
    public void open(Lift lift) {
        throw new IllegalStateException("Lift is moving");
    }

    @Override
    public void close(Lift lift) {
        throw new IllegalStateException("Lift is moving");
    }

    @Override
    public void stop(Lift lift) {
        lift.setLiftState(new Closed());
        System.out.println("Lift stopped at floor " + lift.getCurrentFloor());
    }

    @Override
    public void goTo(Lift lift, int floor) {
        throw new IllegalStateException("Lift is moving");
    }
}
