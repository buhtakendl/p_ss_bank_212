package com.bank.transfer.aspect;


import com.bank.transfer.repository.AuditRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AuditAscpect {

    private final AuditRepository auditRepository;
    private final ObjectMapper objectMapper;

    public AuditAscpect(AuditRepository auditRepository, ObjectMapper objectMapper) {
        this.auditRepository = auditRepository;
        this.objectMapper = objectMapper;
    }

}
