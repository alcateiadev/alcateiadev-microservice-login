package com.br.alcateiadev.microservicelogin.microservicelogin.gateway.repository;


import com.br.alcateiadev.microservicelogin.microservicelogin.domian.AlcateiaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface AlcateiaUserRepository extends CrudRepository<AlcateiaUser, UUID> {
    AlcateiaUser findByLogin(@Param("login") String login);
}
