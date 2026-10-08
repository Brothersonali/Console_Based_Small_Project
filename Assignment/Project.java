public class Project{
    private String code;
    private String title;
    public Project(String code, String title){
        this.code = code;
        this.title = title;
    }
    public String getCode(){
        return code;
    }
    public String getTitle(){
        return title;
    }
    @Override 
    public String toString(){
        return code + " - " + title;
    }
}