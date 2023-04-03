package p000;

import com.google.android.gms.internal.vision.zzjk;

/* renamed from: v99 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class v99 {
    /* renamed from: a */
    public abstract int mo31215a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    public abstract int mo31216b(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final boolean mo48699c(byte[] bArr, int i, int i2) {
        if (mo31215a(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public abstract String mo31217d(byte[] bArr, int i, int i2) throws zzjk;
}
