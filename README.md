# springboot + JPA

본 프로젝트는 스프링부트의 구조와 어노테이션 JPA 사용법에 대해 이해하고자 학습하며 구성해본 프로젝트입니다.

## 설명
회원정보는 이메일만 있다고 가정합니다.
게시판이 존재하며 제목, 내용, 작정자 아이디만 존재합니다.

### 회원
회원 가입이 존재하며, 이메일 중복 체크를 합니다.
이메일이 존재할 경우 exception을 발생 시킵니다.

### 게시판
게시물을 저장 할 수 있으며, 전체 조회가 가능한 api 2개가 존재합니다.

### 테스트
swagger를 올렸으며, http://localhost:8080/swagger-ui/index.html 로 접근이 가능합니다.

## 느낀점
아주 간단한 내용이며, 실질적으로는 해당 프로젝트를 만들면서 spring의 구조와 흐름을 이해하는데 주력으로 만든 프로젝트 입니다.

요즘 개발 트렌드인 의존성 주입을 하는 프레임워크들은 결국 논리적인 흐름은 동일하고 이걸 어떤 언어로 해당 프레임워크를 사용하느냐 인거 같습니다.
물론 deep하게 들어가면 좀 더 공부해야할 것이 많겠지만 이는 결국 시간이고 경험치에 따라 해당 시간이 단축될걸로 보입니다.

모든 개발자가 그렇겠지만 하나의 언어와 프레임워크를 잘 이해하고 있으면 결국 공부와 러닝커브 기간만 있으면 해낼 수 있다 생각합니다.
제가 .net에서 nodejs 진형으로 옮겼을때도 그랬고, 현재 java를 하는 것도 그렇습니다.

시니어 개발자는 실제 코딩도 코딩이지만 설계도 매우 중요하기에 결국 설계의 좋은 방향은 많은 경험이라 생각되어집니다.
이 경험을 주니어 개발자들에게 알려주고 서로 더 좋은 목표를 잡고 가면 좋은 프로덕트가 나올거라 생각 되어 집니다.

### 참고
오렐리 - spring boot up & running(마크헤클러)
인프런 -스프링 부트 - 핵심 원리와 활용(김영한)


