package com.ncc.finalExample;

public final class Final {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println("sb before: " + sb);

        // Thay đổi giá trị của sb bằng phương thức append()
        sb.append(" World");
        System.out.println("sb after: " + sb);

        // Không thể gán một đối tượng StringBuilder khác cho sb
        // Lỗi biên dịch: "cannot assign a value to final variable sb"
        // sb = new StringBuilder("New StringBuilder");
    }
}
//final Intern intern = new Intern("name", "age")