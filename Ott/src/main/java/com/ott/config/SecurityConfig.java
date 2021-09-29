package com.ott.config;




import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
        User.UserBuilder users= User.withDefaultPasswordEncoder();
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser(users.username("pranav").password("pranav").roles("Admin"));
    }
    @Override
    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/ott").permitAll()
                .antMatchers("/ott/admin/**").hasRole("Admin")
                .and().formLogin().loginPage("/ottlogin/showLoginPage")
                .loginProcessingUrl("/authenticateUser").permitAll().permitAll()
                .and().logout().logoutUrl("/ott/logout").logoutSuccessUrl("/ott").permitAll().and().exceptionHandling().accessDeniedPage("/ottlogin/accessDeniedPage");;
    }
}