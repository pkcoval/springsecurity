package pl.coderslab.springsecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation
        .web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation
        .web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    DataSource dataSource;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user1").password("user123").roles("USER")
                .and()
                .withUser("admin1").password("admin123").roles("ADMIN");

    }

    //przechowywanie danych o użytkownikach w bazie danych ponizej

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and().formLogin()
                .loginPage("/login")
                .and().exceptionHandling().accessDeniedPage("/403");
    }

//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admin/**").hasAnyRole("USER","ADMIN")
//                .anyRequest().permitAll()
//                .and().formLogin().loginPage("/login")
//                .and().logout().logoutSuccessUrl("/")
//                .permitAll()
//                .and().exceptionHandling().accessDeniedPage("/403");
//    }


}