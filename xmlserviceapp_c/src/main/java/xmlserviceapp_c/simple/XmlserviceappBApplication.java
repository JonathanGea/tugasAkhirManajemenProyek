package xmlserviceapp_c.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import xmlserviceapp_c.simple.utils.XmlParser;

@SpringBootApplication
public class XmlserviceappBApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlserviceappBApplication.class, args);
    }
    
    @Bean
    public XmlParser xmlParser(){
        return new XmlParser();
    }

}
