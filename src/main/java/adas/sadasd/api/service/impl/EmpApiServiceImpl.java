package adas.sadasd.api.service.impl;

import adas.sadasd.api.service.*;
import adas.sadasd.model.*;
import org.springframework.stereotype.Service;
import adas.sadasd.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import adas.sadasd.model.Emp;

import java.util.List;
import adas.sadasd.exception.NotFoundException;

@Service
public class EmpApiServiceImpl implements EmpApiService {
  	  @Autowired
  	  private EmpRepository empRepository ;
  	  
  
  
      @Override
      public List<Emp> findAllEmp()
      throws NotFoundException {
      
        
  		
  		
  			return empRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp updateEmp(Emp emp)
      throws NotFoundException {
      
         
        	return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp addEmp(Emp emp)
      throws NotFoundException {
      
         
        	return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp findByIdEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return empRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  empRepository.delete(id);
  		
  		
  		
  }
  
}
