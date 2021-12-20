/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private List<Customer> custList;

    public CustomerDirectory() {
        custList = new ArrayList();
    }

    public List<Customer> getCustList() {
        return custList;
    }

    public void setCustList(List<Customer> custList) {
        this.custList = custList;
    }
    
    public Customer createCustomer(String name, String userName, String CustomerAddress){
        int leftLimit = 65; // letter 'a'
            int rightLimit = 90; // letter 'z'
            int targetStringLength = 3 ;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
            (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
}
           String customerCode = buffer.toString() + name.substring(0,2).toUpperCase();
           
         Customer customer = new Customer(name,userName, CustomerAddress, customerCode);
      if(!custList.contains(customer)){
          System.out.println("adding ------customer"+name);
      custList.add(customer);
      }
      System.out.println("using existing ------customer"+name);
      return customer;
    }
    
    public void deleteCustomer(Customer c) {
        custList.remove(c);
    }
}
