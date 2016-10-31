package adas.sadasd.api.service;

import adas.sadasd.model.Emp;

import adas.sadasd.exception.NotFoundException;
import java.util.List;
public interface EmpApiService {
  
      List<Emp> findAllEmp()
      throws NotFoundException;
  
      Emp updateEmp(Emp emp)
      throws NotFoundException;
  
      Emp addEmp(Emp emp)
      throws NotFoundException;
  
      Emp findByIdEmp(Long id)
      throws NotFoundException;
  
      void deleteEmp(Long id)
      throws NotFoundException;
  
}
