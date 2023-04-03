package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: r68 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class r68 implements k87 {

    /* renamed from: a */
    public boolean f33322a = false;

    /* renamed from: b */
    public boolean f33323b = false;

    /* renamed from: c */
    public f02 f33324c;

    /* renamed from: d */
    public final m58 f33325d;

    public r68(m58 m58) {
        this.f33325d = m58;
    }

    /* renamed from: a */
    public final void mo47341a(f02 f02, boolean z) {
        this.f33322a = false;
        this.f33324c = f02;
        this.f33323b = z;
    }

    /* renamed from: b */
    public final k87 mo44700b(String str) throws IOException {
        mo47342d();
        this.f33325d.mo45626b(this.f33324c, str, this.f33323b);
        return this;
    }

    /* renamed from: c */
    public final k87 mo44701c(boolean z) throws IOException {
        mo47342d();
        this.f33325d.mo45632h(this.f33324c, z ? 1 : 0, this.f33323b);
        return this;
    }

    /* renamed from: d */
    public final void mo47342d() {
        if (!this.f33322a) {
            this.f33322a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
