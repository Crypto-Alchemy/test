package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.f94;

/* renamed from: ba4 */
/* compiled from: NotificationCompatBuilder */
public class ba4 implements b94 {

    /* renamed from: a */
    public final Context f8020a;

    /* renamed from: b */
    public final Notification.Builder f8021b;

    /* renamed from: c */
    public final f94.C2277e f8022c;

    /* renamed from: d */
    public RemoteViews f8023d;

    /* renamed from: e */
    public RemoteViews f8024e;

    /* renamed from: f */
    public final List<Bundle> f8025f = new ArrayList();

    /* renamed from: g */
    public final Bundle f8026g = new Bundle();

    /* renamed from: h */
    public int f8027h;

    /* renamed from: i */
    public RemoteViews f8028i;

    public ba4(f94.C2277e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        this.f8022c = eVar;
        this.f8020a = eVar.f11624a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8021b = new Notification.Builder(eVar.f11624a, eVar.f11613K);
        } else {
            this.f8021b = new Notification.Builder(eVar.f11624a);
        }
        Notification notification = eVar.f11620R;
        Notification.Builder lights = this.f8021b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f11632i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(eVar.f11628e).setContentText(eVar.f11629f).setContentInfo(eVar.f11634k).setContentIntent(eVar.f11630g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f11631h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(eVar.f11633j).setNumber(eVar.f11635l).setProgress(eVar.f11643t, eVar.f11644u, eVar.f11645v);
        this.f8021b.setSubText(eVar.f11640q).setUsesChronometer(eVar.f11638o).setPriority(eVar.f11636m);
        Iterator<f94.C2270a> it = eVar.f11625b.iterator();
        while (it.hasNext()) {
            mo11463b(it.next());
        }
        Bundle bundle = eVar.f11606D;
        if (bundle != null) {
            this.f8026g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f8023d = eVar.f11610H;
        this.f8024e = eVar.f11611I;
        this.f8021b.setShowWhen(eVar.f11637n);
        this.f8021b.setLocalOnly(eVar.f11649z).setGroup(eVar.f11646w).setGroupSummary(eVar.f11647x).setSortKey(eVar.f11648y);
        this.f8027h = eVar.f11617O;
        this.f8021b.setCategory(eVar.f11605C).setColor(eVar.f11607E).setVisibility(eVar.f11608F).setPublicVersion(eVar.f11609G).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m11181e(m11182g(eVar.f11626c), eVar.f11623U);
        } else {
            list = eVar.f11623U;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                this.f8021b.addPerson(addPerson);
            }
        }
        this.f8028i = eVar.f11612J;
        if (eVar.f11627d.size() > 0) {
            Bundle bundle2 = eVar.mo19792d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < eVar.f11627d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), ca4.m11816a(eVar.f11627d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.mo19792d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f8026g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Icon icon = eVar.f11622T;
        if (icon != null) {
            this.f8021b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            Notification.Builder unused = this.f8021b.setExtras(eVar.f11606D).setRemoteInputHistory(eVar.f11642s);
            RemoteViews remoteViews = eVar.f11610H;
            if (remoteViews != null) {
                Notification.Builder unused2 = this.f8021b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f11611I;
            if (remoteViews2 != null) {
                Notification.Builder unused3 = this.f8021b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f11612J;
            if (remoteViews3 != null) {
                Notification.Builder unused4 = this.f8021b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            Notification.Builder unused5 = this.f8021b.setBadgeIconType(eVar.f11614L).setSettingsText(eVar.f11641r).setShortcutId(eVar.f11615M).setTimeoutAfter(eVar.f11616N).setGroupAlertBehavior(eVar.f11617O);
            if (eVar.f11604B) {
                Notification.Builder unused6 = this.f8021b.setColorized(eVar.f11603A);
            }
            if (!TextUtils.isEmpty(eVar.f11613K)) {
                this.f8021b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<io4> it2 = eVar.f11626c.iterator();
            while (it2.hasNext()) {
                Notification.Builder unused7 = this.f8021b.addPerson(it2.next().mo21592h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Notification.Builder unused8 = this.f8021b.setAllowSystemGeneratedContextualActions(eVar.f11619Q);
            Notification.Builder unused9 = this.f8021b.setBubbleMetadata(f94.C2276d.m16700a((f94.C2276d) null));
        }
        if (i5 >= 31 && (i = eVar.f11618P) != 0) {
            Notification.Builder unused10 = this.f8021b.setForegroundServiceBehavior(i);
        }
        if (eVar.f11621S) {
            if (this.f8022c.f11647x) {
                this.f8027h = 2;
            } else {
                this.f8027h = 1;
            }
            this.f8021b.setVibrate((long[]) null);
            this.f8021b.setSound((Uri) null);
            int i6 = notification.defaults & -2 & -3;
            notification.defaults = i6;
            this.f8021b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f8022c.f11646w)) {
                    this.f8021b.setGroup("silent");
                }
                Notification.Builder unused11 = this.f8021b.setGroupAlertBehavior(this.f8027h);
            }
        }
    }

    /* renamed from: e */
    public static List<String> m11181e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3162qq qqVar = new C3162qq(list.size() + list2.size());
        qqVar.addAll(list);
        qqVar.addAll(list2);
        return new ArrayList(qqVar);
    }

    /* renamed from: g */
    public static List<String> m11182g(List<io4> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (io4 g : list) {
            arrayList.add(g.mo21591g());
        }
        return arrayList;
    }

    /* renamed from: a */
    public Notification.Builder mo11450a() {
        return this.f8021b;
    }

    /* renamed from: b */
    public final void mo11463b(f94.C2270a aVar) {
        Icon icon;
        Bundle bundle;
        IconCompat d = aVar.mo19768d();
        if (d != null) {
            icon = d.mo5367q();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, aVar.mo19772h(), aVar.mo19765a());
        if (aVar.mo19769e() != null) {
            for (RemoteInput addRemoteInput : sc5.m26846b(aVar.mo19769e())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        if (aVar.mo19767c() != null) {
            bundle = new Bundle(aVar.mo19767c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo19766b());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            Notification.Action.Builder unused = builder.setAllowGeneratedReplies(aVar.mo19766b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.mo19770f());
        if (i >= 28) {
            Notification.Action.Builder unused2 = builder.setSemanticAction(aVar.mo19770f());
        }
        if (i >= 29) {
            Notification.Action.Builder unused3 = builder.setContextual(aVar.mo19774j());
        }
        if (i >= 31) {
            Notification.Action.Builder unused4 = builder.setAuthenticationRequired(aVar.mo19773i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo19771g());
        builder.addExtras(bundle);
        this.f8021b.addAction(builder.build());
    }

    /* renamed from: c */
    public Notification mo11464c() {
        RemoteViews remoteViews;
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        f94.C2280h hVar = this.f8022c.f11639p;
        if (hVar != null) {
            hVar.mo19775b(this);
        }
        if (hVar != null) {
            remoteViews = hVar.mo19818e(this);
        } else {
            remoteViews = null;
        }
        Notification d2 = mo11465d();
        if (remoteViews != null) {
            d2.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f8022c.f11610H;
            if (remoteViews2 != null) {
                d2.contentView = remoteViews2;
            }
        }
        if (!(hVar == null || (d = hVar.mo19817d(this)) == null)) {
            d2.bigContentView = d;
        }
        if (!(hVar == null || (f = this.f8022c.f11639p.mo19819f(this)) == null)) {
            d2.headsUpContentView = f;
        }
        if (!(hVar == null || (a = f94.m16673a(d2)) == null)) {
            hVar.mo19780a(a);
        }
        return d2;
    }

    /* renamed from: d */
    public Notification mo11465d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f8021b.build();
        }
        if (i >= 24) {
            Notification build = this.f8021b.build();
            if (this.f8027h != 0) {
                if (!(build.getGroup() == null || (build.flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0 || this.f8027h != 2)) {
                    mo11467h(build);
                }
                if (build.getGroup() != null && (build.flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0 && this.f8027h == 1) {
                    mo11467h(build);
                }
            }
            return build;
        }
        this.f8021b.setExtras(this.f8026g);
        Notification build2 = this.f8021b.build();
        RemoteViews remoteViews = this.f8023d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f8024e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f8028i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f8027h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0 || this.f8027h != 2)) {
                mo11467h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0 && this.f8027h == 1) {
                mo11467h(build2);
            }
        }
        return build2;
    }

    /* renamed from: f */
    public Context mo11466f() {
        return this.f8020a;
    }

    /* renamed from: h */
    public final void mo11467h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }
}
