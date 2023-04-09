package com.example.lionweek02.dto;
/* ex) 강남대학교 검색 url에 naver.com 만 뜨면 post형식
* naver.com/강남대학교dasfkl/이런식으로 뜨면 get형식 */
public class MemberDto {

    private String name;
    private String email;
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString(){
        return "MemberDto{" +
                "name='" + name + '\''+
                ", email='" + email + '\''+
                ", organization='" +organization+ '\''+
                '}';
    }

}