package com.space.data.repository;

import com.space.data.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by asus-pc on 24.05.2016.
 */
public interface AccountRepository extends MongoRepository<Account, String> {

}
