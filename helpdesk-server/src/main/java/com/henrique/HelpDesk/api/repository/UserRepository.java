package com.henrique.HelpDesk.api.repository;

import com.henrique.HelpDesk.api.security.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
