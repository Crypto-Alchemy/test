package p000;

import com.google.crypto.tink.shaded.protobuf.C4705c0;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;

/* renamed from: g75 */
/* compiled from: RawMessageInfo */
public final class g75 implements nu3 {

    /* renamed from: a */
    public final C4705c0 f29104a;

    /* renamed from: b */
    public final String f29105b;

    /* renamed from: c */
    public final Object[] f29106c;

    /* renamed from: d */
    public final int f29107d;

    public g75(C4705c0 c0Var, String str, Object[] objArr) {
        this.f29104a = c0Var;
        this.f29105b = str;
        this.f29106c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f29107d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f29107d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo41893a() {
        if ((this.f29107d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C4705c0 mo41894b() {
        return this.f29104a;
    }

    /* renamed from: c */
    public ProtoSyntax mo41895c() {
        if ((this.f29107d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public Object[] mo42839d() {
        return this.f29106c;
    }

    /* renamed from: e */
    public String mo42840e() {
        return this.f29105b;
    }
}
