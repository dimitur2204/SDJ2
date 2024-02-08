package state.lift;

public class Closed implements LiftState{

    @Override
    public void open(Lift lift) {
        lift.setLiftState(new Open());
        System.out.println("Lift opened");
    }

    @Override
    public void close(Lift lift) {
        throw new IllegalStateException("Lift is already closed");
    }

    @Override
    public void stop(Lift lift) {
        throw new IllegalStateException("Lift is already stopped");
    }

    @Override
    public void goTo(Lift lift, int floor) {
        lift.setLiftState(new Moving());
        System.out.println("Lift moving to floor " + floor);
        lift.setCurrentFloor(floor);
        lift.setLiftState(new Closed());
        System.out.println("Lift stopped at floor " + lift.getCurrentFloor());
    }
}
