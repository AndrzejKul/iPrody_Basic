package homework.lesson11.task2;

import java.util.Random;

public class Competition {
    static Random random = new Random();

    public static void main(String[] args) throws NoSuchFieldException {
        start();
    }

    public static void start() throws NoSuchFieldException {
        Barrier[] barriers = new Barrier[random.nextInt(1, 6)];
        for (int i = 0; i < barriers.length; i++) {
            if (random.nextInt(1, 3) == 1) {
                barriers[i] = new Treadmill(random.nextInt(100, 1001));
            } else {
                barriers[i] = new Wall(random.nextInt(1, 5));
            }
        }

        Participant[] participants = new Participant[random.nextInt(1, 6)];
        for (int i = 0; i < participants.length; i++) {
            int typeParticipant = random.nextInt(1, 4);
            if (typeParticipant == 1) {
                participants[i] = new Human(random.nextInt(101, 1101),
                        random.nextInt(1, 6));
            } else if (typeParticipant == 2) {
                participants[i] = new Robot(random.nextInt(101, 1101),
                        random.nextInt(1, 6));
            } else if (typeParticipant == 3) {
                participants[i] = new Cat(random.nextInt(101, 1101),
                        random.nextInt(1, 6));
            }
        }

        for (int i = 0; i < participants.length; i++) {
            System.out.println("На старт выходит: " + participants[i].getClass().getSimpleName()
                    + " под номером " + ((PartricipantBase) participants[i]).getNumberStartPosition() +
                    "\nОн может пробежать: " + ((PartricipantBase) participants[i]).runLength +
                    "\nОн может прыгнуть: " + ((PartricipantBase) participants[i]).jumpHeight);

            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof Treadmill) {
                    participants[i].run(barriers[j]);
                } else if (barriers[j] instanceof Wall) {
                    participants[i].jump(barriers[j]);
                }
            }
            System.out.println();
        }
    }
}
