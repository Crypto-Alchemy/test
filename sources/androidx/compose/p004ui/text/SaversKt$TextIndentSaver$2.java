package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p000.go6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lrn6;", "invoke", "(Ljava/lang/Object;)Lrn6;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$TextIndentSaver$2 extends Lambda implements rc2<Object, rn6> {
    public static final SaversKt$TextIndentSaver$2 INSTANCE = new SaversKt$TextIndentSaver$2();

    public SaversKt$TextIndentSaver$2() {
        super(1);
    }

    public final rn6 invoke(Object obj) {
        go6 go6;
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        go6.C2414a aVar = go6.f12519b;
        kl5<go6, Object> r = SaversKt.m3241r(aVar);
        Boolean bool = Boolean.FALSE;
        go6 go62 = null;
        if (!vx2.m53586b(obj2, bool) && obj2 != null) {
            go6 = r.mo3147b(obj2);
        } else {
            go6 = null;
        }
        vx2.m53588d(go6);
        long k = go6.mo20727k();
        Object obj3 = list.get(1);
        kl5<go6, Object> r2 = SaversKt.m3241r(aVar);
        if (!vx2.m53586b(obj3, bool) && obj3 != null) {
            go62 = r2.mo3147b(obj3);
        }
        vx2.m53588d(go62);
        return new rn6(k, go62.mo20727k(), (DefaultConstructorMarker) null);
    }
}
