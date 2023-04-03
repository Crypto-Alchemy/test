package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: bm */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C6868bm extends AbstractAnnotationTypeQualifierResolver<C9460vl> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6868bm(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        vx2.m53591g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    /* renamed from: u */
    public Iterable<String> mo50644b(C9460vl vlVar, boolean z) {
        List<String> list;
        vx2.m53591g(vlVar, "<this>");
        Map<r24, fq0<?>> f = vlVar.mo53264f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : f.entrySet()) {
            r24 r24 = (r24) next.getKey();
            fq0 fq0 = (fq0) next.getValue();
            if (!z || vx2.m53586b(r24, t73.f44655c)) {
                list = mo50652y(fq0);
            } else {
                list = ck0.m33062j();
            }
            hk0.m45275z(arrayList, list);
        }
        return arrayList;
    }

    /* renamed from: v */
    public u82 mo50645i(C9460vl vlVar) {
        vx2.m53591g(vlVar, "<this>");
        return vlVar.mo53263e();
    }

    /* renamed from: w */
    public Object mo50646j(C9460vl vlVar) {
        vx2.m53591g(vlVar, "<this>");
        if0 e = DescriptorUtilsKt.m62444e(vlVar);
        vx2.m53588d(e);
        return e;
    }

    /* renamed from: x */
    public Iterable<C9460vl> mo50647k(C9460vl vlVar) {
        C6983dm annotations;
        vx2.m53591g(vlVar, "<this>");
        if0 e = DescriptorUtilsKt.m62444e(vlVar);
        if (e == null || (annotations = e.getAnnotations()) == null) {
            return ck0.m33062j();
        }
        return annotations;
    }

    /* renamed from: y */
    public final List<String> mo50652y(fq0<?> fq0) {
        if (fq0 instanceof C9313sq) {
            ArrayList arrayList = new ArrayList();
            for (fq0 y : (Iterable) ((C9313sq) fq0).mo51739b()) {
                hk0.m45275z(arrayList, mo50652y(y));
            }
            return arrayList;
        } else if (fq0 instanceof zq1) {
            return bk0.m32598e(((zq1) fq0).mo67381c().mo65597f());
        } else {
            return ck0.m33062j();
        }
    }
}
