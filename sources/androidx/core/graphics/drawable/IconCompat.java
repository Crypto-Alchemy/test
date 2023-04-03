package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.github.mikephil.charting.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.web3j.ens.contracts.generated.PublicResolver;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f3411k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3412a;

    /* renamed from: b */
    public Object f3413b;

    /* renamed from: c */
    public byte[] f3414c;

    /* renamed from: d */
    public Parcelable f3415d;

    /* renamed from: e */
    public int f3416e;

    /* renamed from: f */
    public int f3417f;

    /* renamed from: g */
    public ColorStateList f3418g;

    /* renamed from: h */
    public PorterDuff.Mode f3419h;

    /* renamed from: i */
    public String f3420i;

    /* renamed from: j */
    public String f3421j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0564a {
        /* renamed from: a */
        public static IconCompat m4336a(Object obj) {
            gu4.m18428f(obj);
            int d = m4339d(obj);
            if (d == 2) {
                return IconCompat.m4324h((Resources) null, m4338c(obj), m4337b(obj));
            }
            if (d == 4) {
                return IconCompat.m4322f(m4340e(obj));
            }
            if (d == 6) {
                return IconCompat.m4319c(m4340e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3413b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        public static int m4337b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0566c.m4345a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        public static String m4338c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0566c.m4346b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: d */
        public static int m4339d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0566c.m4347c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (InvocationTargetException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                return -1;
            } catch (NoSuchMethodException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(obj);
                return -1;
            }
        }

        /* renamed from: e */
        public static Uri m4340e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0566c.m4348d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public static Drawable m4341f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        public static Icon m4342g(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f3412a) {
                case -1:
                    return (Icon) iconCompat.f3413b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f3413b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.mo5361k(), iconCompat.f3416e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f3413b, iconCompat.f3416e, iconCompat.f3417f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f3413b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m4318b((Bitmap) iconCompat.f3413b, false));
                        break;
                    } else {
                        icon = C0565b.m4344b((Bitmap) iconCompat.f3413b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C0567d.m4349a(iconCompat.mo5363m());
                        break;
                    } else if (context != null) {
                        InputStream n = iconCompat.mo5364n(context);
                        if (n != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m4318b(BitmapFactory.decodeStream(n), false));
                                break;
                            } else {
                                icon = C0565b.m4344b(BitmapFactory.decodeStream(n));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.mo5363m());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.mo5363m());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f3418g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3419h;
            if (mode != IconCompat.f3411k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C0565b {
        /* renamed from: a */
        public static Drawable m4343a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m4344b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C0566c {
        /* renamed from: a */
        public static int m4345a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m4346b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m4347c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m4348d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C0567d {
        /* renamed from: a */
        public static Icon m4349a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3412a = -1;
        this.f3414c = null;
        this.f3415d = null;
        this.f3416e = 0;
        this.f3417f = 0;
        this.f3418g = null;
        this.f3419h = f3411k;
        this.f3420i = null;
    }

    /* renamed from: a */
    public static IconCompat m4317a(Icon icon) {
        return C0564a.m4336a(icon);
    }

    /* renamed from: b */
    public static Bitmap m4318b(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, Utils.FLOAT_EPSILON, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m4319c(Uri uri) {
        mf4.m22285c(uri);
        return m4320d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m4320d(String str) {
        mf4.m22285c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3413b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m4321e(Bitmap bitmap) {
        mf4.m22285c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3413b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m4322f(Uri uri) {
        mf4.m22285c(uri);
        return m4323g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m4323g(String str) {
        mf4.m22285c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3413b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m4324h(Resources resources, String str, int i) {
        mf4.m22285c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3416e = i;
            if (resources != null) {
                try {
                    iconCompat.f3413b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3413b = str;
            }
            iconCompat.f3421j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: s */
    public static String m4325s(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: i */
    public Bitmap mo5359i() {
        int i = this.f3412a;
        if (i == -1) {
            Object obj = this.f3413b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3413b;
        } else {
            if (i == 5) {
                return m4318b((Bitmap) this.f3413b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: j */
    public int mo5360j() {
        int i = this.f3412a;
        if (i == -1) {
            return C0564a.m4337b(this.f3413b);
        }
        if (i == 2) {
            return this.f3416e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: k */
    public String mo5361k() {
        int i = this.f3412a;
        if (i == -1) {
            return C0564a.m4338c(this.f3413b);
        }
        if (i == 2) {
            String str = this.f3421j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f3413b).split(":", -1)[0];
            }
            return this.f3421j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: l */
    public int mo5362l() {
        int i = this.f3412a;
        if (i == -1) {
            return C0564a.m4339d(this.f3413b);
        }
        return i;
    }

    /* renamed from: m */
    public Uri mo5363m() {
        int i = this.f3412a;
        if (i == -1) {
            return C0564a.m4340e(this.f3413b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3413b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: n */
    public InputStream mo5364n(Context context) {
        Uri m = mo5363m();
        String scheme = m.getScheme();
        if (PublicResolver.FUNC_CONTENT.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to load image from URI: ");
                sb.append(m);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3413b));
            } catch (FileNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to load image from path: ");
                sb2.append(m);
                return null;
            }
        }
    }

    /* renamed from: o */
    public void mo5365o() {
        this.f3419h = PorterDuff.Mode.valueOf(this.f3420i);
        switch (this.f3412a) {
            case -1:
                Parcelable parcelable = this.f3415d;
                if (parcelable != null) {
                    this.f3413b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3415d;
                if (parcelable2 != null) {
                    this.f3413b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3414c;
                this.f3413b = bArr;
                this.f3412a = 3;
                this.f3416e = 0;
                this.f3417f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3414c, Charset.forName("UTF-16"));
                this.f3413b = str;
                if (this.f3412a == 2 && this.f3421j == null) {
                    this.f3421j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3413b = this.f3414c;
                return;
            default:
                return;
        }
    }

    /* renamed from: p */
    public void mo5366p(boolean z) {
        this.f3420i = this.f3419h.name();
        switch (this.f3412a) {
            case -1:
                if (!z) {
                    this.f3415d = (Parcelable) this.f3413b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3413b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3414c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3415d = (Parcelable) this.f3413b;
                return;
            case 2:
                this.f3414c = ((String) this.f3413b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3414c = (byte[]) this.f3413b;
                return;
            case 4:
            case 6:
                this.f3414c = this.f3413b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    @Deprecated
    /* renamed from: q */
    public Icon mo5367q() {
        return mo5368r((Context) null);
    }

    /* renamed from: r */
    public Icon mo5368r(Context context) {
        return C0564a.m4342g(this, context);
    }

    public String toString() {
        if (this.f3412a == -1) {
            return String.valueOf(this.f3413b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m4325s(this.f3412a));
        switch (this.f3412a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3413b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3413b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3421j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo5360j())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3416e);
                if (this.f3417f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3417f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3413b);
                break;
        }
        if (this.f3418g != null) {
            sb.append(" tint=");
            sb.append(this.f3418g);
        }
        if (this.f3419h != f3411k) {
            sb.append(" mode=");
            sb.append(this.f3419h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f3414c = null;
        this.f3415d = null;
        this.f3416e = 0;
        this.f3417f = 0;
        this.f3418g = null;
        this.f3419h = f3411k;
        this.f3420i = null;
        this.f3412a = i;
    }
}
