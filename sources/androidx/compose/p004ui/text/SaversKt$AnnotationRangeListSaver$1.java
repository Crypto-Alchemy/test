package androidx.compose.p004ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.C3205rl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lll5;", "", "Lrl$a;", "", "it", "invoke", "(Lll5;Ljava/util/List;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1 */
/* compiled from: Savers.kt */
public final class SaversKt$AnnotationRangeListSaver$1 extends Lambda implements fd2<ll5, List<? extends C3205rl.C3206a<? extends Object>>, Object> {
    public static final SaversKt$AnnotationRangeListSaver$1 INSTANCE = new SaversKt$AnnotationRangeListSaver$1();

    public SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    public final Object invoke(ll5 ll5, List<? extends C3205rl.C3206a<? extends Object>> list) {
        vx2.m53591g(ll5, "$this$Saver");
        vx2.m53591g(list, "it");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.m3244u((C3205rl.C3206a) list.get(i), SaversKt.f2160c, ll5));
        }
        return arrayList;
    }
}
