package net.safemoon.androidwallet.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTHomeActivity;
import p000.f94;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J4\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "Lr37;", "o", "", "newToken", "q", "messageTitle", "messageBody", "transactionHash", "ticketId", "t", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyFirebaseMessagingService.kt */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: A */
    public static String f42544A = "ARG_NEW_TOKEN";

    /* renamed from: B */
    public static String f42545B = "ARG_REFRESH_NOTIFICATIONS";

    /* renamed from: s */
    public static final C8621a f42546s = new C8621a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static String f42547x = "TRANSACTION_HASH";

    /* renamed from: y */
    public static String f42548y = "TICKET_ID";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/MyFirebaseMessagingService$a;", "", "", "ARG_NEW_TOKEN", "Ljava/lang/String;", "ARG_REFRESH_NOTIFICATIONS", "ARG_TICKET_ID", "ARG_TRANSACTION_HASH", "TAG", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.service.MyFirebaseMessagingService$a */
    /* compiled from: MyFirebaseMessagingService.kt */
    public static final class C8621a {
        public C8621a() {
        }

        public /* synthetic */ C8621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m68254u(MyFirebaseMessagingService myFirebaseMessagingService, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        myFirebaseMessagingService.mo60817t(str, str2, str3, str4);
    }

    /* renamed from: o */
    public void mo36240o(RemoteMessage remoteMessage) {
        yx0 yx0;
        Class<AKTHomeActivity> cls = AKTHomeActivity.class;
        vx2.m53591g(remoteMessage, "remoteMessage");
        super.mo36240o(remoteMessage);
        Map<String, String> r1 = remoteMessage.mo36245r1();
        vx2.m53590f(r1, "remoteMessage.data");
        RemoteMessage.C4802b s1 = remoteMessage.mo36246s1();
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived:--> ");
        sb.append(r1);
        String str = r1.get("transactionHash");
        String str2 = r1.get("ticket_id");
        if (s1 != null) {
            String c = s1.mo36249c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMessageReceived:--> ");
            sb2.append(c);
            String a = s1.mo36248a();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onMessageReceived:--> ");
            sb3.append(a);
            if (str2 != null) {
                m68254u(this, s1.mo36249c(), s1.mo36248a(), (String) null, str2, 4, (Object) null);
                f06.m57523n(this, "ZENDESK_HAVE_NEW_REPLY", Boolean.TRUE);
            } else {
                m68254u(this, s1.mo36249c(), s1.mo36248a(), str, (String) null, 8, (Object) null);
            }
        }
        if (!r1.containsKey("custom") || r1.get("custom") == null) {
            Intent intent = new Intent(this, cls);
            intent.addFlags(335544320);
            intent.putExtra(f42545B, true);
            startActivity(intent);
            return;
        }
        try {
            yx0 = (yx0) new Gson().fromJson(r1.get("custom"), yx0.class);
        } catch (Exception unused) {
            yx0 = null;
        }
        if (yx0 != null) {
            yx0.mo67184a();
        }
        if (vx2.m53586b((Object) null, "true")) {
            Intent intent2 = new Intent(this, cls);
            intent2.addFlags(335544320);
            intent2.putExtra(f42544A, true);
            startActivity(intent2);
        }
    }

    /* renamed from: q */
    public void mo36242q(String str) {
        vx2.m53591g(str, "newToken");
        super.mo36242q(str);
        if (f06.m57519j(getApplication(), "TEMP_FCM_TOKEN", (String) null) == null) {
            y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new MyFirebaseMessagingService$onNewToken$1(this, str, (ns0<? super MyFirebaseMessagingService$onNewToken$1>) null), 2, (Object) null);
        }
    }

    /* renamed from: t */
    public final void mo60817t(String str, String str2, String str3, String str4) {
        Intent intent = new Intent(this, AKTHomeActivity.class);
        intent.putExtra("isFrom", "Notification");
        if (str3 != null) {
            intent.putExtra(f42547x, str3);
        }
        if (str4 != null) {
            intent.putExtra(f42548y, str4);
        }
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        f94.C2277e y = new f94.C2277e(this, "net.safemoon.androidwallet").mo19782A(R.drawable.ic_notification).mo19800m(str).mo19799l(str2).mo19794g(true).mo19786E(new long[]{500, 500, 500, 500, 500}).mo19801n(-1).mo19812y(1);
        vx2.m53590f(y, "Builder(this, MyApplicat…tionCompat.PRIORITY_HIGH)");
        y.mo19808u(-16776961, 1, 1).mo19783B(defaultUri).mo19798k(activity);
        Object systemService = getSystemService("notification");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("net.safemoon.androidwallet", getText(R.string.notification_channel_new_transaction), 4);
            notificationChannel.setDescription("Safemoon");
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLightColor(-16711936);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannel);
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MyFirebaseMessagingService$sendNotification$3(this, y, notificationManager, (ns0<? super MyFirebaseMessagingService$sendNotification$3>) null), 3, (Object) null);
            return;
        }
        notificationManager.notify(0, y.mo19790b());
    }
}
