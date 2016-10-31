package adas.sadasd.api;

import adas.sadasd.model.*;

import adas.sadasd.api.service.EmpApiService;

import adas.sadasd.exception.NotFoundException;

import adas.sadasd.model.Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/emp", produces = {APPLICATION_JSON_VALUE})
public class EmpApi {

   @Autowired
   private EmpApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Emp>> findAllEmp()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Emp>>(service.findAllEmp(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Emp> updateEmp(@RequestBody Emp emp
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Emp>(service.updateEmp(emp), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Emp> addEmp(@RequestBody Emp emp
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Emp>(service.addEmp(emp), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Emp> findByIdEmp(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Emp>(service.findByIdEmp(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteEmp(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteEmp(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
