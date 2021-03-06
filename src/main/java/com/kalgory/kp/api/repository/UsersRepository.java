package com.kalgory.kp.api.repository;

import com.kalgory.kp.api.entity.user.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Mongo DB의 users 컬렉션과 연결하는 Repository.
 */
@Repository
public interface UsersRepository extends MongoRepository<Users, String> {

  Boolean existsByEmail(String email);
}
