
package com.Proyecto;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Jose Ignacio
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}1234")
                .roles("ADMIN", "ENCARGADO", "USER")
                .and()
                .withUser("encargado")
                .password("{noop}1234")
                .roles("Encargado", "USER")
                .and()
                .withUser("user")
                .password("{noop}1234")
                .roles("USER")
                ;
                
    }
    @Override
    protected void configure (HttpSecurity http)throws Exception{
        http.authorizeRequests()
                .antMatchers("/articulo/nuevo", "/articulo/guardar",
                            "/articulo/modificar/**", "/articulo/eliminar/**",
                            "/categoria/nuevo", "/categoria/guardar/",
                            "/categoria/modificar/**", "/categoria/eliminar/**",
                            "/cliente/nuevo", "/cliente/guardar/",
                            "/cliente/modificar/**", "/cliente/eliminar/**",
                            "/usuario/nuevo", "/usuario/guardar/",
                            "/usuario/modificar/**", "/usuario/eliminar/**",
                            "/reserva/nuevo", "/reserva/guardar/",
                            "/reserva/modificar/**", "/reserva/eliminar/**",
                            "/emergencia/nuevo", "/emergencia/guardar/",
                            "/emergencia/modificar/**", "/emergencia/eliminar/**")
                .hasRole("ADMIN")
                .antMatchers("/articulo/listado", "/cliente/listado",
                            "/categoria/listado","/reserva/listado","/emergencia/listado")
                .hasAnyRole("ADMIN","ENCARGADO")
                .antMatchers("/")
                .hasAnyRole("ADMIN","ENCARGADO","USER")
                .and()
                .formLogin()
                .loginPage("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errores/403")
                ;          
    } 
}
