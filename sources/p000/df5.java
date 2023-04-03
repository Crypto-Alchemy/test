package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: df5 */
/* compiled from: ResourceCacheKey */
public final class df5 implements z93 {

    /* renamed from: j */
    public static final dm3<Class<?>, byte[]> f10695j = new dm3<>(50);

    /* renamed from: b */
    public final C2982oq f10696b;

    /* renamed from: c */
    public final z93 f10697c;

    /* renamed from: d */
    public final z93 f10698d;

    /* renamed from: e */
    public final int f10699e;

    /* renamed from: f */
    public final int f10700f;

    /* renamed from: g */
    public final Class<?> f10701g;

    /* renamed from: h */
    public final xi4 f10702h;

    /* renamed from: i */
    public final mw6<?> f10703i;

    public df5(C2982oq oqVar, z93 z93, z93 z932, int i, int i2, mw6<?> mw6, Class<?> cls, xi4 xi4) {
        this.f10696b = oqVar;
        this.f10697c = z93;
        this.f10698d = z932;
        this.f10699e = i;
        this.f10700f = i2;
        this.f10703i = mw6;
        this.f10701g = cls;
        this.f10702h = xi4;
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f10696b.mo24042d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f10699e).putInt(this.f10700f).array();
        this.f10698d.mo18753b(messageDigest);
        this.f10697c.mo18753b(messageDigest);
        messageDigest.update(bArr);
        mw6<?> mw6 = this.f10703i;
        if (mw6 != null) {
            mw6.mo18753b(messageDigest);
        }
        this.f10702h.mo18753b(messageDigest);
        messageDigest.update(mo18757c());
        this.f10696b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] mo18757c() {
        dm3<Class<?>, byte[]> dm3 = f10695j;
        byte[] g = dm3.mo18844g(this.f10701g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f10701g.getName().getBytes(z93.f20511a);
        dm3.mo18848k(this.f10701g, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof df5)) {
            return false;
        }
        df5 df5 = (df5) obj;
        if (this.f10700f != df5.f10700f || this.f10699e != df5.f10699e || !p67.m24676d(this.f10703i, df5.f10703i) || !this.f10701g.equals(df5.f10701g) || !this.f10697c.equals(df5.f10697c) || !this.f10698d.equals(df5.f10698d) || !this.f10702h.equals(df5.f10702h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f10697c.hashCode() * 31) + this.f10698d.hashCode()) * 31) + this.f10699e) * 31) + this.f10700f;
        mw6<?> mw6 = this.f10703i;
        if (mw6 != null) {
            hashCode = (hashCode * 31) + mw6.hashCode();
        }
        return (((hashCode * 31) + this.f10701g.hashCode()) * 31) + this.f10702h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f10697c + ", signature=" + this.f10698d + ", width=" + this.f10699e + ", height=" + this.f10700f + ", decodedResourceClass=" + this.f10701g + ", transformation='" + this.f10703i + '\'' + ", options=" + this.f10702h + '}';
    }
}
