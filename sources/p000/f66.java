package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import kotlin.Metadata;
import p000.io6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a9\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lr37;", "e", "Luk0;", "color", "a", "(Landroid/text/Spannable;JII)V", "Lsj3;", "localeList", "d", "Lgo6;", "fontSize", "Ldc1;", "density", "c", "(Landroid/text/Spannable;JLdc1;II)V", "b", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: f66 */
/* compiled from: SpannableExtensions.android.kt */
public final class f66 {
    /* renamed from: a */
    public static final void m16627a(Spannable spannable, long j, int i, int i2) {
        boolean z;
        vx2.m53591g(spannable, "$this$setBackground");
        if (j != uk0.f18515b.mo26824d()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16631e(spannable, new BackgroundColorSpan(zk0.m31347e(j)), i, i2);
        }
    }

    /* renamed from: b */
    public static final void m16628b(Spannable spannable, long j, int i, int i2) {
        boolean z;
        vx2.m53591g(spannable, "$this$setColor");
        if (j != uk0.f18515b.mo26824d()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16631e(spannable, new ForegroundColorSpan(zk0.m31347e(j)), i, i2);
        }
    }

    /* renamed from: c */
    public static final void m16629c(Spannable spannable, long j, dc1 dc1, int i, int i2) {
        vx2.m53591g(spannable, "$this$setFontSize");
        vx2.m53591g(dc1, "density");
        long g = go6.m18277g(j);
        io6.C2564a aVar = io6.f13355b;
        if (io6.m19758g(g, aVar.mo21605b())) {
            m16631e(spannable, new AbsoluteSizeSpan(ap3.m31899b(dc1.mo18679n(j)), false), i, i2);
        } else if (io6.m19758g(g, aVar.mo21604a())) {
            m16631e(spannable, new RelativeSizeSpan(go6.m18278h(j)), i, i2);
        }
    }

    /* renamed from: d */
    public static final void m16630d(Spannable spannable, sj3 sj3, int i, int i2) {
        Object obj;
        qj3 qj3;
        vx2.m53591g(spannable, "<this>");
        if (sj3 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                obj = vj3.f18807a.mo27152a(sj3);
            } else {
                if (sj3.isEmpty()) {
                    qj3 = qj3.f16953b.mo25124a();
                } else {
                    qj3 = sj3.mo25800j(0);
                }
                obj = new LocaleSpan(rj3.m26229a(qj3));
            }
            m16631e(spannable, obj, i, i2);
        }
    }

    /* renamed from: e */
    public static final void m16631e(Spannable spannable, Object obj, int i, int i2) {
        vx2.m53591g(spannable, "<this>");
        vx2.m53591g(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }
}
