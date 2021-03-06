package in.cognitia.cognitia18;

/**
 * Created by devansh on 9/9/18.
 */

public class CognitiaEvent extends EventCategory{
    private String shortDescription;
    private String name;
    private String description;
    private String about;
    private String rules;
    private String robotSpecs;
    private String teamGuidelines;
    private String parent = null;


    public static String DESCRIPTION = "Description";
    public static String ROBOT_SPECIFICATIONS = "Robot Specifications";
    public static String ROBOT_SPECS = "Robot Specs";
    public static String RULES = "Rules";
    public static String TEAM = "Team";
    public static String PARENT = "Parent";


    //Defined so that data from Firebase can be serialized into a CognitiaEvent class
    public CognitiaEvent() {
    }

    public CognitiaEvent(String name, String shortDescription, int imageResId) {
        super(name, imageResId, 0);
        setShortDescription(shortDescription);
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getRules() {
        return rules;
    }

    public void setRobotSpecs(String robotSpecs) {
        this.robotSpecs = robotSpecs;
    }

    public String getRobotSpecs() {
        return robotSpecs;
    }

    public void setTeamGuidelines(String teamGuidelines) {
        this.teamGuidelines = teamGuidelines;
    }

    public String getTeamGuidelines() {
        return teamGuidelines;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParent() {
        return parent;
    }
}