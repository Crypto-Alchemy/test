package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

@Metadata(mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$objectInstance$2 extends Lambda implements pc2<T> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$objectInstance$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final T invoke() {
        Field field;
        if0 m = this.this$0.mo53009m();
        if (m.getKind() != ClassKind.OBJECT) {
            return null;
        }
        if (!m.mo52345V() || vl0.m73288a(ul0.f45107a, m)) {
            field = this.this$1.mo41920k().getDeclaredField("INSTANCE");
        } else {
            field = this.this$1.mo41920k().getEnclosingClass().getDeclaredField(m.getName().mo65594d());
        }
        T t = field.get((Object) null);
        vx2.m53589e(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
        return t;
    }
}
