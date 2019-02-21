package com.bookManage.repository;

import com.bookManage.pojo.Book;
import com.bookManage.pojo.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader,String> {
        }
