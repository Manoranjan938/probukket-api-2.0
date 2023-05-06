package com.api.user.repo;

import com.api.user.entity.NewUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<NewUsers, Long> {
}
