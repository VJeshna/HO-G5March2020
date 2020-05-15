package com.mastek.ho.Springcore01;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mastek.core.model.Address;
import com.mastek.core.model.BankAccount;
import com.mastek.core.model.Person;
import com.mastek.core.service.BankService;


/**
 * Unit test for simple App.
 */
public class AppTest {
    private static ApplicationContext context;


    @BeforeAll
    public static void beforeAll() {
        context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    }
    
    @Disabled
    @Test
    public void testAddress() {
        Address address=context.getBean(Address.class);
        System.out.println("Address"+address);
        assertNotNull(address,"Must provide address object");
    }    
    
    @Disabled
    @Test
    public void testPerson() {
        Person person=context.getBean(Person.class);
        System.out.println("Person "+person);
        assertNotNull(person,"Must provide person object");
    }    
    
    @Disabled
    @Test
    public void testAccount() {
        BankAccount account=(BankAccount) context.getBean("account");
        System.out.println(account);
        assertNotNull(account.toString(),"Account must be created");
        
    }
    
    @Test
    public void testService() {
        BankService service=(BankService) context.getBean("service");
        assertNotNull(service, "Service object can't be null");
        (service.getAccounts()).forEach(System.out::println);
    }
    
}