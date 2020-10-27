package com.jjdev.multimodule;

import com.jjdev.multimodule.service.UserDbService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserDbService userDbService;

    @Test
    void contextLoads() {
        Assertions.assertThat(userDbService.getUsers()).isNotEmpty();
    }
}
