package $PACKAGE.config;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}
}
