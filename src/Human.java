import java.util.HashSet;
import java.util.Set;

public class Human {
    public Set<SoftSkill> softSkills = new HashSet<>();
    public Set<HardSkill> hardSkills = new HashSet<>();

    public void addSomethingToSoftSkills(SoftSkill softSkill) {
        softSkills.add(softSkill);
    }

    public void addSomethingToHardSkills(HardSkill hardSkill) {
        hardSkills.add(hardSkill);
    }

    public class SchoolKnowledgeAcquiring {
        public static void acquireSoftSkillKnowledge(Human human, SoftSkill softSkill) {
            human.addSomethingToSoftSkills(softSkill);
        }

        public static void acquireHardSkillKnowledge(Human human, HardSkill hardSkill) {
            human.addSomethingToHardSkills(hardSkill);
        }

    }

    public class UniversityKnowledgeAcquiring {
        public static void acquireSoftSkillKnowledge(Human human, SoftSkill softSkill) {
            human.addSomethingToSoftSkills(softSkill);
        }

        public static void acquireHardSkillKnowledge(Human human, HardSkill hardSkill) {
            human.addSomethingToHardSkills(hardSkill);
        }

    }
}