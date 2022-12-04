package com.teambgd.christmastree.repository;

import com.teambgd.christmastree.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
    User findByNickname(String nickname);

    boolean existsByNickname(String nickname);
}
