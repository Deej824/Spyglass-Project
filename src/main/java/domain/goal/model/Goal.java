package domain.goal.model;

public class Goal {
    private String title;
    private Double targetSavingsAmount;
    private Double amountSaved;
    private Double savingsDateGoal;
    private String notes;
    private Double progressBar;
    private goalType goalType;


    public Goal() {
    }

    public Goal(String title, Double targetSavingsAmount, Double amountSaved,
                Double savingsDateGoal, String notes, Double progressBar, goalType goalType) {
        this.title = title;
        this.targetSavingsAmount = targetSavingsAmount;
        this.amountSaved = amountSaved;
        this.savingsDateGoal = savingsDateGoal;
        this.notes = notes;
        this.progressBar = progressBar;
        this.goalType = goalType;
    }

    public goalType getGoalType() {
        return goalType;
    }

    public void setGoalType(goalType goalType) {
        this.goalType = goalType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getTargetSavingsAmount() {
        return targetSavingsAmount;
    }

    public void setTargetSavingsAmount(Double targetSavingsAmount) {
        this.targetSavingsAmount = targetSavingsAmount;
    }

    public Double getAmountSaved() {
        return amountSaved;
    }

    public void setAmountSaved(Double amountSaved) {
        this.amountSaved = amountSaved;
    }

    public Double getSavingsDateGoal() {
        return savingsDateGoal;
    }

    public void setSavingsDateGoal(Double savingsDateGoal) {
        this.savingsDateGoal = savingsDateGoal;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(Double progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "goalType"+ goalType + '\'' +
                "title='" + title + '\'' +
                ", targetSavingsAmount=" + targetSavingsAmount +
                ", amountSaved=" + amountSaved +
                ", savingsDateGoal=" + savingsDateGoal +
                ", notes='" + notes + '\'' +
                ", progressBar=" + progressBar +
                '}';
    }
}
