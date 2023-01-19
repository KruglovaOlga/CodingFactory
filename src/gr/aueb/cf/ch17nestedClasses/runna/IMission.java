package gr.aueb.cf.ch17nestedClasses.runna;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
