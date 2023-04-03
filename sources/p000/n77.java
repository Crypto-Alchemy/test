package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C4214a;
import java.util.Locale;

/* renamed from: n77 */
/* compiled from: Utils */
public class n77 {

    /* renamed from: n77$a */
    /* compiled from: Utils */
    public static class C9717a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4214a f46517a;

        public C9717a(C4214a aVar) {
            this.f46517a = aVar;
        }

        public void run() {
            this.f46517a.cancel();
        }
    }

    /* renamed from: n77$b */
    /* compiled from: Utils */
    public static class C9718b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f46518a;

        /* renamed from: d */
        public final /* synthetic */ View f46519d;

        /* renamed from: e */
        public final /* synthetic */ C4214a f46520e;

        public C9718b(View.OnClickListener onClickListener, View view, C4214a aVar) {
            this.f46518a = onClickListener;
            this.f46519d = view;
            this.f46520e = aVar;
        }

        public void onClick(View view) {
            this.f46518a.onClick(this.f46519d);
            this.f46520e.cancel();
        }
    }

    /* renamed from: n77$c */
    /* compiled from: Utils */
    public static class C9719c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        public final /* synthetic */ Handler f46521a;

        /* renamed from: d */
        public final /* synthetic */ Runnable f46522d;

        public C9719c(Handler handler, Runnable runnable) {
            this.f46521a = handler;
            this.f46522d = runnable;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f46521a.removeCallbacks(this.f46522d);
        }
    }

    /* renamed from: n77$d */
    /* compiled from: Utils */
    public static class C9720d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public final /* synthetic */ Handler f46523a;

        /* renamed from: d */
        public final /* synthetic */ Runnable f46524d;

        public C9720d(Handler handler, Runnable runnable) {
            this.f46523a = handler;
            this.f46524d = runnable;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.f46523a.removeCallbacks(this.f46524d);
        }
    }

    /* renamed from: n77$e */
    /* compiled from: Utils */
    public static class C9721e implements lw6 {

        /* renamed from: a */
        public final int f46525a;

        /* renamed from: b */
        public final int f46526b;

        public C9721e(int i, int i2) {
            this.f46525a = i;
            this.f46526b = i2;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s", new Object[]{Integer.valueOf(this.f46525a), Integer.valueOf(this.f46526b)});
        }

        public Bitmap transform(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = this.f46526b;
            RectF rectF = new RectF((float) i, (float) i, (float) (bitmap.getWidth() - this.f46526b), (float) (bitmap.getHeight() - this.f46526b));
            int i2 = this.f46525a;
            canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static int m75284a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return -16777216;
        }
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            return typedValue.data;
        }
        return zr0.m31440c(context, i2);
    }

    /* renamed from: b */
    public static void m75285b(ImageView imageView, int i) {
        if (imageView != null && imageView.getDrawable() != null) {
            ij1.m19655n(ij1.m19659r(imageView.getDrawable()).mutate(), i);
            imageView.invalidate();
        }
    }

    /* renamed from: c */
    public static boolean m75286c(String str, Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static lw6 m75287d(Context context, int i) {
        return new C9721e(context.getResources().getDimensionPixelOffset(i), 0);
    }

    /* renamed from: e */
    public static void m75288e(View view, String str, long j, CharSequence charSequence, View.OnClickListener onClickListener) {
        C4214a aVar = new C4214a(view.getContext());
        Handler handler = new Handler();
        C9717a aVar2 = new C9717a(aVar);
        aVar.setContentView(h45.belvedere_bottom_sheet);
        TextView textView = (TextView) aVar.findViewById(m35.belvedere_bottom_sheet_message_text);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) aVar.findViewById(m35.belvedere_bottom_sheet_actions_text);
        if (textView2 != null) {
            textView2.setText(charSequence);
            textView2.setOnClickListener(new C9718b(onClickListener, view, aVar));
        }
        aVar.setCancelable(true);
        aVar.setOnCancelListener(new C9719c(handler, aVar2));
        aVar.setOnDismissListener(new C9720d(handler, aVar2));
        aVar.show();
        handler.postDelayed(aVar2, j);
    }

    /* renamed from: f */
    public static void m75289f(View view, boolean z) {
        int i;
        View findViewById = view.findViewById(m35.image_stream_toolbar);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = view.findViewById(m35.image_stream_toolbar_container);
        if (findViewById2 != null) {
            if (!z) {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
        }
    }
}
