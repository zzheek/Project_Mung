package com.project_mung.domain;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userid;              // 유저아이디
    private String userpass;            // 비밀번호
    private String username;            // 이름
    private String userphone;           // 전화번호
    private String userpostcode;        // 우편번호
    private String useraddress;         // 주소
    private String userdetailaddress;   // 상세주소
    private String useremail;           // 이메일

    // UserRole 추가
    @Builder.Default
    private Set<UserRole> roles = new HashSet<>();

    public void addRole(UserRole role) {
        roles.add(role);
    }
}