package com.example.test.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TimeMapperTests {
    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void getTimeTest(){
        String now = timeMapper.getTime();
        log.info("----------------------------");
        log.info("íėŽėę° : " + now);
        log.info("----------------------------");
    }

}

