package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.OneSignal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.onesignal.g1 */
/* compiled from: TrackAmazonPurchase */
public class C5236g1 {

    /* renamed from: a */
    public Context f26326a;

    /* renamed from: b */
    public boolean f26327b = false;

    /* renamed from: c */
    public C5238b f26328c;

    /* renamed from: d */
    public boolean f26329d = false;

    /* renamed from: e */
    public Object f26330e;

    /* renamed from: f */
    public Field f26331f;

    /* renamed from: com.onesignal.g1$a */
    /* compiled from: TrackAmazonPurchase */
    public class C5237a implements Runnable {
        public C5237a() {
        }

        public void run() {
            PurchasingService.registerListener(C5236g1.this.f26326a, C5236g1.this.f26328c);
        }
    }

    /* renamed from: com.onesignal.g1$b */
    /* compiled from: TrackAmazonPurchase */
    public class C5238b implements PurchasingListener {

        /* renamed from: a */
        public PurchasingListener f26333a;

        public C5238b() {
        }

        public /* synthetic */ C5238b(C5236g1 g1Var, C5237a aVar) {
            this();
        }
    }

    public C5236g1(Context context) {
        this.f26326a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f26330e = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f26330e = cls.getMethod("e", new Class[0]).invoke((Object) null, new Object[0]);
                this.f26329d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f26331f = declaredField;
            declaredField.setAccessible(true);
            C5238b bVar = new C5238b(this, (C5237a) null);
            this.f26328c = bVar;
            bVar.f26333a = (PurchasingListener) this.f26331f.get(this.f26330e);
            this.f26327b = true;
            mo38829e();
        } catch (ClassNotFoundException e) {
            m40852d(e);
        } catch (IllegalAccessException e2) {
            m40852d(e2);
        } catch (InvocationTargetException e3) {
            m40852d(e3);
        } catch (NoSuchMethodException e4) {
            m40852d(e4);
        } catch (NoSuchFieldException e5) {
            m40852d(e5);
        } catch (ClassCastException e6) {
            m40852d(e6);
        }
    }

    /* renamed from: d */
    public static void m40852d(Exception exc) {
        OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    /* renamed from: c */
    public void mo38828c() {
        if (this.f26327b) {
            try {
                C5238b bVar = (PurchasingListener) this.f26331f.get(this.f26330e);
                C5238b bVar2 = this.f26328c;
                if (bVar != bVar2) {
                    bVar2.f26333a = bVar;
                    mo38829e();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public final void mo38829e() {
        if (this.f26329d) {
            OSUtils.m40270S(new C5237a());
        } else {
            PurchasingService.registerListener(this.f26326a, this.f26328c);
        }
    }
}
