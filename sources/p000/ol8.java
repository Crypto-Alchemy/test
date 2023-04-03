package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: ol8 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public abstract class ol8 {

    /* renamed from: a */
    public static final j68 f32399a;

    static {
        c68 c68 = new c68();
        kh8.f30880a.mo30128a(c68);
        f32399a = c68.mo29880b();
    }

    /* renamed from: a */
    public static byte[] m49354a(Object obj) {
        j68 j68 = f32399a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            j68.mo44058a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public abstract uu3 mo46426b();
}
