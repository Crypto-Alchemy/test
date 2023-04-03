package p000;

import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* renamed from: kf3 */
/* compiled from: LazyFieldLite */
public class kf3 {

    /* renamed from: a */
    public c70 f38889a;

    /* renamed from: b */
    public C7616d f38890b;

    /* renamed from: c */
    public volatile boolean f38891c;

    /* renamed from: d */
    public volatile C7628h f38892d;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo52897a(kotlin.reflect.jvm.internal.impl.protobuf.C7628h r3) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.h r0 = r2.f38892d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.h r0 = r2.f38892d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x000c:
            c70 r0 = r2.f38889a     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            jm4 r3 = r3.getParserForType()     // Catch:{ IOException -> 0x0023 }
            c70 r0 = r2.f38889a     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = r2.f38890b     // Catch:{ IOException -> 0x0023 }
            java.lang.Object r3 = r3.mo52752b(r0, r1)     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r3 = (kotlin.reflect.jvm.internal.impl.protobuf.C7628h) r3     // Catch:{ IOException -> 0x0023 }
            r2.f38892d = r3     // Catch:{ IOException -> 0x0023 }
            goto L_0x0023
        L_0x0021:
            r2.f38892d = r3     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf3.mo52897a(kotlin.reflect.jvm.internal.impl.protobuf.h):void");
    }

    /* renamed from: b */
    public int mo52898b() {
        if (this.f38891c) {
            return this.f38892d.getSerializedSize();
        }
        return this.f38889a.size();
    }

    /* renamed from: c */
    public C7628h mo52899c(C7628h hVar) {
        mo52897a(hVar);
        return this.f38892d;
    }

    /* renamed from: d */
    public C7628h mo52900d(C7628h hVar) {
        C7628h hVar2 = this.f38892d;
        this.f38892d = hVar;
        this.f38889a = null;
        this.f38891c = true;
        return hVar2;
    }
}
