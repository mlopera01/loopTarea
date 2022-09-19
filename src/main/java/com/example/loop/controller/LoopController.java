package com.example.loop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loop.service.LoopService;

@RestController
@RequestMapping( "/loop" )
public class LoopController {
    private final LoopService loopService;

    public LoopController(@Autowired LoopService x) {
        this.loopService = x;
    }

    @PostMapping
    public ResponseEntity<List<List<String>>> solucion(@RequestBody LoopRequest loopRequest) {
        return ResponseEntity.ok(loopService.solucion(loopRequest));
    }
}

