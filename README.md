# baseballProject
## 요구사항

[평가] 야구 관리 프로그램을 만드시오.

1. DB생성
 - 야구장 (총 3개)
 - 팀 (총 3개)
 - 선수 (각 5명)

2. 페이지 만들기 (JSP사용)
 - 야구장 등록 페이지
 - 팀 등록 페이지
 - 선수 등록 페이지
 - 야구장 목록 보기 및 삭제페이지
 - 야구팀 목록 보기 및 삭제페이지
 - 선수 목록 보기 및 삭제페이지
 - 포지션별 팀의 야구 선수 페이지 (피벗)


## 환경설정

### yml 설정

```yml
server:
  port: 8080
  servlet:
    context-path: /
    encoding:
      charset: UTF-8
      enabled: true
      force: true
  
      
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp
      
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/baseball?serverTimezone=Asia/Seoul
    username: baseball
    password: baseball1234

  
  jpa:
    open-in-view: true
    hibernate:
      ddl-auto: update #create update none
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      
    show-sql: true
    properties:
      hibernate.format_sql: true
      
  jackson:
    serialization:
      fail-on-empty-beans: false
```


### 데이터베이스
```sql
create user 'baseball'@'%' identified by 'baseball1234';
GRANT ALL PRIVILEGES ON *.* TO 'baseball'@'%';
create database baseball;
```

