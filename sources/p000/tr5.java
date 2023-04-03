package p000;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* renamed from: tr5 */
/* compiled from: SecretBytes */
public final class tr5 {

    /* renamed from: a */
    public final e70 f34314a;

    public tr5(e70 e70) {
        this.f34314a = e70;
    }

    /* renamed from: a */
    public static tr5 m52421a(byte[] bArr, ur5 ur5) {
        if (ur5 != null) {
            return new tr5(e70.m43803a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* renamed from: b */
    public int mo48161b() {
        return this.f34314a.mo42138c();
    }
}
