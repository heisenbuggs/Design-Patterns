package StatePattern;

public class TVContext implements TVState {

    private TVState tvState;

    public void setState(TVState state) {
        this.tvState = state;
    }

    public TVState getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}
