package com.modules.member;

import com.modules.domain.Members;
import com.modules.repository.MembersRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class MemberRepositoryTest {
    @Autowired
    private MembersRepository membersRepository;

    @Test
    public void add(){
        membersRepository.save(new Members("jjm","jaemin.joo@gmail.com"));
        Members saved = membersRepository.findById(1L).get();
        assertThat(saved.getName()).isEqualTo("jjm");
    }
}
