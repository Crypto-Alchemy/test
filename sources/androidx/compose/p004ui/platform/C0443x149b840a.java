package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", mo48632f = "WindowRecomposer.android.kt", mo48633l = {391}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class C0443x149b840a extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ ug3 $lifecycleOwner;
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ C0441xff837ba9 $self;
    public final /* synthetic */ Ref$ObjectRef<my3> $systemDurationScaleSettingConsumer;
    public final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0443x149b840a(Ref$ObjectRef<my3> ref$ObjectRef, Recomposer recomposer, ug3 ug3, C0441xff837ba9 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, ns0<? super C0443x149b840a> ns0) {
        super(2, ns0);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$lifecycleOwner = ug3;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        C0443x149b840a windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new C0443x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$lifecycleOwner, this.$self, this.$this_createLifecycleAwareWindowRecomposer, ns0);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((C0443x149b840a) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r11.L$0
            y23 r0 = (p000.y23) r0
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0014 }
            goto L_0x006c
        L_0x0014:
            r12 = move-exception
            goto L_0x0086
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            p000.hg5.m45199b(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            hu0 r4 = (p000.hu0) r4
            kotlin.jvm.internal.Ref$ObjectRef<my3> r12 = r11.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x0084 }
            T r12 = r12.element     // Catch:{ all -> 0x0084 }
            my3 r12 = (p000.my3) r12     // Catch:{ all -> 0x0084 }
            if (r12 == 0) goto L_0x005d
            android.view.View r1 = r11.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "context.applicationContext"
            p000.vx2.m53590f(r1, r5)     // Catch:{ all -> 0x0084 }
            t86 r1 = androidx.compose.p004ui.platform.WindowRecomposer_androidKt.m3137e(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0084 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0084 }
            r12.mo23421f(r5)     // Catch:{ all -> 0x0084 }
            r5 = 0
            r6 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0084 }
            r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0084 }
            r8 = 3
            r9 = 0
            y23 r12 = p000.d50.m56748b(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0084 }
            goto L_0x005e
        L_0x005d:
            r12 = r3
        L_0x005e:
            androidx.compose.runtime.Recomposer r1 = r11.$recomposer     // Catch:{ all -> 0x007f }
            r11.L$0 = r12     // Catch:{ all -> 0x007f }
            r11.label = r2     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.mo3117m0(r11)     // Catch:{ all -> 0x007f }
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r12
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            p000.y23.C9621a.m74226a(r0, r3, r2, r3)
        L_0x0071:
            ug3 r12 = r11.$lifecycleOwner
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.$self
            r12.mo6297c(r0)
            r37 r12 = p000.r37.f33317a
            return r12
        L_0x007f:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x0086
        L_0x0084:
            r12 = move-exception
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            p000.y23.C9621a.m74226a(r0, r3, r2, r3)
        L_0x008b:
            ug3 r0 = r11.$lifecycleOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.$self
            r0.mo6297c(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C0443x149b840a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
