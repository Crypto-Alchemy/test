package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lpl4;", "invoke", "(Ljava/lang/Object;)Lpl4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements rc2<Object, pl4> {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    public SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    public final pl4 invoke(Object obj) {
        go6 go6;
        rn6 rn6;
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        an6 an6 = obj2 != null ? (an6) obj2 : null;
        Object obj3 = list.get(1);
        gn6 gn6 = obj3 != null ? (gn6) obj3 : null;
        Object obj4 = list.get(2);
        kl5<go6, Object> r = SaversKt.m3241r(go6.f12519b);
        Boolean bool = Boolean.FALSE;
        if (!vx2.m53586b(obj4, bool) && obj4 != null) {
            go6 = r.mo3147b(obj4);
        } else {
            go6 = null;
        }
        vx2.m53588d(go6);
        long k = go6.mo20727k();
        Object obj5 = list.get(3);
        kl5<rn6, Object> p = SaversKt.m3239p(rn6.f17304c);
        if (!vx2.m53586b(obj5, bool) && obj5 != null) {
            rn6 = p.mo3147b(obj5);
        } else {
            rn6 = null;
        }
        return new pl4(an6, gn6, k, rn6, (DefaultConstructorMarker) null);
    }
}
