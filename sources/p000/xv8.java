package p000;

import com.google.android.gms.internal.vision.C4095b0;
import com.google.android.gms.internal.vision.C4143y;
import com.google.android.gms.internal.vision.zzjk;
import p000.xv8;

/* renamed from: xv8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class xv8<MessageType extends C4143y<MessageType, BuilderType>, BuilderType extends xv8<MessageType, BuilderType>> implements t59 {
    /* renamed from: Q */
    public final /* synthetic */ t59 mo47993Q(k59 k59) {
        if (mo31174i().getClass().isInstance(k59)) {
            return mo31181b((C4143y) k59);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: b */
    public abstract BuilderType mo31181b(MessageType messagetype);

    /* renamed from: f */
    public abstract BuilderType mo31185f(byte[] bArr, int i, int i2, C4095b0 b0Var) throws zzjk;
}
