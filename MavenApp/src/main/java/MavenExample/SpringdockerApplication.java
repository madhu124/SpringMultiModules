package MavenExample;
import com.example.springdocker.JavaApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringdockerApplication {

	@RequestMapping(value="/")
	public String helloo(){
        JavaApp.hello();

        return "Welcone to My MavenApplication";

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);

	}
}
