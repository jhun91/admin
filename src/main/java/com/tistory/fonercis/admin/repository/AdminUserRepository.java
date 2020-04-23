package com.tistory.fonercis.admin.repository;

import com.tistory.fonercis.admin.model.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
}
