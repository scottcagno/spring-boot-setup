package $PACKAGE.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
				"SELECT username, password, enabled FROM user WHERE username=?")
				.authoritiesByUsernameQuery(
						"SELECT username, role FROM user WHERE username=?");
	}	

	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
				.antMatchers("/user/**").hasAnyRole("ADMIN","USER")
			.and()
				.formLogin().loginPage("/login")
			.and()
				.logout().logoutSuccessUrl("/home")
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"));
	}
}
