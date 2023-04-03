package p000;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4982i0;
import com.google.protobuf.C5000m0;
import com.google.protobuf.C5003n0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;

/* renamed from: z37 */
/* compiled from: UnknownFieldSetLiteSchema */
public class z37 extends C5000m0<C5003n0, C5003n0> {
    /* renamed from: A */
    public C5003n0 mo37438g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: B */
    public int mo37439h(C5003n0 n0Var) {
        return n0Var.mo37454d();
    }

    /* renamed from: C */
    public int mo37440i(C5003n0 n0Var) {
        return n0Var.mo37455e();
    }

    /* renamed from: D */
    public C5003n0 mo37442k(C5003n0 n0Var, C5003n0 n0Var2) {
        if (n0Var2.equals(C5003n0.m39843c())) {
            return n0Var;
        }
        return C5003n0.m39846m(n0Var, n0Var2);
    }

    /* renamed from: E */
    public C5003n0 mo37445n() {
        return C5003n0.m39847n();
    }

    /* renamed from: F */
    public void mo37446o(Object obj, C5003n0 n0Var) {
        mo37447p(obj, n0Var);
    }

    /* renamed from: G */
    public void mo37447p(Object obj, C5003n0 n0Var) {
        ((GeneratedMessageLite) obj).unknownFields = n0Var;
    }

    /* renamed from: H */
    public C5003n0 mo37449r(C5003n0 n0Var) {
        n0Var.mo37457h();
        return n0Var;
    }

    /* renamed from: I */
    public void mo37450s(C5003n0 n0Var, Writer writer) throws IOException {
        n0Var.mo37465s(writer);
    }

    /* renamed from: J */
    public void mo37451t(C5003n0 n0Var, Writer writer) throws IOException {
        n0Var.mo37466u(writer);
    }

    /* renamed from: j */
    public void mo37441j(Object obj) {
        mo37438g(obj).mo37457h();
    }

    /* renamed from: q */
    public boolean mo37448q(C4982i0 i0Var) {
        return false;
    }

    /* renamed from: u */
    public void mo37432a(C5003n0 n0Var, int i, int i2) {
        n0Var.mo37464q(WireFormat.m39052c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo37433b(C5003n0 n0Var, int i, long j) {
        n0Var.mo37464q(WireFormat.m39052c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo37434c(C5003n0 n0Var, int i, C5003n0 n0Var2) {
        n0Var.mo37464q(WireFormat.m39052c(i, 3), n0Var2);
    }

    /* renamed from: x */
    public void mo37435d(C5003n0 n0Var, int i, ByteString byteString) {
        n0Var.mo37464q(WireFormat.m39052c(i, 2), byteString);
    }

    /* renamed from: y */
    public void mo37436e(C5003n0 n0Var, int i, long j) {
        n0Var.mo37464q(WireFormat.m39052c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public C5003n0 mo37437f(Object obj) {
        C5003n0 A = mo37438g(obj);
        if (A != C5003n0.m39843c()) {
            return A;
        }
        C5003n0 n = C5003n0.m39847n();
        mo37447p(obj, n);
        return n;
    }
}
