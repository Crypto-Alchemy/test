package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: n4 */
public abstract class C7926n4 implements C6843b4, cp1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6843b4)) {
            return false;
        }
        return mo50158n().mo65963B(((C6843b4) obj).mo50158n());
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo50158n().mo65964u(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return mo50158n().hashCode();
    }

    /* renamed from: n */
    public abstract C9326t4 mo50158n();

    /* renamed from: q */
    public byte[] mo56353q(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo50158n().mo65965w(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
