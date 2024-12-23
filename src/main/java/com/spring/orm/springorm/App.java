package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orm.dao.StudentDao;
import orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student student=new Student();
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao obj=context.getBean("studentdao",StudentDao.class);
		/*
		 * int r= obj.insert(student); System.out.println(r);
		 */
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    boolean go=true;
    while(true) {
    	try {
			int input=Integer.parseInt(reader.readLine());
			switch(input) {
			case 1://insert
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				go=false;
				break;
			}
			
		} catch (Exception e) {
			System.out.println("wrong input added ");
			e.getMessage();
		} 
    }
    
    }
}
