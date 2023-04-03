package p000;

import android.app.Activity;
import android.content.Context;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import p000.wo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Ly12;", "Lwo2;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lwo2$a;", "callback", "Landroidx/biometric/BiometricPrompt;", "b", "Landroidx/fragment/app/Fragment;", "fragment", "a", "Landroid/content/Context;", "context", "Landroidx/biometric/BiometricPrompt$d;", "f", "Landroidx/biometric/BiometricPrompt;", "biometricPrompt", "Lwo2$a;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "c", "Ljava/lang/ref/WeakReference;", "Landroidx/biometric/BiometricPrompt$a;", "d", "Landroidx/biometric/BiometricPrompt$a;", "biometricPromptAuthenticationCallback", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: y12 */
/* compiled from: FingerprintBiometricAuthUseCase.kt */
public final class y12 implements wo2 {

    /* renamed from: a */
    public BiometricPrompt f46086a;

    /* renamed from: b */
    public wo2.C9557a f46087b;

    /* renamed from: c */
    public WeakReference<Activity> f46088c;

    /* renamed from: d */
    public final BiometricPrompt.C0277a f46089d = new C9619a(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo44877d2 = {"y12$a", "Landroidx/biometric/BiometricPrompt$a;", "", "errorCode", "", "errString", "Lr37;", "a", "Landroidx/biometric/BiometricPrompt$b;", "result", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: y12$a */
    /* compiled from: FingerprintBiometricAuthUseCase.kt */
    public static final class C9619a extends BiometricPrompt.C0277a {

        /* renamed from: a */
        public final /* synthetic */ y12 f46090a;

        public C9619a(y12 y12) {
            this.f46090a = y12;
        }

        /* renamed from: a */
        public void mo2629a(int i, CharSequence charSequence) {
            vx2.m53591g(charSequence, "errString");
            super.mo2629a(i, charSequence);
            BiometricPrompt d = this.f46090a.f46086a;
            if (d != null) {
                d.mo2626d();
            }
            WeakReference c = this.f46090a.f46088c;
            if (c != null) {
                a77.m55424b((Activity) c.get(), Boolean.FALSE);
            }
            if (i == 10 || i == 11) {
                wo2.C9557a e = this.f46090a.f46087b;
                if (e != null) {
                    e.mo56680a(i);
                    return;
                }
                return;
            }
            String str = "AuthenticationCallback: error(" + i + ") " + charSequence;
            String simpleName = this.f46090a.getClass().getSimpleName();
            vx2.m53590f(simpleName, "this@FingerprintBiometri…se::class.java.simpleName");
            ol0.m70350b0(str, simpleName);
        }

        /* renamed from: c */
        public void mo2631c(BiometricPrompt.C0278b bVar) {
            vx2.m53591g(bVar, "result");
            super.mo2631c(bVar);
            wo2.C9557a e = this.f46090a.f46087b;
            if (e != null) {
                e.mo56681b();
            }
            WeakReference c = this.f46090a.f46088c;
            if (c != null) {
                a77.m55424b((Activity) c.get(), Boolean.FALSE);
            }
        }
    }

    /* renamed from: a */
    public BiometricPrompt mo66749a(Fragment fragment, wo2.C9557a aVar) {
        vx2.m53591g(fragment, "fragment");
        vx2.m53591g(aVar, "callback");
        this.f46087b = aVar;
        WeakReference<Activity> weakReference = new WeakReference<>(fragment.requireActivity());
        this.f46088c = weakReference;
        a77.m55424b(weakReference.get(), Boolean.TRUE);
        BiometricPrompt biometricPrompt = new BiometricPrompt(fragment, this.f46089d);
        this.f46086a = biometricPrompt;
        vx2.m53588d(biometricPrompt);
        Context applicationContext = fragment.requireActivity().getApplicationContext();
        vx2.m53590f(applicationContext, "fragment.requireActivity().applicationContext");
        biometricPrompt.mo2624b(mo66997f(applicationContext));
        BiometricPrompt biometricPrompt2 = this.f46086a;
        vx2.m53588d(biometricPrompt2);
        return biometricPrompt2;
    }

    /* renamed from: b */
    public BiometricPrompt mo66750b(FragmentActivity fragmentActivity, wo2.C9557a aVar) {
        vx2.m53591g(fragmentActivity, "activity");
        vx2.m53591g(aVar, "callback");
        this.f46087b = aVar;
        WeakReference<Activity> weakReference = new WeakReference<>(fragmentActivity);
        this.f46088c = weakReference;
        a77.m55424b(weakReference.get(), Boolean.TRUE);
        BiometricPrompt biometricPrompt = new BiometricPrompt(fragmentActivity, this.f46089d);
        this.f46086a = biometricPrompt;
        vx2.m53588d(biometricPrompt);
        Context applicationContext = fragmentActivity.getApplicationContext();
        vx2.m53590f(applicationContext, "activity.applicationContext");
        biometricPrompt.mo2624b(mo66997f(applicationContext));
        BiometricPrompt biometricPrompt2 = this.f46086a;
        vx2.m53588d(biometricPrompt2);
        return biometricPrompt2;
    }

    /* renamed from: f */
    public final BiometricPrompt.C0280d mo66997f(Context context) {
        BiometricPrompt.C0280d a = new BiometricPrompt.C0280d.C0281a().mo2649e(context.getText(R.string.biometric_dialog_title)).mo2648d(context.getText(R.string.biometric_dialog_content)).mo2646b(33023).mo2647c(false).mo2645a();
        vx2.m53590f(a, "Builder()\n            .s…lse)\n            .build()");
        return a;
    }
}
