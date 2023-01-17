package gr.aueb.cf.ch17seminarInheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Organizer extends User{
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarInvitation> seminarInvitations = new ArrayList<>();

    public Organizer() {}

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars); //return read-only List
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    List<SeminarInvitation> getSeminarInvitations() {
        return seminarInvitations;
    }

    public List<SeminarInvitation> getAllSeminarInvitations(){
        return Collections.unmodifiableList(this.seminarInvitations);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public void setSeminarInvitations(List<SeminarInvitation> seminarInvitations) {
        this.seminarInvitations = seminarInvitations;
    }


    public boolean addSeminar(Seminar seminar) {
        if (seminar == null) return false;
        if (seminar.getOrganizer() == this) return false;//if organizer exist do nothing

        this.seminars.add(seminar);
        seminar.setOrganizer(this);
        return true;
    }

    public boolean addSeminarInvitation(SeminarInvitation seminarInvitation) {
        if(seminarInvitation == null) return false;
        if(seminarInvitation.getSender() == this) return false;

        this.seminarInvitations.add(seminarInvitation);
        seminarInvitation.setSender(this);
        return true;
    }
}
