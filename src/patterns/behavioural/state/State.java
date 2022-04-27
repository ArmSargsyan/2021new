package patterns.behavioural.state;

public abstract class State {

    Player player;

    State(Player player) {
        this.player = player;

    }

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
    public abstract String onLock();
}
