package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Lr37;", "e", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "", "onFound", "d", "(Lrc2;)Ljava/lang/Boolean;", "Lv04;", "Lu62;", "a", "Lv04;", "c", "()Lv04;", "focusRequesterModifierLocals", "<init>", "()V", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusRequester */
/* compiled from: FocusRequester.kt */
public final class FocusRequester {

    /* renamed from: b */
    public static final C0359a f1652b = new C0359a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f1653c = v04.f18628g;

    /* renamed from: d */
    public static final FocusRequester f1654d = new FocusRequester();

    /* renamed from: e */
    public static final FocusRequester f1655e = new FocusRequester();

    /* renamed from: a */
    public final v04<u62> f1656a = new v04<>(new u62[16], 0);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028GX\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusRequester$a;", "", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "b", "()Landroidx/compose/ui/focus/FocusRequester;", "Cancel", "a", "getCancel$annotations", "()V", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.focus.FocusRequester$a */
    /* compiled from: FocusRequester.kt */
    public static final class C0359a {
        public C0359a() {
        }

        public /* synthetic */ C0359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FocusRequester mo3267a() {
            return FocusRequester.f1655e;
        }

        /* renamed from: b */
        public final FocusRequester mo3268b() {
            return FocusRequester.f1654d;
        }
    }

    /* renamed from: c */
    public final v04<u62> mo3264c() {
        return this.f1656a;
    }

    /* renamed from: d */
    public final Boolean mo3265d(rc2<? super FocusModifier, Boolean> rc2) {
        vx2.m53591g(rc2, "onFound");
        if (vx2.m53586b(this, f1655e)) {
            return Boolean.FALSE;
        }
        if (vx2.m53586b(this, f1654d)) {
            return null;
        }
        v04<u62> v04 = this.f1656a;
        int n = v04.mo26963n();
        boolean z = false;
        if (n > 0) {
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i = 0;
            boolean z2 = false;
            do {
                FocusModifier s = ((u62) m[i]).mo26660s();
                if (s != null) {
                    if (rc2.invoke(s).booleanValue() || z2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                i++;
            } while (i < n);
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final void mo3266e() {
        if (this.f1656a.mo26966r()) {
            mo3265d(FocusRequester$requestFocus$2.INSTANCE);
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
