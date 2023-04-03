package p000;

import android.text.style.TtsSpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, mo44877d2 = {"Lry6;", "Landroid/text/style/TtsSpan;", "a", "Lz87;", "b", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: sy6 */
/* compiled from: TtsAnnotationExtensions.android.kt */
public final class sy6 {
    /* renamed from: a */
    public static final TtsSpan m27196a(ry6 ry6) {
        vx2.m53591g(ry6, "<this>");
        if (ry6 instanceof z87) {
            return m27197b((z87) ry6);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final TtsSpan m27197b(z87 z87) {
        vx2.m53591g(z87, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(z87.mo28381a()).build();
        vx2.m53590f(build, "builder.build()");
        return build;
    }
}
