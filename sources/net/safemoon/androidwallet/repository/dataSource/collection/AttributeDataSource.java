package net.safemoon.androidwallet.repository.dataSource.collection;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/dataSource/collection/AttributeDataSource;", "", "Lr37;", "a", "Landroid/content/Context;", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "application", "", "J", "c", "()J", "roomNftid", "<init>", "(Landroid/content/Context;J)V", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AttributeDataSource.kt */
public final class AttributeDataSource {

    /* renamed from: c */
    public static final Companion f42537c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Context f42538a;

    /* renamed from: b */
    public final long f42539b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/dataSource/collection/AttributeDataSource$Companion;", "", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "", "input", "Lr37;", "b", "(Lnet/safemoon/androidwallet/model/collectible/RoomNFT;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "image", "a", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AttributeDataSource.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Object mo60788a(String str, ns0<? super String> ns0) {
            try {
                if (StringsKt__StringsKt.m63081R(str, "base64,", false, 2, (Object) null)) {
                    return StringsKt__StringsKt.m63061B0(str, new String[]{"base64,"}, false, 0, 6, (Object) null).get(1);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo60789b(net.safemoon.androidwallet.model.collectible.RoomNFT r7, java.lang.String r8, p000.ns0<? super p000.r37> r9) throws java.lang.Exception {
            /*
                r6 = this;
                boolean r0 = r9 instanceof net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion$parseAttribute$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion$parseAttribute$1 r0 = (net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion$parseAttribute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion$parseAttribute$1 r0 = new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion$parseAttribute$1
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0051
                if (r2 == r4) goto L_0x0041
                if (r2 != r3) goto L_0x0039
                java.lang.Object r7 = r0.L$2
                net.safemoon.androidwallet.model.collectible.RoomNFT r7 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r7
                java.lang.Object r8 = r0.L$1
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.Object r0 = r0.L$0
                net.safemoon.androidwallet.model.collectible.RoomNFT r0 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r0
                p000.hg5.m45199b(r9)
                goto L_0x00d1
            L_0x0039:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0041:
                java.lang.Object r7 = r0.L$2
                net.safemoon.androidwallet.model.collectible.RoomNFT r7 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r7
                java.lang.Object r8 = r0.L$1
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.Object r0 = r0.L$0
                net.safemoon.androidwallet.model.collectible.RoomNFT r0 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r0
                p000.hg5.m45199b(r9)
                goto L_0x0091
            L_0x0051:
                p000.hg5.m45199b(r9)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>(r8)
                java.lang.String r8 = "image"
                boolean r2 = r9.has(r8)
                if (r2 == 0) goto L_0x0099
                java.lang.String r2 = r9.getString(r8)
                java.lang.String r3 = "jsonObject.getString(\"image\")"
                p000.vx2.m53590f(r2, r3)
                java.lang.String r2 = p000.db6.m56794c(r2)
                r7.setImage_preview_url(r2)
                java.lang.String r2 = r7.getImage_preview_url()
                if (r2 != 0) goto L_0x00d7
                java.lang.String r8 = r9.getString(r8)
                p000.vx2.m53590f(r8, r3)
                r0.L$0 = r7
                r0.L$1 = r9
                r0.L$2 = r7
                r0.label = r4
                java.lang.Object r8 = r6.mo60788a(r8, r0)
                if (r8 != r1) goto L_0x008d
                return r1
            L_0x008d:
                r0 = r7
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x0091:
                java.lang.String r9 = (java.lang.String) r9
                r7.setImage_data(r9)
            L_0x0096:
                r9 = r8
                r7 = r0
                goto L_0x00d7
            L_0x0099:
                java.lang.String r8 = "image_url"
                boolean r2 = r9.has(r8)
                if (r2 == 0) goto L_0x00d7
                java.lang.String r2 = r9.getString(r8)
                java.lang.String r4 = "jsonObject.getString(\"image_url\")"
                p000.vx2.m53590f(r2, r4)
                java.lang.String r2 = p000.db6.m56794c(r2)
                r7.setImage_preview_url(r2)
                java.lang.String r2 = r7.getImage_preview_url()
                if (r2 != 0) goto L_0x00d7
                java.lang.String r8 = r9.getString(r8)
                p000.vx2.m53590f(r8, r4)
                r0.L$0 = r7
                r0.L$1 = r9
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r8 = r6.mo60788a(r8, r0)
                if (r8 != r1) goto L_0x00cd
                return r1
            L_0x00cd:
                r0 = r7
                r5 = r9
                r9 = r8
                r8 = r5
            L_0x00d1:
                java.lang.String r9 = (java.lang.String) r9
                r7.setImage_data(r9)
                goto L_0x0096
            L_0x00d7:
                java.lang.String r8 = "animation_url"
                boolean r0 = r9.has(r8)
                if (r0 == 0) goto L_0x00ef
                java.lang.String r8 = r9.getString(r8)
                java.lang.String r0 = "jsonObject.getString(\"animation_url\")"
                p000.vx2.m53590f(r8, r0)
                java.lang.String r8 = p000.db6.m56794c(r8)
                r7.setAnimation_url(r8)
            L_0x00ef:
                java.lang.String r8 = "name"
                boolean r0 = r9.has(r8)
                if (r0 == 0) goto L_0x00fe
                java.lang.String r8 = r9.getString(r8)
                r7.setName(r8)
            L_0x00fe:
                java.lang.String r8 = "description"
                boolean r0 = r9.has(r8)
                if (r0 == 0) goto L_0x010d
                java.lang.String r8 = r9.getString(r8)
                r7.setDescription(r8)
            L_0x010d:
                java.lang.String r8 = "attributes"
                boolean r0 = r9.has(r8)
                if (r0 == 0) goto L_0x011c
                java.lang.String r8 = r9.getString(r8)
                r7.setAttributes(r8)
            L_0x011c:
                java.lang.String r8 = "external_url"
                boolean r0 = r9.has(r8)
                if (r0 == 0) goto L_0x012b
                java.lang.String r8 = r9.getString(r8)
                r7.setOpenSeaUrl(r8)
            L_0x012b:
                r37 r7 = p000.r37.f33317a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource.Companion.mo60789b(net.safemoon.androidwallet.model.collectible.RoomNFT, java.lang.String, ns0):java.lang.Object");
        }
    }

    public AttributeDataSource(Context context, long j) {
        vx2.m53591g(context, "application");
        this.f42538a = context;
        this.f42539b = j;
    }

    /* renamed from: a */
    public final void mo60785a() {
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new AttributeDataSource$fetchAttributes$1(this, (ns0<? super AttributeDataSource$fetchAttributes$1>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final Context mo60786b() {
        return this.f42538a;
    }

    /* renamed from: c */
    public final long mo60787c() {
        return this.f42539b;
    }
}
