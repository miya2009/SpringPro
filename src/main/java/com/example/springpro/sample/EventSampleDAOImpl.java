package com.example.springpro.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("normal")
public class EventSampleDAOImpl implements ISampleDAO{
}
