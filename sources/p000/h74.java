package p000;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1274d;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import net.safemoon.androidwallet.views.CustomVideoPlayer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0010B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0016R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R%\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lh74;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "Lh74$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "holder", "position", "Lr37;", "d", "c", "getItemCount", "Lkotlin/Function1;", "a", "Lrc2;", "()Lrc2;", "callBack", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "Landroidx/recyclerview/widget/d;", "b", "()Landroidx/recyclerview/widget/d;", "differ", "<init>", "(Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: h74 */
/* compiled from: NftsAdapter.kt */
public final class h74 extends C1330o<RoomNFT, C7164a> {

    /* renamed from: a */
    public final rc2<RoomNFT, r37> f38162a;

    /* renamed from: d */
    public final C1274d<RoomNFT> f38163d = new C1274d<>((RecyclerView.Adapter) this, i74.f38337a);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lh74$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "item", "Lr37;", "b", "Lzy2;", "a", "Lzy2;", "itemCollectible", "<init>", "(Lh74;Lzy2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h74$a */
    /* compiled from: NftsAdapter.kt */
    public final class C7164a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final zy2 f38164a;

        /* renamed from: b */
        public final /* synthetic */ h74 f38165b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, mo44877d2 = {"h74$a$a", "Lny;", "Lvq2;", "", "id", "", "throwable", "Lr37;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: h74$a$a */
        /* compiled from: NftsAdapter.kt */
        public static final class C7165a extends C2931ny<vq2> {

            /* renamed from: b */
            public final /* synthetic */ zy2 f38166b;

            /* renamed from: c */
            public final /* synthetic */ RoomNFT f38167c;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"h74$a$a$a", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: h74$a$a$a */
            /* compiled from: NftsAdapter.kt */
            public static final class C7166a implements le5<Drawable> {

                /* renamed from: a */
                public final /* synthetic */ zy2 f38168a;

                /* renamed from: d */
                public final /* synthetic */ RoomNFT f38169d;

                public C7166a(zy2 zy2, RoomNFT roomNFT) {
                    this.f38168a = zy2;
                    this.f38169d = roomNFT;
                }

                /* renamed from: a */
                public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
                    return false;
                }

                /* renamed from: d */
                public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
                    CustomVideoPlayer customVideoPlayer = this.f38168a.f36311g;
                    vx2.m53590f(customVideoPlayer, "videoPlayer");
                    customVideoPlayer.setVisibility(0);
                    this.f38168a.f36311g.setPlayURL(this.f38169d.getImage_preview_url());
                    return false;
                }
            }

            public C7165a(zy2 zy2, RoomNFT roomNFT) {
                this.f38166b = zy2;
                this.f38167c = roomNFT;
            }

            /* renamed from: b */
            public void mo20418b(String str, Throwable th) {
                super.mo20418b(str, th);
                ImageView imageView = this.f38166b.f36308d;
                vx2.m53590f(imageView, "nftIcon");
                imageView.setVisibility(0);
                SimpleDraweeView simpleDraweeView = this.f38166b.f36310f;
                vx2.m53590f(simpleDraweeView, "sdvImage");
                simpleDraweeView.setVisibility(4);
                me5 u = C1710a.m12225u(this.f38166b.f36308d);
                String image_preview_url = this.f38167c.getImage_preview_url();
                vx2.m53588d(image_preview_url);
                ((be5) ((be5) u.mo23164y(StringsKt__StringsKt.m63090V0(image_preview_url).toString()).mo22591m(R.drawable.safemoon)).mo22574d()).mo11570w0(new C7166a(this.f38166b, this.f38167c)).mo11553K0(this.f38166b.f36308d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7164a(h74 h74, zy2 zy2) {
            super(zy2.mo49999b());
            vx2.m53591g(zy2, "itemCollectible");
            this.f38165b = h74;
            this.f38164a = zy2;
        }

        /* renamed from: c */
        public static final void m58483c(h74 h74, RoomNFT roomNFT, View view) {
            vx2.m53591g(h74, "this$0");
            vx2.m53591g(roomNFT, "$item");
            h74.mo52124a().invoke(roomNFT);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo52129b(net.safemoon.androidwallet.model.collectible.RoomNFT r9) {
            /*
                r8 = this;
                java.lang.String r0 = "item"
                p000.vx2.m53591g(r9, r0)
                zy2 r0 = r8.f38164a
                h74 r1 = r8.f38165b
                java.lang.String r2 = r9.getImage_preview_url()
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x001e
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0019
                r2 = r3
                goto L_0x001a
            L_0x0019:
                r2 = r4
            L_0x001a:
                if (r2 != r3) goto L_0x001e
                r2 = r3
                goto L_0x001f
            L_0x001e:
                r2 = r4
            L_0x001f:
                java.lang.String r5 = "nftIcon"
                r6 = 4
                java.lang.String r7 = "sdvImage"
                if (r2 == 0) goto L_0x006e
                android.widget.ImageView r2 = r0.f36308d
                p000.vx2.m53590f(r2, r5)
                r2.setVisibility(r6)
                com.facebook.drawee.view.SimpleDraweeView r2 = r0.f36310f
                p000.vx2.m53590f(r2, r7)
                r2.setVisibility(r4)
                com.facebook.drawee.view.SimpleDraweeView r2 = r0.f36310f
                so4 r4 = p000.ic2.m19554e()
                java.lang.String r5 = r9.getImage_preview_url()
                p000.vx2.m53588d(r5)
                java.lang.CharSequence r5 = kotlin.text.StringsKt__StringsKt.m63090V0(r5)
                java.lang.String r5 = r5.toString()
                com.facebook.imagepipeline.request.ImageRequest r5 = com.facebook.imagepipeline.request.ImageRequest.m13641b(r5)
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r4 = r4.mo13219B(r5)
                so4 r4 = (p000.so4) r4
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r4.mo13245y(r3)
                so4 r3 = (p000.so4) r3
                h74$a$a r4 = new h74$a$a
                r4.<init>(r0, r9)
                com.facebook.drawee.controller.AbstractDraweeControllerBuilder r3 = r3.mo13218A(r4)
                so4 r3 = (p000.so4) r3
                b6 r3 = r3.build()
                r2.setController(r3)
                goto L_0x00bb
            L_0x006e:
                com.facebook.drawee.view.SimpleDraweeView r2 = r0.f36310f
                p000.vx2.m53590f(r2, r7)
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r0.f36308d
                p000.vx2.m53590f(r2, r5)
                r2.setVisibility(r4)
                java.lang.String r2 = r9.getImage_data()
                r3 = 2131231313(0x7f080251, float:1.8078703E38)
                if (r2 == 0) goto L_0x00a8
                android.widget.ImageView r2 = r0.f36308d
                me5 r2 = com.bumptech.glide.C1710a.m12225u(r2)
                java.lang.String r4 = r9.getImage_data()
                p000.vx2.m53588d(r4)
                byte[] r4 = p000.db6.m56792a(r4)
                be5 r2 = r2.mo23165z(r4)
                kz r2 = r2.mo22591m(r3)
                be5 r2 = (p000.be5) r2
                android.widget.ImageView r3 = r0.f36308d
                r2.mo11553K0(r3)
                goto L_0x00bb
            L_0x00a8:
                android.widget.ImageView r2 = r0.f36308d
                me5 r2 = com.bumptech.glide.C1710a.m12225u(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                be5 r2 = r2.mo23162w(r3)
                android.widget.ImageView r3 = r0.f36308d
                r2.mo11553K0(r3)
            L_0x00bb:
                android.widget.TextView r0 = r0.f36309e
                java.lang.String r2 = r9.getName()
                r0.setText(r2)
                zy2 r0 = r8.f38164a
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo49999b()
                g74 r2 = new g74
                r2.<init>(r1, r9)
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.h74.C7164a.mo52129b(net.safemoon.androidwallet.model.collectible.RoomNFT):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h74(rc2<? super RoomNFT, r37> rc2) {
        super(i74.f38337a);
        vx2.m53591g(rc2, "callBack");
        this.f38162a = rc2;
    }

    /* renamed from: a */
    public final rc2<RoomNFT, r37> mo52124a() {
        return this.f38162a;
    }

    /* renamed from: b */
    public final C1274d<RoomNFT> mo52125b() {
        return this.f38163d;
    }

    /* renamed from: c */
    public RoomNFT mo52126c(int i) {
        RoomNFT roomNFT = this.f38163d.mo9695b().get(i);
        vx2.m53590f(roomNFT, "differ.currentList[position]");
        return roomNFT;
    }

    /* renamed from: d */
    public void onBindViewHolder(C7164a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        aVar.mo52129b(mo52126c(i));
    }

    /* renamed from: e */
    public C7164a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        zy2 c = zy2.m55303c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c, "inflate(LayoutInflater.f…arent,\n            false)");
        return new C7164a(this, c);
    }

    public int getItemCount() {
        return this.f38163d.mo9695b().size();
    }
}
