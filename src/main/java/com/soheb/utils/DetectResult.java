package com.soheb.utils;

public class DetectResult {
    private final boolean success;
    private final CharSequence problematicUnicode;
    private final int location;

    public boolean isSuccess() {
        return success;
    }

    public CharSequence getProblematicUnicode() {
        return problematicUnicode;
    }

    public int getLocation() {
        return location;
    }

    private DetectResult(boolean success, CharSequence problematicUnicode, int location) {
        this.success = success;
        this.problematicUnicode = problematicUnicode;
        this.location = location;
    }

    public static DetectResult success() {
        return new DetectResult(true, null, -1);
    }

    public static DetectResult failed(CharSequence problematic, int index) {
        return new DetectResult(false, problematic,  index);
    }
}
