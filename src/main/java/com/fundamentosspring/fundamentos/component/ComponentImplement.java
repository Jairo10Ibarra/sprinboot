package com.fundamentosspring.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("HOLA DEV JAIRO !!");
    }
}
