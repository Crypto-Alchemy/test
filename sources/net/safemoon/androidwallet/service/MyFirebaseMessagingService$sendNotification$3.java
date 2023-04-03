package net.safemoon.androidwallet.service;

import android.app.NotificationManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryData;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryResult;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import p000.f94;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.service.MyFirebaseMessagingService$sendNotification$3", mo48632f = "MyFirebaseMessagingService.kt", mo48633l = {127}, mo48634m = "invokeSuspend")
/* compiled from: MyFirebaseMessagingService.kt */
public final class MyFirebaseMessagingService$sendNotification$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ f94.C2277e $notificationBuilder;
    public final /* synthetic */ NotificationManager $notificationManager;
    public int label;
    public final /* synthetic */ MyFirebaseMessagingService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyFirebaseMessagingService$sendNotification$3(MyFirebaseMessagingService myFirebaseMessagingService, f94.C2277e eVar, NotificationManager notificationManager, ns0<? super MyFirebaseMessagingService$sendNotification$3> ns0) {
        super(2, ns0);
        this.this$0 = myFirebaseMessagingService;
        this.$notificationBuilder = eVar;
        this.$notificationManager = notificationManager;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MyFirebaseMessagingService$sendNotification$3(this.this$0, this.$notificationBuilder, this.$notificationManager, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MyFirebaseMessagingService$sendNotification$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        NotificationHistoryData data;
        ArrayList<NotificationHistoryResult> result;
        Object d = wx2.m54101d();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            hg5.m45199b(obj);
            List<TokenType> a = Common.f42577a.mo60896a(true);
            MyFirebaseMessagingService myFirebaseMessagingService = this.this$0;
            ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
            Iterator<T> it = a.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                TokenType tokenType = (TokenType) it.next();
                Wallet c = ol0.m70351c(myFirebaseMessagingService);
                if (c != null) {
                    str = c.getAddress(tokenType.getCoinType().getValue());
                }
                arrayList.add(str);
            }
            String i0 = CollectionsKt___CollectionsKt.m47338i0(CollectionsKt___CollectionsKt.m47326W(arrayList), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
            tk5 o = C9384u3.m72574o();
            vx2.m53590f(o, "getSafeMoonClient()");
            ag2 ag2 = new ag2(o);
            Common common = Common.f42577a;
            Context applicationContext = this.this$0.getApplicationContext();
            vx2.m53590f(applicationContext, "this@MyFirebaseMessagingService.applicationContext");
            String i3 = Common.m68291i(common, applicationContext, (String) null, 2, (Object) null);
            this.label = 1;
            obj2 = ag2.mo50161a(i0, i3, this);
            if (obj2 == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
                obj2 = obj;
            } catch (RuntimeException e) {
                String message = e.getMessage();
                if (message != null) {
                    String simpleName = this.this$0.getClass().getSimpleName();
                    vx2.m53590f(simpleName, "this@MyFirebaseMessaging…ce::class.java.simpleName");
                    ol0.m70350b0(message, simpleName);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NotificationHistory notificationHistory = (NotificationHistory) obj2;
        if (!(notificationHistory == null || (data = notificationHistory.getData()) == null || (result = data.getResult()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T next : result) {
                if (!((NotificationHistoryResult) next).read) {
                    arrayList2.add(next);
                }
            }
            i2 = arrayList2.size();
        }
        this.$notificationBuilder.mo19810w(i2);
        this.$notificationManager.notify(0, this.$notificationBuilder.mo19790b());
        return r37.f33317a;
    }
}
