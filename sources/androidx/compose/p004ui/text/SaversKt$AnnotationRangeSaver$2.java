package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p000.C3205rl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lrl$a;", "invoke", "(Ljava/lang/Object;)Lrl$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2 */
/* compiled from: Savers.kt */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements rc2<Object, C3205rl.C3206a<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2$a */
    /* compiled from: Savers.kt */
    public /* synthetic */ class C0456a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2178a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.Url.ordinal()] = 4;
            iArr[AnnotationType.String.ordinal()] = 5;
            f2178a = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    public final C3205rl.C3206a<? extends Object> invoke(Object obj) {
        vx2.m53591g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        vx2.m53588d(annotationType);
        Object obj4 = list.get(2);
        Integer num = obj4 != null ? (Integer) obj4 : null;
        vx2.m53588d(num);
        int intValue = num.intValue();
        Object obj5 = list.get(3);
        Integer num2 = obj5 != null ? (Integer) obj5 : null;
        vx2.m53588d(num2);
        int intValue2 = num2.intValue();
        Object obj6 = list.get(4);
        String str = obj6 != null ? (String) obj6 : null;
        vx2.m53588d(str);
        int i = C0456a.f2178a[annotationType.ordinal()];
        if (i == 1) {
            Object obj7 = list.get(1);
            kl5<pl4, Object> f = SaversKt.m3229f();
            if (!vx2.m53586b(obj7, Boolean.FALSE) && obj7 != null) {
                obj3 = f.mo3147b(obj7);
            }
            vx2.m53588d(obj3);
            return new C3205rl.C3206a<>(obj3, intValue, intValue2, str);
        } else if (i == 2) {
            Object obj8 = list.get(1);
            kl5<c66, Object> s = SaversKt.m3242s();
            if (!vx2.m53586b(obj8, Boolean.FALSE) && obj8 != null) {
                obj3 = s.mo3147b(obj8);
            }
            vx2.m53588d(obj3);
            return new C3205rl.C3206a<>(obj3, intValue, intValue2, str);
        } else if (i == 3) {
            Object obj9 = list.get(1);
            kl5 d = SaversKt.f2161d;
            if (!vx2.m53586b(obj9, Boolean.FALSE) && obj9 != null) {
                obj3 = (z87) d.mo3147b(obj9);
            }
            vx2.m53588d(obj3);
            return new C3205rl.C3206a<>(obj3, intValue, intValue2, str);
        } else if (i == 4) {
            Object obj10 = list.get(1);
            kl5 c = SaversKt.f2162e;
            if (!vx2.m53586b(obj10, Boolean.FALSE) && obj10 != null) {
                obj3 = (l57) c.mo3147b(obj10);
            }
            vx2.m53588d(obj3);
            return new C3205rl.C3206a<>(obj3, intValue, intValue2, str);
        } else if (i == 5) {
            Object obj11 = list.get(1);
            if (obj11 != null) {
                obj3 = (String) obj11;
            }
            vx2.m53588d(obj3);
            return new C3205rl.C3206a<>(obj3, intValue, intValue2, str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
