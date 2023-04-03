package zendesk.belvedere;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.picasso.C5457o;
import com.squareup.picasso.Picasso;
import java.util.concurrent.atomic.AtomicBoolean;

public class FixedWidthImageView extends AppCompatImageView implements C5457o {

    /* renamed from: a */
    public int f46619a = -1;

    /* renamed from: d */
    public int f46620d = -1;

    /* renamed from: e */
    public int f46621e;

    /* renamed from: g */
    public int f46622g;

    /* renamed from: k */
    public Uri f46623k = null;

    /* renamed from: r */
    public Picasso f46624r;

    /* renamed from: s */
    public final AtomicBoolean f46625s = new AtomicBoolean(false);

    /* renamed from: x */
    public C9785c f46626x;

    /* renamed from: zendesk.belvedere.FixedWidthImageView$a */
    public class C9783a implements Runnable {
        public C9783a() {
        }

        public void run() {
            FixedWidthImageView.this.requestLayout();
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$b */
    public static class C9784b {

        /* renamed from: a */
        public final int f46628a;

        /* renamed from: b */
        public final int f46629b;

        /* renamed from: c */
        public final int f46630c;

        /* renamed from: d */
        public final int f46631d;

        public C9784b(int i, int i2, int i3, int i4) {
            this.f46628a = i;
            this.f46629b = i2;
            this.f46630c = i3;
            this.f46631d = i4;
        }
    }

    /* renamed from: zendesk.belvedere.FixedWidthImageView$c */
    public interface C9785c {
        /* renamed from: a */
        void mo73648a(C9784b bVar);
    }

    public FixedWidthImageView(Context context) {
        super(context);
        init();
    }

    /* renamed from: c */
    public final void mo73640c(Picasso picasso, int i, int i2, Uri uri) {
        this.f46620d = i2;
        post(new C9783a());
        C9785c cVar = this.f46626x;
        if (cVar != null) {
            cVar.mo73648a(new C9784b(this.f46622g, this.f46621e, this.f46620d, this.f46619a));
            this.f46626x = null;
        }
        picasso.mo39467j(uri).mo39590k(i, i2).mo39591l(n77.m75287d(getContext(), d25.belvedere_image_stream_item_radius)).mo39585f(this);
    }

    /* renamed from: d */
    public final Pair<Integer, Integer> mo73641d(int i, int i2, int i3) {
        return Pair.create(Integer.valueOf(i), Integer.valueOf((int) (((float) i3) * (((float) i) / ((float) i2)))));
    }

    /* renamed from: e */
    public void mo73642e(Picasso picasso, Uri uri, long j, long j2, C9785c cVar) {
        if (uri == null || uri.equals(this.f46623k)) {
            C9833i.m75551a("FixedWidthImageView", "Image already loaded. " + uri);
            return;
        }
        Picasso picasso2 = this.f46624r;
        if (picasso2 != null) {
            picasso2.mo39461c(this);
            this.f46624r.mo39460b(this);
        }
        this.f46623k = uri;
        this.f46624r = picasso;
        int i = (int) j;
        this.f46621e = i;
        int i2 = (int) j2;
        this.f46622g = i2;
        this.f46626x = cVar;
        int i3 = this.f46619a;
        if (i3 > 0) {
            mo73644g(picasso, uri, i3, i, i2);
        } else {
            this.f46625s.set(true);
        }
    }

    /* renamed from: f */
    public void mo73643f(Picasso picasso, Uri uri, C9784b bVar) {
        if (uri == null || uri.equals(this.f46623k)) {
            C9833i.m75551a("FixedWidthImageView", "Image already loaded. " + uri);
            return;
        }
        Picasso picasso2 = this.f46624r;
        if (picasso2 != null) {
            picasso2.mo39461c(this);
            this.f46624r.mo39460b(this);
        }
        this.f46623k = uri;
        this.f46624r = picasso;
        this.f46621e = bVar.f46629b;
        this.f46622g = bVar.f46628a;
        this.f46620d = bVar.f46630c;
        int d = bVar.f46631d;
        this.f46619a = d;
        mo73644g(picasso, uri, d, this.f46621e, this.f46622g);
    }

    /* renamed from: g */
    public final void mo73644g(Picasso picasso, Uri uri, int i, int i2, int i3) {
        C9833i.m75551a("FixedWidthImageView", "Start loading image: " + i + " " + i2 + " " + i3);
        if (i2 <= 0 || i3 <= 0) {
            picasso.mo39467j(uri).mo39587h(this);
            return;
        }
        Pair<Integer, Integer> d = mo73641d(i, i2, i3);
        mo73640c(picasso, ((Integer) d.first).intValue(), ((Integer) d.second).intValue(), uri);
    }

    public void init() {
        this.f46620d = getResources().getDimensionPixelOffset(d25.belvedere_image_stream_image_height);
    }

    public void onBitmapFailed(Exception exc, Drawable drawable) {
    }

    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.f46622g = bitmap.getHeight();
        int width = bitmap.getWidth();
        this.f46621e = width;
        Pair<Integer, Integer> d = mo73641d(this.f46619a, width, this.f46622g);
        mo73640c(this.f46624r, ((Integer) d.first).intValue(), ((Integer) d.second).intValue(), this.f46623k);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f46620d, 1073741824);
        if (this.f46619a == -1) {
            this.f46619a = size;
        }
        int i3 = this.f46619a;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            if (this.f46625s.compareAndSet(true, false)) {
                mo73644g(this.f46624r, this.f46623k, this.f46619a, this.f46621e, this.f46622g);
            }
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    public void onPrepareLoad(Drawable drawable) {
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FixedWidthImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
