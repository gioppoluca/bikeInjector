package it.csi.bigiot.bikeinjector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableScheduling
@EnableEncryptableProperties
public class BikeInjectorApplication {
	private static final Logger log = LoggerFactory.getLogger(BikeInjectorApplication.class);
	
	@Bean
    MyBean myBean() {
        return new MyBean();
    }
	 
	public static void main(String[] args) {
		log.info("REMEMEBR: to run use JASYPT_ENCRYPTOR_PASSWORD=password java -jar parkIngester-0.0.1-SNAPSHOT.jar");
//		ApplicationContext context = SpringApplication.run(ExampleMain.class, args);
//        MyBean myBean = context.getBean(MyBean.class);
		SpringApplication.run(BikeInjectorApplication.class, args);
	}
	
	private static class MyBean {

        @PostConstruct
        public void init() {
            System.out.println("GIOPPO init");
        }

        public void doSomething() {
            System.out.println("in doSomething()");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("GIOPPO destroy");
            log.info("closed");
        }
    }
}
