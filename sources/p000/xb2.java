package p000;

import java.util.UUID;

/* renamed from: xb2 */
/* compiled from: FrameworkCryptoConfig */
public final class xb2 implements hw0 {

    /* renamed from: d */
    public static final boolean f19804d;

    /* renamed from: a */
    public final UUID f19805a;

    /* renamed from: b */
    public final byte[] f19806b;

    /* renamed from: c */
    public final boolean f19807c;

    static {
        boolean z;
        if ("Amazon".equals(w67.f19023c)) {
            String str = w67.f19024d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f19804d = z;
            }
        }
        z = false;
        f19804d = z;
    }

    public xb2(UUID uuid, byte[] bArr, boolean z) {
        this.f19805a = uuid;
        this.f19806b = bArr;
        this.f19807c = z;
    }
}
