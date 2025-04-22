import java.util.Calendar;

public class Project extends Work {
    String projectName;
    String projectPosition;
    String projectDescription;

    public Project(String projectName, String projectPosition, Calendar projectStarted) {
        this.projectName = projectName;
        this.projectPosition = projectPosition;
        this.startDate = projectStarted;
        this.projectDescription = getProjectDescription(projectName);
    }

    private String getProjectDescription(String projectName) {
        return switch (projectName) {
            case "Am I Bulgarian App" -> ProjectDescription.AM_I_BULGARIAN.getProjectDescription();
            case "Certain curtain produces and installer company" ->
                    ProjectDescription.CURTAIN_APP_PROJECT.getProjectDescription();
            default -> "";
        };
    }
}