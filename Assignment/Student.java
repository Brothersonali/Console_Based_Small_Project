public class Student {
    private String rollNo;
    private String name;
    private String emailId;
    private Long mobileNo;

    public Student(String rollNo,String name,String emailId,Long mobileNo){
        this.rollNo = rollNo;
        this.name = name;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }
    public String getRollNo(){
        return rollNo;
    }
     public String getName(){
        return name;
    }
     public String getEmailId(){
        return emailId;
    }
     public Long getMobileNo(){
        return mobileNo;
    }
    @Override 
    public String toString(){
        return name + " (" + rollNo + ")";
    }
}
