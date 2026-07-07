public class RobotDebug {
    public static void main(String[] args) {
        String[] commands = {
            "FORWARD",
            "FORWARD",
            "TURN_RIGHT",
            "FORWARD",
            "TURN_LEFT",
            "FORWARD"
        };

        int x = 0;
        int y = 0;
        int headingDegrees = 0;

        System.out.println(
            "DEBUG: Start position = (" + x + ", " + y + "), heading = " + headingDegrees
        );

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if (command.equals("FORWARD")) {
                if (headingDegrees == 0) {
                    y = y + 1;
                } else if (headingDegrees == 90) {
                    x = x + 1;
                } else if (headingDegrees == 180) {
                    y = y - 1;
                } else {
                    x = x - 1;
                }
            } else if (command.equals("TURN_RIGHT")) {
                headingDegrees = (headingDegrees + 90) % 360;
            } else if (command.equals("TURN_LEFT")) {
                headingDegrees = (headingDegrees + 270) % 360;
            }

            System.out.println(
                "DEBUG: after command " + command
                    + " -> position = (" + x + ", " + y + ")"
                    + ", heading = " + headingDegrees
            );
        }

        System.out.println(
            "Final telemetry: position = (" + x + ", " + y + "), heading = " + headingDegrees
        );
    }
}
