package adas.sadasd.model.repository;

import adas.sadasd.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>{

}



