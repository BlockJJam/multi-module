package com.modules.member;

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
