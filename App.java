package $PACKAGE;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application  {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}
