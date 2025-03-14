package com.example.tastyplatters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http
                    .authorizeHttpRequests(auth -> auth
                            .requestMatchers("/tastyplatters/register").permitAll()
                            .requestMatchers("/tastyplatters/login").permitAll()
                            .requestMatchers("tastyplatters/user**").hasRole("USER")
                            .anyRequest().authenticated()                  // Everything else requires login
                    )
                    .formLogin(Customizer.withDefaults())
                    .logout(Customizer.withDefaults());

            return http.build();
        }


}

// http
//         .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())  //
//        .csrf(csrf -> csrf.disable())  // Disable CSRF globally
//        .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable())); // Allow H2 Console iframes
//
//        return http.build();