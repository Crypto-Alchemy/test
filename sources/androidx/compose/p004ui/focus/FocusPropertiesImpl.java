package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.focus.FocusRequester;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u0010.R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u001b\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\"\u0010\u001e\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u001d\u0010\u000fR\"\u0010!\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b \u0010\u000fR\"\u0010#\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0018\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010%\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001f\u0010\r\"\u0004\b$\u0010\u000fR7\u0010/\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0&8\u0016@\u0016X\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b\u0007\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R7\u00102\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0&8\u0016@\u0016X\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b)\u0010(\u0012\u0004\b1\u0010.\u001a\u0004\b\u001c\u0010*\"\u0004\b0\u0010,\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Ls62;", "", "a", "Z", "q", "()Z", "j", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "b", "Landroidx/compose/ui/focus/FocusRequester;", "()Landroidx/compose/ui/focus/FocusRequester;", "v", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "c", "r", "u", "previous", "d", "h", "up", "e", "i", "l", "down", "f", "n", "left", "g", "o", "right", "p", "start", "m", "end", "Lkotlin/Function1;", "Lj62;", "Lrc2;", "k", "()Lrc2;", "s", "(Lrc2;)V", "getEnter$annotations", "()V", "enter", "t", "getExit$annotations", "exit", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusPropertiesImpl */
/* compiled from: FocusProperties.kt */
public final class FocusPropertiesImpl implements s62 {

    /* renamed from: a */
    public boolean f1640a = true;

    /* renamed from: b */
    public FocusRequester f1641b;

    /* renamed from: c */
    public FocusRequester f1642c;

    /* renamed from: d */
    public FocusRequester f1643d;

    /* renamed from: e */
    public FocusRequester f1644e;

    /* renamed from: f */
    public FocusRequester f1645f;

    /* renamed from: g */
    public FocusRequester f1646g;

    /* renamed from: h */
    public FocusRequester f1647h;

    /* renamed from: i */
    public FocusRequester f1648i;

    /* renamed from: j */
    public rc2<? super j62, FocusRequester> f1649j;

    /* renamed from: k */
    public rc2<? super j62, FocusRequester> f1650k;

    public FocusPropertiesImpl() {
        FocusRequester.C0359a aVar = FocusRequester.f1652b;
        this.f1641b = aVar.mo3268b();
        this.f1642c = aVar.mo3268b();
        this.f1643d = aVar.mo3268b();
        this.f1644e = aVar.mo3268b();
        this.f1645f = aVar.mo3268b();
        this.f1646g = aVar.mo3268b();
        this.f1647h = aVar.mo3268b();
        this.f1648i = aVar.mo3268b();
        this.f1649j = FocusPropertiesImpl$enter$1.INSTANCE;
        this.f1650k = FocusPropertiesImpl$exit$1.INSTANCE;
    }

    /* renamed from: a */
    public FocusRequester mo3238a() {
        return this.f1645f;
    }

    /* renamed from: b */
    public FocusRequester mo3239b() {
        return this.f1641b;
    }

    /* renamed from: c */
    public FocusRequester mo3240c() {
        return this.f1643d;
    }

    /* renamed from: d */
    public FocusRequester mo3241d() {
        return this.f1646g;
    }

    /* renamed from: e */
    public FocusRequester mo3242e() {
        return this.f1647h;
    }

    /* renamed from: f */
    public rc2<j62, FocusRequester> mo3243f() {
        return this.f1650k;
    }

    /* renamed from: g */
    public FocusRequester mo3244g() {
        return this.f1648i;
    }

    /* renamed from: h */
    public void mo3245h(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1643d = focusRequester;
    }

    /* renamed from: i */
    public FocusRequester mo3246i() {
        return this.f1644e;
    }

    /* renamed from: j */
    public void mo3247j(boolean z) {
        this.f1640a = z;
    }

    /* renamed from: k */
    public rc2<j62, FocusRequester> mo3248k() {
        return this.f1649j;
    }

    /* renamed from: l */
    public void mo3249l(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1644e = focusRequester;
    }

    /* renamed from: m */
    public void mo3250m(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1648i = focusRequester;
    }

    /* renamed from: n */
    public void mo3251n(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1645f = focusRequester;
    }

    /* renamed from: o */
    public void mo3252o(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1646g = focusRequester;
    }

    /* renamed from: p */
    public void mo3253p(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1647h = focusRequester;
    }

    /* renamed from: q */
    public boolean mo3254q() {
        return this.f1640a;
    }

    /* renamed from: r */
    public FocusRequester mo3255r() {
        return this.f1642c;
    }

    /* renamed from: s */
    public void mo3256s(rc2<? super j62, FocusRequester> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.f1649j = rc2;
    }

    /* renamed from: t */
    public void mo3257t(rc2<? super j62, FocusRequester> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.f1650k = rc2;
    }

    /* renamed from: u */
    public void mo3258u(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1642c = focusRequester;
    }

    /* renamed from: v */
    public void mo3259v(FocusRequester focusRequester) {
        vx2.m53591g(focusRequester, "<set-?>");
        this.f1641b = focusRequester;
    }
}
