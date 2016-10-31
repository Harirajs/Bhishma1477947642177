package adas.sadasd.model;



import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;




@Entity
public class Dept  {
  
  
   
  
  @Id
   private Long deptno = null;
  
   
   private String dname = null;
  
   
   private String loc = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getDeptno() {
    return deptno;
  }
  public void setDeptno(Long deptno) {
    this.deptno = deptno;
  }

  
  /**
   * {}
   **/
  public String getDname() {
    return dname;
  }
  public void setDname(String dname) {
    this.dname = dname;
  }

  
  /**
   * {}
   **/
  public String getLoc() {
    return loc;
  }
  public void setLoc(String loc) {
    this.loc = loc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dept dept = (Dept) o;
    return Objects.equals(deptno, dept.deptno) &&
        Objects.equals(dname, dept.dname) &&
        Objects.equals(loc, dept.loc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deptno, dname, loc);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dept {\n");
    
    sb.append("  deptno: ").append(deptno).append("\n");
    sb.append("  dname: ").append(dname).append("\n");
    sb.append("  loc: ").append(loc).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

