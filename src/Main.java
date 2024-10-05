public class Main {
    public static void main(String[] args) {

        FitnessTracker tracker = new FitnessTracker("David Etienne", 0, 0, 0, 70);


        tracker.setGoalSteps(100);

        tracker.addSteps(500);

        tracker.updateHeartRate(60);

        System.out.println(tracker);

        tracker.checkGoal();

        tracker.resetDailyStats();

        System.out.println(tracker);
    }
}
