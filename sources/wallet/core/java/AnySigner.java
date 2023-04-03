package wallet.core.java;

import com.google.protobuf.C4956c0;
import wallet.core.jni.CoinType;

public class AnySigner {
    public static native byte[] nativePlan(byte[] bArr, int i);

    public static native byte[] nativeSign(byte[] bArr, int i);

    public static <T extends C4956c0> T plan(C4956c0 c0Var, CoinType coinType, im4<T> im4) throws Exception {
        return (C4956c0) im4.mo37069a(nativePlan(c0Var.toByteArray(), coinType.value()));
    }

    public static <T extends C4956c0> T sign(C4956c0 c0Var, CoinType coinType, im4<T> im4) throws Exception {
        return (C4956c0) im4.mo37069a(nativeSign(c0Var.toByteArray(), coinType.value()));
    }

    public static native String signJSON(String str, byte[] bArr, int i);

    public static native boolean supportsJSON(int i);
}
