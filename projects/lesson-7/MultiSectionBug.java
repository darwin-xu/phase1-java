public class MultiSectionBug {

    static int readFrontSensorMillimeters() {
        return 240;
    }

    static int convertToCentimeters(int sensorMillimeters) {
        int distanceCm = sensorMillimeters / 100;
        return distanceCm;
    }

    static int chooseDrivePower(int distanceCm) {
        if (distanceCm > 20) {
            return 60;
        }
        return 0;
    }

    static void sendDriveCommand(int power) {
        System.out.println("Drive power: " + power + "%");
    }

    public static void main(String[] args) {
        System.out.println("Step 1: Read front sensor");
        int sensorMillimeters = readFrontSensorMillimeters();
        System.out.println("  Raw sensor value: " + sensorMillimeters + " mm");

        System.out.println("Step 2: Convert units");
        int distanceCm = convertToCentimeters(sensorMillimeters);
        System.out.println("  Converted distance: " + distanceCm + " cm");

        System.out.println("Step 3: Choose motor power");
        int drivePower = chooseDrivePower(distanceCm);
        System.out.println("  Chosen drive power: " + drivePower + "%");

        System.out.println("Step 4: Output");
        sendDriveCommand(drivePower);
    }
}
