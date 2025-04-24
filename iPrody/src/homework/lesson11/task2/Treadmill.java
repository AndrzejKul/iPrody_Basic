package homework.lesson11.task2;

public class Treadmill implements Barrier {

    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    public int getTreadmillLength() {
        return treadmillLength;
    }

    @Override
    public boolean overcome(PartricipantBase participant) {
        if (this.treadmillLength < participant.getRunLength()) {
            return true;
        }
        return false;
    }
}
