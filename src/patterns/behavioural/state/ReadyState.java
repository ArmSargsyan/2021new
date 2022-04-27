package patterns.behavioural.state;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }
    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new ReadyState(player));
        return action;
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }


}
