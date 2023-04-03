package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C6436rf;

/* renamed from: wf */
/* compiled from: AnalyticsDeferredProxy */
public class C6661wf {

    /* renamed from: a */
    public final ya1<C6436rf> f35317a;

    /* renamed from: b */
    public volatile C6700xf f35318b;

    /* renamed from: c */
    public volatile e40 f35319c;

    /* renamed from: d */
    public final List<d40> f35320d;

    public C6661wf(ya1<C6436rf> ya1) {
        this(ya1, new rg1(), new m37());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m53871g(String str, Bundle bundle) {
        this.f35318b.mo45344b(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m53872h(d40 d40) {
        synchronized (this) {
            if (this.f35319c instanceof rg1) {
                this.f35320d.add(d40);
            }
            this.f35319c.mo29869b(d40);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m53873i(ly4 ly4) {
        C6436rf rfVar = (C6436rf) ly4.get();
        yu0 yu0 = new yu0(rfVar);
        qu0 qu0 = new qu0();
        if (m53874j(rfVar, qu0) != null) {
            rk3.m51112f().mo47423b("Registered Firebase Analytics listener.");
            c40 c40 = new c40();
            l30 l30 = new l30(yu0, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (d40 b : this.f35320d) {
                    c40.mo29869b(b);
                }
                qu0.mo47276d(c40);
                qu0.mo47277e(l30);
                this.f35319c = c40;
                this.f35318b = l30;
            }
            return;
        }
        rk3.m51112f().mo47431k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    public static C6436rf.C6437a m53874j(C6436rf rfVar, qu0 qu0) {
        C6436rf.C6437a c = rfVar.mo47396c("clx", qu0);
        if (c == null) {
            rk3.m51112f().mo47423b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            c = rfVar.mo47396c("crash", qu0);
            if (c != null) {
                rk3.m51112f().mo47431k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return c;
    }

    /* renamed from: d */
    public C6700xf mo49190d() {
        return new C6569uf(this);
    }

    /* renamed from: e */
    public e40 mo49191e() {
        return new C6531tf(this);
    }

    /* renamed from: f */
    public final void mo49192f() {
        this.f35317a.mo48748a(new C6602vf(this));
    }

    public C6661wf(ya1<C6436rf> ya1, e40 e40, C6700xf xfVar) {
        this.f35317a = ya1;
        this.f35319c = e40;
        this.f35320d = new ArrayList();
        this.f35318b = xfVar;
        mo49192f();
    }
}
