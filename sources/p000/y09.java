package p000;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: y09 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class y09 extends fk9 {

    /* renamed from: a */
    public final int f35748a;

    public y09(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43211a(z);
        this.f35748a = Arrays.hashCode(bArr);
    }

    /* renamed from: r1 */
    public static byte[] m54600r1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final ro2 mo45816b() {
        return gf4.m44716s1(mo47695s1());
    }

    public final boolean equals(Object obj) {
        ro2 b;
        if (obj != null && (obj instanceof mk9)) {
            try {
                mk9 mk9 = (mk9) obj;
                if (mk9.zzc() != this.f35748a || (b = mk9.mo45816b()) == null) {
                    return false;
                }
                return Arrays.equals(mo47695s1(), (byte[]) gf4.m44715r1(b));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35748a;
    }

    /* renamed from: s1 */
    public abstract byte[] mo47695s1();

    public final int zzc() {
        return this.f35748a;
    }
}
