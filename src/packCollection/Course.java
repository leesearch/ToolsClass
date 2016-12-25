package packCollection;

/**
 * Created by lsq on 12/21/16.
 */
public class Course {
    public String id;
    public String name;
    public Course(String id,String name){
        this.id=id;
        this.name=name;
    }

    public Course(){

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Course)){
            return false;
        }
        Course course=(Course) obj;
        if(this.name==null){
            if(course.name==null){
                return true;
            }else{
                return false;
            }
        }else{
            if(this.name.equals(course.name)){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
