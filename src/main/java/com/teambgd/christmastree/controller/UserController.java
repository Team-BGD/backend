package com.teambgd.christmastree.controller;

import com.teambgd.christmastree.domain.User;
import com.teambgd.christmastree.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class UserController {

    private final UserService uServ;

    // 사용자 닉네임 입력받고 닉네임 리턴
    @PostMapping("/tree/nickname")
    public String getNickname(@RequestBody User user) {
        User newUSer = uServ.getNickname(user);
        return newUSer.getNickname();
    }

    // 사용자 닉네임 중복체크하기
    @GetMapping("/user-nickname/{nickname}/exists")
    public boolean checkUserNicknameDuplicate(@PathVariable String nickname) {
        return uServ.checkNicknameDuplicate(nickname);
    }

}
