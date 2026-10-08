public class Main {

    public static void main(String[] args) {

        // Creating Student objects

        Student s1 = new Student(
                "101",
                "Sonali",
                "sonali@gmail.com",
                9876543210L
        );

        Student s2 = new Student(
                "102",
                "Saloni",
                "saloni@gmail.com",
                9876543211L
        );

        Student s3 = new Student(
                "103",
                "Ujjwal",
                "ujjwal@gmail.com",
                9876543212L
        );

        Student s4 = new Student(
                "104",
                "Sujeet",
                "sujeet@gmail.com",
                9876543213L
        );


        // Creating Teacher object

        Teacher teacher1 = new Teacher(
                1,
                "Sonal Ma'am",
                "Professor",
                "CSE"
        );


        // Creating Project object

        Project project1 = new Project(
                "P101",
                "AI Career Platform"
        );


        // Creating Team object

        Team team1 = new Team("T01");


        // Adding students to the team

        team1.addMember(s1);
        team1.addMember(s2);
        team1.addMember(s3);
        team1.addMember(s4);


        // Setting team leader

        team1.setLeader(s1);


        // Assigning supervisor

        team1.assignSupervisor(teacher1);


        // Assigning project

        team1.assignProject(project1);


        // Display team details

        team1.displayTeamDetails();
    }
}