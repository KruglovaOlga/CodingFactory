package gr.aueb.cf.ch17nestedClasses.runna;

public class SaveTheWorldMission implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;



    public SaveTheWorldMission() {
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
        System.out.println("Save the world mission");
    }
}
