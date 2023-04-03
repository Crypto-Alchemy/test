package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: AlertDialog */
public class C0147a extends C3629xm {

    /* renamed from: a */
    public final AlertController f608a = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: AlertDialog */
    public static class C0148a {

        /* renamed from: a */
        public final AlertController.C0113b f609a;

        /* renamed from: b */
        public final int f610b;

        public C0148a(Context context) {
            this(context, C0147a.m853c(context, 0));
        }

        /* renamed from: a */
        public C0148a mo1196a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f487w = listAdapter;
            bVar.f488x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0148a mo1197b(boolean z) {
            this.f609a.f482r = z;
            return this;
        }

        /* renamed from: c */
        public C0148a mo1198c(View view) {
            this.f609a.f471g = view;
            return this;
        }

        public C0147a create() {
            C0147a aVar = new C0147a(this.f609a.f465a, this.f610b);
            this.f609a.mo1005a(aVar.f608a);
            aVar.setCancelable(this.f609a.f482r);
            if (this.f609a.f482r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f609a.f483s);
            aVar.setOnDismissListener(this.f609a.f484t);
            DialogInterface.OnKeyListener onKeyListener = this.f609a.f485u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        /* renamed from: d */
        public C0148a mo1200d(Drawable drawable) {
            this.f609a.f468d = drawable;
            return this;
        }

        /* renamed from: e */
        public C0148a mo1201e(int i) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f472h = bVar.f465a.getText(i);
            return this;
        }

        /* renamed from: f */
        public C0148a mo1202f(CharSequence charSequence) {
            this.f609a.f472h = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0148a mo1203g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f476l = charSequence;
            bVar.f478n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f609a.f465a;
        }

        /* renamed from: h */
        public C0148a mo1205h(DialogInterface.OnKeyListener onKeyListener) {
            this.f609a.f485u = onKeyListener;
            return this;
        }

        /* renamed from: i */
        public C0148a mo1206i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f473i = charSequence;
            bVar.f475k = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C0148a mo1207j(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f487w = listAdapter;
            bVar.f488x = onClickListener;
            bVar.f457I = i;
            bVar.f456H = true;
            return this;
        }

        /* renamed from: k */
        public C0148a mo1208k(int i) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f470f = bVar.f465a.getText(i);
            return this;
        }

        /* renamed from: l */
        public C0147a mo1209l() {
            C0147a create = create();
            create.show();
            return create;
        }

        public C0148a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f476l = bVar.f465a.getText(i);
            this.f609a.f478n = onClickListener;
            return this;
        }

        public C0148a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f473i = bVar.f465a.getText(i);
            this.f609a.f475k = onClickListener;
            return this;
        }

        public C0148a setTitle(CharSequence charSequence) {
            this.f609a.f470f = charSequence;
            return this;
        }

        public C0148a setView(View view) {
            AlertController.C0113b bVar = this.f609a;
            bVar.f490z = view;
            bVar.f489y = 0;
            bVar.f453E = false;
            return this;
        }

        public C0148a(Context context, int i) {
            this.f609a = new AlertController.C0113b(new ContextThemeWrapper(context, C0147a.m853c(context, i)));
            this.f610b = i;
        }
    }

    public C0147a(Context context, int i) {
        super(context, m853c(context, i));
    }

    /* renamed from: c */
    public static int m853c(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m15.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView mo1191b() {
        return this.f608a.mo982d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f608a.mo983e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f608a.mo984f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f608a.mo985g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f608a.mo994p(charSequence);
    }
}
