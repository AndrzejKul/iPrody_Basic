package homework.lesson11.task2;

public abstract class PartricipantBase {

    private static int counterParticipant = 0;
    int numberStartPosition;
    int runLength;
    int jumpHeight;

    public PartricipantBase(int runLength, int jumpHeight) {
        counterParticipant++;
        this.numberStartPosition = counterParticipant;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public static int getCounterParticipant() {
        return counterParticipant;
    }

    public int getNumberStartPosition() {
        return numberStartPosition;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }
}
