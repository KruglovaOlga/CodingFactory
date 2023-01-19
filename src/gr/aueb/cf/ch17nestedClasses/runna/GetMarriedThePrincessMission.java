package gr.aueb.cf.ch17nestedClasses.runna;

public class GetMarriedThePrincessMission implements IMission {
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    public GetMarriedThePrincessMission() {
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
        System.out.println("Get married the princess mission");
    }
}
