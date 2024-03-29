package $PACKAGE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App  {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.setShowBanner(false);
		app.run(args);
	}
}
