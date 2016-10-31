package adas.sadasd.model;

import java.util.Date;
import adas.sadasd.model.Dept;


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
public class Emp  {
  
  
   
  
  @Id
   private Long empno = null;
  
   
   private String ename = null;
  
   
   private String job = null;
  
   
   private String mgr = null;
  
   
   private Date hiredate = null;
  
   
   private Double sal = null;
  
   
   private Double comm = null;
  
   
    @ManyToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "deptno", insertable=false, updatable=false) private Dept dept = null;
  
   
   private Long deptno = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getEmpno() {
    return empno;
  }
  public void setEmpno(Long empno) {
    this.empno = empno;
  }

  
  /**
   * {}
   **/
  public String getEname() {
    return ename;
  }
  public void setEname(String ename) {
    this.ename = ename;
  }

  
  /**
   * {}
   **/
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }

  
  /**
   * {}
   **/
  public String getMgr() {
    return mgr;
  }
  public void setMgr(String mgr) {
    this.mgr = mgr;
  }

  
  /**
   * {}
   **/
  public Date getHiredate() {
    return hiredate;
  }
  public void setHiredate(Date hiredate) {
    this.hiredate = hiredate;
  }

  
  /**
   * {}
   **/
  public Double getSal() {
    return sal;
  }
  public void setSal(Double sal) {
    this.sal = sal;
  }

  
  /**
   * {}
   **/
  public Double getComm() {
    return comm;
  }
  public void setComm(Double comm) {
    this.comm = comm;
  }

  
  /**
   * {"foreignKeyColumn":"deptno"}
   **/
  public Dept getDept() {
    return dept;
  }
  public void setDept(Dept dept) {
    this.dept = dept;
  }

  
  /**
   * {}
   **/
  public Long getDeptno() {
    return deptno;
  }
  public void setDeptno(Long deptno) {
    this.deptno = deptno;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emp emp = (Emp) o;
    return Objects.equals(empno, emp.empno) &&
        Objects.equals(ename, emp.ename) &&
        Objects.equals(job, emp.job) &&
        Objects.equals(mgr, emp.mgr) &&
        Objects.equals(hiredate, emp.hiredate) &&
        Objects.equals(sal, emp.sal) &&
        Objects.equals(comm, emp.comm) &&
        Objects.equals(dept, emp.dept) &&
        Objects.equals(deptno, emp.deptno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empno, ename, job, mgr, hiredate, sal, comm, dept, deptno);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emp {\n");
    
    sb.append("  empno: ").append(empno).append("\n");
    sb.append("  ename: ").append(ename).append("\n");
    sb.append("  job: ").append(job).append("\n");
    sb.append("  mgr: ").append(mgr).append("\n");
    sb.append("  hiredate: ").append(hiredate).append("\n");
    sb.append("  sal: ").append(sal).append("\n");
    sb.append("  comm: ").append(comm).append("\n");
    sb.append("  dept: ").append(dept).append("\n");
    sb.append("  deptno: ").append(deptno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

