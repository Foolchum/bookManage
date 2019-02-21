package com.bookManage.service.impl;

import com.bookManage.repository.AdminRepository;
import com.bookManage.repository.BookRepository;
import com.bookManage.repository.BorowRecordRepository;
import com.bookManage.repository.ReaderRepository;
import com.bookManage.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookService")
public class  BookServiceImpl implements BookService {

    @Resource
    private BookRepository bookRepository;
    @Resource
    private AdminRepository adminRepository;
    @Resource
    private BorowRecordRepository borrowRecordRepository;
    @Resource
    private ReaderRepository readerRepository;

}
