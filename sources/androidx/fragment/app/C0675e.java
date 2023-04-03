package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentHostCallback */
public abstract class C0675e<E> extends k92 {

    /* renamed from: a */
    public final Activity f3832a;

    /* renamed from: d */
    public final Context f3833d;

    /* renamed from: e */
    public final Handler f3834e;

    /* renamed from: g */
    public final int f3835g;

    /* renamed from: k */
    public final FragmentManager f3836k;

    public C0675e(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: c */
    public View mo5861c(int i) {
        return null;
    }

    /* renamed from: d */
    public boolean mo5862d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity mo6183e() {
        return this.f3832a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo6184f() {
        return this.f3833d;
    }

    /* renamed from: g */
    public Handler mo6185g() {
        return this.f3834e;
    }

    /* renamed from: h */
    public abstract E mo5887h();

    /* renamed from: i */
    public LayoutInflater mo5888i() {
        return LayoutInflater.from(this.f3833d);
    }

    @Deprecated
    /* renamed from: j */
    public void mo6186j(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: k */
    public boolean mo5889k(String str) {
        return false;
    }

    /* renamed from: l */
    public void mo6187l(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            zr0.m31448k(this.f3833d, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: m */
    public void mo6188m(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C3582x9.m29967y(this.f3832a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: n */
    public void mo5890n() {
    }

    public C0675e(Activity activity, Context context, Handler handler, int i) {
        this.f3836k = new ea2();
        this.f3832a = activity;
        this.f3833d = (Context) gu4.m18429g(context, "context == null");
        this.f3834e = (Handler) gu4.m18429g(handler, "handler == null");
        this.f3835g = i;
    }
}
