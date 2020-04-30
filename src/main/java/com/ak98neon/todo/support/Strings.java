package com.ak98neon.todo.support;

import java.util.Arrays;

public final class Strings {
    private Strings() {
        throw new UnsupportedOperationException();
    }

    public static boolean isNotBlank(final String... strings) {
        return Arrays.stream(strings).noneMatch(str -> str == null || "".equals(str));
    }
}
