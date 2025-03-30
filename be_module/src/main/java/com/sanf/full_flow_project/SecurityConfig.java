package com.sanf.full_flow_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // http
        // .authorizeHttpRequests(auth -> auth
        // .requestMatchers("/v1/users", "/login").permitAll() // Allow unauthenticated
        // access
        // .anyRequest().authenticated() // Secure all other endpoints
        // )
        // .csrf(csrf -> csrf.disable());// Disable CSRF
        // // .formLogin(lg ->
        // // lg.loginProcessingUrl("/login").defaultSuccessUrl("/begin_safe"));
        http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

        return http.build();
    }

    // @Bean
    // @ConditionalOnMissingBean(UserDetailsService.class)
    // InMemoryUserDetailsManager inMemoryUserDetailsManager() {
    // PasswordEncoder encoder =
    // PasswordEncoderFactories.createDelegatingPasswordEncoder();
    // return new InMemoryUserDetailsManager(User.withUsername("user")
    // .password(encoder.encode("admin_pass")).roles("USER").build());
    // }

}
