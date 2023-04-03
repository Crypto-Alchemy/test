package androidx.compose.p004ui.text.input;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;B\u0011\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b:\u0010<J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\b0\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u001b8\u0002@\u0002X\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR$\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0000@BX\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001b\u00105\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b%\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u00108\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Lrp4;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "e", "", "h", "Lr37;", "k", "(Lns0;)Ljava/lang/Object;", "i", "visible", "j", "Landroid/view/View;", "a", "Landroid/view/View;", "g", "()Landroid/view/View;", "view", "Lav2;", "b", "Lav2;", "inputMethodManager", "c", "Z", "editorHasFocus", "Lkotlin/Function1;", "", "Lnn1;", "d", "Lrc2;", "onEditCommand", "Lis2;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextFieldValue;", "<set-?>", "f", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Ljs2;", "Ljs2;", "imeOptions", "", "Ljava/lang/ref/WeakReference;", "Lq85;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "Lef3;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Lfd0;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "Lfd0;", "textInputCommandChannel", "<init>", "(Landroid/view/View;Lav2;)V", "(Landroid/view/View;)V", "TextInputCommand", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid implements rp4 {

    /* renamed from: a */
    public final View f2214a;

    /* renamed from: b */
    public final av2 f2215b;

    /* renamed from: c */
    public boolean f2216c;

    /* renamed from: d */
    public rc2<? super List<? extends nn1>, r37> f2217d;

    /* renamed from: e */
    public rc2<? super is2, r37> f2218e;

    /* renamed from: f */
    public TextFieldValue f2219f;

    /* renamed from: g */
    public js2 f2220g;

    /* renamed from: h */
    public List<WeakReference<q85>> f2221h;

    /* renamed from: i */
    public final ef3 f2222i;

    /* renamed from: j */
    public final fd0<TextInputCommand> f2223j;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand */
    /* compiled from: TextInputServiceAndroid.android.kt */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$a */
    /* compiled from: TextInputServiceAndroid.android.kt */
    public /* synthetic */ class C0462a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2225a;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            f2225a = iArr;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$b", "Lwu2;", "", "Lnn1;", "editCommands", "Lr37;", "d", "Lis2;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "b", "Lq85;", "ic", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$b */
    /* compiled from: TextInputServiceAndroid.android.kt */
    public static final class C0463b implements wu2 {

        /* renamed from: a */
        public final /* synthetic */ TextInputServiceAndroid f2226a;

        public C0463b(TextInputServiceAndroid textInputServiceAndroid) {
            this.f2226a = textInputServiceAndroid;
        }

        /* renamed from: a */
        public void mo4136a(q85 q85) {
            vx2.m53591g(q85, "ic");
            int size = this.f2226a.f2221h.size();
            for (int i = 0; i < size; i++) {
                if (vx2.m53586b(((WeakReference) this.f2226a.f2221h.get(i)).get(), q85)) {
                    this.f2226a.f2221h.remove(i);
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo4137b(KeyEvent keyEvent) {
            vx2.m53591g(keyEvent, "event");
            this.f2226a.mo4130f().sendKeyEvent(keyEvent);
        }

        /* renamed from: c */
        public void mo4138c(int i) {
            this.f2226a.f2218e.invoke(is2.m19798i(i));
        }

        /* renamed from: d */
        public void mo4139d(List<? extends nn1> list) {
            vx2.m53591g(list, "editCommands");
            this.f2226a.f2217d.invoke(list);
        }
    }

    public TextInputServiceAndroid(View view, av2 av2) {
        vx2.m53591g(view, "view");
        vx2.m53591g(av2, "inputMethodManager");
        this.f2214a = view;
        this.f2215b = av2;
        this.f2217d = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.f2218e = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.f2219f = new TextFieldValue("", ao6.f7681b.mo11073a(), (ao6) null, 4, (DefaultConstructorMarker) null);
        this.f2220g = js2.f13834f.mo22082a();
        this.f2221h = new ArrayList();
        this.f2222i = C6169a.m47233b(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f2223j = od0.m70236b(Integer.MAX_VALUE, (BufferOverflow) null, (rc2) null, 6, (Object) null);
    }

    /* renamed from: l */
    public static final void m3294l(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i = C0462a.f2225a[textInputCommand.ordinal()];
        boolean z = true;
        if (i == 1) {
            T t = Boolean.TRUE;
            ref$ObjectRef.element = t;
            ref$ObjectRef2.element = t;
        } else if (i == 2) {
            T t2 = Boolean.FALSE;
            ref$ObjectRef.element = t2;
            ref$ObjectRef2.element = t2;
        } else if ((i == 3 || i == 4) && !vx2.m53586b(ref$ObjectRef.element, Boolean.FALSE)) {
            if (textInputCommand != TextInputCommand.ShowKeyboard) {
                z = false;
            }
            ref$ObjectRef2.element = Boolean.valueOf(z);
        }
    }

    /* renamed from: e */
    public final InputConnection mo4129e(EditorInfo editorInfo) {
        vx2.m53591g(editorInfo, "outAttrs");
        if (!this.f2216c) {
            return null;
        }
        vn6.m28925b(editorInfo, this.f2220g, this.f2219f);
        q85 q85 = new q85(this.f2219f, new C0463b(this), this.f2220g.mo22074b());
        this.f2221h.add(new WeakReference(q85));
        return q85;
    }

    /* renamed from: f */
    public final BaseInputConnection mo4130f() {
        return (BaseInputConnection) this.f2222i.getValue();
    }

    /* renamed from: g */
    public final View mo4131g() {
        return this.f2214a;
    }

    /* renamed from: h */
    public final boolean mo4132h() {
        return this.f2216c;
    }

    /* renamed from: i */
    public final void mo4133i() {
        this.f2215b.mo4120c(this.f2214a);
    }

    /* renamed from: j */
    public final void mo4134j(boolean z) {
        if (z) {
            this.f2215b.mo4119b(this.f2214a);
        } else {
            this.f2215b.mo4118a(this.f2214a.getWindowToken());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4135k(p000.ns0<? super p000.r37> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.p004ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = (androidx.compose.p004ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.L$1
            md0 r2 = (p000.md0) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = (androidx.compose.p004ui.text.input.TextInputServiceAndroid) r4
            p000.hg5.m45199b(r9)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            p000.hg5.m45199b(r9)
            fd0<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r8.f2223j
            md0 r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L_0x0044:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r2.mo55581a(r0)
            if (r9 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r2.next()
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            android.view.View r5 = r4.f2214a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x0074
        L_0x0067:
            fd0<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.f2223j
            java.lang.Object r9 = r9.mo52183r()
            boolean r9 = p000.qd0.m71231j(r9)
            if (r9 != 0) goto L_0x0067
            goto L_0x0044
        L_0x0074:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
        L_0x007e:
            if (r9 == 0) goto L_0x0090
            m3294l(r9, r5, r6)
            fd0<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r9 = r4.f2223j
            java.lang.Object r9 = r9.mo52183r()
            java.lang.Object r9 = p000.qd0.m71227f(r9)
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r9 = (androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand) r9
            goto L_0x007e
        L_0x0090:
            T r9 = r5.element
            java.lang.Boolean r7 = p000.a40.m31670a(r3)
            boolean r9 = p000.vx2.m53586b(r9, r7)
            if (r9 == 0) goto L_0x009f
            r4.mo4133i()
        L_0x009f:
            T r9 = r6.element
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r9.booleanValue()
            r4.mo4134j(r9)
        L_0x00ac:
            T r9 = r5.element
            r5 = 0
            java.lang.Boolean r5 = p000.a40.m31670a(r5)
            boolean r9 = p000.vx2.m53586b(r9, r5)
            if (r9 == 0) goto L_0x0044
            r4.mo4133i()
            goto L_0x0044
        L_0x00bd:
            r37 r9 = p000.r37.f33317a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.input.TextInputServiceAndroid.mo4135k(ns0):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputServiceAndroid(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p000.vx2.m53591g(r4, r0)
            androidx.compose.ui.text.input.InputMethodManagerImpl r0 = new androidx.compose.ui.text.input.InputMethodManagerImpl
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            p000.vx2.m53590f(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.input.TextInputServiceAndroid.<init>(android.view.View):void");
    }
}
