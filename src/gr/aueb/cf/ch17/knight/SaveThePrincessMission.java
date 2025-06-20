package gr.aueb.cf.ch17.knight;

public class SaveThePrincessMission implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionstatus) {
        this.missionStatus = missionstatus;
    }

    @Override
    public void embark() {
        System.out.println("Save the princess mission");
    }
}
