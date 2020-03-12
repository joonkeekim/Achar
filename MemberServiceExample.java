package com.example;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService=new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인됨");
			memberService.logout("hong");
		}else {
			System.out.println("wrong id or password");
		}
	}

}
