package com2.Services;

import com2.Models.Result;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
    @Override
    public Object doUntil(long until, String action) {
        long result = 0;
        if (action.equals("sum")){
            result = findSum(until);
        }else if (action.equals("factor")){
            result = findFactor(until);
        }
        return new Result(result);
    }

    public long findSum(long until){
        long result = 0;
        for (int i = 0; i <= until; i++) {
            result += i;
        }
        return result;
    }

    public long findFactor(long until){
        long result = 1;
        for (int i = 1; i <= until ; i++) {
            result *= i;
        }
        return result;
    }


}
