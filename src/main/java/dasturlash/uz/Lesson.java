package dasturlash.uz;

public class Lesson {
    private String name;
    private Professor professor; // domla
    private Assistant assistant; // yordamchi shogirt

    public void showDetail() {
        System.out.println("Lesson{" +
                "name='" + name + '\'' +
                ", professor=" + professor +
                ", assistant=" + assistant +
                '}');
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }
}