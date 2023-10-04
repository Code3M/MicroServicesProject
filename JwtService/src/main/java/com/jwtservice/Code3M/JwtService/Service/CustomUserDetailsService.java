package com.jwtservice.Code3M.JwtService.Service;


import com.jwtservice.Code3M.JwtService.Entity.UserEntity;
import com.jwtservice.Code3M.JwtService.Model.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    private UserEntity userEntity;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = restTemplate.getForObject("http://localhost:8081/User/user/" + username, UserEntity.class);

        if (userEntity == null) {
            throw new UsernameNotFoundException("Not found");
        }

        return new CustomUserDetails(userEntity);
    }
}
