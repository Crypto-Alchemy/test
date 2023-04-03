package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lnz5;", "invoke", "(Ljava/lang/Object;)Lnz5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$ShadowSaver$2 extends Lambda implements rc2<Object, nz5> {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    public SaversKt$ShadowSaver$2() {
        super(1);
    }

    public final nz5 invoke(Object obj) {
        uk0 uk0;
        tf4 tf4;
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        kl5<uk0, Object> h = SaversKt.m3231h(uk0.f18515b);
        Boolean bool = Boolean.FALSE;
        Float f = null;
        if (!vx2.m53586b(obj2, bool) && obj2 != null) {
            uk0 = h.mo3147b(obj2);
        } else {
            uk0 = null;
        }
        vx2.m53588d(uk0);
        long p = uk0.mo26819p();
        Object obj3 = list.get(1);
        kl5<tf4, Object> l = SaversKt.m3235l(tf4.f18145b);
        if (!vx2.m53586b(obj3, bool) && obj3 != null) {
            tf4 = l.mo3147b(obj3);
        } else {
            tf4 = null;
        }
        vx2.m53588d(tf4);
        long r = tf4.mo26442r();
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f = (Float) obj4;
        }
        vx2.m53588d(f);
        return new nz5(p, r, f.floatValue(), (DefaultConstructorMarker) null);
    }
}
