package com.teambgd.christmastree.controller;

import com.teambgd.christmastree.domain.Ornament;
import com.teambgd.christmastree.dto.GetOrnamentRequest;
import com.teambgd.christmastree.service.OrnamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class OrnamentController {

    private final OrnamentService ornaServ;

    // 오너먼트 선택하기
    @PostMapping("/tree/{nickname}/ornament")
    public Long getOrnament(@PathVariable String nickname, @RequestBody GetOrnamentRequest ornamentRequest) {
        return ornaServ.getOrnament(nickname, ornamentRequest.getOrnamentNum());
    }

    // 메세지와 닉네임 작성하기
    @PostMapping("/tree/{nickname}/ornament/{ornaId}/message")
    public Ornament getMessage(@PathVariable String nickname, @PathVariable Long ornaId, @RequestBody Ornament ornament) {
        Ornament getMsgOrna = ornaServ.getMessage(ornaId, ornament);
        return getMsgOrna;
    }

}
