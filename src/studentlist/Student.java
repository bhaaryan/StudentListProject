
package studentlist;

/**
 *
 * @author aryan
 */
public class Student {
    private String sname;
    private String sID;
// this has been edited on github.com to show fetchmerge
// some comment at 9:48
    public Student(String sname, String sID) {
        this.sname = sname;
        this.sID = sID;
    }
    
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
    
    
    
    
    
}
