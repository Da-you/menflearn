package com.myapp.menflearn.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/member")
public class MemberApiController {
	private final MemberRepository memberRepo;

	@PostMapping("sign-in")
	public String signIn(@RequestBody MemberRequestDto req) {
		Member member = Member.builder()
			.accountName(req.getAccountName())
			.password(req.getPassword())
			.build();
		memberRepo.save(member);
		return member.getAccountName();
	}
}
