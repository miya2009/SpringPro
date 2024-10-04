package com.example.springpro.config;

import com.example.springpro.sample.SampleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SampleDTO myDto1(){
        String[] hobbys={"잠자기, 여행"};
        return new SampleDTO("박경미",30,hobbys);
    }
    @Bean
    public SampleDTO myDto2(){
        String[] hobbys={"낚시", "여행"};
        return new SampleDTO("윤요섭",30,hobbys);
    }
}
