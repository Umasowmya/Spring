package classes;
import validation.CourseCode;
import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    private String lastName;

    @Min(value = 1,message = "should not less than one")
    @Max(value = 10,message = "should not greater than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "only 5 characters")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

}

