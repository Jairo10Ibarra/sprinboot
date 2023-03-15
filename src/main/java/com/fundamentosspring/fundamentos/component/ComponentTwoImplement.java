package com.fundamentosspring.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println(" HOLA ARQUITECTO DEV JAVA IBARRA!!!");
    }
}
