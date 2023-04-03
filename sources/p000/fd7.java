package p000;

import androidx.lifecycle.C0714d;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;
import p000.zv0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, mo44877d2 = {"Lhd7;", "owner", "Lzv0;", "a", "lifecycle-viewmodel_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: fd7 */
/* compiled from: ViewModelProvider.kt */
public final class fd7 {
    /* renamed from: a */
    public static final zv0 m16947a(hd7 hd7) {
        vx2.m53591g(hd7, ENS.FUNC_OWNER);
        if (!(hd7 instanceof C0714d)) {
            return zv0.C3764a.f20690b;
        }
        zv0 defaultViewModelCreationExtras = ((C0714d) hd7).getDefaultViewModelCreationExtras();
        vx2.m53590f(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }
}
