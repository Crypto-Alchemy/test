package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.web3j.ens.contracts.generated.PublicResolver;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public class AppMeasurement {

    /* renamed from: c */
    public static volatile AppMeasurement f23054c;

    /* renamed from: a */
    public final kr8 f23055a;

    /* renamed from: b */
    public final ux8 f23056b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            cu4.m43221k(bundle);
            this.mAppId = (String) zt8.m55252b(bundle, "app_id", cls2, null);
            this.mOrigin = (String) zt8.m55252b(bundle, "origin", cls2, null);
            this.mName = (String) zt8.m55252b(bundle, PublicResolver.FUNC_NAME, cls2, null);
            this.mValue = zt8.m55252b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zt8.m55252b(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) zt8.m55252b(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) zt8.m55252b(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) zt8.m55252b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) zt8.m55252b(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) zt8.m55252b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) zt8.m55252b(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) zt8.m55252b(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) zt8.m55252b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) zt8.m55252b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zt8.m55252b(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zt8.m55252b(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }

        /* renamed from: a */
        public final Bundle mo31338a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(PublicResolver.FUNC_NAME, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                zt8.m55251a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(kr8 kr8) {
        cu4.m43221k(kr8);
        this.f23055a = kr8;
        this.f23056b = null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f23054c
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f23054c     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            ux8 r2 = (p000.ux8) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((p000.ux8) r2)     // Catch:{ all -> 0x0056 }
            f23054c = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            kr8 r14 = p000.kr8.m47470e(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((p000.kr8) r14)     // Catch:{ all -> 0x0056 }
            f23054c = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f23054c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            ux8.mo44452l(str);
            return;
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45259d().mo46407f(str, this.f23055a.mo45256a().mo29581b());
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            ux8.mo44458r(str, str2, bundle);
            return;
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45242F().mo47897B(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            ux8.mo44454n(str);
            return;
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45259d().mo46408g(str, this.f23055a.mo45256a().mo29581b());
    }

    @Keep
    public long generateEventId() {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44446a();
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45243G().mo42812h0();
    }

    @Keep
    public String getAppInstanceId() {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44447f();
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45242F().mo47925n();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            list = ux8.mo44457q(str, str2);
        } else {
            cu4.m43221k(this.f23055a);
            list = this.f23055a.mo45242F().mo47898C(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44448g();
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45242F().mo47901F();
    }

    @Keep
    public String getCurrentScreenName() {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44449h();
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45242F().mo47900E();
    }

    @Keep
    public String getGmpAppId() {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44451k();
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45242F().mo47902G();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44455o(str);
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45242F().mo47933x(str);
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            return ux8.mo44456p(str, str2, z);
        }
        cu4.m43221k(this.f23055a);
        return this.f23055a.mo45242F().mo47899D(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            ux8.mo44450i(str, str2, bundle);
            return;
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45242F().mo47916X(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        cu4.m43221k(conditionalUserProperty);
        ux8 ux8 = this.f23056b;
        if (ux8 != null) {
            ux8.mo44453m(conditionalUserProperty.mo31338a());
            return;
        }
        cu4.m43221k(this.f23055a);
        this.f23055a.mo45242F().mo47934y(conditionalUserProperty.mo31338a());
    }

    public AppMeasurement(ux8 ux8) {
        cu4.m43221k(ux8);
        this.f23056b = ux8;
        this.f23055a = null;
    }
}
