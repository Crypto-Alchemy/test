package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;
import p000.wz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a", "invoke", "()Lnet/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSelectCurrencyActivity.kt */
public final class AKTSelectCurrencyActivity$defaultCurrencyAdapter$2 extends Lambda implements pc2<C8171a> {
    public final /* synthetic */ AKTSelectCurrencyActivity this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a", "Lwz1;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a */
    /* compiled from: AKTSelectCurrencyActivity.kt */
    public static final class C8171a extends wz1 {
        public C8171a(AKTSelectCurrencyActivity aKTSelectCurrencyActivity, C8172b bVar) {
            super(aKTSelectCurrencyActivity, bVar);
        }

        /* renamed from: c */
        public Fiat mo56787c() {
            return rz1.f44501a.mo65771a();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$b", "Lwz1$a;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$b */
    /* compiled from: AKTSelectCurrencyActivity.kt */
    public static final class C8172b implements wz1.C9572a {

        /* renamed from: a */
        public final /* synthetic */ AKTSelectCurrencyActivity f41370a;

        public C8172b(AKTSelectCurrencyActivity aKTSelectCurrencyActivity) {
            this.f41370a = aKTSelectCurrencyActivity;
        }

        /* renamed from: a */
        public void mo56788a(Fiat fiat) {
            vx2.m53591g(fiat, "item");
            SelectFiatViewModel.m68799o(this.f41370a.mo56782c0(), fiat, false, (pc2) null, 4, (Object) null);
            this.f41370a.onBackPressed();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSelectCurrencyActivity$defaultCurrencyAdapter$2(AKTSelectCurrencyActivity aKTSelectCurrencyActivity) {
        super(0);
        this.this$0 = aKTSelectCurrencyActivity;
    }

    public final C8171a invoke() {
        return new C8171a(this.this$0, new C8172b(this.this$0));
    }
}
