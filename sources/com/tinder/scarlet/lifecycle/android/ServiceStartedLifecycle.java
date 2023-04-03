package com.tinder.scarlet.lifecycle.android;

import androidx.lifecycle.C0719h;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo44877d2 = {"Lcom/tinder/scarlet/lifecycle/android/ServiceStartedLifecycle;", "Lkg3;", "ALifecycleObserver", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: ServiceStartedLifecycle.kt */
public final class ServiceStartedLifecycle implements kg3 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo44877d2 = {"Lcom/tinder/scarlet/lifecycle/android/ServiceStartedLifecycle$ALifecycleObserver;", "Ltg3;", "Lr37;", "onResume", "onStop", "onDestroy", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* compiled from: ServiceStartedLifecycle.kt */
    public final class ALifecycleObserver implements tg3 {
        @C0719h(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            ServiceStartedLifecycle.m41989b((ServiceStartedLifecycle) null).onComplete();
        }

        @C0719h(Lifecycle.Event.ON_START)
        public final void onResume() {
            ServiceStartedLifecycle.m41989b((ServiceStartedLifecycle) null).onNext(kg3.C6147a.C6149b.f30871a);
        }

        @C0719h(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            ServiceStartedLifecycle.m41989b((ServiceStartedLifecycle) null).onNext(kg3.C6147a.C6150c.C6151a.f30872a);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ yg3 m41989b(ServiceStartedLifecycle serviceStartedLifecycle) {
        throw null;
    }
}
