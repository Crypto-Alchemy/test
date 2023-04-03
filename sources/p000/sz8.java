package p000;

import com.google.android.gms.internal.measurement.C4085b;
import com.google.android.gms.internal.measurement.zzkn;
import p000.sz8;

/* renamed from: sz8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class sz8<MessageType extends C4085b<MessageType, BuilderType>, BuilderType extends sz8<MessageType, BuilderType>> implements p79 {
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ p79 mo46662A(byte[] bArr) throws zzkn {
        return mo47952i(bArr, 0, bArr.length);
    }

    /* renamed from: E0 */
    public final /* bridge */ /* synthetic */ p79 mo46663E0(byte[] bArr, t29 t29) throws zzkn {
        return mo47953j(bArr, 0, bArr.length, t29);
    }

    /* renamed from: W */
    public final /* bridge */ /* synthetic */ p79 mo46664W(r79 r79) {
        if (mo47631f().getClass().isInstance(r79)) {
            return mo47954l((C4085b) r79);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: i */
    public abstract BuilderType mo47952i(byte[] bArr, int i, int i2) throws zzkn;

    /* renamed from: j */
    public abstract BuilderType mo47953j(byte[] bArr, int i, int i2, t29 t29) throws zzkn;

    /* renamed from: l */
    public abstract BuilderType mo47954l(MessageType messagetype);
}
