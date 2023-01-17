package gr.aueb.cf.ch17seminarInheritance;

import java.util.Date;

public class TimePeriod extends IdentifiableEntity{
    private Date start;
    private Date end;

    public Date getStart() {
        return new Date(this.start.getTime());
    }

    public Date getEnd() {
        return new Date(this.end.getTime());
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
