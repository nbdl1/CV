import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Sergey sergey = Sergey.toBeBorn();
        sergey.getSchoolKnowledge();
        sergey.getUniversityKnowledge();
        sergey.applyToJob(new Job("Distributor of network equipment", "Senior sales specialist", getJobOrProjectStartDateCalendarEntity("01.09.2008")));
        sergey.applyToJob(new Job("Industrial Manufacturer", "Service Manager", getJobOrProjectStartDateCalendarEntity("01.06.2011")));
        sergey.applyToJob(new Job("Computers and Electronic devices Manufacturer", "Channel Executive", getJobOrProjectStartDateCalendarEntity("01.10.2012")));
        sergey.doSelfDevelopment("Java");
        sergey.startAProject(new Project("App for curtain and SDS Systems producer and installer company", "Owner", getJobOrProjectStartDateCalendarEntity("01.11.2023")));
        sergey.startAProject(new Project("Am I Bulgarian App", "Owner", getJobOrProjectStartDateCalendarEntity("01.10.2024")));
        sergey.telltheExperienceStory();
    }

    public static Calendar getJobOrProjectStartDateCalendarEntity(String date) {
        String[] dateArray = date.split("\\.");
        Calendar jobStartDate = Calendar.getInstance();
        jobStartDate.set(Integer.parseInt(dateArray[2]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[0]));
        return jobStartDate;
    }
}