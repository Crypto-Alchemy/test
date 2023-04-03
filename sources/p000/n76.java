package p000;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Lm76$b;", "Lm76;", "driver", "", "oldVersion", "newVersion", "", "Lwe;", "callbacks", "Lr37;", "a", "(Lm76$b;Lm76;II[Lwe;)V", "runtime"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: n76 */
/* compiled from: SqlDriver.kt */
public final class n76 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
    /* renamed from: n76$a */
    /* compiled from: Comparisons.kt */
    public static final class C6275a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Integer.valueOf(((C6660we) t).mo49187a()), Integer.valueOf(((C6660we) t2).mo49187a()));
        }
    }

    /* renamed from: a */
    public static final void m48675a(m76.C6236b bVar, m76 m76, int i, int i2, C6660we... weVarArr) {
        vx2.m53591g(bVar, "<this>");
        vx2.m53591g(m76, "driver");
        vx2.m53591g(weVarArr, "callbacks");
        ArrayList arrayList = new ArrayList();
        int length = weVarArr.length;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            C6660we weVar = weVarArr[i3];
            int a = weVar.mo49187a();
            if (i > a || a >= i2) {
                z = false;
            }
            if (z) {
                arrayList.add(weVar);
            }
            i3++;
        }
        for (C6660we weVar2 : CollectionsKt___CollectionsKt.m47304D0(arrayList, new C6275a())) {
            bVar.mo30019b(m76, i, weVar2.mo49187a() + 1);
            weVar2.mo49188b().invoke(m76);
            i = weVar2.mo49187a() + 1;
        }
        if (i < i2) {
            bVar.mo30019b(m76, i, i2);
        }
    }
}
