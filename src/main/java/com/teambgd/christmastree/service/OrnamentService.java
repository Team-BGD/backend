package com.teambgd.christmastree.service;

import com.teambgd.christmastree.domain.Ornament;
import com.teambgd.christmastree.repository.OrnamentRepository;
import com.teambgd.christmastree.repository.TreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrnamentService {

    private final OrnamentRepository ornaRepo;
    private final TreeRepository trRepo;

    // 오너먼트 선택하기
    public Long getOrnament(String nickname, Long ornamentNum) {
        Ornament orna = new Ornament().builder()
                .ornamentNum(ornamentNum)
                .treeId(trRepo.findByNickname(nickname).getTreeId())
                .createDt(LocalDateTime.now())
                .build();

        ornaRepo.save(orna);
        return orna.getOrnamentId();
    }

    // 메시지와 닉네임 입력하기
    public Ornament getMessage(Long ornamentId, Ornament ornament) {
        Ornament tempOrna = ornaRepo.findByOrnamentId(ornamentId);

        if(ornament.getMessage() != null)
            tempOrna.setMessage(ornament.getMessage());
        if(ornament.getAnoNickname() != null)
            tempOrna.setAnoNickname(ornament.getAnoNickname());

        Ornament newOrna = ornaRepo.save(tempOrna);
        return newOrna;
    }

}
