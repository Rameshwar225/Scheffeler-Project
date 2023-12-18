package Backend.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //@Column(name = "projectName")
    private String projectName;
    
    //@Column(name = "projectClassification")
    private String projectClassification;
    
    //@Column(name = "projectType")
    private String projectType;
    
    //@Column(name = "projectNumber")
    private String projectNumber;
    
    //@Column(name = "asil")
    private String asil;
   
    //@Column(name = "startDate")
    private Date startDate;

    // No-argument constructor
    public Project() {
        // Default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectClassification() {
        return projectClassification;
    }

    public void setProjectClassification(String projectClassification) {
        this.projectClassification = projectClassification;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getAsil() {
        return asil;
    }

    public void setAsil(String asil) {
        this.asil = asil;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    // Other constructors if needed

    // toString method
    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectClassification='" + projectClassification + '\'' +
                ", projectType='" + projectType + '\'' +
                ", projectNumber='" + projectNumber + '\'' +
                ", asil='" + asil + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
