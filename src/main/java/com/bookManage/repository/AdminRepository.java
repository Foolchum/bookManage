package com.bookManage.repository;

import com.bookManage.pojo.Admin;
import com.bookManage.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {
}
