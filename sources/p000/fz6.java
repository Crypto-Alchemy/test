package p000;

/* renamed from: fz6 */
/* compiled from: Type */
public interface fz6<T> {
    public static final int MAX_BIT_LENGTH = 256;
    public static final int MAX_BYTE_LENGTH = 32;

    int bytes32PaddedLength();

    String getTypeAsString();

    T getValue();
}
