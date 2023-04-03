package p000;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b\"\u0004\b \u0010\u001dR\u0014\u0010#\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, mo44877d2 = {"Lsn5;", "Loj4;", "", "a", "I", "d", "()I", "semanticsNodeId", "", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "allScopes", "", "e", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "oldXValue", "c", "h", "oldYValue", "Lrn5;", "k", "Lrn5;", "()Lrn5;", "f", "(Lrn5;)V", "horizontalScrollAxisRange", "r", "i", "verticalScrollAxisRange", "", "isValid", "()Z", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lrn5;Lrn5;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sn5 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class sn5 implements oj4 {

    /* renamed from: a */
    public final int f17754a;

    /* renamed from: d */
    public final List<sn5> f17755d;

    /* renamed from: e */
    public Float f17756e;

    /* renamed from: g */
    public Float f17757g;

    /* renamed from: k */
    public rn5 f17758k;

    /* renamed from: r */
    public rn5 f17759r;

    public sn5(int i, List<sn5> list, Float f, Float f2, rn5 rn5, rn5 rn52) {
        vx2.m53591g(list, "allScopes");
        this.f17754a = i;
        this.f17755d = list;
        this.f17756e = f;
        this.f17757g = f2;
        this.f17758k = rn5;
        this.f17759r = rn52;
    }

    /* renamed from: a */
    public final rn5 mo25910a() {
        return this.f17758k;
    }

    /* renamed from: b */
    public final Float mo25911b() {
        return this.f17756e;
    }

    /* renamed from: c */
    public final Float mo25912c() {
        return this.f17757g;
    }

    /* renamed from: d */
    public final int mo25913d() {
        return this.f17754a;
    }

    /* renamed from: e */
    public final rn5 mo25914e() {
        return this.f17759r;
    }

    /* renamed from: f */
    public final void mo25915f(rn5 rn5) {
        this.f17758k = rn5;
    }

    /* renamed from: g */
    public final void mo25916g(Float f) {
        this.f17756e = f;
    }

    /* renamed from: h */
    public final void mo25917h(Float f) {
        this.f17757g = f;
    }

    /* renamed from: i */
    public final void mo25918i(rn5 rn5) {
        this.f17759r = rn5;
    }

    public boolean isValid() {
        return this.f17755d.contains(this);
    }
}
