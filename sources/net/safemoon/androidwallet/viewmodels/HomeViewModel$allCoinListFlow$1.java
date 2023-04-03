package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.ActiveTokenListMode;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.repository.AllTokensDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldl4;", "", "Lnet/safemoon/androidwallet/model/Coin;", "invoke", "()Ldl4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$allCoinListFlow$1 extends Lambda implements pc2<dl4<Integer, Coin>> {
    public final /* synthetic */ HomeViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$allCoinListFlow$1$a", "Lbo2;", "", "get", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$allCoinListFlow$1$a */
    /* compiled from: HomeViewModel.kt */
    public static final class C8695a implements bo2 {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f42758a;

        public C8695a(HomeViewModel homeViewModel) {
            this.f42758a = homeViewModel;
        }

        public String get() {
            return this.f42758a.f42740c;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$allCoinListFlow$1$b", "Lbo2;", "", "get", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$allCoinListFlow$1$b */
    /* compiled from: HomeViewModel.kt */
    public static final class C8696b implements bo2 {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f42759a;

        public C8696b(HomeViewModel homeViewModel) {
            this.f42759a = homeViewModel;
        }

        public String get() {
            return this.f42759a.f42741d;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$allCoinListFlow$1$c", "Lbo2;", "", "get", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$allCoinListFlow$1$c */
    /* compiled from: HomeViewModel.kt */
    public static final class C8697c implements bo2 {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f42760a;

        public C8697c(HomeViewModel homeViewModel) {
            this.f42760a = homeViewModel;
        }

        public String get() {
            String value;
            ActiveTokenListMode value2 = this.f42760a.mo61224f().getValue();
            if (value2 == null || (value = value2.getValue()) == null) {
                return "";
            }
            return value;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/HomeViewModel$allCoinListFlow$1$d", "Lbo2;", "", "get", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.HomeViewModel$allCoinListFlow$1$d */
    /* compiled from: HomeViewModel.kt */
    public static final class C8698d implements bo2 {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f42761a;

        public C8698d(HomeViewModel homeViewModel) {
            this.f42761a = homeViewModel;
        }

        public String get() {
            String value = this.f42761a.mo61223e().getValue();
            if (value == null) {
                return "";
            }
            return value;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$allCoinListFlow$1(HomeViewModel homeViewModel) {
        super(0);
        this.this$0 = homeViewModel;
    }

    public final dl4<Integer, Coin> invoke() {
        ho3 l = C9384u3.m72571l();
        vx2.m53590f(l, "getMarketClient()");
        return new AllTokensDataSource(l, new C8695a(this.this$0), new C8696b(this.this$0), new C8697c(this.this$0), new C8698d(this.this$0));
    }
}
