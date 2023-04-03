package org.koin.android.scope;

import android.app.Service;
import kotlin.Metadata;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "Lij;", "Lr37;", "onCreate", "onDestroy", "Lorg/koin/core/scope/Scope;", "a", "Lef3;", "n", "()Lorg/koin/core/scope/Scope;", "scope", "<init>", "()V", "koin-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: ScopeService.kt */
public abstract class ScopeService extends Service implements C7215ij {

    /* renamed from: a */
    public final ef3 f43926a = ServiceExtKt.m70712c(this);

    /* renamed from: n */
    public Scope mo52489n() {
        return (Scope) this.f43926a.getValue();
    }

    public void onCreate() {
        super.onCreate();
        if (mo52489n() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ServiceExtKt.m70711b(this);
    }
}
