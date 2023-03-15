package com.fundamentosspring.fundamentos;

import com.fundamentosspring.fundamentos.bean.*;
import com.fundamentosspring.fundamentos.component.ComponentDependency;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Scanner;

@SpringBootApplication
@EnableConfigurationProperties
public class FundamentosApplication implements CommandLineRunner {

    private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

    //INYECTANDO DEPENDENCIA POR MEDIO DEL CONSTRUCTOR
    private ComponentDependency componentDependency;

    //INTERFACE CREANDO UN BEAN
    private MyBean myBean;

    //INYECTAMOS UNA DEPENDENCIA DENTRO DE OTRA
    private MyBeanWithDependency myBeanWithDependency;

    //DEPENDENCIA CREADA PERSONAL
    private BeanCalculoRaiz beanCalculoRaiz;
    //DEPENDENCIA CREADA CALCULAR AREA
    private InterfaceCalcularArea interfaceCalcularArea;

    private MyBeanWithProperties myBeanWithProperties;

    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
                                  MyBean myBean,
                                  MyBeanWithDependency myBeanWithDependency, BeanCalculoRaiz beanCalculoRaiz,
                                  @Qualifier("interfaceCalcularAreaImpl") InterfaceCalcularArea interfaceCalcularArea,
                                  MyBeanWithProperties myBeanWithProperties
                                  ) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
        this.beanCalculoRaiz = beanCalculoRaiz;
        this.interfaceCalcularArea = interfaceCalcularArea;
        this.myBeanWithProperties = myBeanWithProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ejemplosAnteriores();
//        saveUserInDataBase();
    }

//    private void saveUserInDataBase(){
//        User user1 = new User("Jairo", "ingibarra@gmail.com", "Ibarra", LocalDate.of(2021,3,20));
//        User user2 = new User("Jair", "ibarra@gmail.com", "perez", LocalDate.of(2021,1,20));
//        User user3 = new User("yairo", "ibarra10@gmail.com", "ascanio", LocalDate.of(2021,8,20));
//        User user4 = new User("alan", "garra@gmail.com", "ortiz", LocalDate.of(2021,9,20));
//        User user5 = new User("yojan", "barra@gmail.com", "roa", LocalDate.of(2021,3,20));
//        User user6 = new User("cami", "gibarra@gmail.com", "bayona", LocalDate.of(2021,5,20));
//        User user7 = new User("mariela", "ingiba@gmail.com", "soto", LocalDate.of(2021,5,20));
//        User user8 = new User("jano", "ing@gmail.com", "quintana", LocalDate.of(2021,4,20));
//        List<User> lista = Arrays.asList(user1,user2, user3, user4, user5, user6, user7, user8);
//        lista.forEach(userRepository::save);
//    }

    private void ejemplosAnteriores(){
        componentDependency.saludar();
        myBean.print();
        myBeanWithDependency.printWithDependendy();
        beanCalculoRaiz.calculoRaiz(4);
        interfaceCalcularArea.obtenerArea(4.0);
        System.out.println(myBeanWithProperties.function());
        try {
            int value = 10/0;
            LOGGER.debug("Mi valor : " + value);
        }catch (Exception exception){
            LOGGER.error("ESTO ES UN ERROR AL DIVIDIR POR CERO " + exception.getMessage());
        }
    }

    Scanner input = new Scanner(System.in);

    // Pide al usuario que ingrese su fecha de nacimiento
    String fechaNacimiento = input.nextLine();

    // Divide la fecha de nacimiento en día, mes y año
    String[] partesFecha = fechaNacimiento.split("/");
    int dia = Integer.parseInt(partesFecha[0]);
    int mes = Integer.parseInt(partesFecha[1]);
    int anio = Integer.parseInt(partesFecha[2]);

    // Muestra la fecha de nacimiento en la consola



}
