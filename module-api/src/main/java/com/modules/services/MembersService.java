package com.modules.services;

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

