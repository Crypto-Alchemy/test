package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "T", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C7382x4fc4299 extends Lambda implements pc2<String> {
    public final /* synthetic */ Class<T> $annotationClass;
    public final /* synthetic */ Map<String, Object> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7382x4fc4299(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.$annotationClass = cls;
        this.$values = map;
    }

    public final String invoke() {
        Class<T> cls = this.$annotationClass;
        Map<String, Object> map = this.$values;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        CollectionsKt___CollectionsKt.m47336g0(map.entrySet(), sb, ", ", "(", ")", 0, (CharSequence) null, C7383xd18867f3.INSTANCE, 48, (Object) null);
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
