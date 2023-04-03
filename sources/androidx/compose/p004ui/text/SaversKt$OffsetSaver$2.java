package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Ltf4;", "invoke-x-9fifI", "(Ljava/lang/Object;)Ltf4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$OffsetSaver$2 extends Lambda implements rc2<Object, tf4> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    /* renamed from: invoke-x-9fifI  reason: not valid java name */
    public final tf4 invoke(Object obj) {
        Float f;
        vx2.m53591g(obj, "it");
        if (vx2.m53586b(obj, Boolean.FALSE)) {
            return tf4.m27727d(tf4.f18145b.mo26445b());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        vx2.m53588d(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        vx2.m53588d(f2);
        return tf4.m27727d(wf4.m29550a(floatValue, f2.floatValue()));
    }
}
