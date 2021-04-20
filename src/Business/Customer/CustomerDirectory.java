/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author mrigesh
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public Customer createCustomer(String userName){
        
        for(Customer c : customerDirectory){
        
            if(c.getUserName().equalsIgnoreCase(userName)){
                System.out.println("UserName Already Exists");
             return null;   
            }
        }
        Customer customer = new Customer();
        this.customerDirectory.add(customer);
        return customer;
    }
    
    // fetch Customer
    public Customer fetchCustomer(String userName){
    
        for(Customer c: customerDirectory){
            
            if(c.getUserName().equalsIgnoreCase(userName)){
                
                return c;
            } 
        }
       return null;
    }
    
     //Remove Customer from Customer Directory
    public void deleteCustomer(ArrayList<Object> custDetails){
        int i =0;
        for(Object c : custDetails ){
           
            customerDirectory.remove(custDetails.get(i));
             
            i++;
        }
        
    }
    
    public void modifyCustomer(Customer cu){
            customerDirectory.add(cu);
        }
  
}
