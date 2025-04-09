package university;

public enum ProgramType {
    //240, 120
    MAJOR(240), MINOR(120);

    private int creditsRequiredToGraduate;

    ProgramType(int creditsNeededToGraduate) {
        this.creditsRequiredToGraduate = creditsNeededToGraduate;
    }

    public int getCreditsRequiredToGraduate() {
        return creditsRequiredToGraduate;
    }

    public void setCreditsRequiredToGraduate(int creditsRequiredToGraduate) {
        this.creditsRequiredToGraduate = creditsRequiredToGraduate;
    }
}
