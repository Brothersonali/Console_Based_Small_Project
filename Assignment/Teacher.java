import java.util.ArrayList;

public class Teacher {

    private Integer id;
    private String name;
    private String designation;
    private String department;

    private ArrayList<Team> supervisedTeams = new ArrayList<>();

    public Teacher(Integer id, String name, String designation, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public boolean canSuperviseMoreTeams() {
        return supervisedTeams.size() < 9;
    }

    public void addSupervisedTeam(Team team) {
        if (canSuperviseMoreTeams()) {
            supervisedTeams.add(team);
        }
    }

    public int getNumberOfTeams() {
        return supervisedTeams.size();
    }

    @Override
    public String toString() {
        return name + " (" + designation + ")";
    }
}