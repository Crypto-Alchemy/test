package org.koin.android.scope;

import android.app.Service;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lorg/koin/core/scope/Scope;", "invoke"}, mo44878k = 3, mo44879mv = {1, 5, 1}, mo44881xi = 48)
/* compiled from: ServiceExt.kt */
public final class ServiceExtKt$serviceScope$1 extends Lambda implements pc2<Scope> {
    public final /* synthetic */ Service $this_serviceScope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceExtKt$serviceScope$1(Service service) {
        super(0);
        this.$this_serviceScope = service;
    }

    public final Scope invoke() {
        return ServiceExtKt.m70710a(this.$this_serviceScope);
    }
}
