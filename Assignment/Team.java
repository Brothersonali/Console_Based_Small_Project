import java.util.ArrayList;

public class Team {

    private String id;

    private ArrayList<Student> members = new ArrayList<>();

    private Student leader;

    private Teacher supervisor;

    private Project project;


    public Team(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }


    public void addMember(Student student) {

        if (members.size() >= 5) {
            System.out.println("A team cannot have more than 5 students.");
            return;
        }

        if (members.contains(student)) {
            System.out.println("Student is already a member of this team.");
            return;
        }

        members.add(student);

        System.out.println(student.getName() + " added to Team " + id);
    }


    public void removeMember(Student student) {

        if (members.size() <= 3) {
            System.out.println("A team must have at least 3 students.");
            return;
        }

        if (members.remove(student)) {
            System.out.println(student.getName() + " removed from Team " + id);

            if (leader == student) {
                leader = null;
            }
        } else {
            System.out.println("Student is not a member of this team.");
        }
    }


    public void setLeader(Student leader) {

        if (!members.contains(leader)) {
            System.out.println("Leader must be a member of the team.");
            return;
        }

        this.leader = leader;

        System.out.println(leader.getName() + " is now the leader of Team " + id);
    }


    public void assignSupervisor(Teacher supervisor) {

        if (this.supervisor != null) {
            System.out.println("A supervisor is already assigned.");
            return;
        }

        if (!supervisor.canSuperviseMoreTeams()) {
            System.out.println("This teacher cannot supervise more than 9 teams.");
            return;
        }

        this.supervisor = supervisor;

        supervisor.addSupervisedTeam(this);

        System.out.println(supervisor.getName()
                + " assigned as supervisor of Team " + id);
    }


    public void assignProject(Project project) {

        if (this.project != null) {
            System.out.println("A project is already assigned to this team.");
            return;
        }

        this.project = project;

        System.out.println(project.getTitle()
                + " assigned to Team " + id);
    }


    public void displayTeamDetails() {

        System.out.println("\n========== TEAM DETAILS ==========");

        System.out.println("Team ID: " + id);

        System.out.println("\nMembers:");

        for (Student student : members) {
            System.out.println("- " + student);
        }

        if (leader != null) {
            System.out.println("\nLeader: " + leader);
        } else {
            System.out.println("\nLeader: Not assigned");
        }

        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor);
        } else {
            System.out.println("Supervisor: Not assigned");
        }

        if (project != null) {
            System.out.println("Project: " + project);
        } else {
            System.out.println("Project: Not assigned");
        }

        System.out.println("==================================");
    }
}