package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class C0409x595e4e0d extends Lambda implements pc2<r37> {
    public final /* synthetic */ sn5 $scrollObservationScope;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0409x595e4e0d(sn5 sn5, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = sn5;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r6 == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r15 = this;
            sn5 r0 = r15.$scrollObservationScope
            rn5 r0 = r0.mo25910a()
            sn5 r1 = r15.$scrollObservationScope
            rn5 r1 = r1.mo25914e()
            sn5 r2 = r15.$scrollObservationScope
            java.lang.Float r2 = r2.mo25911b()
            sn5 r3 = r15.$scrollObservationScope
            java.lang.Float r3 = r3.mo25912c()
            r4 = 0
            if (r0 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            pc2 r5 = r0.mo25464c()
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = r2.floatValue()
            float r5 = r5 - r2
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r1 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x004a
            pc2 r2 = r1.mo25464c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            goto L_0x004b
        L_0x004a:
            r2 = r4
        L_0x004b:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x0053
            r3 = r7
            goto L_0x0054
        L_0x0053:
            r3 = r6
        L_0x0054:
            if (r3 == 0) goto L_0x005d
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x005b
            r6 = r7
        L_0x005b:
            if (r6 != 0) goto L_0x00dd
        L_0x005d:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r15.this$0
            sn5 r4 = r15.$scrollObservationScope
            int r4 = r4.mo25913d()
            int r3 = r3.mo3838c0(r4)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r8 = r15.this$0
            r10 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r12 = 0
            r13 = 8
            r14 = 0
            r9 = r3
            androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m2949f0(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r15.this$0
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r3 = r4.mo3816C(r3, r6)
            if (r0 == 0) goto L_0x00a7
            pc2 r4 = r0.mo25464c()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollX(r4)
            pc2 r4 = r0.mo25462a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollX(r4)
        L_0x00a7:
            if (r1 == 0) goto L_0x00cd
            pc2 r4 = r1.mo25464c()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollY(r4)
            pc2 r4 = r1.mo25462a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollY(r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00d8
            int r4 = (int) r5
            int r2 = (int) r2
            androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C0401c.m3004a(r3, r4, r2)
        L_0x00d8:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = r15.this$0
            boolean unused = r2.mo3839d0(r3)
        L_0x00dd:
            if (r0 == 0) goto L_0x00ee
            sn5 r2 = r15.$scrollObservationScope
            pc2 r0 = r0.mo25464c()
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r2.mo25916g(r0)
        L_0x00ee:
            if (r1 == 0) goto L_0x00ff
            sn5 r0 = r15.$scrollObservationScope
            pc2 r1 = r1.mo25464c()
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.mo25917h(r1)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C0409x595e4e0d.invoke():void");
    }
}
