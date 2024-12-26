public class Supervisor extends Teacher {
    private String researchDirection;
    private String type;

    public Supervisor() {
    }

    public void attendProject(String projectName) {
    }

    public void attendProject(String projectName, String projectType) {
    }

    public String getResearchDirection() {
        return this.researchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        this.researchDirection = researchDirection;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
