package com.msr.springgootdemo2.controller;

import com.msr.springgootdemo2.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2.controller
 * @date 2020/8/25 15:44
 * @Copyright © 株式会社多言语系统研究所
 */
@RequestMapping("/test")
@Controller
public class MyController {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${person.addr}")
    private String addr;

//    @Value("${numbers}")
//    private String[] numbers;

    //private Person person;

    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        System.out.println("1111111111111");
        //System.out.println(this.name);
        //"SpringBoot--"+this.port+","+this.name+",age="+this.age;
        //System.out.println(this.numbers);
        return null;//"name="+person.getName()+",age="+person.getAge()+",addr="+person.getAddr();

    }
}
