package gr.aueb.cf.ch17nestedClasses.runna;

public interface IKnight {
    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new GetMarriedThePrincessMission(),
            new SaveTheWorldMission(),
            new BecomeCyberSecurityExpertMission()
    };
    void embarkOnMission(IMission mission);

}
