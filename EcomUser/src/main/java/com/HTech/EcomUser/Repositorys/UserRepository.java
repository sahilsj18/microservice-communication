package com.HTech.EcomUser.Repositorys;

import com.HTech.EcomUser.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users,String> {

}
