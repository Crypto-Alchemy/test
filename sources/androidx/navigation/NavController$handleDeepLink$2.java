package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ln44;", "Lr37;", "invoke", "(Ln44;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public final class NavController$handleDeepLink$2 extends Lambda implements rc2<n44, r37> {
    public final /* synthetic */ NavDestination $node;
    public final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((n44) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(p000.n44 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "$this$navOptions"
            p000.vx2.m53591g(r7, r0)
            androidx.navigation.NavController$handleDeepLink$2$1 r0 = androidx.navigation.NavController$handleDeepLink$2.C11171.INSTANCE
            r7.mo23500a(r0)
            androidx.navigation.NavDestination r0 = r6.$node
            boolean r1 = r0 instanceof androidx.navigation.NavGraph
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0042
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.f6051A
            hw5 r0 = r1.mo8566c(r0)
            androidx.navigation.NavController r1 = r6.this$0
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r0.next()
            androidx.navigation.NavDestination r4 = (androidx.navigation.NavDestination) r4
            androidx.navigation.NavDestination r5 = r1.mo8446B()
            if (r5 == 0) goto L_0x0035
            androidx.navigation.NavGraph r5 = r5.mo8548D()
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x001e
            r0 = r3
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            if (r2 == 0) goto L_0x0060
            boolean r0 = androidx.navigation.NavController.f5993H
            if (r0 == 0) goto L_0x0060
            androidx.navigation.NavGraph$Companion r0 = androidx.navigation.NavGraph.f6067M
            androidx.navigation.NavController r1 = r6.this$0
            androidx.navigation.NavGraph r1 = r1.mo8448D()
            androidx.navigation.NavDestination r0 = r0.mo8586a(r1)
            int r0 = r0.mo8563w()
            androidx.navigation.NavController$handleDeepLink$2$2 r1 = androidx.navigation.NavController$handleDeepLink$2.C11182.INSTANCE
            r7.mo23502c(r0, r1)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController$handleDeepLink$2.invoke(n44):void");
    }
}
