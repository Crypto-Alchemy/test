package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import zendesk.belvedere.C9807c;
import zendesk.belvedere.FixedWidthImageView;
import zendesk.belvedere.SelectableView;

/* renamed from: zendesk.belvedere.d */
/* compiled from: ImageStreamItems */
public class C9810d {

    /* renamed from: a */
    public static final int f46704a = w25.belvedere_ic_camera_black;

    /* renamed from: b */
    public static final int f46705b = h45.belvedere_stream_list_item_square_static;

    /* renamed from: zendesk.belvedere.d$a */
    /* compiled from: ImageStreamItems */
    public static class C9811a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C9807c.C9809b f46706a;

        public C9811a(C9807c.C9809b bVar) {
            this.f46706a = bVar;
        }

        public void onClick(View view) {
            this.f46706a.mo73758b();
        }
    }

    /* renamed from: zendesk.belvedere.d$b */
    /* compiled from: ImageStreamItems */
    public static abstract class C9812b {

        /* renamed from: a */
        public final int f46707a;

        /* renamed from: b */
        public final long f46708b = ((long) UUID.randomUUID().hashCode());

        /* renamed from: c */
        public final MediaResult f46709c;

        /* renamed from: d */
        public boolean f46710d = false;

        public C9812b(int i, MediaResult mediaResult) {
            this.f46707a = i;
            this.f46709c = mediaResult;
        }

        /* renamed from: a */
        public abstract void mo73760a(View view);

        /* renamed from: b */
        public long mo73761b() {
            return this.f46708b;
        }

        /* renamed from: c */
        public int mo73762c() {
            return this.f46707a;
        }

        /* renamed from: d */
        public MediaResult mo73763d() {
            return this.f46709c;
        }

        /* renamed from: e */
        public boolean mo73764e() {
            return this.f46710d;
        }

        /* renamed from: f */
        public void mo73765f(boolean z) {
            this.f46710d = z;
        }
    }

    /* renamed from: zendesk.belvedere.d$c */
    /* compiled from: ImageStreamItems */
    public static class C9813c extends C9812b {

        /* renamed from: e */
        public final int f46711e;

        /* renamed from: f */
        public final View.OnClickListener f46712f;

        public /* synthetic */ C9813c(int i, int i2, View.OnClickListener onClickListener, C9811a aVar) {
            this(i, i2, onClickListener);
        }

        /* renamed from: a */
        public void mo73760a(View view) {
            ((ImageView) view.findViewById(m35.list_item_static_image)).setImageResource(this.f46711e);
            view.findViewById(m35.list_item_static_click_area).setOnClickListener(this.f46712f);
        }

        public C9813c(int i, int i2, View.OnClickListener onClickListener) {
            super(i, (MediaResult) null);
            this.f46711e = i2;
            this.f46712f = onClickListener;
        }
    }

    /* renamed from: zendesk.belvedere.d$d */
    /* compiled from: ImageStreamItems */
    public static class C9814d extends C9812b {

        /* renamed from: e */
        public final MediaResult f46713e;

        /* renamed from: f */
        public final ResolveInfo f46714f;

        /* renamed from: g */
        public final C9807c.C9809b f46715g;

        /* renamed from: zendesk.belvedere.d$d$a */
        /* compiled from: ImageStreamItems */
        public class C9815a implements SelectableView.C9799c {
            public C9815a() {
            }

            /* renamed from: a */
            public boolean mo73722a(boolean z) {
                return C9814d.this.f46715g.mo73757a(C9814d.this);
            }
        }

        public C9814d(C9807c.C9809b bVar, MediaResult mediaResult, Context context) {
            super(h45.belvedere_stream_list_item_genric_file, mediaResult);
            this.f46713e = mediaResult;
            this.f46714f = mo73766h(mediaResult.mo73700h(), context);
            this.f46715g = bVar;
        }

        /* renamed from: a */
        public void mo73760a(View view) {
            Context context = view.getContext();
            ImageView imageView = (ImageView) view.findViewById(m35.list_item_file_icon);
            TextView textView = (TextView) view.findViewById(m35.list_item_file_label);
            SelectableView selectableView = (SelectableView) view.findViewById(m35.list_item_file_holder);
            selectableView.setContentDescriptionStrings(context.getString(q45.belvedere_stream_item_unselect_file_desc, new Object[]{this.f46713e.mo73700h()}), context.getString(q45.belvedere_stream_item_select_file_desc, new Object[]{this.f46713e.mo73700h()}));
            ((TextView) view.findViewById(m35.list_item_file_title)).setText(this.f46713e.mo73700h());
            if (this.f46714f != null) {
                PackageManager packageManager = context.getPackageManager();
                textView.setText(this.f46714f.loadLabel(packageManager));
                imageView.setImageDrawable(this.f46714f.loadIcon(packageManager));
            } else {
                textView.setText(q45.belvedere_image_stream_unknown_app);
                imageView.setImageResource(17301651);
            }
            selectableView.setSelected(mo73764e());
            selectableView.setSelectionListener(new C9815a());
        }

        /* renamed from: h */
        public final ResolveInfo mo73766h(String str, Context context) {
            PackageManager packageManager = context.getPackageManager();
            MediaResult d = C9800a.m75438c(context).mo73725d("tmp", str);
            if (d == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(d.mo73704m());
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return null;
            }
            return queryIntentActivities.get(0);
        }
    }

    /* renamed from: zendesk.belvedere.d$e */
    /* compiled from: ImageStreamItems */
    public static class C9816e extends C9812b {

        /* renamed from: e */
        public final MediaResult f46717e;

        /* renamed from: f */
        public final C9807c.C9809b f46718f;

        /* renamed from: g */
        public FixedWidthImageView.C9784b f46719g;

        /* renamed from: zendesk.belvedere.d$e$a */
        /* compiled from: ImageStreamItems */
        public class C9817a implements FixedWidthImageView.C9785c {
            public C9817a() {
            }

            /* renamed from: a */
            public void mo73648a(FixedWidthImageView.C9784b bVar) {
                FixedWidthImageView.C9784b unused = C9816e.this.f46719g = bVar;
            }
        }

        /* renamed from: zendesk.belvedere.d$e$b */
        /* compiled from: ImageStreamItems */
        public class C9818b implements SelectableView.C9799c {
            public C9818b() {
            }

            /* renamed from: a */
            public boolean mo73722a(boolean z) {
                return C9816e.this.f46718f.mo73757a(C9816e.this);
            }
        }

        public C9816e(C9807c.C9809b bVar, MediaResult mediaResult) {
            super(h45.belvedere_stream_list_item, mediaResult);
            this.f46718f = bVar;
            this.f46717e = mediaResult;
        }

        /* renamed from: a */
        public void mo73760a(View view) {
            Context context = view.getContext();
            FixedWidthImageView fixedWidthImageView = (FixedWidthImageView) view.findViewById(m35.list_item_image);
            SelectableView selectableView = (SelectableView) view.findViewById(m35.list_item_selectable);
            selectableView.setContentDescriptionStrings(context.getString(q45.belvedere_stream_item_unselect_image_desc, new Object[]{this.f46717e.mo73700h()}), context.getString(q45.belvedere_stream_item_select_image_desc, new Object[]{this.f46717e.mo73700h()}));
            if (this.f46719g != null) {
                fixedWidthImageView.mo73643f(Picasso.m41718h(), this.f46717e.mo73702i(), this.f46719g);
            } else {
                fixedWidthImageView.mo73642e(Picasso.m41718h(), this.f46717e.mo73702i(), this.f46717e.mo73705o(), this.f46717e.mo73698f(), new C9817a());
            }
            selectableView.setSelected(mo73764e());
            selectableView.setSelectionListener(new C9818b());
        }
    }

    /* renamed from: a */
    public static C9813c m75470a(C9807c.C9809b bVar) {
        return new C9813c(f46705b, f46704a, new C9811a(bVar), (C9811a) null);
    }

    /* renamed from: b */
    public static List<C9812b> m75471b(List<MediaResult> list, C9807c.C9809b bVar, Context context) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaResult next : list) {
            if (next.mo73699g() == null || !next.mo73699g().startsWith("image")) {
                arrayList.add(new C9814d(bVar, next, context));
            } else {
                arrayList.add(new C9816e(bVar, next));
            }
        }
        return arrayList;
    }
}
