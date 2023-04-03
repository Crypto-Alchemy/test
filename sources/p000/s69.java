package p000;

import java.lang.ref.WeakReference;

/* renamed from: s69 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class s69 extends y09 {

    /* renamed from: c */
    public static final WeakReference f33757c = new WeakReference((Object) null);

    /* renamed from: b */
    public WeakReference f33758b = f33757c;

    public s69(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: s1 */
    public final byte[] mo47695s1() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f33758b.get();
            if (bArr == null) {
                bArr = mo29373t1();
                this.f33758b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: t1 */
    public abstract byte[] mo29373t1();
}
