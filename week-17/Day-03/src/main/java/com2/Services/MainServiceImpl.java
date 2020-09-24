package com2.Services;

import com2.Models.ArrayInfo;
import com2.Models.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public long processArray(ArrayInfo arrayInfo) {
        String funct = arrayInfo.getWhat();
        long[] nums = arrayInfo.getNumbers();
        long result = 0;
        if (funct.equals("sum")){
            for (long n :
                    nums) {
                result += n;
            }
        }else if(funct.equals("multiply")){
            result = 1;
            for (long n :
                    nums) {
                result *= n;
            }
        }
        return result;
    }

    @Override
    public long[] doubleArray(ArrayInfo arrayInfo) {
        long[] newnums = new long[arrayInfo.getNumbers().length];
        long[] oldnums = arrayInfo.getNumbers();
        for (int i = 0; i < arrayInfo.getNumbers().length; i++) {
            newnums[i] = oldnums[i] * 2;
        }
        return newnums;
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
