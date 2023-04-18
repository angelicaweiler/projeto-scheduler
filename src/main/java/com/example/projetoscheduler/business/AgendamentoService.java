package com.example.projetoscheduler.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class AgendamentoService {

    @Scheduled(cron = "${spring.task.scheduling.cron}")
    @EventListener(ApplicationReadyEvent.class)
    public void agendaTarefas(){
        log.info("Agendado e executado em {}", LocalDateTime.now());
    }
}
