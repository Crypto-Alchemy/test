package p000;

import com.google.android.gms.internal.clearcut.C4052a;
import p000.e98;

/* renamed from: e98 */
public abstract class e98<MessageType extends C4052a<MessageType, BuilderType>, BuilderType extends e98<MessageType, BuilderType>> implements wj8 {
    /* renamed from: D0 */
    public final /* synthetic */ wj8 mo42170D0(tj8 tj8) {
        if (mo30766a().getClass().isInstance(tj8)) {
            return mo30776b((C4052a) tj8);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: b */
    public abstract BuilderType mo30776b(MessageType messagetype);
}
