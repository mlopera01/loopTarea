package com.example.loop.controller;

import java.util.List;

public class LoopRequest {
    private List<String> casos;

    public LoopRequest() {
    }

    public LoopRequest(List<String> casos) {
        this.casos = casos;
    }

    public List<String> getCasos() {
        return casos;
    }

    public void setCasos(List<String> casos) {
        this.casos = casos;
    }
}
