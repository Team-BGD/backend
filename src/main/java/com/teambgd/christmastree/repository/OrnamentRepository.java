package com.teambgd.christmastree.repository;

import com.teambgd.christmastree.domain.Ornament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrnamentRepository extends JpaRepository<Ornament, Long> {
    Ornament findByOrnamentId(Long ornamentId);
    List<Ornament> findByTreeId(Long treeId);
}
