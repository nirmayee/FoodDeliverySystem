/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Customer {
    
    private String name;
    private String userName;
    private List<Order> custOrders;
    //private String customeradd;
    
    
    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }
    private String CustomerAddress;
    private String CustomerCode;

    Customer(String name, String userName,String CustomerAddress,String CustomerCode) {
        this.name = name;
        this.userName=userName;
        this.CustomerAddress = CustomerAddress;
        this.CustomerCode = CustomerCode;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    
    

    public String getUserName() {
        return userName;
    } 

    public void setUserName(String userName) {
        
        this.userName = userName;
    }
    
    
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getCustOrders() {
        if(custOrders == null)
        {
            custOrders = new ArrayList();
        }
        return custOrders;
    }

    public void setCustOrders(List<Order> custOrders) {
        this.custOrders = custOrders;
    }
    

    @Override
    public String toString() {
        return this.getUserName();
    }
  
}
