package gr.aueb.cf.ch13seminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeminarRoom {
    private Long id;
    private String alias;
    private String url;
    private List<Seminar> seminars = new ArrayList<>();

    public SeminarRoom() {}

    public Long getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public String getUrl() {
        return url;
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars); //return read-only List
    }

}
