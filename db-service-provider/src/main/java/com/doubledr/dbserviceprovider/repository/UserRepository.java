package com.doubledr.dbserviceprovider.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.doubledr.pojo.User;

public interface UserRepository extends JpaRepository<User,String> {
    @Query(nativeQuery = true,value = "Select * from tb_user where user_id=:name1")
    User findUserById(@Param("name1") String userId);
    @Query(nativeQuery = true,value = "Select * from tb_user where user_name=:name1")
    User findUserByName(@Param("name1") String userName);
}
