package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {

    /* renamed from: e */
    public static Method f9271e;

    /* renamed from: a */
    public SVG f9272a = null;

    /* renamed from: d */
    public C1892a f9273d = new C1892a();

    /* renamed from: com.caverock.androidsvg.SVGImageView$b */
    public class C1882b extends AsyncTask<Integer, Integer, SVG> {

        /* renamed from: a */
        public Context f9274a;

        /* renamed from: b */
        public int f9275b;

        public C1882b(Context context, int i) {
            this.f9274a = context;
            this.f9275b = i;
        }

        /* renamed from: a */
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.m12727i(this.f9274a, this.f9275b);
            } catch (SVGParseException e) {
                String.format("Error loading resource 0x%x: %s", new Object[]{Integer.valueOf(this.f9275b), e.getMessage()});
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(SVG svg) {
            SVG unused = SVGImageView.this.f9272a = svg;
            SVGImageView.this.mo12810c();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGImageView$c */
    public class C1883c extends AsyncTask<InputStream, Integer, SVG> {
        public C1883c() {
        }

        /* renamed from: a */
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                SVG h = SVG.m12726h(inputStreamArr[0]);
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused) {
                }
                return h;
            } catch (SVGParseException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parse error loading URI: ");
                sb.append(e.getMessage());
                try {
                    inputStreamArr[0].close();
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }

        /* renamed from: b */
        public void onPostExecute(SVG svg) {
            SVG unused = SVGImageView.this.f9272a = svg;
            SVGImageView.this.mo12810c();
        }
    }

    static {
        Class<View> cls = View.class;
        try {
            f9271e = cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class});
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
    }

    private void setFromString(String str) {
        try {
            this.f9272a = SVG.m12729k(str);
            mo12810c();
        } catch (SVGParseException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find SVG at: ");
            sb.append(str);
        }
    }

    /* renamed from: c */
    public final void mo12810c() {
        SVG svg = this.f9272a;
        if (svg != null) {
            Picture p = svg.mo12756p(this.f9273d);
            mo12814g();
            setImageDrawable(new PictureDrawable(p));
        }
    }

    /* renamed from: d */
    public final void mo12811d(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, o55.SVGImageView, i, 0);
            try {
                String string = obtainStyledAttributes.getString(o55.SVGImageView_css);
                if (string != null) {
                    this.f9273d.mo12943a(string);
                }
                int i2 = o55.SVGImageView_svg;
                int resourceId = obtainStyledAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    setImageResource(resourceId);
                    return;
                }
                String string2 = obtainStyledAttributes.getString(i2);
                if (string2 != null) {
                    if (mo12813f(Uri.parse(string2))) {
                        obtainStyledAttributes.recycle();
                        return;
                    } else if (mo12812e(string2)) {
                        obtainStyledAttributes.recycle();
                        return;
                    } else {
                        setFromString(string2);
                    }
                }
                obtainStyledAttributes.recycle();
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo12812e(String str) {
        try {
            InputStream open = getContext().getAssets().open(str);
            new C1883c().execute(new InputStream[]{open});
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo12813f(Uri uri) {
        try {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            new C1883c().execute(new InputStream[]{openInputStream});
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final void mo12814g() {
        if (f9271e != null) {
            try {
                int i = View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()));
                f9271e.invoke(this, new Object[]{Integer.valueOf(i), null});
            } catch (Exception unused) {
            }
        }
    }

    public void setCSS(String str) {
        this.f9273d.mo12943a(str);
        mo12810c();
    }

    public void setImageAsset(String str) {
        if (!mo12812e(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("File not found: ");
            sb.append(str);
        }
    }

    public void setImageResource(int i) {
        new C1882b(getContext(), i).execute(new Integer[0]);
    }

    public void setImageURI(Uri uri) {
        if (!mo12813f(uri)) {
            StringBuilder sb = new StringBuilder();
            sb.append("File not found: ");
            sb.append(uri);
        }
    }

    public void setSVG(SVG svg) {
        if (svg != null) {
            this.f9272a = svg;
            mo12810c();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        mo12811d(attributeSet, 0);
    }

    public void setSVG(SVG svg, String str) {
        if (svg != null) {
            this.f9272a = svg;
            this.f9273d.mo12943a(str);
            mo12810c();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo12811d(attributeSet, i);
    }
}
