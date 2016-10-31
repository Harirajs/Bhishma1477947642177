package adas.sadasd.api.service.impl;

import adas.sadasd.api.service.*;
import adas.sadasd.model.*;
import org.springframework.stereotype.Service;
import adas.sadasd.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import adas.sadasd.model.Dept;

import java.util.List;
import adas.sadasd.exception.NotFoundException;

@Service
public class DeptApiServiceImpl implements DeptApiService {
  	  @Autowired
  	  private DeptRepository deptRepository ;
  	  
  
  
      @Override
      public List<Dept> findAllDept()
      throws NotFoundException {
      
        
  		
  		
  			return deptRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept updateDept(Dept dept)
      throws NotFoundException {
      
         
        	return deptRepository.save(dept);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept addDept(Dept dept)
      throws NotFoundException {
      
         
        	return deptRepository.save(dept);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept findByIdDept(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return deptRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteDept(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  deptRepository.delete(id);
  		
  		
  		
  }
  
}
