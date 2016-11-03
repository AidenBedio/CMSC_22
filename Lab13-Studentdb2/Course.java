
import java.io.Serializable;

////////////////////////////////////////////////////////////////////////////////Bedio Programming(c)///////////////////////////
//////////////////////////////////////////////////////////////////////////////////11/3/16//////////////////////////////////////

public class Course implements Serializable{
    
    private String courseCode;
    private String courseDescription;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    
    public String toString(){
        return String.format("Course Code: %s\nCourseDescription:%s\n",courseCode,courseDescription);
    }
    
    
    
}
