package gr.aueb.cf.ch17seminarInheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participant extends User{
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarResponse> seminarResponses = new ArrayList<>();

    public Participant(){};


    List<Seminar> getSeminars() {
        return seminars;
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars); //return read-only List
    }

    List<SeminarResponse> getSeminarResponses() {
        return seminarResponses;
    }
    public void setSeminarResponses(List<SeminarResponse> seminarResponses) {
        this.seminarResponses = seminarResponses;
    }

    public List<SeminarResponse> getAllSeminarResponses(){
        return Collections.unmodifiableList(this.seminarResponses);
    }

    public boolean addSeminar(Seminar seminar) {
        if(seminar == null) return false;
        for (Participant participant : seminar.getParticipants()) {
            if (participant == this) {
                return false;
            }
        }
        this.seminars.add(seminar);
        seminar.getParticipants().add(this);
        //seminar.addParticipant(this);
        return true;
    }

    public boolean addSeminarResponse(SeminarResponse seminarResponse) {
        if(seminarResponse == null) return false;
        if(seminarResponse.getSender() == this) return false;

        this.seminarResponses.add(seminarResponse);
        seminarResponse.setSender(this);
        return true;
    }

}
