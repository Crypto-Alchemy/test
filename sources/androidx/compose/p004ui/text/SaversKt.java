package androidx.compose.p004ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.Metadata;
import p000.C3205rl;
import p000.C3313sz;
import p000.ao6;
import p000.fn6;
import p000.go6;
import p000.nz5;
import p000.qj3;
import p000.qn6;
import p000.r72;
import p000.rn6;
import p000.sj3;
import p000.tf4;
import p000.uk0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\"&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\".\u0010\u0016\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00140\u0013\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\".\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0018\u0010\u0019\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u001f\u0010\u0019\"&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b\"\u0010\u0011\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000f\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000f\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000f\" \u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000f\"#\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u0010\u000f\"#\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u0010\u000f\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000f\"#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u0010\u000f\")\u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010\u000f\u0012\u0004\bB\u0010\u0019\"#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bE\u0010\u000f\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010\u000f\" \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000f\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0000*\u00020L8@X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010M\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010P\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u0000*\u00020Q8@X\u0004¢\u0006\u0006\u001a\u0004\bA\u0010R\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@X\u0004¢\u0006\u0006\u001a\u0004\b,\u0010T\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0000*\u00020U8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010V\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020W8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bE\u0010X\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u0000*\u00020Y8@X\u0004¢\u0006\u0006\u001a\u0004\b8\u0010Z\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b)\u0010\\\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020]8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bH\u0010^\"'\u0010N\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u0010`\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010b\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0004¢\u0006\u0006\u001a\u0004\b/\u0010d\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, mo44877d2 = {"Lkl5;", "T", "Original", "Saveable", "value", "saver", "Lll5;", "scope", "", "u", "(Ljava/lang/Object;Lkl5;Lll5;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lrl;", "a", "Lkl5;", "e", "()Lkl5;", "AnnotatedStringSaver", "", "Lrl$a;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Lz87;", "d", "VerbatimTtsAnnotationSaver", "Ll57;", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Lpl4;", "f", "ParagraphStyleSaver", "Lc66;", "g", "s", "SpanStyleSaver", "Lfn6;", "h", "TextDecorationSaver", "Lqn6;", "i", "TextGeometricTransformSaver", "Lrn6;", "j", "TextIndentSaver", "Lr72;", "k", "FontWeightSaver", "Lsz;", "l", "BaselineShiftSaver", "Lao6;", "m", "TextRangeSaver", "Lnz5;", "n", "ShadowSaver", "Luk0;", "o", "ColorSaver", "Lgo6;", "p", "getTextUnitSaver$annotations", "TextUnitSaver", "Ltf4;", "q", "OffsetSaver", "Lsj3;", "r", "LocaleListSaver", "Lqj3;", "LocaleSaver", "Lfn6$a;", "(Lfn6$a;)Lkl5;", "Saver", "Lqn6$a;", "(Lqn6$a;)Lkl5;", "Lrn6$a;", "(Lrn6$a;)Lkl5;", "Lr72$a;", "(Lr72$a;)Lkl5;", "Lsz$a;", "(Lsz$a;)Lkl5;", "Lao6$a;", "(Lao6$a;)Lkl5;", "Lnz5$a;", "(Lnz5$a;)Lkl5;", "Luk0$a;", "(Luk0$a;)Lkl5;", "Lgo6$a;", "(Lgo6$a;)Lkl5;", "Ltf4$a;", "(Ltf4$a;)Lkl5;", "Lsj3$a;", "(Lsj3$a;)Lkl5;", "Lqj3$a;", "(Lqj3$a;)Lkl5;", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.SaversKt */
/* compiled from: Savers.kt */
public final class SaversKt {

    /* renamed from: a */
    public static final kl5<C3205rl, Object> f2158a = SaverKt.m2180a(SaversKt$AnnotatedStringSaver$1.INSTANCE, SaversKt$AnnotatedStringSaver$2.INSTANCE);

    /* renamed from: b */
    public static final kl5<List<C3205rl.C3206a<? extends Object>>, Object> f2159b = SaverKt.m2180a(SaversKt$AnnotationRangeListSaver$1.INSTANCE, SaversKt$AnnotationRangeListSaver$2.INSTANCE);

    /* renamed from: c */
    public static final kl5<C3205rl.C3206a<? extends Object>, Object> f2160c = SaverKt.m2180a(SaversKt$AnnotationRangeSaver$1.INSTANCE, SaversKt$AnnotationRangeSaver$2.INSTANCE);

    /* renamed from: d */
    public static final kl5<z87, Object> f2161d = SaverKt.m2180a(SaversKt$VerbatimTtsAnnotationSaver$1.INSTANCE, SaversKt$VerbatimTtsAnnotationSaver$2.INSTANCE);

    /* renamed from: e */
    public static final kl5<l57, Object> f2162e = SaverKt.m2180a(SaversKt$UrlAnnotationSaver$1.INSTANCE, SaversKt$UrlAnnotationSaver$2.INSTANCE);

    /* renamed from: f */
    public static final kl5<pl4, Object> f2163f = SaverKt.m2180a(SaversKt$ParagraphStyleSaver$1.INSTANCE, SaversKt$ParagraphStyleSaver$2.INSTANCE);

    /* renamed from: g */
    public static final kl5<c66, Object> f2164g = SaverKt.m2180a(SaversKt$SpanStyleSaver$1.INSTANCE, SaversKt$SpanStyleSaver$2.INSTANCE);

    /* renamed from: h */
    public static final kl5<fn6, Object> f2165h = SaverKt.m2180a(SaversKt$TextDecorationSaver$1.INSTANCE, SaversKt$TextDecorationSaver$2.INSTANCE);

    /* renamed from: i */
    public static final kl5<qn6, Object> f2166i = SaverKt.m2180a(SaversKt$TextGeometricTransformSaver$1.INSTANCE, SaversKt$TextGeometricTransformSaver$2.INSTANCE);

    /* renamed from: j */
    public static final kl5<rn6, Object> f2167j = SaverKt.m2180a(SaversKt$TextIndentSaver$1.INSTANCE, SaversKt$TextIndentSaver$2.INSTANCE);

    /* renamed from: k */
    public static final kl5<r72, Object> f2168k = SaverKt.m2180a(SaversKt$FontWeightSaver$1.INSTANCE, SaversKt$FontWeightSaver$2.INSTANCE);

    /* renamed from: l */
    public static final kl5<C3313sz, Object> f2169l = SaverKt.m2180a(SaversKt$BaselineShiftSaver$1.INSTANCE, SaversKt$BaselineShiftSaver$2.INSTANCE);

    /* renamed from: m */
    public static final kl5<ao6, Object> f2170m = SaverKt.m2180a(SaversKt$TextRangeSaver$1.INSTANCE, SaversKt$TextRangeSaver$2.INSTANCE);

    /* renamed from: n */
    public static final kl5<nz5, Object> f2171n = SaverKt.m2180a(SaversKt$ShadowSaver$1.INSTANCE, SaversKt$ShadowSaver$2.INSTANCE);

    /* renamed from: o */
    public static final kl5<uk0, Object> f2172o = SaverKt.m2180a(SaversKt$ColorSaver$1.INSTANCE, SaversKt$ColorSaver$2.INSTANCE);

    /* renamed from: p */
    public static final kl5<go6, Object> f2173p = SaverKt.m2180a(SaversKt$TextUnitSaver$1.INSTANCE, SaversKt$TextUnitSaver$2.INSTANCE);

    /* renamed from: q */
    public static final kl5<tf4, Object> f2174q = SaverKt.m2180a(SaversKt$OffsetSaver$1.INSTANCE, SaversKt$OffsetSaver$2.INSTANCE);

    /* renamed from: r */
    public static final kl5<sj3, Object> f2175r = SaverKt.m2180a(SaversKt$LocaleListSaver$1.INSTANCE, SaversKt$LocaleListSaver$2.INSTANCE);

    /* renamed from: s */
    public static final kl5<qj3, Object> f2176s = SaverKt.m2180a(SaversKt$LocaleSaver$1.INSTANCE, SaversKt$LocaleSaver$2.INSTANCE);

    /* renamed from: e */
    public static final kl5<C3205rl, Object> m3228e() {
        return f2158a;
    }

    /* renamed from: f */
    public static final kl5<pl4, Object> m3229f() {
        return f2163f;
    }

    /* renamed from: g */
    public static final kl5<C3313sz, Object> m3230g(C3313sz.C3314a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2169l;
    }

    /* renamed from: h */
    public static final kl5<uk0, Object> m3231h(uk0.C3419a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2172o;
    }

    /* renamed from: i */
    public static final kl5<r72, Object> m3232i(r72.C3185a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2168k;
    }

    /* renamed from: j */
    public static final kl5<qj3, Object> m3233j(qj3.C3149a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2176s;
    }

    /* renamed from: k */
    public static final kl5<sj3, Object> m3234k(sj3.C3272a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2175r;
    }

    /* renamed from: l */
    public static final kl5<tf4, Object> m3235l(tf4.C3361a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2174q;
    }

    /* renamed from: m */
    public static final kl5<nz5, Object> m3236m(nz5.C2934a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2171n;
    }

    /* renamed from: n */
    public static final kl5<fn6, Object> m3237n(fn6.C2309a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2165h;
    }

    /* renamed from: o */
    public static final kl5<qn6, Object> m3238o(qn6.C3157a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2166i;
    }

    /* renamed from: p */
    public static final kl5<rn6, Object> m3239p(rn6.C3211a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2167j;
    }

    /* renamed from: q */
    public static final kl5<ao6, Object> m3240q(ao6.C1564a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2170m;
    }

    /* renamed from: r */
    public static final kl5<go6, Object> m3241r(go6.C2414a aVar) {
        vx2.m53591g(aVar, "<this>");
        return f2173p;
    }

    /* renamed from: s */
    public static final kl5<c66, Object> m3242s() {
        return f2164g;
    }

    /* renamed from: t */
    public static final <T> T m3243t(T t) {
        return t;
    }

    /* renamed from: u */
    public static final <T extends kl5<Original, Saveable>, Original, Saveable> Object m3244u(Original original, T t, ll5 ll5) {
        Object a;
        vx2.m53591g(t, "saver");
        vx2.m53591g(ll5, "scope");
        if (original == null || (a = t.mo3146a(ll5, original)) == null) {
            return Boolean.FALSE;
        }
        return a;
    }
}
