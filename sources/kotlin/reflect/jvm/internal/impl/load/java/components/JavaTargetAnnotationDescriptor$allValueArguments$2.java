package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements pc2<Map<r24, ? extends fq0<? extends Object>>> {
    public final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.this$0 = javaTargetAnnotationDescriptor;
    }

    public final Map<r24, fq0<Object>> invoke() {
        fq0<?> fq0;
        i03 a = this.this$0.mo53477a();
        Map<K, V> map = null;
        if (a instanceof m03) {
            fq0 = JavaAnnotationTargetMapper.f39435a.mo53482c(((m03) this.this$0.mo53477a()).mo56000c());
        } else {
            fq0 = a instanceof e13 ? JavaAnnotationTargetMapper.f39435a.mo53482c(bk0.m32598e(this.this$0.mo53477a())) : null;
        }
        if (fq0 != null) {
            map = ao3.m31894f(wy6.m54142a(k03.f38828a.mo52839d(), fq0));
        }
        return map == null ? C6177b.m47361i() : map;
    }
}
