public class Course
{
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;

    public Course(String courseCode,String title,int capacity)
    {
        this.courseCode=courseCode;
        this.title=title;
        if(capacity>0)
            this.capacity=capacity;
        enrolledCount=0;
    }

    public boolean enroll()
    {
        if(enrolledCount<capacity)
        {
            enrolledCount++;
            return true;
        }
        return false;
    }

    public boolean withdraw()
    {
        if(enrolledCount>0)
        {
            enrolledCount--;
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        return enrolledCount==capacity;
    }

    public int getAvailableSeats()
    {
        return capacity-enrolledCount;
    }

    public String toString()
    {
        return "Course{courseCode='"+courseCode+"', title='"+title+"', capacity="+capacity+", enrolledCount="+enrolledCount+"}";
    }
}