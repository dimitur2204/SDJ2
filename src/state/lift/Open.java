package state.lift;

public class Open implements LiftState{
    @Override
    public void open(Lift lift) {
       throw new IllegalStateException("Lift is already open");
    }

    @Override
    public void close(Lift lift) {
        lift.setLiftState(new Closed());
        System.out.println("Lift closed");
    }

    @Override
    public void stop(Lift lift) {
        throw new IllegalStateException("Lift is already stopped");
    }

    @Override
    public void goTo(Lift lift, int floor) {
        throw new IllegalStateException("Lift has to be closed before moving to another floor");
    }
}
