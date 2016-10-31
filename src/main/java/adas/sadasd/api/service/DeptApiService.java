package adas.sadasd.api.service;

import adas.sadasd.model.Dept;

import adas.sadasd.exception.NotFoundException;
import java.util.List;
public interface DeptApiService {
  
      List<Dept> findAllDept()
      throws NotFoundException;
  
      Dept updateDept(Dept dept)
      throws NotFoundException;
  
      Dept addDept(Dept dept)
      throws NotFoundException;
  
      Dept findByIdDept(Long id)
      throws NotFoundException;
  
      void deleteDept(Long id)
      throws NotFoundException;
  
}
