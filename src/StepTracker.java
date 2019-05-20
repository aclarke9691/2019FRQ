public class StepTracker {

    public int min;
    public int totalSteps;
    public int days;
    public int activeDays;

    public StepTracker (int min)
    {
        this.min=min;
        totalSteps=0;
        days=0;
        activeDays=0;
    }

    public void addDailySteps (int steps)
    {
        totalSteps+=steps;
        days+=1;
        if (steps>= min)
        {
            activeDays+=1;
        }
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        return totalSteps/days;
    }
}
