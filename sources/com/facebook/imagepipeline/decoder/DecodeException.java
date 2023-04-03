package com.facebook.imagepipeline.decoder;

public class DecodeException extends RuntimeException {
    private final gp1 mEncodedImage;

    public DecodeException(String str, gp1 gp1) {
        super(str);
        this.mEncodedImage = gp1;
    }

    public gp1 getEncodedImage() {
        return this.mEncodedImage;
    }

    public DecodeException(String str, Throwable th, gp1 gp1) {
        super(str, th);
        this.mEncodedImage = gp1;
    }
}
