package modern.ui.response;

import modern.io.entity.collage;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class semesterResponse {
    private String id;
    private String code;
    private Date fromDate;
    private Date toDate;
    private collage collage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public modern.io.entity.collage getCollage() {
        return collage;
    }

    public void setCollage(modern.io.entity.collage collage) {
        this.collage = collage;
    }
}
