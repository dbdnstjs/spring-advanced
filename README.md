# SPRING ADVANCED

💻 Spring 심화 개인 과제
✨ 구현 목표
이 프로젝트는 Spring을 활용한 개인 과제로, 기존 코드의 문제점을 분석하고 코드의 안정성, 가독성, 성능을 개선하는데 중점을 두었습니다.

📋 주요 개선 및 리팩토링 내용
📌 프로젝트 세팅 및 초기 문제 해결
application.yml 파일 추가: 애플리케이션 실행에 필수적인 application.yml 파일이 누락되어 있던 문제를 해결했습니다.

WebConfig 파일 설정: AuthUserArgumentResolver가 정상적으로 동작하도록 WebConfig를 추가하였습니다..

📌 코드 가독성 및 유지보수성 향상
유효성 검사 로직 개선: 불필요한 로직 실행을 막기 위해 유효성 검사 로직을 메서드 초반부로 이동시켰습니다.

if-else 문 간소화: if 조건에 맞지 않는 경우 즉시 예외를 던지는 방식으로 코드를 간결하게 리팩토링했습니다.

비밀번호 유효성 검증 분리: UserService에 하드코딩되어 있던 비밀번호 유효성 검증 로직을 @Pattern 어노테이션을 사용하였습니다.

📌 성능 최적화
N+1 문제 해결: N+1 문제를 해결하기 위해 @EntityGraph를 활용한 Fetch Join을 구현하여 쿼리 성능을 최적화했습니다.

📌 테스트 코드 및 예외 처리
테스트 코드 개선: passwordEncoder.matches() 메서드의 인자 순서를 올바르게 변경하고, assertEquals()의 잘못된 인자를 수정하여 테스트 코드의 정확성을 높였습니다.

예외 처리 명확화: 일반적인 ServerException을 더 구체적인 InvalidRequestException으로 변경하여 예외 발생 원인을 명확히 했습니다.

Todo 유효성 검증 강화: todo.getUser() == null 조건을 추가하여 Todo의 사용자 정보가 없는 경우에 대한 예외 처리를 하였습니다.
