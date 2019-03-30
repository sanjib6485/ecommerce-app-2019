package com.sanjib.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/selectcategory").permitAll().anyRequest()
				.authenticated().and().formLogin().loginPage("/login").usernameParameter("username")
				.passwordParameter("password").permitAll().and().logout().permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//				// enable in memory based authentication with a user named "user" and "admin"
//				.inMemoryAuthentication().withUser("user").password("user").roles("USER").and().withUser("admin")
//				.password("password").roles("USER", "ADMIN");

		auth.jdbcAuthentication().dataSource(datasource)
				.usersByUsernameQuery("select email as username,password , enabled from user where email=?")
				.authoritiesByUsernameQuery("select username, role from user_roles where username=?");
	}

}
