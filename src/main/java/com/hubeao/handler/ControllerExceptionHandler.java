package com.hubeao.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHander(HttpServletRequest request,Exception e){
        logger.error("Request URl :{}, Exception : {}",request.getRequestURL(),e);
        ModelAndView mv =new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("Exception",e);
        mv.setViewName("error/error");
        return mv;
    }
}
