public class BuggyArray {
    public static void main(String[] args) {
        int[] distanceReadingsCm = {118, 121, 119, 122};

        int totalDistance = 0;
        for (int i = 0; i < distanceReadingsCm.length; i++) {
            totalDistance = totalDistance + distanceReadingsCm[i];
            System.out.println(
                "DEBUG: sample = " + i
                    + ", reading = " + distanceReadingsCm[i]
                    + ", totalDistance = " + totalDistance
            );
        }

        int averageDistance = totalDistance / distanceReadingsCm.length;
        System.out.println("Average front distance: " + averageDistance + " cm");
    }
}
