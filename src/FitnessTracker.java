public class FitnessTracker {
    // Constants
    public static final double KILOMETERS_PER_STEP = 0.000762;

    public static final double CALORIES_PER_STEP = 0.04;

    // Properties
    private String name;
    private int dailySteps;
    private double distanceWalked;
    private double caloriesBurned;
    private int heartRate;
    private int goalSteps;

    // Default constructor
    public FitnessTracker() {
        this.name = "";
        this.dailySteps = 0;
        this.distanceWalked = 0;
        this.caloriesBurned = 0;
        this.heartRate = 0;
        this.goalSteps = 0;
    }


    public FitnessTracker(String name, int dailySteps, double distanceWalked, double caloriesBurned, int heartRate) {
        this.name = "David";
        this.dailySteps = dailySteps;
        this.distanceWalked = distanceWalked;
        this.caloriesBurned = caloriesBurned;
        this.heartRate = heartRate;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public double getDistanceWalked() {
        return distanceWalked;
    }

    public void setDistanceWalked(double distanceWalked) {
        this.distanceWalked = distanceWalked;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }


    public void addSteps(int steps) {
        this.dailySteps += steps;
        calculateDistance();
        calculateCalories();
    }


    public void calculateDistance() {
        this.distanceWalked = this.dailySteps * KILOMETERS_PER_STEP;
    }


    public void calculateCalories() {
        this.caloriesBurned = this.dailySteps * CALORIES_PER_STEP;
    }


    public void updateHeartRate(int newHeartRate) {
        this.heartRate = newHeartRate;
    }

    // Method to reset daily stats
    public void resetDailyStats() {
        this.dailySteps = 0;
        this.distanceWalked = 0;
        this.caloriesBurned = 0;
    }

    // Set and check goal steps
    public void setGoalSteps(int goalSteps) {
        this.goalSteps = goalSteps;
    }

    public void checkGoal() {
        if (this.dailySteps >= this.goalSteps) {
            System.out.println("You have met your daily goal of " + goalSteps + " steps");
        }
    }

    // display daily stats
    @Override
    public String toString() {
        return "User: " + name + "\n" +
                "Steps Taken: " + dailySteps + "\n" +
                "Distance Walked: " + distanceWalked + " km\n" +
                "Calories Burned: " + caloriesBurned + "\n" +
                "Current Heart Rate: " + heartRate + " bpm";
    }
}
