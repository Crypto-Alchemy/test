package net.safemoon.androidwallet.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C1710a;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.IOException;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.utils.CameraPermissionLauncher;
import p000.C5884gx;
import p000.ea0;
import p000.ee1;
import p000.tb2;

public class ScannedCodeActivity extends BasicActivity {

    /* renamed from: A */
    public boolean f41465A = false;

    /* renamed from: r */
    public SurfaceView f41466r;

    /* renamed from: s */
    public C5884gx f41467s;

    /* renamed from: x */
    public ea0 f41468x;

    /* renamed from: y */
    public String f41469y = "";

    /* renamed from: net.safemoon.androidwallet.activity.ScannedCodeActivity$a */
    public class C8191a extends uy0<Bitmap> {
        public C8191a() {
        }

        /* renamed from: d */
        public void mo19469e(Bitmap bitmap, ww6<? super Bitmap> ww6) {
            SparseArray<Barcode> a = ScannedCodeActivity.this.f41467s.mo42279a(new tb2.C6520a().mo48049b(bitmap).mo48048a());
            if (a.size() != 0) {
                ScannedCodeActivity.this.f41469y = a.valueAt(0).f23153e;
                Intent intent = new Intent();
                intent.putExtra("result", ScannedCodeActivity.this.f41469y);
                ScannedCodeActivity.this.setResult(-1, intent);
                ScannedCodeActivity.this.finish();
                return;
            }
            ScannedCodeActivity.this.mo56869c0();
        }

        /* renamed from: h */
        public void mo19471h(Drawable drawable) {
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.ScannedCodeActivity$b */
    public class C8192b extends C8195e {
        public C8192b() {
            super();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.surfaceDestroyed(surfaceHolder);
            ScannedCodeActivity.this.f41468x.mo42175c();
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.ScannedCodeActivity$c */
    public class C8193c extends C8195e {
        public C8193c() {
            super();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                if (zr0.m31438a(ScannedCodeActivity.this, "android.permission.CAMERA") == 0) {
                    ScannedCodeActivity.this.f41468x.mo42174b(ScannedCodeActivity.this.f41466r.getHolder());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ScannedCodeActivity.this.f41468x.mo42175c();
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.ScannedCodeActivity$d */
    public class C8194d implements ee1.C5790b<Barcode> {
        public C8194d() {
        }

        /* renamed from: a */
        public void mo42285a() {
        }

        /* renamed from: b */
        public void mo42286b(ee1.C5789a<Barcode> aVar) {
            SparseArray<Barcode> a = aVar.mo42284a();
            if (a.size() != 0) {
                ScannedCodeActivity.this.f41469y = a.valueAt(0).f23153e;
                Intent intent = new Intent();
                intent.putExtra("result", ScannedCodeActivity.this.f41469y);
                ScannedCodeActivity.this.setResult(-1, intent);
                ScannedCodeActivity.this.finish();
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.activity.ScannedCodeActivity$e */
    public class C8195e implements SurfaceHolder.Callback {
        public C8195e() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ r37 m65437f0() {
        mo56871e0();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ r37 m65438g0() {
        mo56871e0();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ Void m65439h0(boolean z, View view) {
        if (!z) {
            mo56997L().mo60949c(view, new bm5(this), new cm5(this));
            return null;
        }
        mo56871e0();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m65440i0(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m65441j0(View view) {
        mo56873n0();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ r37 m65442k0(Intent intent) {
        a77.m55424b(this, Boolean.FALSE);
        if (intent.getData() == null) {
            return null;
        }
        C1710a.m12227w(this).mo23148i().mo11557O0(intent.getData()).mo11550H0(new C8191a());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ r37 m65443l0(Intent intent) {
        mo56996K().mo52724b(new fm5(this)).mo27473a(intent);
        return null;
    }

    /* renamed from: m0 */
    public static /* synthetic */ r37 m65444m0() {
        return null;
    }

    /* renamed from: c0 */
    public final void mo56869c0() {
        ol0.m70345Y(this, R.string.scanned_code_invalid_qr_code);
    }

    /* renamed from: d0 */
    public final void mo56870d0() {
        boolean z;
        View findViewById = findViewById(R.id.main_layout);
        if (zr0.m31438a(this, "android.permission.CAMERA") == 0) {
            z = true;
        } else {
            z = false;
        }
        new CameraPermissionLauncher(this, findViewById).mo60887c(findViewById, new am5(this, z, findViewById));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: e0 */
    public final void mo56871e0() {
        this.f41467s = new C5884gx.C5885a(this).mo43018b(0).mo43017a();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f41468x = new ea0.C5757a(this, this.f41467s).mo42180c(displayMetrics.widthPixels, displayMetrics.heightPixels).mo42179b(true).mo42178a();
        if (this.f41466r.getHolder().getSurface().isValid()) {
            try {
                if (zr0.m31438a(this, "android.permission.CAMERA") == 0) {
                    this.f41468x.mo42174b(this.f41466r.getHolder());
                }
                this.f41466r.getHolder().addCallback(new C8192b());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.f41466r.getHolder().addCallback(new C8193c());
        }
        this.f41467s.mo42283e(new C8194d());
    }

    public final void initViews() {
        this.f41466r = (SurfaceView) findViewById(R.id.surfaceView);
        ((ImageView) findViewById(R.id.iv_back)).setOnClickListener(new yl5(this));
        ((ImageView) findViewById(R.id.iv_gallery)).setOnClickListener(new zl5(this));
    }

    /* renamed from: n0 */
    public final void mo56873n0() {
        a77.m55424b(this, Boolean.TRUE);
        View findViewById = findViewById(R.id.main_layout);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        mo56997L().mo60949c(findViewById, new dm5(this, intent), new em5());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scanned_code);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        initViews();
        mo56870d0();
    }

    public void onPause() {
        super.onPause();
        this.f41465A = true;
        ea0 ea0 = this.f41468x;
        if (ea0 != null) {
            ea0.mo42173a();
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public void onResume() {
        super.onResume();
        a77.m55424b(this, Boolean.FALSE);
        if (zr0.m31438a(this, "android.permission.CAMERA") == 0 && this.f41465A) {
            mo56871e0();
        }
    }
}
