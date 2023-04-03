package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4729i0;
import com.google.crypto.tink.shaded.protobuf.C4747m0;
import com.google.crypto.tink.shaded.protobuf.C4750n0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;

/* renamed from: a47 */
/* compiled from: UnknownFieldSetLiteSchema */
public class a47 extends C4747m0<C4750n0, C4750n0> {
    /* renamed from: A */
    public C4750n0 mo28857g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: B */
    public int mo28858h(C4750n0 n0Var) {
        return n0Var.mo35973d();
    }

    /* renamed from: C */
    public int mo28859i(C4750n0 n0Var) {
        return n0Var.mo35974e();
    }

    /* renamed from: D */
    public C4750n0 mo28861k(C4750n0 n0Var, C4750n0 n0Var2) {
        if (n0Var2.equals(C4750n0.m38246c())) {
            return n0Var;
        }
        return C4750n0.m38249i(n0Var, n0Var2);
    }

    /* renamed from: E */
    public C4750n0 mo28862n() {
        return C4750n0.m38250j();
    }

    /* renamed from: F */
    public void mo28863o(Object obj, C4750n0 n0Var) {
        mo28864p(obj, n0Var);
    }

    /* renamed from: G */
    public void mo28864p(Object obj, C4750n0 n0Var) {
        ((GeneratedMessageLite) obj).unknownFields = n0Var;
    }

    /* renamed from: H */
    public C4750n0 mo28866r(C4750n0 n0Var) {
        n0Var.mo35976h();
        return n0Var;
    }

    /* renamed from: I */
    public void mo28867s(C4750n0 n0Var, Writer writer) throws IOException {
        n0Var.mo35980o(writer);
    }

    /* renamed from: J */
    public void mo28868t(C4750n0 n0Var, Writer writer) throws IOException {
        n0Var.mo35981q(writer);
    }

    /* renamed from: j */
    public void mo28860j(Object obj) {
        mo28857g(obj).mo35976h();
    }

    /* renamed from: q */
    public boolean mo28865q(C4729i0 i0Var) {
        return false;
    }

    /* renamed from: u */
    public void mo28851a(C4750n0 n0Var, int i, int i2) {
        n0Var.mo35979m(WireFormat.m37461c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo28852b(C4750n0 n0Var, int i, long j) {
        n0Var.mo35979m(WireFormat.m37461c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo28853c(C4750n0 n0Var, int i, C4750n0 n0Var2) {
        n0Var.mo35979m(WireFormat.m37461c(i, 3), n0Var2);
    }

    /* renamed from: x */
    public void mo28854d(C4750n0 n0Var, int i, ByteString byteString) {
        n0Var.mo35979m(WireFormat.m37461c(i, 2), byteString);
    }

    /* renamed from: y */
    public void mo28855e(C4750n0 n0Var, int i, long j) {
        n0Var.mo35979m(WireFormat.m37461c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public C4750n0 mo28856f(Object obj) {
        C4750n0 A = mo28857g(obj);
        if (A != C4750n0.m38246c()) {
            return A;
        }
        C4750n0 j = C4750n0.m38250j();
        mo28864p(obj, j);
        return j;
    }
}
