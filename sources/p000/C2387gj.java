package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: gj */
/* compiled from: AndroidResourceSignature */
public final class C2387gj implements z93 {

    /* renamed from: b */
    public final int f12353b;

    /* renamed from: c */
    public final z93 f12354c;

    public C2387gj(int i, z93 z93) {
        this.f12353b = i;
        this.f12354c = z93;
    }

    /* renamed from: c */
    public static z93 m18085c(Context context) {
        return new C2387gj(context.getResources().getConfiguration().uiMode & 48, C3212rp.m26354c(context));
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        this.f12354c.mo18753b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f12353b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2387gj)) {
            return false;
        }
        C2387gj gjVar = (C2387gj) obj;
        if (this.f12353b != gjVar.f12353b || !this.f12354c.equals(gjVar.f12354c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return p67.m24687o(this.f12354c, this.f12353b);
    }
}
