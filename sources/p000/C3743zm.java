package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p000.pf5;

/* renamed from: zm */
/* compiled from: AppCompatDrawableManager */
public final class C3743zm {

    /* renamed from: b */
    public static final PorterDuff.Mode f20600b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C3743zm f20601c;

    /* renamed from: a */
    public pf5 f20602a;

    /* renamed from: zm$a */
    /* compiled from: AppCompatDrawableManager */
    public class C3744a implements pf5.C3059f {

        /* renamed from: a */
        public final int[] f20603a = {x25.abc_textfield_search_default_mtrl_alpha, x25.abc_textfield_default_mtrl_alpha, x25.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f20604b = {x25.abc_ic_commit_search_api_mtrl_alpha, x25.abc_seekbar_tick_mark_material, x25.abc_ic_menu_share_mtrl_alpha, x25.abc_ic_menu_copy_mtrl_am_alpha, x25.abc_ic_menu_cut_mtrl_alpha, x25.abc_ic_menu_selectall_mtrl_alpha, x25.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f20605c = {x25.abc_textfield_activated_mtrl_alpha, x25.abc_textfield_search_activated_mtrl_alpha, x25.abc_cab_background_top_mtrl_alpha, x25.abc_text_cursor_material, x25.abc_text_select_handle_left_mtrl, x25.abc_text_select_handle_middle_mtrl, x25.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f20606d = {x25.abc_popup_background_mtrl_mult, x25.abc_cab_background_internal_bg, x25.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f20607e = {x25.abc_tab_indicator_material, x25.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f20608f = {x25.abc_btn_check_material, x25.abc_btn_radio_material, x25.abc_btn_check_material_anim, x25.abc_btn_radio_material_anim};

        /* renamed from: a */
        public Drawable mo24573a(pf5 pf5, Context context, int i) {
            if (i == x25.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{pf5.mo24559j(context, x25.abc_cab_background_internal_bg), pf5.mo24559j(context, x25.abc_cab_background_top_mtrl_alpha)});
            } else if (i == x25.abc_ratingbar_material) {
                return mo28537l(pf5, context, n25.abc_star_big);
            } else {
                if (i == x25.abc_ratingbar_indicator_material) {
                    return mo28537l(pf5, context, n25.abc_star_medium);
                }
                if (i == x25.abc_ratingbar_small_material) {
                    return mo28537l(pf5, context, n25.abc_star_small);
                }
                return null;
            }
        }

        /* renamed from: b */
        public ColorStateList mo24574b(Context context, int i) {
            if (i == x25.abc_edit_text_material) {
                return C2554in.m19713a(context, a25.abc_tint_edittext);
            }
            if (i == x25.abc_switch_track_mtrl_alpha) {
                return C2554in.m19713a(context, a25.abc_tint_switch_track);
            }
            if (i == x25.abc_switch_thumb_material) {
                return mo28536k(context);
            }
            if (i == x25.abc_btn_default_mtrl_shape) {
                return mo28535j(context);
            }
            if (i == x25.abc_btn_borderless_material) {
                return mo28532g(context);
            }
            if (i == x25.abc_btn_colored_material) {
                return mo28534i(context);
            }
            if (i == x25.abc_spinner_mtrl_am_alpha || i == x25.abc_spinner_textfield_background_material) {
                return C2554in.m19713a(context, a25.abc_tint_spinner);
            }
            if (mo28531f(this.f20604b, i)) {
                return xo6.m30266e(context, m15.colorControlNormal);
            }
            if (mo28531f(this.f20607e, i)) {
                return C2554in.m19713a(context, a25.abc_tint_default);
            }
            if (mo28531f(this.f20608f, i)) {
                return C2554in.m19713a(context, a25.abc_tint_btn_checkable);
            }
            if (i == x25.abc_seekbar_thumb_material) {
                return C2554in.m19713a(context, a25.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo24575c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = p000.C3743zm.f20600b
                int[] r1 = r6.f20603a
                boolean r1 = r6.mo28531f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p000.m15.colorControlNormal
            L_0x0014:
                r8 = r3
            L_0x0015:
                r1 = r5
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f20605c
                boolean r1 = r6.mo28531f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p000.m15.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f20606d
                boolean r1 = r6.mo28531f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p000.x25.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p000.x25.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = r3
                r1 = r4
                r2 = r1
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = p000.sj1.m26919a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = p000.xo6.m30264c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = p000.C3743zm.m31369e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C3743zm.C3744a.mo24575c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: d */
        public PorterDuff.Mode mo24576d(int i) {
            if (i == x25.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo24577e(Context context, int i, Drawable drawable) {
            if (i == x25.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = m15.colorControlNormal;
                mo28538m(findDrawableByLayerId, xo6.m30264c(context, i2), C3743zm.f20600b);
                mo28538m(layerDrawable.findDrawableByLayerId(16908303), xo6.m30264c(context, i2), C3743zm.f20600b);
                mo28538m(layerDrawable.findDrawableByLayerId(16908301), xo6.m30264c(context, m15.colorControlActivated), C3743zm.f20600b);
                return true;
            } else if (i != x25.abc_ratingbar_material && i != x25.abc_ratingbar_indicator_material && i != x25.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                mo28538m(layerDrawable2.findDrawableByLayerId(16908288), xo6.m30263b(context, m15.colorControlNormal), C3743zm.f20600b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = m15.colorControlActivated;
                mo28538m(findDrawableByLayerId2, xo6.m30264c(context, i3), C3743zm.f20600b);
                mo28538m(layerDrawable2.findDrawableByLayerId(16908301), xo6.m30264c(context, i3), C3743zm.f20600b);
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo28531f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList mo28532g(Context context) {
            return mo28533h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList mo28533h(Context context, int i) {
            int c = xo6.m30264c(context, m15.colorControlHighlight);
            int b = xo6.m30263b(context, m15.colorButtonNormal);
            return new ColorStateList(new int[][]{xo6.f19934b, xo6.f19937e, xo6.f19935c, xo6.f19941i}, new int[]{b, gl0.m18165f(c, i), gl0.m18165f(c, i), i});
        }

        /* renamed from: i */
        public final ColorStateList mo28534i(Context context) {
            return mo28533h(context, xo6.m30264c(context, m15.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList mo28535j(Context context) {
            return mo28533h(context, xo6.m30264c(context, m15.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList mo28536k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = m15.colorSwitchThumbNormal;
            ColorStateList e = xo6.m30266e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = xo6.f19934b;
                iArr2[0] = xo6.m30263b(context, i);
                iArr[1] = xo6.f19938f;
                iArr2[1] = xo6.m30264c(context, m15.colorControlActivated);
                iArr[2] = xo6.f19941i;
                iArr2[2] = xo6.m30264c(context, i);
            } else {
                int[] iArr3 = xo6.f19934b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = xo6.f19938f;
                iArr2[1] = xo6.m30264c(context, m15.colorControlActivated);
                iArr[2] = xo6.f19941i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable mo28537l(pf5 pf5, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = pf5.mo24559j(context, x25.abc_star_black_48dp);
            Drawable j2 = pf5.mo24559j(context, x25.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void mo28538m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (sj1.m26919a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C3743zm.f20600b;
            }
            drawable.setColorFilter(C3743zm.m31369e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C3743zm m31368b() {
        C3743zm zmVar;
        synchronized (C3743zm.class) {
            if (f20601c == null) {
                m31370h();
            }
            zmVar = f20601c;
        }
        return zmVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m31369e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C3743zm.class) {
            l = pf5.m24868l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m31370h() {
        synchronized (C3743zm.class) {
            if (f20601c == null) {
                C3743zm zmVar = new C3743zm();
                f20601c = zmVar;
                zmVar.f20602a = pf5.m24867h();
                f20601c.f20602a.mo24567u(new C3744a());
            }
        }
    }

    /* renamed from: i */
    public static void m31371i(Drawable drawable, wq6 wq6, int[] iArr) {
        pf5.m24871w(drawable, wq6, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo28527c(Context context, int i) {
        return this.f20602a.mo24559j(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable mo28528d(Context context, int i, boolean z) {
        return this.f20602a.mo24560k(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList mo28529f(Context context, int i) {
        return this.f20602a.mo24561m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo28530g(Context context) {
        this.f20602a.mo24565s(context);
    }
}
