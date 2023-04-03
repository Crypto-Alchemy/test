package kotlin.jvm.internal;

public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, y83 y83, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((df0) y83).mo41920k(), str, str2, (y83 instanceof q83) ^ true ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
