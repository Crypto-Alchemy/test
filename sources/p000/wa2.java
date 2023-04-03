package p000;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: wa2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wa2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f19053a;

    /* renamed from: d */
    public final /* synthetic */ Violation f19054d;

    public /* synthetic */ wa2(String str, Violation violation) {
        this.f19053a = str;
        this.f19054d = violation;
    }

    public final void run() {
        FragmentStrictMode.m4998f(this.f19053a, this.f19054d);
    }
}
