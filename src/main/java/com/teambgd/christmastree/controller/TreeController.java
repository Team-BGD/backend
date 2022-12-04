package com.teambgd.christmastree.controller;

import com.teambgd.christmastree.domain.Ornament;
import com.teambgd.christmastree.domain.Tree;
import com.teambgd.christmastree.repository.OrnamentRepository;
import com.teambgd.christmastree.repository.TreeRepository;
import com.teambgd.christmastree.service.TreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class TreeController {

    private final TreeService trServ;
    private final TreeRepository trRepo;

    // 빈 트리 생성하기
    @GetMapping("/tree/{nickname}")
    public Tree getTree(@PathVariable String nickname) {
        return trServ.getTree(nickname);
    }

    // 트리에 달린 오너먼트 조회하기
    @GetMapping("/tree/{nickname}/ornament/list")
    public List<Ornament> getOrnaments(@PathVariable String nickname) {
        List<Ornament> ornaList = trServ.getOrnamentTree(trRepo.findByNickname(nickname).getTreeId());
        return ornaList;
    }

}
