package state.lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Lift{
    private LiftState liftState;
    private int currentFloor;
    private List<Integer> floors;
    public Lift() {
        this.liftState = new Closed();
        this.currentFloor = 0;
        floors = new ArrayList<>();
    }
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void onFloorClicked(int floor){
        floors.add(floor);
    }

    public void onCloseClicked(){
        liftState.close(this);
    }

    public void onOpenClicked(){
        liftState.open(this);
    }

    public void onStopClicked(){
        liftState.stop(this);
    }

    public void onGoToClicked(){
        if(floors.isEmpty()){
            throw new IllegalStateException("No floor selected");
        }
        liftState.goTo(this, floors.get(0));
        floors.remove(0);
    }
}
