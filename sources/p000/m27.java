package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p000.m72;
import p000.s72;

/* renamed from: m27 */
/* compiled from: TypefaceCompatApi29Impl */
public class m27 extends n27 {
    /* renamed from: i */
    public static int m21984i(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* renamed from: a */
    public Typeface mo20927a(Context context, m72.C2808c cVar, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (m72.C2809d dVar : cVar.mo23051a()) {
                try {
                    Font.Builder weight = new Font.Builder(resources, dVar.mo23053b()).setWeight(dVar.mo23056e());
                    if (dVar.mo23057f()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font build = weight.setSlant(i2).setTtcIndex(dVar.mo23054c()).setFontVariationSettings(dVar.mo23055d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(mo23022h(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo20928b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (s72.C3250b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.mo25657d(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.mo25658e());
                        if (bVar.mo25659f()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font build = weight.setSlant(i2).setTtcIndex(bVar.mo25656c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(mo23022h(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public Typeface mo22164d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public s72.C3250b mo23021g(s72.C3250b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: h */
    public final Font mo23022h(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int i4 = m21984i(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int i6 = m21984i(fontStyle, font2.getStyle());
            if (i6 < i4) {
                font = font2;
                i4 = i6;
            }
        }
        return font;
    }
}
