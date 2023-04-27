package com.ncc.string;

public class StrBufferVsStrBuilder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for(int i = 0;i<100000;i++){
            sb.append("Hello");
        }
        System.out.println("Thoi gian noi chuoi cua StringBuffer: " +(System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for(int i = 0; i<100000;i++){
            sb2.append("Hello");
        }
        System.out.println("Thoi gian noi chuoi cua StringBuilder: " + (System.currentTimeMillis() - start) + "ms");
    }
}
