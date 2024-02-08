package state.lift;

public interface LiftState {
    void open(Lift lift);
    void close(Lift lift);
    void stop(Lift lift);
    void goTo(Lift lift, int floor);
}
