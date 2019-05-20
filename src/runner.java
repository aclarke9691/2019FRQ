public class runner {
        public static void main(String[] args)
        {
            StepTracker tr= new StepTracker(5000);
            tr.addDailySteps(5000);
            tr.addDailySteps(40);
            tr.addDailySteps(3500);
            System.out.println("You have had " + tr.activeDays + " active day(s).");
            System.out.println("Your average amount of steps per day is "+ tr.averageSteps());
        }
}
