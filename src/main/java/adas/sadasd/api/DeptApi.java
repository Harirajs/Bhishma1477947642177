package adas.sadasd.api;

import adas.sadasd.model.*;

import adas.sadasd.api.service.DeptApiService;

import adas.sadasd.exception.NotFoundException;

import adas.sadasd.model.Dept;

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
@RequestMapping(value = "/dept", produces = {APPLICATION_JSON_VALUE})
public class DeptApi {

   @Autowired
   private DeptApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Dept>> findAllDept()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Dept>>(service.findAllDept(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Dept> updateDept(@RequestBody Dept dept
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Dept>(service.updateDept(dept), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Dept> addDept(@RequestBody Dept dept
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Dept>(service.addDept(dept), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Dept> findByIdDept(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Dept>(service.findByIdDept(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteDept(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteDept(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
