package gr.aueb.cf.ch17nestedClasses.knight;

public class Knight implements IKnight{
    private IMission mission;

//    public Knight(IMission mission) {
//        this.mission = mission;
//    }


    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }

    public IMission getMission(){
        return mission;
    }
    public void setMission(IMission mission) {
        this.mission = mission;
    }
}
