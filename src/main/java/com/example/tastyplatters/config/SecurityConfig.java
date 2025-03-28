package com.example.tastyplatters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/platter/getall")
                        .permitAll()
                        .requestMatchers("/order/getall")
                        .permitAll()
                        .requestMatchers("/test")
                        .permitAll())
                .formLogin(login -> login
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll())
                .httpBasic(withDefaults());

        return http.build();
    }
}
//}
//        http
//                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())  //
//                .csrf(csrf -> csrf.disable())  // Disable CSRF globally
//                .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable())); // Allow H2 Console iframes
//
//        return http.build();
//
//
//    }
//}