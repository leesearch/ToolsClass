package packCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lsq on 12/21/16.
 */
public class Students {
    public String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        return name != null ? name.equals(students.name) : students.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String name;
    public Set<Course> course;

    public void setId(String id) {
        this.id = id;
    }

    public Students(String id, String name){

        this.id=id;
        this.name=name;
        this.course=new HashSet<Course>();
    }
}
