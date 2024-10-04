package com.example.springpro.sample;

import com.example.springpro.config.AppConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
public class SampleTest {
    @Test
    public void beanTest(){
        SampleDTO dto=new SampleDTO();
        String[] hobby={"수영", "자건거 타기"};
        dto.setName("홍길동");
        dto.setAge(20);
        dto.setHobby(hobby);
        log.info(dto);

        ApplicationContext context=new ClassPathXmlApplicationContext("/test-context.xml");
        SampleDTO dto1=(SampleDTO) context.getBean("sample1");
        log.info(dto1);
        SampleDTO dto2=(SampleDTO) context.getBean("sample2");
        log.info(dto2);

        ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
        SampleDTO dto3=(SampleDTO) context2.getBean("myDto1",SampleDTO.class);
        SampleDTO dto4=(SampleDTO) context2.getBean("myDto2", SampleDTO.class);
        log.info(dto3);
        log.info(dto4);
    }
}
