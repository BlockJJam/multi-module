# Spring Multi-Module

๐ก ์ด ์ผ๋ง๋ง์ Spring Study์ธ๊ฐ.. ๋๋ฆ ๋์ด๋๊ฐ ๋์ ํ์ต์ด ์์๋์ง๋ง, Reactive์ ํจ๊ป ๊ผญ ํด๋ณด๊ณ  ์ถ์ ํ์ต์ด์๋ค, ์์ํด๋ณด์!!!


### ์ฐธ๊ณ 

---

- ๊ธฐ์ต๋ณด๋จ ๊ธฐ๋ก์ - ํฅ๋ก๋ ๋ธ๋ก๊ทธ, ์ฐํ ๊ฐ๋ฐ๋ธ๋ก๊ทธ - ์ฐ์ํ ํ์ ๋ค ๊ธ์ ์ฐธ๊ณ (์ด ๊ธ์์๋ ์ฐธ๊ณ  X)ํ๊ณ  ๋ง๋ค์ด๋ด๋๋ค
  โ ๋ ์ถ๊ฐ๋ก ๋ณด๋ ๊ธ๋ค์ ์ฌ๊ธฐ ๋งํฌํ๊ฒ ์ต๋๋ค
- [https://github.com/jojoldu/blog-code/tree/master/gradle-multi-modules](https://github.com/jojoldu/blog-code/tree/master/gradle-multi-modules) : ๊ธฐ์ต๋ณด๋จ ๊ธฐ๋ก์
- [https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/](https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/) : Jongmin๋์ ๋ธ๋ก๊ทธ

## ํด๋น ํ์ต์ ๋ชฉํ

---

- ๋จ์ผ ๋ชจ๋ ํ๋ก์ ํธ์ ๋ฌธ์ ์ ๊ณผ ๋ฉํฐ ๋ชจ๋ ํ๋ก์ ํธ์ ํ์์ฑ์ ์์๋ณด์
- ๊ณตํต ๋ชจ๋์ ํตํ ๊ฐ๋จํ ํ์คํธ๋ฅผ ์งํํด๋ณธ๋ค
- ๋ชจ๋์ ์๋ฏธ๋ฅผ ์๊ฐํด๋ณด๋ฉฐ, ์ธ๋ถํ๋ ๋ชจ๋์ ๊ธฐ์กด์ MVP๋ก ๊ตฌํํด๋ณด์

## ๋จ์ผ ๋ชจ๋ ํ๋ก์ ํธ๋ฅผ ์งํํ๊ฒ ๋๋ฉด ๋ง๋ค๋จ๋ฆฌ๊ธฐ ์ฌ์ด ๋ณ๋ชฉ์ 

---

- ์์ด๋ ๊ณตํต ์ฝ๋๋ฅผ ์ด๋ป๊ฒ ๊ด๋ฆฌํด์ผ ๋ ๊น?
- ์๋น์ค๋ฅผ ๋ถ๋ฆฌํด์ผ ํ๋๋ฐ, ์ฌ๊ธฐ์๋.. ์ ๊ธฐ์๋ ์ฐ์ด๋ ์ค๋ณต ํด๋์ค๋ค

## ๋ฉํฐ ๋ชจ๋์ด ์ ํ์ํ ๊น?

---

- ๊ณตํต ํด๋์ค์ ์์ ์ด ํ์ํ๋ฉด, ๊ณตํต ํด๋์ค๊ฐ ๋ด๊ธด ๋ชจ๋  ํ๋ก์ ํธ์ ์ฝ๋๋ฅผ ์์ ํด์ค์ผ ํ๋ค
- ๊ทธ๋ผ ๋ฉํฐ ๋ชจ๋๋ก ๊ณตํต ์ฝ๋๋ฅผ ์ด๋ป๊ฒ ๊ด๋ฆฌํ  ์ ์์๊น?
    - ํ๋์ ๊ณตํต ๋ชจ๋ ํ๋ก์ ํธ๋ ์ง์์ ์ธ ๊ฐ๋ฐ์ด ๊ฐ๋ฅํด์ผ ํ๋ค
    - ํน์  ํ๋ก์ ํธ ๊ฐ๋ฐ ์์ ๋ฐ๋ก ๊ณตํต ๋ชจ๋ ์ฝ๋๋ฅผ ๊ฐ์ ธ๋ค ์ธ ์ ์์ด์ผ ํ๋ค
    - ๋น๋์์ ์๋์ผ๋ก ๊ณตํต ํ๋ก์ ํธ๊ฐ ํฌํจ๋์ด์ผ ํ๋ค

โ ํ์ฌ ์์ฑ์ค์ธ ๋ฌธ์๋ ์ค์ต ์ ์๋๋ค, ์ด ๋ถ๋ถ์ ์ค์ต ํ์ ๋ค์ ์์ ํด์ผ ๋  ๋ถ๋ถ์๋๋ค

- ๋ฉํฐ ๋ชจ๋์ ์ ๋ชฉํด๋ณด๋ ์์ ์ด๋ฏธ์ง

  ![testแแฅแธแแฉแจแแฎแซแแฅ](https://user-images.githubusercontent.com/57485510/147872793-84563f9f-e276-4a8b-99f7-babd38516143.png)

    - 2๋ฒ์งธ img) multi-gradle์ ๋ง๋ค๊ณ , ๊ทธ ์์ common-module์ ๊ตฌํํด๋ด๋๋ค
    - 3๋ฒ์งธ img)์ฐํ๊ฐ๋ฐ์์์ ์ฌ๋ผ์จ module์ SRP(๋จ์ผ์ฑ์์์น), CCP(๊ณตํตํ์์์น)๋ฅผ ํ์ฉํ ๋ฐฉ์์ผ๋ก ๊ตฌํ โ MVP ๊ตฌํํ๋ ํ๋ก์ ํธ๋ฅผ ํ์ฉํด๋ณผ ์์ 

## Tool

---

- gradle: 7.3.2
- spring boot: 2.5.7

## ๋ฉํฐ ๋ชจ๋ ์ค์  ์ค์ต ์์

---

- multi-gradle ํ๋ก์ ํธ ์์ฑ - ๊ณตํต ํ๋ก์ ํธ ํ๋๋ฅผ ๋ง๋ค์ด๋๊ฒ ์ต๋๋ค

- gradle ํ๋ก์ ํธ๋ก ์์ฑ > java๋ง ์ ํ > โmulti-moduleโ์ด๋ผ๋ ์ด๋ฆ์ ํ๋ก์ ํธ ์์ฑ

  ![Untitled](https://user-images.githubusercontent.com/57485510/147872803-86580189-6739-4713-8b5a-c829af340ffc.png)


    - `multi-module` ์ฐํด๋ฆญ > module ์์ฑ > `module-api`, `module-common`, `module-web` ์ด๋ผ๋ ๋ง์ฐฌ๊ฐ์ง๋ก gradle ํ๋ก์ ํธ ์์ฑ
    - ๋น๋๋ root(`multi-module`)์์ ์งํ, ๋๋จธ์ง ํ๋ก์ ํธ๋ gradle(dir), gradlew(exec-file) ๋ฑ์ด ์๊ณ , build.grade, src dir๋ง ์กด์ฌ

- module-common: ๋ค๋ฅธ ํ๋ก์ ํธ๋ค์์ ์ฌ์ฉํ  ๊ณตํต ํด๋์ค๋ฅผ ๋ชจ์๋์ ํ๋ก์ ํธ์๋๋ค `Members.java`, `MembersRepository.java`๋ฅผ ๋ง๋ค์ด๋๊ฒ ์ต๋๋ค.

- module-api: module-common ์์ ์ ๊ณตํ๋ ํด๋์ค๋ค์ ๊ฐ์ ธ๋ค ์ฐ๋ ์ฌ~๋ฌ api ๋ชจ๋ ์ค ํ๋๋ผ๊ณ  ๋ณด์๋ฉด ๋ฉ๋๋ค

- module-web: module-common์ ๋ง์ฐฌ๊ฐ์ง๋ก ์์กดํ๊ฒ ๋๋ ๋ชจ๋์๋๋ค

### ์์ ์ค์ ๊น์ง๋ง ํ๊ณ , module-api์ memberService๋ฅผ ๋ง๋ค์ด๋ณด์

---

- ๋ฌด์ํ ๋นจ๊ฐ ์ค์ ๋ณผ ์ ์๋ค

  ![Untitled 1](https://user-images.githubusercontent.com/57485510/147872798-69f563c6-ee53-4b44-ae39-4da9bdd83629.png)

    - module-api๊ฐ ์ฌ์ฉํ๋ `Members`, `MembersRepository` ๋ฅผ ์ฐพ์ง ๋ชปํ๋ ์ด์ 
      : ๋ชจ๋๊ฐ์ ์์กด์ฑ์ด ๊ด๋ฆฌ๊ฐ ๋๊ณ  ์์ง ์๊ธฐ ๋๋ฌธ

- ๋ถ๋ช root(multi-gradle)์ setting.gradle์๋ ๊ฐ module-XXX ๋ชจ๋์ด ํ์ ๋ชจ๋๋ก ์ค์ ์ด ๋์ด์๋ ๋ชจ์ต์ ํ์ธํ  ์ ์๋ค

  ```groovy
  rootProject.name = 'multi-module'
  include 'module-api'
  include 'module-common'
  include 'module-web'
  ```

- ์์กด์ฑ ๊ด๋ฆฌ๋ฅผ ์ํด root(multi-gradle)์ build.gradle ์ ๋ค์๊ณผ ๊ฐ์ด ์ค์ 

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

    - ํต์ฌ์ ์ผ๋ก ๋ณด๋ฉด ์ข์ ๋ถ๋ถ์ `subprojects`๋ถ๋ถ์๋๋ค

      โ `subprojects`๊ฐ `setting.gradle`์ include ํ๋ก์ ํธ๋ค ๋ชจ๋ ๊ด๋ฆฌํ๊ณ , `apply plugin` ์ ํตํด ํ์ ํ๋ก์ ํธ์ ํ์ํ ์์กด์ฑ(java, spring)์ ๋ฑ๋กํด์ค๋๋ค.

      > root project์๋ ์์กด์ฑ ์ ์ฉ์ด ํ์ํ๋ค๋ฉด, `subproject` โ `allprojects`๋ก ๋ณ๊ฒฝํด์ฃผ์๋ฉด ๊ฐ๋ฅ

      > gradle 7๋ฒ์ ์์๋ `project()` ์์ฑ์ด ๋จนํ์ง ์์๊ธฐ ๋๋ฌธ์, ํ์ ํ๋ก์ ํธ๊ฐ์ ์์กด์ฑ ์ฐ๊ฒฐ์ ๋ค์ common, api, web์ `build.gradle`์ ํ์ธํด๋ณด๋ฉด ๋ฉ๋๋ค

- module-common, module-api, module-web์ `build.gradle` ๋ฅผ ํตํด ํ์ ๋ชจ๋๊ฐ์ ์์กด์ฑ ๊ด๊ณ๋ฅผ ๋ถ์ํด๋ณธ๋ค

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
  
  // below) common module์ Application ๋ถํ์ ํ์ํ bootjar๋ก ํ์ฉ๋์ง ์๊ธฐ๋๋ฌธ์ ๋ฐ์ ์ค์ ์ ํด์ค๋ค
  bootJar{ enabled= false}
  jar{ enabled = true}
  ```

    - **module-api**, **module-web**์ `implementation(:module-common)`์ ์ง์ค

      > ์ด ์ค๋ช์ ๋ค์ด๊ฐ๊ธฐ ์ ์, dependencies์ api, implementation์ ์ฐจ์ด๋ฅผ ์ดํดํ๊ณ  ์ถ์ผ์๋ค๋ฉด, JongMin๋์ ๋ธ๋ก๊ทธ: [https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/](https://jongmin92.github.io/2019/05/09/Gradle/gradle-api-vs-implementation/) ๋ฅผ ๋ค์ด๊ฐ๋ณด์ธ์!

      : ํ์ ๋ชจ๋์ด ์์ ๋ชจ๋(**module-common**)์ ๋ถ๋ฌ์ค๋ ๋ฐฉ๋ฒ
      
        : ์์ ๋ชจ๋(**module-common**)์์๋ ์์กดํ๋ ์์ ๋ชจ๋์ `api`๋ก ๋ถ๋ฌ์ค๊ธฐ ๋๋ฌธ์ ํ์ ๋ชจ๋์ด ํด๋น ๋ชจ๋์ ๊ทธ๋๋ก ์ฌ์ฉ๊ฐ๋ฅํด์ง๋ค

    - **module-common**์ `bootJar`์ `jar` ์ค์ 
      
        : `bootJar`๋ Application์ ๋ถํํ๋ jarํ์ผ์ ํฌํจํ๋์ง ์ฌ๋ถ, `jar`๋ ํ์ ๋ชจ๋์ jarํ์ผ์ ํฌํจํ๋ ์ฌ๋ถ๋ก ์๊ณ  ์๋ค
            
        : **module-api**, **module-web**์ ๊ฒฝ์ฐ, Application์ด ๋ถํ๋์ด API์๋ฒ ํต์ ๋ถํฐ ๋น์ฆ๋์ค ๋ก์ง ์๋น์ค๋ฅผ ์ ๊ณตํ๋ ์ญํ ๋ก โ `bootJar{ enabled = true(default)}`, `jar{ enabled = false(default)}`
      
        : module-common์ ๊ฒฝ์ฐ, ์์ ๋ชจ๋๋ก ํ์ ๋ชจ๋์ jar๋ก ํฌํจ๋๊ธฐ๋ง ํ๊ณ  Application ๋ถํ๊ณผ๋ ๊ด๊ณ์๊ธฐ ๋๋ฌธ์ โ `bootJar{ enabled = false }` , `jar{ enabled = true}`

      ![Untitled 2](https://user-images.githubusercontent.com/57485510/147872799-cac0a17d-ee04-48c8-90e6-1e321fb4dbfd.png)

      โ **module-web**๋ฅผ buildํ ํ **module-web.jar**ํ์ผ์ `jar xvf module-web.jar` ์ํค๋ฉด ์์กดํ๋ jarํ์ผ์ด ๋์จ๋ค

      โ (jar๋ช๋ น์ด๋ฅผ ์น ํ)module-web > build > libs > BOOT-INF > lib > module-common.jarํ์ผ์ด ์๋ค๋ ๊ฒ์ ์ ์ ์๋ค

## ๊ทธ๋ผ ํ์คํธ ์ฝ๋๋ถํฐ Application ์คํ๊น์ง์ ์ฝ๋์ ๊ฒฐ๊ณผ๋ฅผ ํ์ธ

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
        // gradle์ implementation ์์กด ์์ฑ์ ๊ฒฝ์ฐ) A(implementation) <- B, ๋ชจ๋ ๊ด๊ณ์์ B๋ A๊ฐ ์์กดํ๋ ๋ผ์ด๋ธ๋ฌ๋ฆฌ(๋ชจ๋)์ ์ ๊ทผ์ด ๋ถ๊ฐ๋ฅ!
        // gradle์ api ์์กด ์์ฑ์ ๊ฒฝ์ฐ) A(api) <- B, ๋ชจ๋ ๊ด๊ณ์์ B๋ A๊ฐ ์์กดํ๋ ๋ผ์ด๋ธ๋ฌ๋ฆฌ(๋ชจ๋)์ ์ ๊ทผ์ด ๊ฐ๋ฅ!
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

โ module-api ์ฝ๋๋ง ๋ณด๊ฒ ์ต๋๋ค(๋๋จธ์ง๋ github์์ ํ์ธ!)
โ MembersService.java๋ฅผ ๋ณด์๋ฉด, import {repository path}๋ฅผ ๊ฐ์ ธ์ค๋ ๊ฒ์ด ๋ณด์๋๋ค( ์ค์ ๋ก ์ปดํ์ผ ์๋ฌ ์๋ธ! )
โ ModuleApiTest.java๋ฅผ ๋ณด์๋, membersService๊ฐ ์ฌ๋ฐ๋ฅด๊ฒ ์ฒ๋ฆฌํ๋ค๋ ๊ฒ๋ ์คํ๊ฒฐ๊ณผ๋ฅผ ๋ณด์ฌ๋๋ฆฌ๊ฒ ์ต๋๋ค

![Untitled 3](https://user-images.githubusercontent.com/57485510/147872801-45650c68-9735-40a4-9fde-47f76d99c349.png)

- ๊ทธ๋ผ SpringApplication์ด ์ ๋๋ก ๋ถํ์ด ๋๋์ง module-web( controllerํฌํจํ๋ ๋ชจ๋ ) ๋ถํํด๋ณด๊ฒ ์ต๋๋ค

![Untitled 4](https://user-images.githubusercontent.com/57485510/147872802-6f1517f3-51c0-48b1-b33c-508c238f3041.png)

โ ๋ฌธ์ ์์ด ์ ๋ถ๋ฌ์ค๋ ๊ฒ๋ ํ์ธํ  ์ ์์ต๋๋ค

## ์ค์ตํ๋ฉด์ ์๊ฒผ๋ Issue

---

- ์ ์ผ ๋ง์ด ์ฐธ๊ณ ํ ๋ธ๋ก๊ทธ
  : **๊ธฐ์ต๋ณด๋จ ๊ธฐ๋ก์** 
  
    โ 2017๋์ ์ฌ๋ ค์ฃผ์  ์๋ฃ๋ก, gradle 7๋ฒ์ ์ ๋ง๊ฒ ๋ฆฌํฉํ ๋งํ ๋ถ๋ถ์ด ์์ต๋๋ค
- ๋ชจ๋ ์์ฑํ์ค ๋, group๋ช์ ๊ผญ ์ฑ๊ฒจ์ฃผ์ธ์
  
    : group์ด root ํ๋ก์ ํธ์๋ง ๋์ด์๊ณ , ํ์ ๋ชจ๋์ group๋ช์ด ์์ด ์ค์ต์ ํด๋ดค๋๋ฐ, bean path๋ฅผ ์ ๋๋ก ๋ชป ์ฝ์ด์์ ์ค์ ์ด ์ ๋๋ก ๋์ด์์ด๋ ์ค์ต์ด ์๋๋ ๋ฌธ์ ๊ฐ ์์์ต๋๋ค