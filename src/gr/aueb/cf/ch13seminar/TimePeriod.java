package gr.aueb.cf.ch13seminar;

import java.util.Date;

public class TimePeriod {
    private Long id;
    private Date start;
    private Date end;

    public Long getId() {
        return id;
    }

    public Date getStart() {
        return new Date(this.start.getTime());
    }

    public Date getEnd() {
        return new Date(this.end.getTime());
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
