package com.thoughtworks.reactiveatddworkshop.application;

import com.thoughtworks.reactiveatddworkshop.domain.Status;
import com.thoughtworks.reactiveatddworkshop.domain.StatusRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class StatusServiceShould {

    @Mock
    private StatusRepository statusRepository;

    @InjectMocks
    private StatusService statusService;

    @BeforeEach
    void setUp() {
        Status status = new Status();
        when(statusRepository.getStatus()).thenReturn(status);
    }

    @Test
    public void return_status() {
        Status status = statusService.getStatus();
        assertThat(status).isNotNull();
    }

}