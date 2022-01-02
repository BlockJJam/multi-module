# Spring Multi-Module

💡 이 얼마만의 Spring Study인가.. 나름 난이도가 높은 학습이 예상되지만, Reactive와 함께 꼭 해보고 싶은 학습이었다, 시작해보자!!!


### 참고

---

- 기억보단 기록을 - 향로님 블로그, 우형 개발블로그 - 우아한 형제들 글을 참고(이 글에서는 참고 X)하고 만들어봅니다
  → 더 추가로 보는 글들은 여기 링크하겠습니다
- [https://github.com/jojoldu/blog-code/tree/master/gradle-multi-modules](https://github.com/jojoldu/blog-code/tree/master/gradle-multi-modules) : 기억보단 기록을
- [https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/](https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/) : Jongmin님의 블로그

## 해당 학습의 목표

---

- 단일 모듈 프로젝트의 문제점과 멀티 모듈 프로젝트의 필요성을 알아보자
- 공통 모듈을 통한 간단한 테스트를 진행해본다
- 모듈의 의미를 생각해보며, 세분화된 모듈을 기존의 MVP로 구현해보자

## 단일 모듈 프로젝트를 진행하게 되면 맞다뜨리기 쉬운 병목점

---

- 쌓이는 공통 코드를 어떻게 관리해야 될까?
- 서비스를 분리해야 하는데, 여기서도.. 저기서도 쓰이는 중복 클래스들

## 멀티 모듈이 왜 필요할까?

---

- 공통 클래스의 수정이 필요하면, 공통 클래스가 담긴 모든 프로젝트의 코드를 수정해줘야 한다
- 그럼 멀티 모듈로 공통 코드를 어떻게 관리할 수 있을까?
    - 하나의 공통 모듈 프로젝트는 지속적인 개발이 가능해야 한다
    - 특정 프로젝트 개발 시에 바로 공통 모듈 코드를 가져다 쓸 수 있어야 한다
    - 빌드시에 자동으로 공통 프로젝트가 포함되어야 한다

⇒ 현재 작성중인 문서는 실습 전입니다, 이 부분은 실습 후에 다시 수정해야 될 부분입니다

- 멀티 모듈을 접목해보는 순서 이미지

  ![test접목순서](https://user-images.githubusercontent.com/57485510/147872793-84563f9f-e276-4a8b-99f7-babd38516143.png)

    - 2번째 img) multi-gradle을 만들고, 그 안에 common-module을 구현해봅니다
    - 3번째 img)우형개발자에서 올라온 module의 SRP(단일책임원칙), CCP(공통폐쇄원칙)를 활용한 방식으로 구현 → MVP 구현했던 프로젝트를 활용해볼 예정

## Tool

---

- gradle: 7.3.2
- spring boot: 2.5.7

## 멀티 모듈 설정 실습 순서

---

- multi-gradle 프로젝트 생성 - 공통 프로젝트 하나를 만들어두겠습니다

- gradle 프로젝트로 생성 > java만 선택 > “multi-module”이라는 이름의 프로젝트 생성

  ![Untitled](https://user-images.githubusercontent.com/57485510/147872803-86580189-6739-4713-8b5a-c829af340ffc.png)


    - `multi-module` 우클릭 > module 생성 > `module-api`, `module-common`, `module-web` 이라는 마찬가지로 gradle 프로젝트 생성
    - 빌드는 root(`multi-module`)에서 진행, 나머지 프로젝트는 gradle(dir), gradlew(exec-file) 등이 없고, build.grade, src dir만 존재

- module-common: 다른 프로젝트들에서 사용할 공통 클래스를 모아놓은 프로젝트입니다 `Members.java`, `MembersRepository.java`를 만들어놓겠습니다.

- module-api: module-common 에서 제공하는 클래스들을 가져다 쓰는 여~러 api 모듈 중 하나라고 보시면 됩니다

- module-web: module-common에 마찬가지로 의존하게 되는 모듈입니다

### 위의 설정까지만 하고, module-api에 memberService를 만들어보자

---

- 무수한 빨간 줄을 볼 수 있다

  ![Untitled 1](https://user-images.githubusercontent.com/57485510/147872798-69f563c6-ee53-4b44-ae39-4da9bdd83629.png)

    - module-api가 사용하는 `Members`, `MembersRepository` 를 찾지 못하는 이유
      : 모듈간에 의존성이 관리가 되고 있지 않기 때문

- 분명 root(multi-gradle)의 setting.gradle에는 각 module-XXX 모듈이 하위 모듈로 설정이 되어있는 모습을 확인할 수 있다

  ```groovy
  rootProject.name = 'multi-module'
  include 'module-api'
  include 'module-common'
  include 'module-web'
  ```

- 의존성 관리를 위해 root(multi-gradle)의 build.gradle 을 다음과 같이 설정

  ```groovy
  buildscript{
      ext{
          dependencyManageVersion='1.0.11.RELEASE'
      }
  
      repositories {
          mavenCentral()
      }
      dependencies {
          classpath 'org.springframework.boot:spring-boot-gradle-plugin:2.5.7'
          classpath 'io.spring.gradle:dependency-management-plugin:${dependencyManageVersion}'
      }
  }
  
  subprojects {
      group 'com.modules'
      version '1.0-SNAPSHOT'
  
      apply plugin: 'java-library'
      apply plugin: 'org.springframework.boot'
      apply plugin: 'io.spring.dependency-management'
  
      sourceCompatibility = 11
  
      repositories {
          mavenCentral() //
      }
  
      dependencies{
          compileOnly 'org.projectlombok:lombok'
          annotationProcessor 'org.projectlombok:lombok'
          testImplementation 'org.springframework.boot:spring-boot-starter-test'
          testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
          testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
      }
  }
  ```

    - 핵심적으로 보면 좋을 부분은 `subprojects`부분입니다

      → `subprojects`가 `setting.gradle`의 include 프로젝트들 모두 관리하고, `apply plugin` 을 통해 하위 프로젝트에 필요한 의존성(java, spring)을 등록해줍니다.

      > root project에도 의존성 적용이 필요하다면, `subproject` → `allprojects`로 변경해주시면 가능

      > gradle 7버전에서는 `project()` 속성이 먹히지 않았기 때문에, 하위 프로젝트간의 의존성 연결은 다음 common, api, web의 `build.gradle`을 확인해보면 됩니다

- module-common, module-api, module-web의 `build.gradle` 를 통해 하위 모듈간의 의존성 관계를 분석해본다

  ```groovy
  /** module-api **/
  buildscript {
      ext{
          springBootStarterVersion='2.5.7'
      }
  }
  
  group 'com.modules'
  version 'unspecified'
  
  dependencies {
      implementation group: 'org.springframework.boot', name: 'spring-boot-starter-web', version: springBootStarterVersion
      implementation project(':module-common')
  }
  
  test {
      useJUnitPlatform()
  }
  ```

  ```groovy
  /** module-web **/
  buildscript {
      ext{
          springBootStarterVersion='2.5.7'
      }
  }
  
  group 'com.modules'
  version 'unspecified'
  
  dependencies {
      implementation group: 'org.springframework.boot', name: 'spring-boot-starter-web', version: springBootStarterVersion
      implementation project(':module-common')
  }
  
  test {
      useJUnitPlatform()
  }
  ```

  ```groovy
  /** module-common **/
  buildscript {
      ext{
          springBootStarterVersion='2.5.7'
      }
  }
  
  group 'com.modules'
  version 'unspecified'
  
  dependencies {
      api group: 'org.springframework.boot', name: 'spring-boot-starter-data-jpa', version: springBootStarterVersion
      runtimeOnly group: 'com.h2database', name: 'h2', version: '2.0.202'
  }
  
  test {
      useJUnitPlatform()
  }
  
  // below) common module은 Application 부팅에 필요한 bootjar로 활용되지 않기때문에 밑의 설정을 해준다
  bootJar{ enabled= false}
  jar{ enabled = true}
  ```

    - **module-api**, **module-web**의 `implementation(:module-common)`에 집중

      > 이 설명을 들어가기 전에, dependencies의 api, implementation의 차이를 이해하고 싶으시다면, JongMin님의 블로그: [https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/](https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/) 를 들어가보세요!

      : 하위 모듈이 상위 모듈(**module-common**)을 불러오는 방법
      
        : 상위 모듈(**module-common**)에서는 의존하는 상위 모듈을 `api`로 불러오기 때문에 하위 모듈이 해당 모듈을 그대로 사용가능해진다

    - **module-common**의 `bootJar`와 `jar` 설정
      
        : `bootJar`는 Application을 부팅하는 jar파일에 포함하는지 여부, `jar`는 하위 모듈에 jar파일을 포함하는 여부로 알고 있다
            
        : **module-api**, **module-web**의 경우, Application이 부팅되어 API서버 통신부터 비즈니스 로직 서비스를 제공하는 역할로 → `bootJar{ enabled = true(default)}`, `jar{ enabled = false(default)}`
      
        : module-common의 경우, 상위 모듈로 하위 모듈에 jar로 포함되기만 하고 Application 부팅과는 관계없기 때문에 → `bootJar{ enabled = false }` , `jar{ enabled = true}`

      ![Untitled 2](https://user-images.githubusercontent.com/57485510/147872799-cac0a17d-ee04-48c8-90e6-1e321fb4dbfd.png)

      → **module-web**를 build한 후 **module-web.jar**파일을 `jar xvf module-web.jar` 시키면 의존하는 jar파일이 나온다

      → (jar명령어를 친 후)module-web > build > libs > BOOT-INF > lib > module-common.jar파일이 있다는 것을 알 수 있다

## 그럼 테스트 코드부터 Application 실행까지의 코드와 결과를 확인

---

- module-api > member service, test, spring boot application code

```java
/* MembersService.java */
import com.modules.domain.Members;
import com.modules.repository.MembersRepository;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
    private MembersRepository membersRepository;

    public MembersService(MembersRepository membersRepository){
        this.membersRepository = membersRepository;
    }

    public Long signUp(Members members){
        // gradle의 implementation 의존 속성의 경우) A(implementation) <- B, 모듈 관계에서 B는 A가 의존하는 라이브러리(모듈)에 접근이 불가능!
        // gradle의 api 의존 속성의 경우) A(api) <- B, 모듈 관계에서 B는 A가 의존하는 라이브러리(모듈)에 접근이 가능!
        return membersRepository.save(members).getId();
    }
}
```

```java
/* ModuleApiApplication.java */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }
}

```

```java
/* ModuleApiTest.java */
import com.modules.domain.Members;
import com.modules.services.MembersService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ModuleApiTest {

    @Autowired
    private MembersService membersService;

    @Test
    public void save(){
        Members members = new Members("jjm","jjm@naver.com");
        Long id = membersService.signUp(members);
        assertThat(id).isEqualTo(1L);
    }
}
```

→ module-api 코드만 보겠습니다(나머지는 github에서 확인!)
→ MembersService.java를 보시면, import {repository path}를 가져오는 것이 보입니다( 실제로 컴파일 에러 안뜸! )
→ ModuleApiTest.java를 보셔도, membersService가 올바르게 처리한다는 것도 실행결과를 보여드리겠습니다

![Untitled 3](https://user-images.githubusercontent.com/57485510/147872801-45650c68-9735-40a4-9fde-47f76d99c349.png)

- 그럼 SpringApplication이 제대로 부팅이 되는지 module-web( controller포함하는 모듈 ) 부팅해보겠습니다

![Untitled 4](https://user-images.githubusercontent.com/57485510/147872802-6f1517f3-51c0-48b1-b33c-508c238f3041.png)

→ 문제없이 잘 불러오는 것도 확인할 수 있습니다

## 실습하면서 생겼던 Issue

---

- 제일 많이 참고한 블로그
  : **기억보단 기록을** 
  
    → 2017년에 올려주신 자료로, gradle 7버전에 맞게 리팩토링한 부분이 있습니다
- 모듈 생성하실 때, group명은 꼭 챙겨주세요
  
    : group이 root 프로젝트에만 되어있고, 하위 모듈에 group명이 없이 실습을 해봤는데, bean path를 제대로 못 읽어와서 설정이 제대로 되어있어도 실습이 안되는 문제가 있었습니다