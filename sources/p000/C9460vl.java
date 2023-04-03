package p000;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: vl */
/* compiled from: AnnotationDescriptor.kt */
public interface C9460vl {

    /* renamed from: vl$a */
    /* compiled from: AnnotationDescriptor.kt */
    public static final class C9461a {
        /* renamed from: a */
        public static u82 m73287a(C9460vl vlVar) {
            if0 e = DescriptorUtilsKt.m62444e(vlVar);
            if (e == null) {
                return null;
            }
            if (nr1.m70034m(e)) {
                e = null;
            }
            if (e != null) {
                return DescriptorUtilsKt.m62443d(e);
            }
            return null;
        }
    }

    /* renamed from: e */
    u82 mo53263e();

    /* renamed from: f */
    Map<r24, fq0<?>> mo53264f();

    a66 getSource();

    xc3 getType();
}
