package rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	/* 
	url : /hi
	Http method : GET
	headers : NA
	Req param : NA
	path param : NA
	Req body : NA
	res body: hello.....

	*/

	@GetMapping("/hi")
		public String ping() {
			return "how are you";
		}
	
	
	
	@GetMapping("/Hello")
	public String ding() {
		return "i'm fime";
	}
	
	/*
	 URL : /emp
	 Http Method : GET
	 Input Format : NA
	 Input data : NA
	 Output format : JSON
	 Output data :
	 {
		 "id" : 233,
   	"name" : "kmr",
     "age" : 43
	 }
	 Response Code : 200
	 */
  
  	@GetMapping("/emp")
   public Employee getEmp(){
     Employee e = new Employee(1000, "user1", 22);
     return e; 
   }
  	
  	/*
	 URL : /cities
	 Http Method : GET
	 Input Format : NA
	 Input data : NA
	 Output format : JSON 
	 Output data :
	[
     "hyd" , "mumbai" ,"bangalore"
 ]
	 Response Code : 200
	 */
  
   
   
   @GetMapping("/cities")
   public List<String> getListStr() {
   //create a list
   	List<String> cities = new ArrayList<>();
     
     //add cities
   cities.add("hyd");
		cities.add("chennai");
		cities.add("mumbai");
     
     return cities;
   
   }

}