package com.base.web.service;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/sample", description = "Sample Service")
@RestController
public class SampleService
{
    @ApiOperation(value = "Dummy operation")
    @RequestMapping("/dummy")
    public String getDummy()
    {
        return "Dummy";
    }

}
