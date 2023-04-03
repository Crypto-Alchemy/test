package androidx.compose.p004ui.text;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p000.C3205rl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lll5;", "Lrl$a;", "", "it", "invoke", "(Lll5;Lrl$a;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1 */
/* compiled from: Savers.kt */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements fd2<ll5, C3205rl.C3206a<? extends Object>, Object> {
    public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1();

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1$a */
    /* compiled from: Savers.kt */
    public /* synthetic */ class C0455a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2177a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.Url.ordinal()] = 4;
            iArr[AnnotationType.String.ordinal()] = 5;
            f2177a = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    public final Object invoke(ll5 ll5, C3205rl.C3206a<? extends Object> aVar) {
        AnnotationType annotationType;
        Object obj;
        vx2.m53591g(ll5, "$this$Saver");
        vx2.m53591g(aVar, "it");
        Object e = aVar.mo25444e();
        if (e instanceof pl4) {
            annotationType = AnnotationType.Paragraph;
        } else if (e instanceof c66) {
            annotationType = AnnotationType.Span;
        } else if (e instanceof z87) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (e instanceof l57) {
            annotationType = AnnotationType.Url;
        } else {
            annotationType = AnnotationType.String;
        }
        int i = C0455a.f2177a[annotationType.ordinal()];
        if (i == 1) {
            Object e2 = aVar.mo25444e();
            vx2.m53589e(e2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            obj = SaversKt.m3244u((pl4) e2, SaversKt.m3229f(), ll5);
        } else if (i == 2) {
            Object e3 = aVar.mo25444e();
            vx2.m53589e(e3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            obj = SaversKt.m3244u((c66) e3, SaversKt.m3242s(), ll5);
        } else if (i == 3) {
            Object e4 = aVar.mo25444e();
            vx2.m53589e(e4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            obj = SaversKt.m3244u((z87) e4, SaversKt.f2161d, ll5);
        } else if (i == 4) {
            Object e5 = aVar.mo25444e();
            vx2.m53589e(e5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            obj = SaversKt.m3244u((l57) e5, SaversKt.f2162e, ll5);
        } else if (i == 5) {
            obj = SaversKt.m3243t(aVar.mo25444e());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ck0.m33058f(SaversKt.m3243t(annotationType), obj, SaversKt.m3243t(Integer.valueOf(aVar.mo25446f())), SaversKt.m3243t(Integer.valueOf(aVar.mo25443d())), SaversKt.m3243t(aVar.mo25447g()));
    }
}
