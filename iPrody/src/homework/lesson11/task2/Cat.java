package homework.lesson11.task2;

public class Cat extends PartricipantBase implements Participant {
    public Cat(int runLength, int jumpHeight) {
        super(runLength, jumpHeight);
    }

    @Override
    public void run(Barrier barrier) {
        boolean result = barrier.overcome(this);
        if (result) {
            System.out.println("Участник " + this.getClass().getSimpleName() + " " +
                    this.getNumberStartPosition() +
                    " прошел препятствие " + barrier.getClass().getSimpleName() + " на дистанции " +
                    ((Treadmill) barrier).getTreadmillLength());
        } else {
            System.out.println("Участник " + this.getClass().getSimpleName() + " " +
                    this.getNumberStartPosition() +
                    " не прошел препятствие " + barrier.getClass().getSimpleName() +
                    " длинной " + ((Treadmill) barrier).getTreadmillLength() + ". Пройдено " +
                    this.runLength);
        }
    }

    @Override
    public void jump(Barrier barrier) {
        boolean result = barrier.overcome(this);
        if (result) {
            System.out.println("Участник " + this.getClass().getSimpleName() + " " +
                    this.getNumberStartPosition() +
                    " прошел препятствие " + barrier.getClass().getSimpleName() + " и прыгнул на высоту " +
                    ((Wall) barrier).getWallHeight());
        } else {
            System.out.println("Участник " + this.getClass().getSimpleName() + " " +
                    this.getNumberStartPosition() +
                    " не прошел препятствие " + barrier.getClass().getSimpleName() +
                    " высотой " + ((Wall) barrier).getWallHeight() +
                    ". Спортсмен прыгнул " +
                    this.jumpHeight);
        }
    }
}
