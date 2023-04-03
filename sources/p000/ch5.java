package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ch5 */
/* compiled from: RlpDecoder */
public class ch5 {
    public static int OFFSET_LONG_LIST = 247;
    public static int OFFSET_LONG_STRING = 183;
    public static int OFFSET_SHORT_LIST = 192;
    public static int OFFSET_SHORT_STRING = 128;

    private static int calcLength(int i, byte[] bArr, int i2) {
        byte b = (byte) (i - 1);
        long j = 0;
        for (int i3 = 1; i3 <= i; i3++) {
            j += ((long) (bArr[i2 + i3] & 255)) << (b * 8);
            b = (byte) (b - 1);
        }
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new RuntimeException("RLP too many bytes to decode");
    }

    public static eh5 decode(byte[] bArr) {
        eh5 eh5 = new eh5((List<gh5>) new ArrayList());
        traverse(bArr, 0, bArr.length, eh5);
        return eh5;
    }

    private static void traverse(byte[] bArr, int i, int i2, eh5 eh5) {
        byte b;
        int calcLength;
        int i3;
        int i4;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    if (i2 < 0 || i2 > bArr.length) {
                        throw new RuntimeException("RLP invalid parameters while decoding");
                    }
                    while (i < i2) {
                        byte b2 = bArr[i] & 255;
                        int i5 = OFFSET_SHORT_STRING;
                        if (b2 < i5) {
                            eh5.getValues().add(fh5.create(new byte[]{(byte) b2}));
                        } else if (b2 == i5) {
                            eh5.getValues().add(fh5.create(new byte[0]));
                        } else {
                            if (b2 > i5) {
                                if (b2 <= OFFSET_LONG_STRING) {
                                    i3 = (byte) (b2 - i5);
                                    int i6 = i + 1;
                                    if (i3 <= i2 - i6) {
                                        byte[] bArr2 = new byte[i3];
                                        System.arraycopy(bArr, i6, bArr2, 0, i3);
                                        eh5.getValues().add(fh5.create(bArr2));
                                        i4 = i3 + 1;
                                        i += i4;
                                    } else {
                                        throw new RuntimeException("RLP length mismatch");
                                    }
                                }
                            }
                            int i7 = OFFSET_LONG_STRING;
                            if (b2 <= i7 || b2 >= OFFSET_SHORT_LIST) {
                                int i8 = OFFSET_SHORT_LIST;
                                if (b2 < i8 || b2 > OFFSET_LONG_LIST) {
                                    int i9 = OFFSET_LONG_LIST;
                                    if (b2 > i9) {
                                        b = (byte) (b2 - i9);
                                        calcLength = calcLength(b, bArr, i);
                                        eh5 eh52 = new eh5((List<gh5>) new ArrayList());
                                        int i10 = i + b;
                                        traverse(bArr, i10 + 1, i10 + calcLength + 1, eh52);
                                        eh5.getValues().add(eh52);
                                    }
                                } else {
                                    i3 = (byte) (b2 - i8);
                                    eh5 eh53 = new eh5((List<gh5>) new ArrayList());
                                    traverse(bArr, i + 1, i + i3 + 1, eh53);
                                    eh5.getValues().add(eh53);
                                    i4 = i3 + 1;
                                    i += i4;
                                }
                            } else {
                                b = (byte) (b2 - i7);
                                calcLength = calcLength(b, bArr, i);
                                int i11 = i + b + 1;
                                if (calcLength <= i2 - i11) {
                                    byte[] bArr3 = new byte[calcLength];
                                    System.arraycopy(bArr, i11, bArr3, 0, calcLength);
                                    eh5.getValues().add(fh5.create(bArr3));
                                } else {
                                    throw new RuntimeException("RLP length mismatch");
                                }
                            }
                            i4 = b + calcLength + 1;
                            i += i4;
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("RLP wrong encoding", e);
            }
        }
    }
}
