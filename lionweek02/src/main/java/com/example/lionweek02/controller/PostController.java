package com.example.lionweek02.controller;

import com.example.lionweek02.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    //http://localhost:8080/api/v1/post-api/member
    @PostMapping(value="/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
}
