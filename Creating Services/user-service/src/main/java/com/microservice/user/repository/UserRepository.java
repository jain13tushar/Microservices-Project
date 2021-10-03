package com.microservice.user.repository;

import com.microservice.user.entity.User;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that indicates that the decorated class is a repository.
// A repository is a mechanism for encapsulating storage, retrieval, and search behavior
// which emulates a collection of objects.
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
