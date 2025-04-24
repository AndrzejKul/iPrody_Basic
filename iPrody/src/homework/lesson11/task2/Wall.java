package homework.lesson11.task2;

public class Wall implements Barrier {

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    @Override
    public boolean overcome(PartricipantBase participant) {
        if (this.wallHeight < participant.getJumpHeight()) {
            return true;
        }
        return false;
    }
}
