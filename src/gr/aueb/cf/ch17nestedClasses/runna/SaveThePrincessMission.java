package gr.aueb.cf.ch17nestedClasses.runna;

public class SaveThePrincessMission implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;
    public SaveThePrincessMission() {
        super();
    }

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Save the princess mission");
    }
}
