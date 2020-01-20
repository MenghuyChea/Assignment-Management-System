package Assignment_Management_Program;
import java.io.Serializable;

import static java.lang.System.out;
public class Assignment implements Serializable {
    private long id;
    private String type;
    private String tittle;
    private String instruction;
    private String coursename;
    private String dueDate;
    private float point;
    private String topic;

    Assignment(){}
    Assignment(long id,String type,String tittle)
    {
        this.id=id;
        this.type=type;
        this.tittle=tittle;
    }
    public long getId()
    {
        return id;
    }
    public String getType()
    {
        return type;
    }
    public String getTittle()
    {
        return tittle;
    }
    public String getInstruction()
    {
        return instruction;
    }
    public String getCoursename()
    {
        return coursename;
    }
    public String getDueDate()
    {
        return dueDate;
    }
    public float getPoint()
    {
        return point;
    }
    public String getTopic()
    {
        return topic;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setTittle(String tittle)
    {
        this.tittle = tittle;
    }
    public void setInstruction(String instruction)
    {
        this.instruction = instruction;
    }
    public void setCoursename(String coursename)
    {
        this.coursename = coursename;
    }
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }
    public void setPoint(float point)
    {
        this.point = point;
    }
    public void setTopic(String topic)
    {
        this.topic = topic;
    }
    public void display()
    {
        out.println("The id is : "+this.id);
        out.println("The type is : "+this.type);
        out.println("The type is : "+this.tittle);
        out.println("The instruction is : "+this.instruction);
        out.println("The course name is : "+this.coursename);
        out.println("The dueDate is : "+this.dueDate);
        out.println("The point is : "+this.point);
        out.println("The topic is : "+this.topic);
    }
}
