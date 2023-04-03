package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.nft.NFTData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/NftDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "E", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NftDetailActivity.kt */
public final class NftDetailActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final C8190a f41460a = new C8190a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static NFTData f41461d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/NftDetailActivity$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.NftDetailActivity$a */
    /* compiled from: NftDetailActivity.kt */
    public static final class C8190a {
        public C8190a() {
        }

        public /* synthetic */ C8190a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: C */
    public static final void m65400C(NftDetailActivity nftDetailActivity, View view) {
        vx2.m53591g(nftDetailActivity, "this$0");
        nftDetailActivity.finish();
    }

    /* renamed from: D */
    public static final void m65401D(NftDetailActivity nftDetailActivity, View view) {
        vx2.m53591g(nftDetailActivity, "this$0");
        nftDetailActivity.mo56863E();
    }

    /* renamed from: E */
    public final void mo56863E() {
        String str;
        NFTData nFTData = f41461d;
        if (nFTData != null) {
            str = nFTData.getPermalink();
        } else {
            str = null;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void onCreate(Bundle bundle) {
        ArrayList<NFTData.Property> arrayList;
        String str;
        String str2;
        String str3;
        ArrayList<NFTData.Property> arrayList2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_nft_detail);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.propertyRecycle);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        NFTData nFTData = f41461d;
        String str4 = null;
        if (nFTData != null) {
            arrayList = nFTData.getProperties();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            NFTData nFTData2 = f41461d;
            if (nFTData2 != null) {
                arrayList2 = nFTData2.getProperties();
            } else {
                arrayList2 = null;
            }
            vx2.m53588d(arrayList2);
            recyclerView.setAdapter(new i24(arrayList2));
        }
        ImageView imageView = (ImageView) findViewById(R.id.nftDetailImage);
        TextView textView = (TextView) findViewById(R.id.txtDescription);
        TextView textView2 = (TextView) findViewById(R.id.nftSource);
        TextView textView3 = (TextView) findViewById(R.id.title);
        if (imageView != null) {
            me5 u = C1710a.m12225u(imageView);
            NFTData nFTData3 = f41461d;
            if (nFTData3 != null) {
                str3 = nFTData3.getImageUrl();
            } else {
                str3 = null;
            }
            u.mo23164y(str3).mo11553K0(imageView);
        }
        findViewById(R.id.btnBack).setOnClickListener(new q64(this));
        findViewById(R.id.btnOpen).setOnClickListener(new r64(this));
        if (textView != null) {
            NFTData nFTData4 = f41461d;
            if (nFTData4 != null) {
                str2 = nFTData4.getDescription();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        if (textView2 != null) {
            NFTData nFTData5 = f41461d;
            if (nFTData5 != null) {
                str = nFTData5.getPermalink();
            } else {
                str = null;
            }
            textView2.setText(str);
        }
        if (textView3 != null) {
            NFTData nFTData6 = f41461d;
            if (nFTData6 != null) {
                str4 = nFTData6.getName();
            }
            textView3.setText(str4);
        }
    }
}
