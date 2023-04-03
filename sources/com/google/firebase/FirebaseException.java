package com.google.firebase;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        cu4.m43218h(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        cu4.m43218h(str, "Detail message must not be empty");
    }
}
