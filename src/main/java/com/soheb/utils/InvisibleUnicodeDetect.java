package com.soheb.utils;

public class InvisibleUnicodeDetect {
    private final CharSequence[] MULTI_INVISIBLE_UNICODE_CHARS = {
            "\t", " ", "\u00AD", "͏", "\u061C", "ᅟ", "ᅠ", "឴", "឵", "\u180E", " ", " ", " ", " "," ", " ",
            " ", " ", " ", " ", " ", "\u200B", "\u200C", "\u200D", "\u200E", "\u200F", " "," ",
            "\u2060", "\u2061", "\u2062", "\u2063", "\u2064", "\u206A", "\u206B", "\u206C", "\u206D", "\u206E", "\u206F",
            "　","⠀","ㅤ","\ufeff","ﾠ", "𝅙","\uD834\uDD73","\uD834\uDD74","\uD834\uDD75","\uD834\uDD76","\uD834\uDD77",
            "\uD834\uDD78", "\uD834\uDD79","\uD834\uDD7A"
    };

    public DetectResult findInvisibleChar(String toFind) {
        for (CharSequence cs : MULTI_INVISIBLE_UNICODE_CHARS) {
            if (toFind.contains(cs)) {
                int index = toFind.indexOf(cs.toString());
                return DetectResult.failed(cs, index);
            }
        }
        return DetectResult.success();
    }
}
