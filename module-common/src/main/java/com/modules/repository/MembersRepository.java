package com.modules.repository;

import com.modules.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MembersRepository extends JpaRepository<Members, Long> {

}