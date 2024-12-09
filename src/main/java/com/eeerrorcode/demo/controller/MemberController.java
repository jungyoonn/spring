package com.eeerrorcode.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eeerrorcode.demo.service.MemberService;
import com.eeerrorcode.demo.vo.Member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService service;

    @RequestMapping("")
    public String index(Model model, HttpServletRequest req, String str, Member member, HttpSession session) {
        model.addAttribute("now", service.selectNow());
        req.setAttribute("name", "kil dong");
        model.addAttribute("str", str); // 쿼리스트링으로 밸류를 주면 수집한다!
        model.addAttribute("member", member);
        return "hello";
    }
}
