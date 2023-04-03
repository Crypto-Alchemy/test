package net.safemoon.androidwallet.repository;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u001b\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u000bJ?\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u0003*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/FcmDataSource;", "", "", "kotlin.jvm.PlatformType", "c", "(Lns0;)Ljava/lang/Object;", "lang", "currency", "", "isSendPushPriceAlert", "Lkotlin/Function1;", "Lr37;", "callBack", "f", "h", "e", "(Ljava/lang/String;Ljava/lang/String;ZLrc2;Lns0;)Ljava/lang/Object;", "oldFCMToken", "i", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "application", "Ltk5;", "b", "Lef3;", "d", "()Ltk5;", "safemoonAPIInterface", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: FcmDataSource.kt */
public final class FcmDataSource {

    /* renamed from: a */
    public final Application f42511a;

    /* renamed from: b */
    public final ef3 f42512b = C6169a.m47232a(FcmDataSource$safemoonAPIInterface$2.INSTANCE);

    public FcmDataSource(Application application) {
        vx2.m53591g(application, "application");
        this.f42511a = application;
    }

    /* renamed from: g */
    public static /* synthetic */ void m68151g(FcmDataSource fcmDataSource, String str, String str2, boolean z, rc2 rc2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Common.m68291i(Common.f42577a, fcmDataSource.f42511a, (String) null, 2, (Object) null);
        }
        if ((i & 2) != 0) {
            str2 = rz1.f44501a.mo65771a().getSymbol();
        }
        if ((i & 4) != 0) {
            z = f06.m57514e(fcmDataSource.f42511a, "FCM_TOKEN", true);
        }
        fcmDataSource.mo60727f(str, str2, z, rc2);
    }

    /* renamed from: c */
    public final Object mo60724c(ns0<? super String> ns0) {
        return jm6.m46615a(FirebaseMessaging.m38582g().mo36214i());
    }

    /* renamed from: d */
    public final tk5 mo60725d() {
        return (tk5) this.f42512b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1 A[LOOP:0: B:27:0x00db->B:29:0x00e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0105 A[Catch:{ Exception -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0106 A[Catch:{ Exception -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60726e(java.lang.String r22, java.lang.String r23, boolean r24, p000.rc2<? super java.lang.Boolean, p000.r37> r25, p000.ns0<? super p000.r37> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r26
            boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.FcmDataSource$updateFCMToken$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.repository.FcmDataSource$updateFCMToken$1 r2 = (net.safemoon.androidwallet.repository.FcmDataSource$updateFCMToken$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.repository.FcmDataSource$updateFCMToken$1 r2 = new net.safemoon.androidwallet.repository.FcmDataSource$updateFCMToken$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0075
            if (r4 == r8) goto L_0x005f
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r2 = r2.L$0
            rc2 r2 = (p000.rc2) r2
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0137
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            boolean r4 = r2.Z$0
            java.lang.Object r6 = r2.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r2.L$3
            rc2 r9 = (p000.rc2) r9
            java.lang.Object r10 = r2.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$0
            net.safemoon.androidwallet.repository.FcmDataSource r12 = (net.safemoon.androidwallet.repository.FcmDataSource) r12
            p000.hg5.m45199b(r1)
            r15 = r10
            r14 = r11
            r11 = r6
            goto L_0x00ca
        L_0x005f:
            boolean r4 = r2.Z$0
            java.lang.Object r9 = r2.L$3
            rc2 r9 = (p000.rc2) r9
            java.lang.Object r10 = r2.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$0
            net.safemoon.androidwallet.repository.FcmDataSource r12 = (net.safemoon.androidwallet.repository.FcmDataSource) r12
            p000.hg5.m45199b(r1)
            goto L_0x009e
        L_0x0075:
            p000.hg5.m45199b(r1)
            r2.L$0 = r0
            r1 = r22
            r2.L$1 = r1
            r4 = r23
            r2.L$2 = r4
            r9 = r25
            r2.L$3 = r9
            r10 = r24
            r2.Z$0 = r10
            r2.label = r8
            java.lang.Object r11 = r0.mo60724c(r2)
            if (r11 != r3) goto L_0x0093
            return r3
        L_0x0093:
            r12 = r0
            r19 = r11
            r11 = r1
            r1 = r19
            r20 = r10
            r10 = r4
            r4 = r20
        L_0x009e:
            java.lang.String r1 = (java.lang.String) r1
            net.safemoon.androidwallet.repository.WalletDataSource r13 = new net.safemoon.androidwallet.repository.WalletDataSource
            net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$i r14 = net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase.f41647p
            android.app.Application r15 = r12.f42511a
            net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase r14 = r14.mo57110b(r15)
            ih7 r14 = r14.mo57108Q()
            r13.<init>(r14)
            r2.L$0 = r12
            r2.L$1 = r11
            r2.L$2 = r10
            r2.L$3 = r9
            r2.L$4 = r1
            r2.Z$0 = r4
            r2.label = r6
            java.lang.Object r6 = r13.mo60771c(r2)
            if (r6 != r3) goto L_0x00c6
            return r3
        L_0x00c6:
            r15 = r10
            r14 = r11
            r11 = r1
            r1 = r6
        L_0x00ca:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r10 = 10
            int r10 = p000.dk0.m43495u(r1, r10)
            r6.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r10 = r1.next()
            net.safemoon.androidwallet.model.wallets.Wallet r10 = (net.safemoon.androidwallet.model.wallets.Wallet) r10
            java.util.List r10 = r10.getAllAddressOfWallet()
            r6.add(r10)
            goto L_0x00db
        L_0x00ef:
            java.util.List r1 = p000.dk0.m43497w(r6)
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.Object[] r1 = r1.toArray(r6)
            java.lang.String[] r1 = (java.lang.String[]) r1
            tk5 r6 = r12.mo60725d()     // Catch:{ Exception -> 0x0145 }
            net.safemoon.androidwallet.model.FCMNotification r13 = new net.safemoon.androidwallet.model.FCMNotification     // Catch:{ Exception -> 0x0145 }
            r16 = 0
            if (r4 == 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r8 = r7
        L_0x0107:
            java.lang.Boolean r4 = p000.a40.m31670a(r8)     // Catch:{ Exception -> 0x0145 }
            r17 = 4
            r18 = 0
            r10 = r13
            r12 = r1
            r1 = r13
            r13 = r16
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0145 }
            k90 r1 = r6.mo66094m(r1)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r4 = "safemoonAPIInterface.upd…          )\n            )"
            p000.vx2.m53590f(r1, r4)     // Catch:{ Exception -> 0x0145 }
            r2.L$0 = r9     // Catch:{ Exception -> 0x0145 }
            r4 = 0
            r2.L$1 = r4     // Catch:{ Exception -> 0x0145 }
            r2.L$2 = r4     // Catch:{ Exception -> 0x0145 }
            r2.L$3 = r4     // Catch:{ Exception -> 0x0145 }
            r2.L$4 = r4     // Catch:{ Exception -> 0x0145 }
            r2.label = r5     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x0145 }
            if (r1 != r3) goto L_0x0136
            return r3
        L_0x0136:
            r2 = r9
        L_0x0137:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0146 }
            boolean r1 = r1.mo50581e()     // Catch:{ Exception -> 0x0146 }
            java.lang.Boolean r1 = p000.a40.m31670a(r1)     // Catch:{ Exception -> 0x0146 }
            r2.invoke(r1)     // Catch:{ Exception -> 0x0146 }
            goto L_0x014d
        L_0x0145:
            r2 = r9
        L_0x0146:
            java.lang.Boolean r1 = p000.a40.m31670a(r7)
            r2.invoke(r1)
        L_0x014d:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.FcmDataSource.mo60726e(java.lang.String, java.lang.String, boolean, rc2, ns0):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo60727f(String str, String str2, boolean z, rc2<? super Boolean, r37> rc2) {
        vx2.m53591g(str, "lang");
        vx2.m53591g(str2, "currency");
        vx2.m53591g(rc2, "callBack");
        y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new FcmDataSource$updateFCMTokenConfiguration$1(this, str, str2, z, rc2, (ns0<? super FcmDataSource$updateFCMTokenConfiguration$1>) null), 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo60728h() {
        String j = f06.m57519j(this.f42511a, "TEMP_FCM_TOKEN", (String) null);
        if (j != null) {
            y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new FcmDataSource$updateIfPendingToSaveToken$1$1(this, j, (ns0<? super FcmDataSource$updateIfPendingToSaveToken$1$1>) null), 2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3 A[Catch:{ Exception -> 0x00f4 }, LOOP:0: B:26:0x009d->B:28:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4 A[Catch:{ Exception -> 0x00f4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed A[Catch:{ Exception -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60729i(java.lang.String r10, p000.ns0<? super p000.r37> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof net.safemoon.androidwallet.repository.FcmDataSource$updateNewFCMTokenToServer$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            net.safemoon.androidwallet.repository.FcmDataSource$updateNewFCMTokenToServer$1 r0 = (net.safemoon.androidwallet.repository.FcmDataSource$updateNewFCMTokenToServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.FcmDataSource$updateNewFCMTokenToServer$1 r0 = new net.safemoon.androidwallet.repository.FcmDataSource$updateNewFCMTokenToServer$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r10 = r0.L$0
            net.safemoon.androidwallet.repository.FcmDataSource r10 = (net.safemoon.androidwallet.repository.FcmDataSource) r10
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00e5
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            net.safemoon.androidwallet.repository.FcmDataSource r4 = (net.safemoon.androidwallet.repository.FcmDataSource) r4
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x00f4 }
            r8 = r11
            r11 = r10
            r10 = r4
            r4 = r8
            goto L_0x008c
        L_0x004d:
            p000.hg5.m45199b(r11)
            com.google.firebase.messaging.FirebaseMessaging r11 = com.google.firebase.messaging.FirebaseMessaging.m38582g()     // Catch:{ Exception -> 0x00f4 }
            tl6 r11 = r11.mo36210d()     // Catch:{ Exception -> 0x00f4 }
            p000.jm6.m46615a(r11)     // Catch:{ Exception -> 0x00f4 }
            com.google.firebase.messaging.FirebaseMessaging r11 = com.google.firebase.messaging.FirebaseMessaging.m38582g()     // Catch:{ Exception -> 0x00f4 }
            tl6 r11 = r11.mo36214i()     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r11 = p000.jm6.m46615a(r11)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00f4 }
            net.safemoon.androidwallet.repository.WalletDataSource r2 = new net.safemoon.androidwallet.repository.WalletDataSource     // Catch:{ Exception -> 0x00f4 }
            net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase$i r5 = net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase.f41647p     // Catch:{ Exception -> 0x00f4 }
            android.app.Application r6 = r9.f42511a     // Catch:{ Exception -> 0x00f4 }
            net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase r5 = r5.mo57110b(r6)     // Catch:{ Exception -> 0x00f4 }
            ih7 r5 = r5.mo57108Q()     // Catch:{ Exception -> 0x00f4 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00f4 }
            r0.L$0 = r9     // Catch:{ Exception -> 0x00f4 }
            r0.L$1 = r10     // Catch:{ Exception -> 0x00f4 }
            r0.L$2 = r11     // Catch:{ Exception -> 0x00f4 }
            r0.label = r4     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r2 = r2.mo60771c(r0)     // Catch:{ Exception -> 0x00f4 }
            if (r2 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r4 = r2
            r2 = r10
            r10 = r9
        L_0x008c:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ Exception -> 0x00f4 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f4 }
            r6 = 10
            int r6 = p000.dk0.m43495u(r4, r6)     // Catch:{ Exception -> 0x00f4 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00f4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00f4 }
        L_0x009d:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x00f4 }
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x00f4 }
            net.safemoon.androidwallet.model.wallets.Wallet r6 = (net.safemoon.androidwallet.model.wallets.Wallet) r6     // Catch:{ Exception -> 0x00f4 }
            java.util.List r6 = r6.getAllAddressOfWallet()     // Catch:{ Exception -> 0x00f4 }
            r5.add(r6)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x009d
        L_0x00b1:
            java.util.List r4 = p000.dk0.m43497w(r5)     // Catch:{ Exception -> 0x00f4 }
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ Exception -> 0x00f4 }
            tk5 r5 = r10.mo60725d()     // Catch:{ Exception -> 0x00f4 }
            net.safemoon.androidwallet.model.UpdateFCMToken r6 = new net.safemoon.androidwallet.model.UpdateFCMToken     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = "newToken"
            p000.vx2.m53590f(r11, r7)     // Catch:{ Exception -> 0x00f4 }
            r6.<init>(r4, r2, r11)     // Catch:{ Exception -> 0x00f4 }
            k90 r11 = r5.mo66096o(r6)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = "safemoonAPIInterface.upd…          )\n            )"
            p000.vx2.m53590f(r11, r2)     // Catch:{ Exception -> 0x00f4 }
            r0.L$0 = r10     // Catch:{ Exception -> 0x00f4 }
            r2 = 0
            r0.L$1 = r2     // Catch:{ Exception -> 0x00f4 }
            r0.L$2 = r2     // Catch:{ Exception -> 0x00f4 }
            r0.label = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r11 = retrofit2.KotlinExtensions.m71521c(r11, r0)     // Catch:{ Exception -> 0x00f4 }
            if (r11 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            bg5 r11 = (p000.bg5) r11     // Catch:{ Exception -> 0x00f4 }
            boolean r11 = r11.mo50581e()     // Catch:{ Exception -> 0x00f4 }
            if (r11 == 0) goto L_0x00f4
            android.app.Application r10 = r10.f42511a     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r11 = "TEMP_FCM_TOKEN"
            p000.f06.m57520k(r10, r11)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            r37 r10 = p000.r37.f33317a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.FcmDataSource.mo60729i(java.lang.String, ns0):java.lang.Object");
    }
}
