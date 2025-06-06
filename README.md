# start-project

## Spring Boot를 이용한 간단한 회원가입/로그인 프로젝트

[어라운드 허브 스튜디오 | 스트링 부트 기본기](https://youtu.be/AalcVuKwBUM?feature=shared)를 참고하였습니다.

### 프로젝트 구조
```
member
┣ controller
┃ ┣ dto
┃ ┃ ┗ JoinRequest.java
┃ ┗ MemberController.java
┣ repository
┃ ┣ entity
┃ ┃ ┗ Member.java
┃ ┗ MemberRepository.java
┗ service
┃ ┣ MemberService.java
┃ ┗ MemberServicempl.java
```

### 스프링 프레임워크

### DI( 의존성 주입 )
외부에서 두 객체간의 관계를 결정하는 디자인 패턴

주로 생성자 주입 방식을 사용한다.. ( 아마도.. ? )

### AOP( 관점 지향 프로그래밍 )

#### OOP

#### AOP

### MVC

### API

### DTO
 


## 🐳 Docker 사용법

Docker를 통해 컨테이너 환경에서 실행이 가능합니다.

Docker 연습입니당.


### 1. 빌드 (Maven)

Maven을 통해 애플리케이션을 빌드합니다.

```bash
./mvnw clean package
```
빌드 결과물은 /target/ 폴더에 .jar 파일로 생성됩니다.

### 2. Docker 이미지빌드
루트 폴더에 있는 Dockerfile을 기반으로 이미지를 생성합니다.
```bash
docker build -t spring/start-project .
```
※ 필요시 .jar 파일명을 직접 지정하려면:
```bash
docker build --build-arg JAR_FILE=target/your-app.jar -t spring/start-project .
```

### 3. Docker컨테이너 실행
```bash
docker run -p 8080:8080 spring/start-project
```
기본적으로 애플리케이션은 8080 포트에서 실행됩니다.


### 4. 컨테이너 정리
```bash
docker ps # 실행중인 컨테이너 확인
docker stop <COTAINER_ID>
docker rm <COTAINER_ID>
```

