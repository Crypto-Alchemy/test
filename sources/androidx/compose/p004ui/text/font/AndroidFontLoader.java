package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.Result;
import p000.C2602ji;
import p000.f72;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Lfp4;", "Ly62;", "font", "Landroid/graphics/Typeface;", "d", "a", "(Ly62;Lns0;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "context", "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader implements fp4 {

    /* renamed from: a */
    public final Context f2179a;

    /* renamed from: b */
    public final Object f2180b;

    public AndroidFontLoader(Context context) {
        vx2.m53591g(context, "context");
        this.f2179a = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo4085a(p000.y62 r7, p000.ns0<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p004ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.p004ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            y62 r7 = (p000.y62) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.p004ui.text.font.AndroidFontLoader) r0
            p000.hg5.m45199b(r8)
            goto L_0x0078
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            p000.hg5.m45199b(r8)
            goto L_0x005d
        L_0x0042:
            p000.hg5.m45199b(r8)
            boolean r8 = r7 instanceof p000.C2602ji
            if (r8 == 0) goto L_0x005e
            ji r7 = (p000.C2602ji) r7
            ji$a r8 = r7.mo21857d()
            android.content.Context r2 = r6.f2179a
            p000.vx2.m53590f(r2, r5)
            r0.label = r4
            java.lang.Object r8 = r8.mo21859b(r2, r7, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            return r8
        L_0x005e:
            boolean r8 = r7 instanceof p000.lf5
            if (r8 == 0) goto L_0x008a
            r8 = r7
            lf5 r8 = (p000.lf5) r8
            android.content.Context r2 = r6.f2179a
            p000.vx2.m53590f(r2, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AndroidFontLoader_androidKt.m3252d(r8, r2, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r0 = r6
        L_0x0078:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            lf5 r7 = (p000.lf5) r7
            r7.mo22752e()
            r7 = 0
            android.content.Context r0 = r0.f2179a
            p000.vx2.m53590f(r0, r5)
            android.graphics.Typeface r7 = p000.wp4.m29685c(r8, r7, r0)
            return r7
        L_0x008a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AndroidFontLoader.mo4085a(y62, ns0):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo4086b() {
        return this.f2180b;
    }

    /* renamed from: d */
    public Typeface mo4087c(y62 y62) {
        Typeface typeface;
        Object obj;
        vx2.m53591g(y62, "font");
        if (y62 instanceof C2602ji) {
            C2602ji jiVar = (C2602ji) y62;
            C2602ji.C2603a d = jiVar.mo21857d();
            Context context = this.f2179a;
            vx2.m53590f(context, "context");
            return d.mo21858a(context, jiVar);
        } else if (!(y62 instanceof lf5)) {
            return null;
        } else {
            int a = y62.mo21856a();
            f72.C2266a aVar = f72.f11555a;
            if (f72.m16637e(a, aVar.mo19710b())) {
                Context context2 = this.f2179a;
                vx2.m53590f(context2, "context");
                typeface = AndroidFontLoader_androidKt.m3251c((lf5) y62, context2);
            } else if (f72.m16637e(a, aVar.mo19711c())) {
                try {
                    Result.C6167a aVar2 = Result.Companion;
                    Context context3 = this.f2179a;
                    vx2.m53590f(context3, "context");
                    obj = Result.m75635constructorimpl(AndroidFontLoader_androidKt.m3251c((lf5) y62, context3));
                } catch (Throwable th) {
                    Result.C6167a aVar3 = Result.Companion;
                    obj = Result.m75635constructorimpl(hg5.m45198a(th));
                }
                if (Result.m75640isFailureimpl(obj)) {
                    obj = null;
                }
                typeface = (Typeface) obj;
            } else if (f72.m16637e(a, aVar.mo19709a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + f72.m16639g(y62.mo21856a()));
            }
            ((lf5) y62).mo22752e();
            Context context4 = this.f2179a;
            vx2.m53590f(context4, "context");
            return wp4.m29685c(typeface, (q72) null, context4);
        }
    }
}
