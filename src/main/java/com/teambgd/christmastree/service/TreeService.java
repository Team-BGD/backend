package com.teambgd.christmastree.service;

import com.teambgd.christmastree.domain.Ornament;
import com.teambgd.christmastree.domain.Tree;
import com.teambgd.christmastree.repository.OrnamentRepository;
import com.teambgd.christmastree.repository.TreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TreeService {

    private final TreeRepository trRepo;
    private final OrnamentRepository ornaRepo;

    // 빈 트리 생성하기
    public Tree getTree(String nickname) {
        Tree newTree = Tree.builder()
                .nickname(nickname)
                .build();

        trRepo.save(newTree);
        return newTree;
    }

    // 트리에 달린 오너먼트 조회하기
    public List<Ornament> getOrnamentTree(Long treeId) {
        List<Ornament> ornaList = ornaRepo.findByTreeId(treeId);
        return ornaList;
    }

}
