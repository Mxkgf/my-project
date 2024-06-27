package io.github.mxkgf.controller.exception;

import io.github.mxkgf.entity.RestBean;
import jakarta.validation.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationController {

    private static final Logger log = LoggerFactory.getLogger(ValidationController.class);

    @ExceptionHandler(ValidationException.class)
    public RestBean<Void> validationException(ValidationException e) {
        log.warn("Resolve [{}: {}]", e.getClass().getSimpleName(), e.getMessage());
        return RestBean.failure(400, "请求参数有误");
    }

}
