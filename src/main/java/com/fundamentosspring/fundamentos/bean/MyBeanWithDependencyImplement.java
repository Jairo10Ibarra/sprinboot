package com.fundamentosspring.fundamentos.bean;

import com.fundamentosspring.fundamentos.FundamentosApplication;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private final Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependendy() {
        LOGGER.info("HEMOS INGRESADO AL METODO printWithDependendy");
        int numero = 4;
        LOGGER.debug("EL NUMERO ENVIADO COMO PARAMETRO A LA DEPENDENCIA OPERACION ES :" + numero);
        myOperation.sum(numero);
        System.out.println(numero);
        System.out.println("DESDE LA IMPLEMETACION DE UN BEAN CON DEPENDENCIA");
    }
}
