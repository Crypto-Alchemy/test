package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.p95;

/* renamed from: t95 */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class t95 extends p95 implements m03 {

    /* renamed from: c */
    public final Object[] f44695c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t95(r24 r24, Object[] objArr) {
        super(r24, (DefaultConstructorMarker) null);
        vx2.m53591g(objArr, "values");
        this.f44695c = objArr;
    }

    /* renamed from: c */
    public List<p95> mo56000c() {
        Object[] objArr = this.f44695c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            p95.C9173a aVar = p95.f44016b;
            vx2.m53588d(obj);
            arrayList.add(aVar.mo65260a(obj, (r24) null));
        }
        return arrayList;
    }
}
