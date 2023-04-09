package com.example.lionweek02.controller;

import com.example.lionweek02.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
/* @RequestParam 사용자에게 정보를 받는용도
* 요청할때는 get */
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    //http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value="/request3")
    public String getRequestParam3(MemberDto memberDto){
        //return memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
        return memberDto.toString();

    }
}