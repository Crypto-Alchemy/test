package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo44877d2 = {"Lvo2;", "", "", "deviceToken", "", "xAddress", "Lkotlin/Function1;", "", "Lr37;", "callBack", "a", "(Ljava/lang/String;[Ljava/lang/String;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vo2 */
/* compiled from: IRegisterDeviceTokenUseCase.kt */
public interface vo2 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: vo2$a */
    /* compiled from: IRegisterDeviceTokenUseCase.kt */
    public static final class C9463a {
        /* renamed from: a */
        public static /* synthetic */ void m73298a(vo2 vo2, String str, String[] strArr, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    rc2 = null;
                }
                vo2.mo50130a(str, strArr, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
    }

    /* renamed from: a */
    void mo50130a(String str, String[] strArr, rc2<? super Boolean, r37> rc2);
}
