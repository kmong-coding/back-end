package com.example.demo.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {	
    @Id
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String userId; // 이메일
    
    @NotBlank(message = "패스워드 입력")
    private String pw;      // 비밀번호
    
    @NotBlank(message = "닉네임 입력")
    private String nickname; // 사용자 이름
    
    private LocalDate birthDate; // 생년월일
    private String role;         // 역할
    private String hobby;        // 취미
    
    @NotBlank(message = "MBTI 입력")
    @Pattern(regexp = "^(ENFP|ENFJ|ESFP|ESFJ|ENTP|ENTJ|ESTP|ESTJ|INFP|INFJ|ISFP|ISFJ|INTP|INTJ|ISTP|ISTJ)$", message = "유효하지 않은 MBTI입니다.")
    private String mbti; // mbti
    
    public String getUserId() {
        return userId;
    }

    public String getPw() {
        return pw;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getMbti() {
        return mbti;
    }

}

