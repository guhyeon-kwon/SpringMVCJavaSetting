## Spring MVC Default Java Setting

### 설정 목록
- [x] DispatcherServlet 설정
- [x] MVC Project 설정
- [x] Bean관리 클래스 설정
- [x] Controller 샘플
- [x] 데이터베이스 연결 Bean 추가(Oracle)
- [x] 쿼리 실행 Bean 추가
- [x] properties 연결
- [x] 필수 모듈 gradle 등록
- [x] 정적파일 경로 매핑
- [x] ViewResolvers prefix, suffix 설정
- [x] 인코딩 필터 설정
- [ ] Mapper 샘플
- [ ] Intercepter 샘플
- [ ] MariaDB 연결 Bean 추가
- [ ] messageSource 등록
- [ ] 유효성 검사 샘플
- [ ] 에러 메세지 커스터마이징 properties 생성 및 샘플
- [ ] Validator 커스터마이징 추가
- [ ] 쿠키, 세션 샘플
 
```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂kr
 ┃ ┃ ┃ ┗ 📂co
 ┃ ┃ ┃ ┃ ┗ 📂springtest
 ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RootAppContext.java - 기본 빈 설정 파일
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ServletAppContext.java - MVC 설정 파일
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SpringConfigClass.java - 프로젝트 설정 파일
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜HomeController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📂database - Mapper 폴더
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapperInterface.java
 ┃ ┣ 📂resources
 ┃ ┃ ┗ 📂META-INF
 ┃ ┃ ┃ ┣ 📜beans.xml
 ┃ ┃ ┃ ┗ 📜persistence.xml
 ┃ ┗ 📂webapp
 ┃ ┃ ┗ 📂WEB-INF
 ┃ ┃ ┃ ┣ 📂properties
 ┃ ┃ ┃ ┃ ┗ 📜db.properties - db 접속 정보
 ┃ ┃ ┃ ┣ 📂resources - 정적파일 기본 경로
 ┃ ┃ ┃ ┃ ┗ 📂image
 ┃ ┃ ┃ ┃ ┃ ┗ 📜spring-logo.svg
 ┃ ┃ ┃ ┣ 📂views
 ┃ ┃ ┃ ┃ ┗ 📜index.jsp
 ┃ ┃ ┃ ┗ 📜faces-config.xml
 ┗ 📂test
 ┃ ┣ 📂java
 ┃ ┗ 📂resources
```