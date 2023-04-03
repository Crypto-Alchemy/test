package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "T", "", "Lz83;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$constructors$2 extends Lambda implements pc2<List<? extends z83<? extends T>>> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final List<z83<T>> invoke() {
        Collection<C7424b> w = this.this$0.mo52999w();
        KClassImpl<T> kClassImpl = this.this$0;
        ArrayList arrayList = new ArrayList(dk0.m43495u(w, 10));
        for (C7424b kFunctionImpl : w) {
            arrayList.add(new KFunctionImpl(kClassImpl, kFunctionImpl));
        }
        return arrayList;
    }
}
