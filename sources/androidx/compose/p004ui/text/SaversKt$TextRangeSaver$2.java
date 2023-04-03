package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lao6;", "invoke-VqIyPBM", "(Ljava/lang/Object;)Lao6;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$TextRangeSaver$2 extends Lambda implements rc2<Object, ao6> {
    public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();

    public SaversKt$TextRangeSaver$2() {
        super(1);
    }

    /* renamed from: invoke-VqIyPBM  reason: not valid java name */
    public final ao6 invoke(Object obj) {
        Integer num;
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        vx2.m53588d(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        vx2.m53588d(num2);
        return ao6.m10675b(bo6.m11528b(intValue, num2.intValue()));
    }
}
