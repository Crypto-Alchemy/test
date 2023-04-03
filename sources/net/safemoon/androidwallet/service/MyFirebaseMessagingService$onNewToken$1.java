package net.safemoon.androidwallet.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;
import p000.vo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.service.MyFirebaseMessagingService$onNewToken$1", mo48632f = "MyFirebaseMessagingService.kt", mo48633l = {154, 161}, mo48634m = "invokeSuspend")
/* compiled from: MyFirebaseMessagingService.kt */
public final class MyFirebaseMessagingService$onNewToken$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $newToken;
    public Object L$0;
    public int label;
    public final /* synthetic */ MyFirebaseMessagingService this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.service.MyFirebaseMessagingService$onNewToken$1$2", mo48632f = "MyFirebaseMessagingService.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.service.MyFirebaseMessagingService$onNewToken$1$2 */
    /* compiled from: MyFirebaseMessagingService.kt */
    public static final class C86222 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86222(myFirebaseMessagingService, str, list, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86222) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                tk5 o = C9384u3.m72574o();
                vx2.m53590f(o, "getSafeMoonClient()");
                ac5 ac5 = new ac5(o, myFirebaseMessagingService);
                String str = str;
                String[] strArr = (String[]) list.toArray(new String[0]);
                vo2.C9463a.m73298a(ac5, str, (String[]) Arrays.copyOf(strArr, strArr.length), (rc2) null, 4, (Object) null);
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyFirebaseMessagingService$onNewToken$1(MyFirebaseMessagingService myFirebaseMessagingService, String str, ns0<? super MyFirebaseMessagingService$onNewToken$1> ns0) {
        super(2, ns0);
        this.this$0 = myFirebaseMessagingService;
        this.$newToken = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MyFirebaseMessagingService$onNewToken$1(this.this$0, this.$newToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MyFirebaseMessagingService$onNewToken$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        final List list;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            list = new ArrayList();
            WalletDataSource walletDataSource = new WalletDataSource(MainRoomDatabase.f41647p.mo57110b(this.this$0).mo57108Q());
            this.L$0 = list;
            this.label = 1;
            obj = walletDataSource.mo60771c(this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            list = (List) this.L$0;
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        for (Wallet allAddressOfWallet : (Iterable) obj) {
            List<String> allAddressOfWallet2 = allAddressOfWallet.getAllAddressOfWallet();
            if (!allAddressOfWallet2.isEmpty()) {
                list.addAll(allAddressOfWallet2);
            }
        }
        vm3 c = qh1.m71266c();
        final MyFirebaseMessagingService myFirebaseMessagingService = this.this$0;
        final String str = this.$newToken;
        C86222 r3 = new C86222((ns0<? super C86222>) null);
        this.L$0 = null;
        this.label = 2;
        if (b50.m55768e(c, r3, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
