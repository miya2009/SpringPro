package com.example.springpro.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
//@RequiredArgsConstructor
public class SampleService {
    @Autowired
    //@Qualifier("normal")
    private ISampleDAO isampleDAO;
}
