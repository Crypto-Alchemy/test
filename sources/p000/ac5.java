package p000;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.DeviceModel;
import net.safemoon.androidwallet.model.SingleFCMRegister;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lac5;", "Lvo2;", "", "deviceToken", "", "_xAddress", "Lkotlin/Function1;", "", "Lr37;", "callBack", "a", "(Ljava/lang/String;[Ljava/lang/String;Lrc2;)V", "Ltk5;", "Ltk5;", "api", "Landroid/content/Context;", "b", "Landroid/content/Context;", "context", "kotlin.jvm.PlatformType", "c", "Ljava/lang/String;", "TAG", "<init>", "(Ltk5;Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ac5 */
/* compiled from: RegisterDeviceTokenUseCase.kt */
public final class ac5 implements vo2 {

    /* renamed from: a */
    public final tk5 f36423a;

    /* renamed from: b */
    public final Context f36424b;

    /* renamed from: c */
    public final String f36425c = ac5.class.getSimpleName();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ac5$a", "Lp90;", "Lnet/safemoon/androidwallet/model/DeviceModel;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ac5$a */
    /* compiled from: RegisterDeviceTokenUseCase.kt */
    public static final class C6817a implements p90<DeviceModel> {

        /* renamed from: a */
        public final /* synthetic */ rc2<Boolean, r37> f36426a;

        /* renamed from: b */
        public final /* synthetic */ ac5 f36427b;

        public C6817a(rc2<? super Boolean, r37> rc2, ac5 ac5) {
            this.f36426a = rc2;
            this.f36427b = ac5;
        }

        /* renamed from: a */
        public void mo47103a(k90<DeviceModel> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            rc2<Boolean, r37> rc2 = this.f36426a;
            if (rc2 != null) {
                rc2.invoke(Boolean.FALSE);
            }
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.getMessage();
            }
            if (localizedMessage != null) {
                String b = this.f36427b.f36425c;
                vx2.m53590f(b, "TAG");
                ol0.m70350b0(localizedMessage, b);
            }
        }

        /* renamed from: b */
        public void mo47104b(k90<DeviceModel> k90, bg5<DeviceModel> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            try {
                rc2<Boolean, r37> rc2 = this.f36426a;
                if (rc2 != null) {
                    rc2.invoke(Boolean.TRUE);
                }
                String valueOf = String.valueOf(bg5.mo50578a());
                String b = this.f36427b.f36425c;
                vx2.m53590f(b, "TAG");
                ol0.m70350b0(valueOf, b);
            } catch (Exception e) {
                rc2<Boolean, r37> rc22 = this.f36426a;
                if (rc22 != null) {
                    rc22.invoke(Boolean.FALSE);
                }
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = e.getMessage();
                }
                if (localizedMessage != null) {
                    String b2 = this.f36427b.f36425c;
                    vx2.m53590f(b2, "TAG");
                    ol0.m70350b0(localizedMessage, b2);
                }
            }
        }
    }

    public ac5(tk5 tk5, Context context) {
        vx2.m53591g(tk5, "api");
        vx2.m53591g(context, "context");
        this.f36423a = tk5;
        this.f36424b = context;
    }

    /* renamed from: a */
    public void mo50130a(String str, String[] strArr, rc2<? super Boolean, r37> rc2) {
        boolean z;
        boolean z2;
        String[] strArr2 = strArr;
        vx2.m53591g(str, "deviceToken");
        vx2.m53591g(strArr2, "_xAddress");
        for (String str2 : strArr2) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    tk5 tk5 = this.f36423a;
                    SingleFCMRegister singleFCMRegister = r3;
                    SingleFCMRegister singleFCMRegister2 = new SingleFCMRegister(str, str2, (String) null, Common.m68291i(Common.f42577a, this.f36424b, (String) null, 2, (Object) null), rz1.f44501a.mo65771a().getSymbol(), Boolean.valueOf(f06.m57514e(this.f36424b, "FCM_TOKEN", true)), 4, (DefaultConstructorMarker) null);
                    tk5.mo66092k(singleFCMRegister).mo50512X(new C6817a(rc2, this));
                }
            }
            rc2<? super Boolean, r37> rc22 = rc2;
        }
    }
}
