package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.Metadata;
import p000.C3205rl;
import p000.fn6;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a4\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, mo44877d2 = {"Lrl;", "Ldc1;", "density", "Lz62$b;", "fontFamilyResolver", "Landroid/text/SpannableString;", "b", "Lc66;", "spanStyle", "", "start", "end", "Lr37;", "a", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: dh */
/* compiled from: AndroidAccessibilitySpannableString.android.kt */
public final class C2165dh {
    /* renamed from: a */
    public static final void m15111a(SpannableString spannableString, c66 c66, int i, int i2, dc1 dc1, z62.C3714b bVar) {
        int i3;
        int i4;
        f66.m16628b(spannableString, c66.mo11994g(), i, i2);
        f66.m16629c(spannableString, c66.mo11998j(), dc1, i, i2);
        if (!(c66.mo12001m() == null && c66.mo11999k() == null)) {
            r72 m = c66.mo12001m();
            if (m == null) {
                m = r72.f17161d.mo25348a();
            }
            n72 k = c66.mo11999k();
            if (k != null) {
                i4 = k.mo23529h();
            } else {
                i4 = n72.f15367b.mo23533b();
            }
            spannableString.setSpan(new StyleSpan(C2898ni.m23199c(m, i4)), i, i2, 33);
        }
        if (c66.mo11995h() != null) {
            if (c66.mo11995h() instanceof jf2) {
                spannableString.setSpan(new TypefaceSpan(((jf2) c66.mo11995h()).mo21821e()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                z62 h = c66.mo11995h();
                o72 l = c66.mo12000l();
                if (l != null) {
                    i3 = l.mo23911i();
                } else {
                    i3 = o72.f15827b.mo23913a();
                }
                Object value = a72.m93a(bVar, h, (r72) null, 0, i3, 6, (Object) null).getValue();
                vx2.m53589e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(C2714km.f14200a.mo22406a((Typeface) value), i, i2, 33);
            }
        }
        if (c66.mo12005q() != null) {
            fn6 q = c66.mo12005q();
            fn6.C2309a aVar = fn6.f11948b;
            if (q.mo20021c(aVar.mo20027b())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (c66.mo12005q().mo20021c(aVar.mo20026a())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (c66.mo12006r() != null) {
            spannableString.setSpan(new ScaleXSpan(c66.mo12006r().mo25181a()), i, i2, 33);
        }
        f66.m16630d(spannableString, c66.mo12003o(), i, i2);
        f66.m16627a(spannableString, c66.mo11990d(), i, i2);
    }

    /* renamed from: b */
    public static final SpannableString m15112b(C3205rl rlVar, dc1 dc1, z62.C3714b bVar) {
        C3205rl rlVar2 = rlVar;
        vx2.m53591g(rlVar2, "<this>");
        vx2.m53591g(dc1, "density");
        vx2.m53591g(bVar, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(rlVar.mo25431f());
        List<C3205rl.C3206a<c66>> e = rlVar.mo25429e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            C3205rl.C3206a aVar = e.get(i);
            m15111a(spannableString, c66.m11723b((c66) aVar.mo25440a(), 0, 0, (r72) null, (n72) null, (o72) null, (z62) null, (String) null, 0, (C3313sz) null, (qn6) null, (sj3) null, 0, (fn6) null, (nz5) null, 16351, (Object) null), aVar.mo25441b(), aVar.mo25442c(), dc1, bVar);
        }
        List<C3205rl.C3206a<ry6>> g = rlVar2.mo25432g(0, rlVar.length());
        int size2 = g.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C3205rl.C3206a aVar2 = g.get(i2);
            spannableString.setSpan(sy6.m27196a((ry6) aVar2.mo25440a()), aVar2.mo25441b(), aVar2.mo25442c(), 33);
        }
        List<C3205rl.C3206a<l57>> h = rlVar2.mo25433h(0, rlVar.length());
        int size3 = h.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C3205rl.C3206a aVar3 = h.get(i3);
            spannableString.setSpan(m57.m22027a((l57) aVar3.mo25440a()), aVar3.mo25441b(), aVar3.mo25442c(), 33);
        }
        return spannableString;
    }
}
