/*In Java, when the cloning process is done by implementing the Cloneable interface it is called Deep Cloning.
 * In this type of cloning, an exact copy of all the fields of the original object will be created.
 * But in case, the original object has references to other objects as fields then a copy of those objects will also be created by calling the clone() method.
 * This makes the cloned object independent of the original object and any changes made in any of the object won’t be reflected on the other. */

package objectClassCloneTesting;

class EduCourse implements Cloneable
{
    String course1;
    String course2;
    String course3;
  
    public EduCourse(String crs1, String crs2, String crs3)
    {
        this.course1 = crs1; 
        this.course2 = crs2; 
        this.course3 = crs3;
    }
  
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
  
class EduLearner implements Cloneable
{
    int eduId; 
    String learnerName; 
    EduCourse eduCourse;
  
    public EduLearner(int eduId, String learnerName, EduCourse eduCourse)
    {
        this.eduId = eduId; 
        this.learnerName = learnerName; 
        this.eduCourse = eduCourse;
    }
  
    //Overriding clone() method for creating a deep copy of an object
  
    protected Object clone() throws CloneNotSupportedException
    {
        EduLearner learner = (EduLearner) super.clone();
  
        learner.eduCourse = (EduCourse) eduCourse.clone();
  
        return learner;
    }
}
  
public class DeepCopy
{
    public static void main(String[] args)
    {
        EduCourse j2ee = new EduCourse("Java", "Spring", "Microservices"); 
        EduLearner learner1 = new EduLearner(2811, "Rock", j2ee); 
        EduLearner learner2 = null;
  
        try
        {
            //Creating a clone of learner1 and assigning it to learner2
  
            learner2 = (EduLearner) learner1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        
        
  
      //Printing Details of Learner1
        System.out.println("Details of Learner 1: ");
        System.out.println("Id: "+learner1.eduId);
        System.out.println("Name: "+learner1.learnerName.hashCode());
        System.out.println("Course Id: "+learner1.eduCourse.hashCode());
         
        //Printing all the courses of 'learner1'
        System.out.println("\nCourses of Learner 1: ");
        System.out.println(learner1.eduCourse.course1);
        System.out.println(learner1.eduCourse.course2);
        System.out.println(learner1.eduCourse.course3);
         
      //Printing Details of Learner2
        System.out.println("\nDetails of Learner 2: ");
        System.out.println("Id: "+learner2.eduId);
        System.out.println("Name: "+learner2.learnerName.hashCode());
        System.out.println("Course Id: "+learner2.eduCourse.hashCode());
         
         
      //Printing all the courses of 'learner2'
        System.out.println("\nCourses of Learner 2: ");
        System.out.println(learner2.eduCourse.course1);
        System.out.println(learner2.eduCourse.course2);
        System.out.println(learner2.eduCourse.course3);       
  
        //Changing the course3 of 'learner2' 
        learner2.eduCourse.course3 = "JSP";
  
        //This change won't be reflected in original 'learner1' 
        System.out.println("\nCourses of Learner 1:");
        System.out.println(learner1.eduCourse.course3);
         
        //Updated Courses of learner2
        System.out.println("\nCourses of Learner 2:");
        System.out.println(learner2.eduCourse.course3);
        
    }
}
