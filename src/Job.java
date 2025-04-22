import java.util.Calendar;
import java.util.Date;

public class Job extends Work {
    String employerName;
    String jobPosition;
    String jobDuties;

    public Job(String employerName, String jobPosition, Calendar startDate) {
        this.employerName = employerName;
        this.jobPosition = jobPosition;
        this.startDate = startDate;
        Date date = new Date();
        int day = date.getDate();
        int month = date.getMonth();
        int year = date.getYear()+1900;
        this.finishDate.set(year, month, day);
        this.jobDuties = getJobDuties(employerName);
    }

    private String getJobDuties(String employerName) {
        return switch (employerName) {
            case "Distributor of network equipment" -> JobDuties.FIRST_EMPLOYER.getJobDuties();
            case "Industrial Manufacturer" -> JobDuties.SECOND_EMPLOYER.getJobDuties();
            case "Computer and Electronic device Manufacturer" -> JobDuties.THIRD_EMPLOYER.getJobDuties();
            default -> "";
        };
    }
}