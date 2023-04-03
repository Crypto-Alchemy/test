package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C0610f;

/* renamed from: ho1 */
/* compiled from: EmojiMetadata */
public class ho1 {

    /* renamed from: d */
    public static final ThreadLocal<fv3> f12982d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f12983a;

    /* renamed from: b */
    public final C0610f f12984b;

    /* renamed from: c */
    public volatile int f12985c = 0;

    public ho1(C0610f fVar, int i) {
        this.f12984b = fVar;
        this.f12983a = i;
    }

    /* renamed from: a */
    public void mo21316a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f12984b.mo5665g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f12984b.mo5661c(), this.f12983a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo21317b(int i) {
        return mo21322g().mo20237h(i);
    }

    /* renamed from: c */
    public int mo21318c() {
        return mo21322g().mo20238i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int mo21319d() {
        return this.f12985c;
    }

    /* renamed from: e */
    public short mo21320e() {
        return mo21322g().mo20240k();
    }

    /* renamed from: f */
    public int mo21321f() {
        return mo21322g().mo20241l();
    }

    /* renamed from: g */
    public final fv3 mo21322g() {
        ThreadLocal<fv3> threadLocal = f12982d;
        fv3 fv3 = threadLocal.get();
        if (fv3 == null) {
            fv3 = new fv3();
            threadLocal.set(fv3);
        }
        this.f12984b.mo5662d().mo20850j(fv3, this.f12983a);
        return fv3;
    }

    /* renamed from: h */
    public short mo21323h() {
        return mo21322g().mo20242m();
    }

    /* renamed from: i */
    public short mo21324i() {
        return mo21322g().mo20243n();
    }

    /* renamed from: j */
    public boolean mo21325j() {
        return mo21322g().mo20239j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void mo21326k(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f12985c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo21321f()));
        sb.append(", codepoints:");
        int c = mo21318c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo21317b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
