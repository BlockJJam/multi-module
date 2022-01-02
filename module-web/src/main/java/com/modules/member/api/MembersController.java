package com.modules.member.api;

import com.modules.domain.Members;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersController {

    @GetMapping("/")
    public Members get(){
        return new Members("blockjjam", "blockjjam99@gmail.com");
    }
}
