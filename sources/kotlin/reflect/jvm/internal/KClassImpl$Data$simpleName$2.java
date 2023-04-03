package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "T", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$simpleName$2 extends Lambda implements pc2<String> {
    public final /* synthetic */ KClassImpl<T> this$0;
    public final /* synthetic */ KClassImpl<T>.Data this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$simpleName$2(KClassImpl<T> kClassImpl, KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = kClassImpl;
        this.this$1 = data;
    }

    public final String invoke() {
        if (this.this$0.mo41920k().isAnonymousClass()) {
            return null;
        }
        nf0 I = this.this$0.mo52989K();
        if (I.mo62682k()) {
            return this.this$1.mo53002f(this.this$0.mo41920k());
        }
        String d = I.mo62681j().mo65594d();
        vx2.m53590f(d, "classId.shortClassName.asString()");
        return d;
    }
}
