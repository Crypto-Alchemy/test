package p000;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT;
import net.safemoon.androidwallet.views.CustomVideoPlayer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B5\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u00158\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lqj0;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "Lqj0$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "Lr37;", "c", "from", "to", "e", "Lkotlin/Function1;", "a", "Lrc2;", "()Lrc2;", "callBack", "Lkotlin/Function2;", "Lnet/safemoon/androidwallet/model/collectible/TYPE_DELETE_NFT;", "Lfd2;", "b", "()Lfd2;", "callBackCollection", "<init>", "(Lrc2;Lfd2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qj0 */
/* compiled from: CollectionsAdapter.kt */
public final class qj0 extends C1330o<RoomCollectionAndNft, C9215a> {

    /* renamed from: a */
    public final rc2<RoomCollectionAndNft, r37> f44202a;

    /* renamed from: d */
    public final fd2<RoomCollectionAndNft, TYPE_DELETE_NFT, r37> f44203d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lqj0$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "item", "Lr37;", "e", "Lzy2;", "a", "Lzy2;", "itemCollectible", "<init>", "(Lqj0;Lzy2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: qj0$a */
    /* compiled from: CollectionsAdapter.kt */
    public final class C9215a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final zy2 f44204a;

        /* renamed from: b */
        public final /* synthetic */ qj0 f44205b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, mo44877d2 = {"qj0$a$a", "Lny;", "Lvq2;", "", "id", "", "throwable", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: qj0$a$a */
        /* compiled from: CollectionsAdapter.kt */
        public static final class C9216a extends C2931ny<vq2> {

            /* renamed from: b */
            public final /* synthetic */ zy2 f44206b;

            /* renamed from: c */
            public final /* synthetic */ String f44207c;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"qj0$a$a$a", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: qj0$a$a$a */
            /* compiled from: CollectionsAdapter.kt */
            public static final class C9217a implements le5<Drawable> {

                /* renamed from: a */
                public final /* synthetic */ zy2 f44208a;

                /* renamed from: d */
                public final /* synthetic */ String f44209d;

                public C9217a(zy2 zy2, String str) {
                    this.f44208a = zy2;
                    this.f44209d = str;
                }

                /* renamed from: a */
                public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
                    return false;
                }

                /* renamed from: d */
                public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
                    CustomVideoPlayer customVideoPlayer = this.f44208a.f36311g;
                    vx2.m53590f(customVideoPlayer, "videoPlayer");
                    customVideoPlayer.setVisibility(0);
                    this.f44208a.f36311g.setPlayURL(this.f44209d);
                    return false;
                }
            }

            public C9216a(zy2 zy2, String str) {
                this.f44206b = zy2;
                this.f44207c = str;
            }

            /* renamed from: b */
            public void mo20418b(String str, Throwable th) {
                super.mo20418b(str, th);
                ImageView imageView = this.f44206b.f36308d;
                vx2.m53590f(imageView, "nftIcon");
                imageView.setVisibility(0);
                SimpleDraweeView simpleDraweeView = this.f44206b.f36310f;
                vx2.m53590f(simpleDraweeView, "sdvImage");
                simpleDraweeView.setVisibility(4);
                ((be5) ((be5) C1710a.m12225u(this.f44206b.f36308d).mo23164y(StringsKt__StringsKt.m63090V0(this.f44207c).toString()).mo22591m(R.drawable.safemoon)).mo22574d()).mo11570w0(new C9217a(this.f44206b, this.f44207c)).mo11553K0(this.f44206b.f36308d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9215a(qj0 qj0, zy2 zy2) {
            super(zy2.mo49999b());
            vx2.m53591g(zy2, "itemCollectible");
            this.f44205b = qj0;
            this.f44204a = zy2;
        }

        /* renamed from: f */
        public static final void m71278f(qj0 qj0, RoomCollectionAndNft roomCollectionAndNft, View view) {
            vx2.m53591g(qj0, "this$0");
            vx2.m53591g(roomCollectionAndNft, "$item");
            qj0.mo65474b().invoke(roomCollectionAndNft, TYPE_DELETE_NFT.VISIBLE);
        }

        /* renamed from: g */
        public static final void m71279g(qj0 qj0, RoomCollectionAndNft roomCollectionAndNft, View view) {
            vx2.m53591g(qj0, "this$0");
            vx2.m53591g(roomCollectionAndNft, "$item");
            qj0.mo65474b().invoke(roomCollectionAndNft, TYPE_DELETE_NFT.DELETE_FOREVER);
        }

        /* renamed from: h */
        public static final void m71280h(qj0 qj0, RoomCollectionAndNft roomCollectionAndNft, View view) {
            vx2.m53591g(qj0, "this$0");
            vx2.m53591g(roomCollectionAndNft, "$item");
            qj0.mo65474b().invoke(roomCollectionAndNft, TYPE_DELETE_NFT.HIDE);
        }

        /* renamed from: i */
        public static final void m71281i(qj0 qj0, RoomCollectionAndNft roomCollectionAndNft, View view) {
            vx2.m53591g(qj0, "this$0");
            vx2.m53591g(roomCollectionAndNft, "$item");
            qj0.mo65473a().invoke(roomCollectionAndNft);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x012c  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo65478e(net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft r12) {
            /*
                r11 = this;
                java.lang.String r0 = "item"
                p000.vx2.m53591g(r12, r0)
                zy2 r0 = r11.f44204a
                qj0 r1 = r11.f44205b
                net.safemoon.androidwallet.model.collectible.RoomCollection r2 = r12.getCollection()
                java.lang.String r3 = r2.getImageUrl()
                if (r3 != 0) goto L_0x0015
                java.lang.String r3 = ""
            L_0x0015:
                int r4 = r3.length()
                r5 = 1
                r6 = 0
                if (r4 != 0) goto L_0x001f
                r4 = r5
                goto L_0x0020
            L_0x001f:
                r4 = r6
            L_0x0020:
                r7 = 0
                if (r4 == 0) goto L_0x0035
                java.util.List r3 = r12.getNfts()
                java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r3)
                net.safemoon.androidwallet.model.collectible.RoomNFT r3 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r3
                if (r3 == 0) goto L_0x0034
                java.lang.String r3 = r3.getImage_preview_url()
                goto L_0x0035
            L_0x0034:
                r3 = r7
            L_0x0035:
                java.util.List r4 = r12.getNfts()
                java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r4)
                net.safemoon.androidwallet.model.collectible.RoomNFT r4 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r4
                if (r4 == 0) goto L_0x0045
                java.lang.String r7 = r4.getImage_data()
            L_0x0045:
                if (r3 == 0) goto L_0x0054
                int r4 = r3.length()
                if (r4 <= 0) goto L_0x004f
                r4 = r5
                goto L_0x0050
            L_0x004f:
                r4 = r6
            L_0x0050:
                if (r4 != r5) goto L_0x0054
                r4 = r5
                goto L_0x0055
            L_0x0054:
                r4 = r6
            L_0x0055:
                java.lang.String r8 = "nftIcon"
                r9 = 4
                java.lang.String r10 = "sdvImage"
                if (r4 == 0) goto L_0x00a0
                android.widget.ImageView r4 = r0.f36308d
                p000.vx2.m53590f(r4, r8)
                r4.setVisibility(r9)
                com.facebook.drawee.view.SimpleDraweeView r4 = r0.f36310f
                p000.vx2.m53590f(r4, r10)
                r4.setVisibility(r6)
                com.facebook.drawee.view.SimpleDraweeView r4 = r0.f36310f
                so4 r7 = p000.ic2.m19554e()
                p000.vx2.m53588d(r3)
                java.lang.CharSequence r8 = kotlin.text.StringsKt__StringsKt.m63090V0(r3)
                java.lang.String r8 = r8.toString()
                com.facebook.imagepipeline.request.ImageRequest r8 = com.facebook.imagepipeline.request.ImageRequest.m13641b(r8)
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r7 = r7.mo13219B(r8)
                so4 r7 = (p000.so4) r7
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r5 = r7.mo13245y(r5)
                so4 r5 = (p000.so4) r5
                qj0$a$a r7 = new qj0$a$a
                r7.<init>(r0, r3)
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r5.mo13218A(r7)
                so4 r3 = (p000.so4) r3
                b6 r3 = r3.build()
                r4.setController(r3)
                goto L_0x00e2
            L_0x00a0:
                com.facebook.drawee.view.SimpleDraweeView r3 = r0.f36310f
                p000.vx2.m53590f(r3, r10)
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r0.f36308d
                p000.vx2.m53590f(r3, r8)
                r3.setVisibility(r6)
                r3 = 2131231313(0x7f080251, float:1.8078703E38)
                if (r7 == 0) goto L_0x00cf
                android.widget.ImageView r4 = r0.f36308d
                me5 r4 = com.bumptech.glide.C1710a.m12225u(r4)
                byte[] r5 = p000.db6.m56792a(r7)
                be5 r4 = r4.mo23165z(r5)
                kz r3 = r4.mo22591m(r3)
                be5 r3 = (p000.be5) r3
                android.widget.ImageView r4 = r0.f36308d
                r3.mo11553K0(r4)
                goto L_0x00e2
            L_0x00cf:
                android.widget.ImageView r4 = r0.f36308d
                me5 r4 = com.bumptech.glide.C1710a.m12225u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                be5 r3 = r4.mo23162w(r3)
                android.widget.ImageView r4 = r0.f36308d
                r3.mo11553K0(r4)
            L_0x00e2:
                android.widget.TextView r3 = r0.f36309e
                java.lang.String r2 = r2.getName()
                r3.setText(r2)
                net.safemoon.androidwallet.model.collectible.RoomCollection r2 = r12.getCollection()
                int r2 = r2.getTypeDeleteNft()
                net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r3 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE
                int r3 = r3.getValue()
                java.lang.String r4 = "imgDeleteCollection"
                java.lang.String r5 = "imgHideEye"
                if (r2 != r3) goto L_0x012c
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                p000.vx2.m53590f(r2, r5)
                r2.setVisibility(r6)
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                r3 = 2131231140(0x7f0801a4, float:1.8078353E38)
                r2.setImageResource(r3)
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                mj0 r3 = new mj0
                r3.<init>(r1, r12)
                r2.setOnClickListener(r3)
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36306b
                p000.vx2.m53590f(r2, r4)
                r2.setVisibility(r6)
                com.google.android.material.imageview.ShapeableImageView r0 = r0.f36306b
                nj0 r2 = new nj0
                r2.<init>(r1, r12)
                r0.setOnClickListener(r2)
                goto L_0x0158
            L_0x012c:
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                p000.vx2.m53590f(r2, r5)
                boolean r3 = r12.getShowHideIcon()
                r5 = 8
                if (r3 == 0) goto L_0x013a
                goto L_0x013b
            L_0x013a:
                r6 = r5
            L_0x013b:
                r2.setVisibility(r6)
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                r3 = 2131231139(0x7f0801a3, float:1.807835E38)
                r2.setImageResource(r3)
                com.google.android.material.imageview.ShapeableImageView r2 = r0.f36307c
                oj0 r3 = new oj0
                r3.<init>(r1, r12)
                r2.setOnClickListener(r3)
                com.google.android.material.imageview.ShapeableImageView r0 = r0.f36306b
                p000.vx2.m53590f(r0, r4)
                r0.setVisibility(r5)
            L_0x0158:
                zy2 r0 = r11.f44204a
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo49999b()
                pj0 r2 = new pj0
                r2.<init>(r1, r12)
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qj0.C9215a.mo65478e(net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qj0(rc2<? super RoomCollectionAndNft, r37> rc2, fd2<? super RoomCollectionAndNft, ? super TYPE_DELETE_NFT, r37> fd2) {
        super(rj0.m71551a());
        vx2.m53591g(rc2, "callBack");
        vx2.m53591g(fd2, "callBackCollection");
        this.f44202a = rc2;
        this.f44203d = fd2;
    }

    /* renamed from: a */
    public final rc2<RoomCollectionAndNft, r37> mo65473a() {
        return this.f44202a;
    }

    /* renamed from: b */
    public final fd2<RoomCollectionAndNft, TYPE_DELETE_NFT, r37> mo65474b() {
        return this.f44203d;
    }

    /* renamed from: c */
    public void onBindViewHolder(C9215a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        Object item = getItem(i);
        vx2.m53590f(item, "getItem(position)");
        aVar.mo65478e((RoomCollectionAndNft) item);
    }

    /* renamed from: d */
    public C9215a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        zy2 c = zy2.m55303c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C9215a(this, c);
    }

    /* renamed from: e */
    public final void mo65477e(int i, int i2) {
        List currentList = getCurrentList();
        vx2.m53590f(currentList, "currentList");
        List M0 = CollectionsKt___CollectionsKt.m47313M0(currentList);
        Collections.swap(M0, i, i2);
        submitList(M0);
    }
}
