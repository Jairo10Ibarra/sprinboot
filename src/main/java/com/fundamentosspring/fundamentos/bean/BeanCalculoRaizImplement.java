package com.fundamentosspring.fundamentos.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanCalculoRaizImplement implements BeanCalculoRaiz{

    @Override
    public int calculoRaiz(int numero) {
        int raizCuadrada = (int) Math.sqrt(numero);
        System.out.println("LA RAIZ CUADRADA DEL NUMERO ES " + numero + " : " + raizCuadrada);
        return raizCuadrada;
    }
}
