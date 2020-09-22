package com2.Services;

import org.springframework.stereotype.Service;

@Service
public interface MainService {
    public Object doUntil(long until, String action);
}
