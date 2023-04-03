package p000;

import com.google.firebase.encoders.EncodingException;

/* renamed from: t58 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class t58 implements ye4 {

    /* renamed from: a */
    public static final ye4 f34116a = new t58();

    /* renamed from: a */
    public final void mo29899a(Object obj, Object obj2) {
        String str;
        ze4 ze4 = (ze4) obj2;
        ye4<Object> ye4 = c68.f21610d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
