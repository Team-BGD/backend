package com.teambgd.christmastree.service;

import com.teambgd.christmastree.domain.User;
import com.teambgd.christmastree.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository uRepo;

    // 닉네임으로 사용자 생성
    public User getNickname(User user) {
        User newUser = User.builder()
                .nickname(user.getNickname())
                .createDt(LocalDateTime.now())
                .build();
        uRepo.save(newUser);
        return newUser;
    }

    // 사용자 닉네임 중복 체크하기
    public boolean checkNicknameDuplicate(String nickname) {
        return uRepo.existsByNickname(nickname);
    }

}
