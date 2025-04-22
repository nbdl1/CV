import java.util.Calendar;

public class Job extends Work {
    String employerName;
    String jobPosition;
    String jobDuties;

    public Job(String employerName, String jobPosition, Calendar startDate) {
        this.employerName = employerName;
        this.jobPosition = jobPosition;
        this.startDate = startDate;
        this.finishDate.set(1000, 12, 31);
        this.jobDuties = getJobDuties(employerName);
    }

    private String getJobDuties(String employerName) {
        return switch (employerName) {
            case "Megatrade" -> JobDuties.MEGATRADE.getJobDuties();
            case "APC by Schneider Electric" -> JobDuties.APC.getJobDuties();
            case "ASUS" -> JobDuties.ASUS.getJobDuties();
            default -> "";
        };
    }
}