package adas.sadasd.model.repository;

import adas.sadasd.model.*;

import java.util.Date;
import adas.sadasd.model.Dept;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

}



