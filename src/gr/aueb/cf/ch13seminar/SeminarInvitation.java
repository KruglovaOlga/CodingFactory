package gr.aueb.cf.ch13seminar;

public class SeminarInvitation {
    private Organizer sender;
    private Message message;
    private SeminarInvitationType type;

    public SeminarInvitation(){}

    public Organizer getSender() {
        return sender;
    }

    public void setSender(Organizer sender) {
        this.sender = sender;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public SeminarInvitationType getType() {
        return type;
    }

    public void setType(SeminarInvitationType type) {
        this.type = type;
    }


}
