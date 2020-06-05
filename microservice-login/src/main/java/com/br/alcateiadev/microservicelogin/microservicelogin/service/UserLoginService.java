package com.br.alcateiadev.microservicelogin.microservicelogin.service;

import com.br.alcateiadev.microservicelogin.microservicelogin.domian.AlcateiaUser;
import com.br.alcateiadev.microservicelogin.microservicelogin.gateway.repository.AlcateiaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginService implements UserDetailsService {

    @Autowired
    private AlcateiaUserRepository alcateiaUserRepository;

    @Override
    public UserDetails loadUserByUsername(String login) {

        AlcateiaUser user = alcateiaUserRepository.findByLogin(login);

        if (user == null) {
            return null;
        }

        String[] rolesStr = {"USER"};

        List<GrantedAuthority> auth = AuthorityUtils.createAuthorityList(rolesStr);

        return new User(user.getLogin(), user.getPass(), auth);
    }


}
