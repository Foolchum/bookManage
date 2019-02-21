package com.bookManage.repository;

import com.bookManage.pojo.Book;
import com.bookManage.pojo.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorowRecordRepository extends JpaRepository<BorrowRecord,Integer> {
}
