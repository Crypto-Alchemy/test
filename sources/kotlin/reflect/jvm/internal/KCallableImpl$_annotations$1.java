package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_annotations$1 extends Lambda implements pc2<List<? extends Annotation>> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_annotations$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final List<Annotation> invoke() {
        return y67.m74275e(this.this$0.mo52984x());
    }
}
