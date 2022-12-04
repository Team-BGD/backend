package com.teambgd.christmastree.repository;

import com.teambgd.christmastree.domain.Tree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Long> {
    Tree findByTreeId(Long treeId);
    Tree findByNickname(String nickname);
}
