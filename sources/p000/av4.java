package p000;

import com.google.crypto.tink.shaded.protobuf.C4705c0;
import java.security.GeneralSecurityException;

/* renamed from: av4 */
/* compiled from: PrimitiveFactory */
public abstract class av4<PrimitiveT, KeyProtoT extends C4705c0> {

    /* renamed from: a */
    public final Class<PrimitiveT> f21054a;

    public av4(Class<PrimitiveT> cls) {
        this.f21054a = cls;
    }

    /* renamed from: a */
    public abstract PrimitiveT mo29370a(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* renamed from: b */
    public final Class<PrimitiveT> mo29371b() {
        return this.f21054a;
    }
}
