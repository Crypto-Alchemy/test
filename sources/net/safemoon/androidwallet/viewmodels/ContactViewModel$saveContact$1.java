package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.contact.RequestContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1", mo48632f = "ContactViewModel.kt", mo48633l = {119}, mo48634m = "invokeSuspend")
/* compiled from: ContactViewModel.kt */
public final class ContactViewModel$saveContact$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ RequestContact $requestContact;
    public int label;
    public final /* synthetic */ ContactViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1$1", mo48632f = "ContactViewModel.kt", mo48633l = {121, 126, 131, 137, 140, 149}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1$1 */
    /* compiled from: ContactViewModel.kt */
    public static final class C86601 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86601(requestContact, contactViewModel, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86601) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0219, code lost:
            if (r9 == null) goto L_0x022c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x021b, code lost:
            r8 = r9.getLastSent();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x021f, code lost:
            if (r8 == null) goto L_0x022c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0221, code lost:
            r2.setLastSent(p000.a40.m31674e(r8.longValue()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x022c, code lost:
            if (r9 == null) goto L_0x023f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x022e, code lost:
            r8 = r9.getContactCreate();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0232, code lost:
            if (r8 == null) goto L_0x023f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0234, code lost:
            r2.setContactCreate(p000.a40.m31674e(r8.longValue()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
            r6.add(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0243, code lost:
            r14 = r4;
            r1 = r6.iterator();
            r2 = r14;
            r14 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x024f, code lost:
            if (r1.hasNext() == false) goto L_0x0269;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0251, code lost:
            r4 = r2.mo61099i();
            r14.L$0 = r2;
            r14.L$1 = r1;
            r14.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0266, code lost:
            if (r4.mo51976e((net.safemoon.androidwallet.model.contact.abstraction.IContact) r1.next(), r14) != r0) goto L_0x024b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0268, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0269, code lost:
            r6 = p000.cd7.m11843a(r4);
            r14 = r5;
            p000.y23 unused = p000.d50.m56748b(r6, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1.C86601.C86616((p000.ns0<? super net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1.C86601.C86616>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x028c, code lost:
            return p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
            r14 = ((java.io.File) r14).getAbsolutePath();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
            if (r14 != null) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
            r14 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
            r6 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
            if (r3.getLinkId() != null) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
            r3.setLinkId(java.util.UUID.randomUUID().toString());
            r14 = r4.mo61097g(r3, r6);
            r2 = r4;
            r1 = r14.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
            r14 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
            if (r1.hasNext() == false) goto L_0x0269;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
            r4 = r2.mo61099i();
            r14.L$0 = r2;
            r14.L$1 = r1;
            r14.label = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
            if (r4.mo51976e((net.safemoon.androidwallet.model.contact.abstraction.IContact) r1.next(), r14) != r0) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
            r14 = net.safemoon.androidwallet.utils.Common.f42577a.mo60896a(true);
            r1 = new java.util.ArrayList(p000.dk0.m43495u(r14, 10));
            r14 = r14.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
            if (r14.hasNext() == false) goto L_0x0106;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
            r1.add(p000.a40.m31673d(((net.safemoon.androidwallet.common.TokenType) r14.next()).getChainId()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
            r14 = r3.getNetworks().keySet();
            p000.vx2.m53590f(r14, "requestContact.networks.keys");
            r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47346q0(r1, r14);
            r14 = r4.mo61099i();
            r7 = r3.getLinkId();
            p000.vx2.m53588d(r7);
            r13.L$0 = r6;
            r13.L$1 = r1;
            r13.label = 3;
            r14 = r14.mo51974c(r7, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
            if (r14 != r0) goto L_0x0136;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
            r7 = new java.util.ArrayList();
            r14 = ((java.util.List) r14).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0145, code lost:
            if (r14.hasNext() == false) goto L_0x0180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
            r8 = r14.next();
            r9 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0150, code lost:
            if ((r1 instanceof java.util.Collection) == false) goto L_0x015a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
            if (r1.isEmpty() == false) goto L_0x015a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
            r10 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0162, code lost:
            if (r10.hasNext() == false) goto L_0x0158;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
            if (((java.lang.Number) r10.next()).intValue() != r9.getChainAddress()) goto L_0x0176;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
            r11 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0176, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0177, code lost:
            if (r11 == false) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0179, code lost:
            r9 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017a, code lost:
            if (r9 == false) goto L_0x0141;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x017c, code lost:
            r7.add(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
            r14 = r4;
            r1 = r7.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0186, code lost:
            r7 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
            if (r1.hasNext() == false) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018d, code lost:
            r9 = r14.mo61099i();
            r7.L$0 = r6;
            r7.L$1 = r14;
            r7.L$2 = r1;
            r7.label = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a4, code lost:
            if (r9.mo51973b((net.safemoon.androidwallet.model.contact.room.RoomContact) r1.next(), r7) != r0) goto L_0x0187;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a6, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a7, code lost:
            r14 = r4.mo61099i();
            r1 = r3.getLinkId();
            p000.vx2.m53588d(r1);
            r7.L$0 = r6;
            r7.L$1 = null;
            r7.L$2 = null;
            r7.label = 5;
            r14 = r14.mo51974c(r1, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c3, code lost:
            if (r14 != r0) goto L_0x01c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c5, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c6, code lost:
            r1 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c7, code lost:
            r14 = (java.util.List) r14;
            r1 = r4.mo61097g(r3, r1);
            r6 = new java.util.ArrayList(p000.dk0.m43495u(r1, 10));
            r1 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
            if (r1.hasNext() == false) goto L_0x0243;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
            r2 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r1.next();
            r8 = r14.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f2, code lost:
            if (r8.hasNext() == false) goto L_0x020b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f4, code lost:
            r9 = r8.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0203, code lost:
            if (((net.safemoon.androidwallet.model.contact.room.RoomContact) r9).getChainAddress() != r2.getChainAddress()) goto L_0x0207;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0205, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0207, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
            if (r10 == false) goto L_0x01ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x020b, code lost:
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x020c, code lost:
            r9 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x020e, code lost:
            if (r9 == null) goto L_0x0215;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0210, code lost:
            r8 = r9.getId();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0215, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0216, code lost:
            r2.setId(r8);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r13.label
                r2 = 10
                r3 = 0
                r4 = 1
                r5 = 0
                switch(r1) {
                    case 0: goto L_0x005e;
                    case 1: goto L_0x005a;
                    case 2: goto L_0x004e;
                    case 3: goto L_0x0041;
                    case 4: goto L_0x002e;
                    case 5: goto L_0x0024;
                    case 6: goto L_0x0016;
                    default: goto L_0x000e;
                }
            L_0x000e:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0016:
                java.lang.Object r1 = r13.L$1
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r13.L$0
                net.safemoon.androidwallet.viewmodels.ContactViewModel r2 = (net.safemoon.androidwallet.viewmodels.ContactViewModel) r2
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                r14 = r13
                goto L_0x024b
            L_0x0024:
                java.lang.Object r1 = r13.L$0
                java.lang.String r1 = (java.lang.String) r1
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                r7 = r13
                goto L_0x01c7
            L_0x002e:
                java.lang.Object r1 = r13.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r6 = r13.L$1
                net.safemoon.androidwallet.viewmodels.ContactViewModel r6 = (net.safemoon.androidwallet.viewmodels.ContactViewModel) r6
                java.lang.Object r7 = r13.L$0
                java.lang.String r7 = (java.lang.String) r7
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                r14 = r6
                r6 = r7
                goto L_0x0186
            L_0x0041:
                java.lang.Object r1 = r13.L$1
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r6 = r13.L$0
                java.lang.String r6 = (java.lang.String) r6
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                goto L_0x0136
            L_0x004e:
                java.lang.Object r1 = r13.L$1
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r13.L$0
                net.safemoon.androidwallet.viewmodels.ContactViewModel r2 = (net.safemoon.androidwallet.viewmodels.ContactViewModel) r2
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                goto L_0x00bc
            L_0x005a:
                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x027e }
                goto L_0x008a
            L_0x005e:
                p000.hg5.m45199b(r14)
                net.safemoon.androidwallet.model.contact.RequestContact r14 = r3     // Catch:{ Exception -> 0x027e }
                java.lang.String r14 = r14.getOldProfilePath()     // Catch:{ Exception -> 0x027e }
                if (r14 != 0) goto L_0x0096
                net.safemoon.androidwallet.model.contact.RequestContact r14 = r3     // Catch:{ Exception -> 0x027e }
                android.net.Uri r14 = r14.getProfilePath()     // Catch:{ Exception -> 0x027e }
                if (r14 == 0) goto L_0x0091
                net.safemoon.androidwallet.viewmodels.ContactViewModel r1 = r4     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.utils.ImageUtility r6 = new net.safemoon.androidwallet.utils.ImageUtility     // Catch:{ Exception -> 0x027e }
                android.app.Application r1 = r1.mo27549b()     // Catch:{ Exception -> 0x027e }
                java.lang.String r7 = "getApplication()"
                p000.vx2.m53590f(r1, r7)     // Catch:{ Exception -> 0x027e }
                r6.<init>(r1)     // Catch:{ Exception -> 0x027e }
                r13.label = r4     // Catch:{ Exception -> 0x027e }
                java.lang.Object r14 = r6.mo60921b(r14, r13)     // Catch:{ Exception -> 0x027e }
                if (r14 != r0) goto L_0x008a
                return r0
            L_0x008a:
                java.io.File r14 = (java.io.File) r14     // Catch:{ Exception -> 0x027e }
                java.lang.String r14 = r14.getAbsolutePath()     // Catch:{ Exception -> 0x027e }
                goto L_0x0092
            L_0x0091:
                r14 = r5
            L_0x0092:
                if (r14 != 0) goto L_0x0096
                java.lang.String r14 = ""
            L_0x0096:
                r6 = r14
                net.safemoon.androidwallet.model.contact.RequestContact r14 = r3     // Catch:{ Exception -> 0x027e }
                java.lang.String r14 = r14.getLinkId()     // Catch:{ Exception -> 0x027e }
                if (r14 != 0) goto L_0x00db
                net.safemoon.androidwallet.model.contact.RequestContact r14 = r3     // Catch:{ Exception -> 0x027e }
                java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x027e }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x027e }
                r14.setLinkId(r1)     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.viewmodels.ContactViewModel r14 = r4     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.RequestContact r1 = r3     // Catch:{ Exception -> 0x027e }
                java.util.List r14 = r14.mo61097g(r1, r6)     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.viewmodels.ContactViewModel r1 = r4     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x027e }
                r2 = r1
                r1 = r14
            L_0x00bc:
                r14 = r13
            L_0x00bd:
                boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r3 == 0) goto L_0x0269
                java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.abstraction.IContact r3 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r3     // Catch:{ Exception -> 0x027e }
                gr0 r4 = r2.mo61099i()     // Catch:{ Exception -> 0x027e }
                r14.L$0 = r2     // Catch:{ Exception -> 0x027e }
                r14.L$1 = r1     // Catch:{ Exception -> 0x027e }
                r6 = 2
                r14.label = r6     // Catch:{ Exception -> 0x027e }
                java.lang.Object r3 = r4.mo51976e(r3, r14)     // Catch:{ Exception -> 0x027e }
                if (r3 != r0) goto L_0x00bd
                return r0
            L_0x00db:
                net.safemoon.androidwallet.utils.Common r14 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x027e }
                java.util.List r14 = r14.mo60896a(r4)     // Catch:{ Exception -> 0x027e }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x027e }
                int r7 = p000.dk0.m43495u(r14, r2)     // Catch:{ Exception -> 0x027e }
                r1.<init>(r7)     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x00ee:
                boolean r7 = r14.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r7 == 0) goto L_0x0106
                java.lang.Object r7 = r14.next()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.common.TokenType r7 = (net.safemoon.androidwallet.common.TokenType) r7     // Catch:{ Exception -> 0x027e }
                int r7 = r7.getChainId()     // Catch:{ Exception -> 0x027e }
                java.lang.Integer r7 = p000.a40.m31673d(r7)     // Catch:{ Exception -> 0x027e }
                r1.add(r7)     // Catch:{ Exception -> 0x027e }
                goto L_0x00ee
            L_0x0106:
                net.safemoon.androidwallet.model.contact.RequestContact r14 = r3     // Catch:{ Exception -> 0x027e }
                java.util.HashMap r14 = r14.getNetworks()     // Catch:{ Exception -> 0x027e }
                java.util.Set r14 = r14.keySet()     // Catch:{ Exception -> 0x027e }
                java.lang.String r7 = "requestContact.networks.keys"
                p000.vx2.m53590f(r14, r7)     // Catch:{ Exception -> 0x027e }
                java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47346q0(r1, r14)     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.viewmodels.ContactViewModel r14 = r4     // Catch:{ Exception -> 0x027e }
                gr0 r14 = r14.mo61099i()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.RequestContact r7 = r3     // Catch:{ Exception -> 0x027e }
                java.lang.String r7 = r7.getLinkId()     // Catch:{ Exception -> 0x027e }
                p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027e }
                r13.L$0 = r6     // Catch:{ Exception -> 0x027e }
                r13.L$1 = r1     // Catch:{ Exception -> 0x027e }
                r8 = 3
                r13.label = r8     // Catch:{ Exception -> 0x027e }
                java.lang.Object r14 = r14.mo51974c(r7, r13)     // Catch:{ Exception -> 0x027e }
                if (r14 != r0) goto L_0x0136
                return r0
            L_0x0136:
                java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x027e }
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x027e }
                r7.<init>()     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x0141:
                boolean r8 = r14.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r8 == 0) goto L_0x0180
                java.lang.Object r8 = r14.next()     // Catch:{ Exception -> 0x027e }
                r9 = r8
                net.safemoon.androidwallet.model.contact.room.RoomContact r9 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r9     // Catch:{ Exception -> 0x027e }
                boolean r10 = r1 instanceof java.util.Collection     // Catch:{ Exception -> 0x027e }
                if (r10 == 0) goto L_0x015a
                boolean r10 = r1.isEmpty()     // Catch:{ Exception -> 0x027e }
                if (r10 == 0) goto L_0x015a
            L_0x0158:
                r9 = r3
                goto L_0x017a
            L_0x015a:
                java.util.Iterator r10 = r1.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x015e:
                boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r11 == 0) goto L_0x0158
                java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x027e }
                java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ Exception -> 0x027e }
                int r11 = r11.intValue()     // Catch:{ Exception -> 0x027e }
                int r12 = r9.getChainAddress()     // Catch:{ Exception -> 0x027e }
                if (r11 != r12) goto L_0x0176
                r11 = r4
                goto L_0x0177
            L_0x0176:
                r11 = r3
            L_0x0177:
                if (r11 == 0) goto L_0x015e
                r9 = r4
            L_0x017a:
                if (r9 == 0) goto L_0x0141
                r7.add(r8)     // Catch:{ Exception -> 0x027e }
                goto L_0x0141
            L_0x0180:
                net.safemoon.androidwallet.viewmodels.ContactViewModel r14 = r4     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r1 = r7.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x0186:
                r7 = r13
            L_0x0187:
                boolean r8 = r1.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r8 == 0) goto L_0x01a7
                java.lang.Object r8 = r1.next()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.room.RoomContact r8 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r8     // Catch:{ Exception -> 0x027e }
                gr0 r9 = r14.mo61099i()     // Catch:{ Exception -> 0x027e }
                r7.L$0 = r6     // Catch:{ Exception -> 0x027e }
                r7.L$1 = r14     // Catch:{ Exception -> 0x027e }
                r7.L$2 = r1     // Catch:{ Exception -> 0x027e }
                r10 = 4
                r7.label = r10     // Catch:{ Exception -> 0x027e }
                java.lang.Object r8 = r9.mo51973b(r8, r7)     // Catch:{ Exception -> 0x027e }
                if (r8 != r0) goto L_0x0187
                return r0
            L_0x01a7:
                net.safemoon.androidwallet.viewmodels.ContactViewModel r14 = r4     // Catch:{ Exception -> 0x027e }
                gr0 r14 = r14.mo61099i()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.RequestContact r1 = r3     // Catch:{ Exception -> 0x027e }
                java.lang.String r1 = r1.getLinkId()     // Catch:{ Exception -> 0x027e }
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x027e }
                r7.L$0 = r6     // Catch:{ Exception -> 0x027e }
                r7.L$1 = r5     // Catch:{ Exception -> 0x027e }
                r7.L$2 = r5     // Catch:{ Exception -> 0x027e }
                r8 = 5
                r7.label = r8     // Catch:{ Exception -> 0x027e }
                java.lang.Object r14 = r14.mo51974c(r1, r7)     // Catch:{ Exception -> 0x027e }
                if (r14 != r0) goto L_0x01c6
                return r0
            L_0x01c6:
                r1 = r6
            L_0x01c7:
                java.util.List r14 = (java.util.List) r14     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.viewmodels.ContactViewModel r6 = r4     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.RequestContact r8 = r3     // Catch:{ Exception -> 0x027e }
                java.util.List r1 = r6.mo61097g(r8, r1)     // Catch:{ Exception -> 0x027e }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x027e }
                int r2 = p000.dk0.m43495u(r1, r2)     // Catch:{ Exception -> 0x027e }
                r6.<init>(r2)     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x01de:
                boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r2 == 0) goto L_0x0243
                java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.abstraction.IContact r2 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r2     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r8 = r14.iterator()     // Catch:{ Exception -> 0x027e }
            L_0x01ee:
                boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r9 == 0) goto L_0x020b
                java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x027e }
                r10 = r9
                net.safemoon.androidwallet.model.contact.room.RoomContact r10 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r10     // Catch:{ Exception -> 0x027e }
                int r10 = r10.getChainAddress()     // Catch:{ Exception -> 0x027e }
                int r11 = r2.getChainAddress()     // Catch:{ Exception -> 0x027e }
                if (r10 != r11) goto L_0x0207
                r10 = r4
                goto L_0x0208
            L_0x0207:
                r10 = r3
            L_0x0208:
                if (r10 == 0) goto L_0x01ee
                goto L_0x020c
            L_0x020b:
                r9 = r5
            L_0x020c:
                net.safemoon.androidwallet.model.contact.room.RoomContact r9 = (net.safemoon.androidwallet.model.contact.room.RoomContact) r9     // Catch:{ Exception -> 0x027e }
                if (r9 == 0) goto L_0x0215
                int r8 = r9.getId()     // Catch:{ Exception -> 0x027e }
                goto L_0x0216
            L_0x0215:
                r8 = r3
            L_0x0216:
                r2.setId(r8)     // Catch:{ Exception -> 0x027e }
                if (r9 == 0) goto L_0x022c
                java.lang.Long r8 = r9.getLastSent()     // Catch:{ Exception -> 0x027e }
                if (r8 == 0) goto L_0x022c
                long r10 = r8.longValue()     // Catch:{ Exception -> 0x027e }
                java.lang.Long r8 = p000.a40.m31674e(r10)     // Catch:{ Exception -> 0x027e }
                r2.setLastSent(r8)     // Catch:{ Exception -> 0x027e }
            L_0x022c:
                if (r9 == 0) goto L_0x023f
                java.lang.Long r8 = r9.getContactCreate()     // Catch:{ Exception -> 0x027e }
                if (r8 == 0) goto L_0x023f
                long r8 = r8.longValue()     // Catch:{ Exception -> 0x027e }
                java.lang.Long r8 = p000.a40.m31674e(r8)     // Catch:{ Exception -> 0x027e }
                r2.setContactCreate(r8)     // Catch:{ Exception -> 0x027e }
            L_0x023f:
                r6.add(r2)     // Catch:{ Exception -> 0x027e }
                goto L_0x01de
            L_0x0243:
                net.safemoon.androidwallet.viewmodels.ContactViewModel r14 = r4     // Catch:{ Exception -> 0x027e }
                java.util.Iterator r1 = r6.iterator()     // Catch:{ Exception -> 0x027e }
                r2 = r14
                r14 = r7
            L_0x024b:
                boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x027e }
                if (r3 == 0) goto L_0x0269
                java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x027e }
                net.safemoon.androidwallet.model.contact.abstraction.IContact r3 = (net.safemoon.androidwallet.model.contact.abstraction.IContact) r3     // Catch:{ Exception -> 0x027e }
                gr0 r4 = r2.mo61099i()     // Catch:{ Exception -> 0x027e }
                r14.L$0 = r2     // Catch:{ Exception -> 0x027e }
                r14.L$1 = r1     // Catch:{ Exception -> 0x027e }
                r6 = 6
                r14.label = r6     // Catch:{ Exception -> 0x027e }
                java.lang.Object r3 = r4.mo51976e(r3, r14)     // Catch:{ Exception -> 0x027e }
                if (r3 != r0) goto L_0x024b
                return r0
            L_0x0269:
                net.safemoon.androidwallet.viewmodels.ContactViewModel r0 = r4     // Catch:{ Exception -> 0x027e }
                hu0 r6 = p000.cd7.m11843a(r0)     // Catch:{ Exception -> 0x027e }
                r7 = 0
                r8 = 0
                net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1$1$6 r9 = new net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1$1$6     // Catch:{ Exception -> 0x027e }
                pc2<r37> r14 = r5     // Catch:{ Exception -> 0x027e }
                r9.<init>(r14, r5)     // Catch:{ Exception -> 0x027e }
                r10 = 3
                r11 = 0
                p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x027e }
                goto L_0x028a
            L_0x027e:
                r14 = move-exception
                java.lang.String r14 = r14.getMessage()
                if (r14 == 0) goto L_0x028a
                java.lang.String r0 = "Error-Save-Contact"
                p000.ol0.m70350b0(r14, r0)
            L_0x028a:
                r37 r14 = p000.r37.f33317a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ContactViewModel$saveContact$1.C86601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactViewModel$saveContact$1(RequestContact requestContact, ContactViewModel contactViewModel, pc2<r37> pc2, ns0<? super ContactViewModel$saveContact$1> ns0) {
        super(2, ns0);
        this.$requestContact = requestContact;
        this.this$0 = contactViewModel;
        this.$callBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ContactViewModel$saveContact$1(this.$requestContact, this.this$0, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ContactViewModel$saveContact$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final RequestContact requestContact = this.$requestContact;
            final ContactViewModel contactViewModel = this.this$0;
            final pc2<r37> pc2 = this.$callBack;
            C86601 r1 = new C86601((ns0<? super C86601>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
