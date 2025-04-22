import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeSet;

public class Sergey extends Man {
    private static Sergey instance;
    private Sergey() {
    }

    Comparator<Work> projectPeriodComparator = new Comparator<>() {
        @Override
        public int compare(Work o1, Work o2) {
            return o1.startDate.after(o2.startDate) ? 1 : 0;
        }
    };
    TreeSet<Job> jobExperience = new TreeSet<>(projectPeriodComparator);
    TreeSet<Project> projectsInvolvedIn = new TreeSet<>(projectPeriodComparator);

    public static Sergey toBeBorn() {
        if (instance == null) {
            instance = new Sergey();
        }
        PrintStoryString.printStringToConsole("1985. Hello world!");
        return instance;
    }

    public void getSchoolKnowledge() {
        PrintStoryString.printStringToConsole("From 1991 I was getting some basics from the school.");
        Human.SchoolKnowledgeAcquiring.acquireSoftSkillKnowledge(this, new SoftSkill());
        Human.SchoolKnowledgeAcquiring.acquireHardSkillKnowledge(this, new HardSkill());
    }

    //Duplicate method is only for clarification and story
    public void getUniversityKnowledge() {
        PrintStoryString.printStringToConsole("From 2002 till 2007 I was getting (or thought I was gettin') some knowledge at the University.");
        Human.UniversityKnowledgeAcquiring.acquireSoftSkillKnowledge(this, new SoftSkill());
        Human.UniversityKnowledgeAcquiring.acquireHardSkillKnowledge(this, new HardSkill());
    }

    public void applyToJob(Job job) {
        if (!jobExperience.isEmpty()) {
            jobExperience.getFirst().finishDate = job.startDate;
        }
        jobExperience.add(job);
    }

    public void startAProject(Project project) {
        projectsInvolvedIn.add(project);
    }

    public void doSelfDevelopment(String hardSkilllearned) {
        this.hardSkills.add(new HardSkill(hardSkilllearned));
    }

    public void telltheExperienceStory() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        PrintStoryString.printStringToConsole("So, let's proceed to the main topic.");
        PrintStoryString.printStringToConsole("\nWork experience:");
        for (Job job : jobExperience) {
            PrintStoryString.printStringToConsole(dateFormat.format(job.startDate.getTime()) + " - " + dateFormat.format(job.finishDate.getTime()));
            PrintStoryString.printStringToConsole(job.employerName);
            System.out.println();
            PrintStoryString.printStringToConsole(job.jobPosition);
            PrintStoryString.printStringToConsole(job.jobDuties);
            System.out.println();
        }
        PrintStoryString.printStringToConsole("Then I tried to develop myself and learned a bit of Java.\n" +
                "And then I've started some projects:\n");

        for (Project project : projectsInvolvedIn) {
            PrintStoryString.printStringToConsole(dateFormat.format(project.startDate.getTime()));
            PrintStoryString.printStringToConsole(project.projectName);
            System.out.println();
            PrintStoryString.printStringToConsole(project.projectDescription);
            System.out.println();
        }
        PrintStoryString.printStringToConsole("Code is available via GitHub - https://github.com/nbdl1/CV");
    }
}
