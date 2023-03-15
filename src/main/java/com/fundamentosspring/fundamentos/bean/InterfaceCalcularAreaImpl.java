package com.fundamentosspring.fundamentos.bean;

import org.springframework.stereotype.Component;

@Component
public class InterfaceCalcularAreaImpl implements InterfaceCalcularArea{

    @Override
    public double obtenerArea(double radio) {
        double area = (  Math.PI * (radio*radio));
        System.out.println("EL AREA DEL CIRCULO ES : " + area);
        return area;
    }
}
