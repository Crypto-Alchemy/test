package p000;

import com.google.protobuf.C4956c0;
import com.google.protobuf.ProtoSyntax;

/* renamed from: f75 */
/* compiled from: RawMessageInfo */
public final class f75 implements mu3 {

    /* renamed from: a */
    public final C4956c0 f28774a;

    /* renamed from: b */
    public final String f28775b;

    /* renamed from: c */
    public final Object[] f28776c;

    /* renamed from: d */
    public final int f28777d;

    public f75(C4956c0 c0Var, String str, Object[] objArr) {
        this.f28774a = c0Var;
        this.f28775b = str;
        this.f28776c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f28777d = charAt;
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
                this.f28777d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo29934a() {
        if ((this.f28777d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C4956c0 mo29935b() {
        return this.f28774a;
    }

    /* renamed from: c */
    public ProtoSyntax mo29936c() {
        if ((this.f28777d & 1) == 1) {
            return ProtoSyntax.PROTO2;
        }
        return ProtoSyntax.PROTO3;
    }

    /* renamed from: d */
    public Object[] mo42531d() {
        return this.f28776c;
    }

    /* renamed from: e */
    public String mo42532e() {
        return this.f28775b;
    }
}
