public class Student
{
    private String name;
    private String studentId;
    private int mark;
    public Student(String name,String studentId,int mark)
    {
        if(name!=null&&!name.isBlank())
            this.name=name;
        if(studentId!=null&&!studentId.isBlank())
            this.studentId=studentId;
        if(mark>=0&&mark<=100)
            this.mark=mark;
    }
    public String getName()
    {
        return name;
    }
    public String getStudentId()
    {
        return studentId;
    }
    public int getMark()
    {
        return mark;
    }
    public boolean setMark(int newMark)
    {
        if(newMark>=0&&newMark<=100)
        {
            mark=newMark;
            return true;
        }
        return false;
    }
    public boolean hasPassed()
    {
        return mark>=50;
    }
    public String getClassification()
    {
        if(mark>=80)
            return "Distinction";
        else if(mark>=50)
            return "Pass";
        else
            return "Fail";
    }
    public String toString()
    {
        return "Student{name='"+name+"', studentId='"+studentId+"', mark="+mark+", classification='"+getClassification()+"'}";
    }
}