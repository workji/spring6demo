package org.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;
import java.util.Map;

@RestController
@RequestMapping("/header")
public class HeaderTestController {

    @RequestMapping(value = "/data1")
    public String data1(@RequestHeader("Host") String header_host) {
        return header_host;
    }


    @RequestMapping(value = "/data2")
    public String data2(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("[Header] '%s' = %s", key, value));
        });
        return "ok";
    }

    @RequestMapping("/data3")
    public ResponseEntity<String> data3(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        String url = "https://" + host.getHostName() + ":" + host.getPort();
        return new ResponseEntity<String>(String.format("Base URL = %s", url), HttpStatus.OK);
    }
}
