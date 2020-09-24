package com2.Services;

import com2.Models.ArrayInfo;
import org.springframework.stereotype.Service;

@Service
public interface MainService {
    public Object doUntil(long until, String action);
    public long processArray(ArrayInfo arrayInfo);
    public long[] doubleArray(ArrayInfo arrayInfo);
}
