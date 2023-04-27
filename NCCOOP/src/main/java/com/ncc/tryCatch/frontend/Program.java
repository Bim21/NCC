package com.ncc.tryCatch.frontend;

import com.ncc.tryCatch.backend.Exercise;

public class Program {
    public static void main(String[] args) throws Exception {
        Exercise ex = new Exercise();
        ex.Question01();
        ex.Question02();
//        ex.Question03();
//        ex.Question04();
        ex.inputAge();
    }
}
