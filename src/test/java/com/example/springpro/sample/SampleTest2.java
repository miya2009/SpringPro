package com.example.springpro.sample;

import com.example.springpro.config.AppConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)
//@SpringJUnitConfig(AppConfig.class)
@ContextConfiguration(locations = {"/test-context.xml","file:src/main/webapp/WEB-INF/root-context.xml"})

public class SampleTest2 {
    @Autowired(required = false)
    @Qualifier("sample1")
    private SampleDTO sampleDTO1;

    @Autowired(required = false)
    @Qualifier("sample2")
    private SampleDTO sampleDTO2;

    @Autowired(required = false)
    @Qualifier("myDto1")
    private SampleDTO sampleDTO3;
    @Autowired(required = false)
    @Qualifier("myDto2")
    private SampleDTO sampleDTO4;

    @Autowired
    private SampleService sampleService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void beanTest2(){
        log.info(sampleDTO1);
        log.info(sampleDTO2);
        log.info(sampleDTO3);
        log.info(sampleDTO4);
        log.info(sampleService);

    }
    @Test
    public void testConnection() throws Exception{
        Connection connection=dataSource.getConnection();
        log.info(dataSource);
        connection.close();
    }
}
