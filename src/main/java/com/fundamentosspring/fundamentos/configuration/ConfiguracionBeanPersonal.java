package com.fundamentosspring.fundamentos.configuration;

import com.fundamentosspring.fundamentos.bean.InterfaceCalcularArea;
import com.fundamentosspring.fundamentos.bean.InterfaceCalcularAreaImpl;
import com.fundamentosspring.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosspring.fundamentos.bean.MyBeanWithPropertiesImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class ConfiguracionBeanPersonal {

    @Value("${value.nombre}")
    private String nombre;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public InterfaceCalcularArea beanAreaCirculo(){
        return new InterfaceCalcularAreaImpl();
    }

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImpl(nombre, apellido);
    }

    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create()
                .driverClassName("org.h2.Driver")
                .url("jdbc:h2:mem:testdb")
                .username("sa")
                .password("")
                .build();
    }


}
