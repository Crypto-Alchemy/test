package androidx.compose.p004ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.p004ui.platform.WindowRecomposer_androidKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"La52;", "", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", mo48632f = "WindowRecomposer.android.kt", mo48633l = {116, 122}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements fd2<a52<? super Float>, ns0<? super r37>, Object> {
    public final /* synthetic */ Uri $animationScaleUri;
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ fd0<r37> $channel;
    public final /* synthetic */ WindowRecomposer_androidKt.C0440b $contentObserver;
    public final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt.C0440b bVar, fd0<r37> fd0, Context context, ns0<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> ns0) {
        super(2, ns0);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = bVar;
        this.$channel = fd0;
        this.$applicationContext = context;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, ns0);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    public final Object invoke(a52<? super Float> a52, ns0<? super r37> ns0) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(a52, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r9.L$1
            md0 r1 = (p000.md0) r1
            java.lang.Object r4 = r9.L$0
            a52 r4 = (p000.a52) r4
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0091 }
            r10 = r4
            goto L_0x0048
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.L$1
            md0 r1 = (p000.md0) r1
            java.lang.Object r4 = r9.L$0
            a52 r4 = (p000.a52) r4
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0091 }
            r5 = r4
            r4 = r9
            goto L_0x0059
        L_0x0031:
            p000.hg5.m45199b(r10)
            java.lang.Object r10 = r9.L$0
            a52 r10 = (p000.a52) r10
            android.content.ContentResolver r1 = r9.$resolver
            android.net.Uri r4 = r9.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r6 = r9.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            fd0<r37> r1 = r9.$channel     // Catch:{ all -> 0x0091 }
            md0 r1 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x0048:
            r4 = r9
        L_0x0049:
            r4.L$0 = r10     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r1.mo55581a(r4)     // Catch:{ all -> 0x008f }
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x0059:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x008f }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x0085
            r1.next()     // Catch:{ all -> 0x008f }
            android.content.Context r10 = r4.$applicationContext     // Catch:{ all -> 0x008f }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Float r10 = p000.a40.m31672c(r10)     // Catch:{ all -> 0x008f }
            r4.L$0 = r5     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r2     // Catch:{ all -> 0x008f }
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch:{ all -> 0x008f }
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r10 = r5
            goto L_0x0049
        L_0x0085:
            android.content.ContentResolver r10 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r0 = r4.$contentObserver
            r10.unregisterContentObserver(r0)
            r37 r10 = p000.r37.f33317a
            return r10
        L_0x008f:
            r10 = move-exception
            goto L_0x0093
        L_0x0091:
            r10 = move-exception
            r4 = r9
        L_0x0093:
            android.content.ContentResolver r0 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r1 = r4.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
