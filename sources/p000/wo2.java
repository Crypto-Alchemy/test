package p000;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, mo44877d2 = {"Lwo2;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lwo2$a;", "callback", "Landroidx/biometric/BiometricPrompt;", "b", "Landroidx/fragment/app/Fragment;", "fragment", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wo2 */
/* compiled from: IRequestBiometricAuthUseCase.kt */
public interface wo2 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, mo44877d2 = {"Lwo2$a;", "", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wo2$a */
    /* compiled from: IRequestBiometricAuthUseCase.kt */
    public interface C9557a {
        /* renamed from: a */
        void mo56680a(int i);

        /* renamed from: b */
        void mo56681b();
    }

    /* renamed from: a */
    BiometricPrompt mo66749a(Fragment fragment, C9557a aVar);

    /* renamed from: b */
    BiometricPrompt mo66750b(FragmentActivity fragmentActivity, C9557a aVar);
}
