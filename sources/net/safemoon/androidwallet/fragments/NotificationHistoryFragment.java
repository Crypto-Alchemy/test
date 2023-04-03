package net.safemoon.androidwallet.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryResult;

public class NotificationHistoryFragment extends BaseMainFragment {

    /* renamed from: y */
    public static boolean f41998y = false;

    /* renamed from: k */
    public List<String> f41999k = new ArrayList();

    /* renamed from: r */
    public ha2 f42000r;

    /* renamed from: s */
    public ra4 f42001s;

    /* renamed from: x */
    public ob4 f42002x;

    /* renamed from: net.safemoon.androidwallet.fragments.NotificationHistoryFragment$a */
    public class C8409a implements View.OnClickListener {
        public C8409a() {
        }

        public void onClick(View view) {
            NotificationHistoryFragment.this.mo57569v0();
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.NotificationHistoryFragment$b */
    public class C8410b implements View.OnClickListener {
        public C8410b() {
        }

        public void onClick(View view) {
            C9001np.m69933R(new WeakReference(NotificationHistoryFragment.this.getContext()), Integer.valueOf(R.string.confirm), (String) null, Integer.valueOf(R.string.mark_as_read_confirm), (String) null, Integer.valueOf(R.string.mark), Integer.valueOf(R.string.cancel), (Integer) null, (Integer) null, new eb4(NotificationHistoryFragment.this), new fb4(NotificationHistoryFragment.this));
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.NotificationHistoryFragment$c */
    public class C8411c implements View.OnClickListener {
        public C8411c() {
        }

        public void onClick(View view) {
            C9001np.m69933R(new WeakReference(NotificationHistoryFragment.this.getContext()), Integer.valueOf(R.string.confirm), (String) null, Integer.valueOf(R.string.mark_all_confirm), (String) null, Integer.valueOf(R.string.ok), Integer.valueOf(R.string.cancel), (Integer) null, (Integer) null, new gb4(NotificationHistoryFragment.this), new hb4(NotificationHistoryFragment.this));
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.NotificationHistoryFragment$d */
    public class C8412d implements View.OnClickListener {
        public C8412d() {
        }

        public void onClick(View view) {
            C9001np.m69933R(new WeakReference(NotificationHistoryFragment.this.getContext()), Integer.valueOf(R.string.confirm), (String) null, Integer.valueOf(R.string.delete_all_confirm), (String) null, Integer.valueOf(R.string.ok), Integer.valueOf(R.string.cancel), (Integer) null, (Integer) null, new ib4(NotificationHistoryFragment.this), new jb4(NotificationHistoryFragment.this));
        }
    }

    /* renamed from: net.safemoon.androidwallet.fragments.NotificationHistoryFragment$e */
    public class C8413e implements View.OnClickListener {
        public C8413e() {
        }

        public void onClick(View view) {
            StringBuilder sb = new StringBuilder();
            sb.append("delete: ");
            sb.append(NotificationHistoryFragment.this.f41999k.toString());
            C9001np.m69933R(new WeakReference(NotificationHistoryFragment.this.getContext()), Integer.valueOf(R.string.confirm), (String) null, Integer.valueOf(R.string.delete_any_confirm), (String) null, Integer.valueOf(R.string.ok), Integer.valueOf(R.string.cancel), (Integer) null, (Integer) null, new kb4(NotificationHistoryFragment.this), new lb4(NotificationHistoryFragment.this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m66713d0(NotificationHistoryResult notificationHistoryResult) {
        if (!notificationHistoryResult.read) {
            this.f42002x.mo62872l(notificationHistoryResult.f42459id);
        }
        mo50753j(C8565d.m67999a(notificationHistoryResult.data.transactionHash, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m66715f0(View view) {
        mo50752i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m66716g0(NotificationHistory notificationHistory) {
        if (notificationHistory == null || notificationHistory.getData() == null || notificationHistory.getData().getResult() == null || notificationHistory.getData().getResult().size() <= 0) {
            this.f42000r.f29502k.setVisibility(0);
        } else {
            this.f42001s.mo65619h(this.f42002x.mo62869i());
            this.f42000r.f29502k.setVisibility(8);
            this.f42000r.f29501j.f21126d.setVisibility(0);
        }
        this.f42000r.f29499h.setRefreshing(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m66717h0(String str) {
        if (str != null) {
            this.f42000r.f29499h.setRefreshing(false);
        }
    }

    /* renamed from: N */
    public final void mo57540N() {
        this.f42000r.f29501j.f21126d.setText(R.string.edit);
        this.f42000r.f29500i.setVisibility(8);
        this.f41999k.clear();
    }

    /* renamed from: O */
    public final r37 mo57541O(DialogInterface dialogInterface) {
        return r37.f33317a;
    }

    /* renamed from: P */
    public final r37 mo57542P(DialogInterface dialogInterface) {
        mo57549W();
        return r37.f33317a;
    }

    /* renamed from: Q */
    public final r37 mo57543Q(DialogInterface dialogInterface) {
        return r37.f33317a;
    }

    /* renamed from: R */
    public final r37 mo57544R(DialogInterface dialogInterface) {
        mo57550X();
        return r37.f33317a;
    }

    /* renamed from: S */
    public final r37 mo57545S(DialogInterface dialogInterface) {
        return r37.f33317a;
    }

    /* renamed from: T */
    public final r37 mo57546T(DialogInterface dialogInterface) {
        mo57556i0();
        return r37.f33317a;
    }

    /* renamed from: U */
    public final r37 mo57547U(DialogInterface dialogInterface) {
        return r37.f33317a;
    }

    /* renamed from: V */
    public final r37 mo57548V(DialogInterface dialogInterface) {
        mo57557j0();
        StringBuilder sb = new StringBuilder();
        sb.append("markAsRead: ");
        sb.append(this.f41999k.toString());
        return r37.f33317a;
    }

    /* renamed from: W */
    public final void mo57549W() {
        this.f42002x.mo62864d(new ab4(this), new bb4(this));
    }

    /* renamed from: X */
    public final void mo57550X() {
        this.f42002x.mo62865e(this.f41999k, new cb4(this), new db4(this));
    }

    /* renamed from: Y */
    public final void mo57551Y() {
        this.f42000r.f29501j.f21126d.setText(R.string.cancel);
        this.f42000r.f29497f.setVisibility(8);
        this.f42000r.f29496e.setVisibility(0);
        this.f42000r.f29494c.setVisibility(8);
        this.f42000r.f29495d.setVisibility(0);
        this.f42000r.f29500i.setVisibility(0);
    }

    /* renamed from: Z */
    public final void mo57552Z() {
        this.f42000r.f29499h.setRefreshing(true);
        this.f42002x.mo62868h();
    }

    /* renamed from: a0 */
    public final void mo57553a0() {
        this.f42000r.f29501j.f21126d.setVisibility(8);
        this.f42000r.f29500i.setVisibility(8);
    }

    /* renamed from: b0 */
    public final void mo57554b0() {
        ra4 ra4 = new ra4(new ArrayList(), new wa4(this), new xa4(this));
        this.f42001s = ra4;
        this.f42000r.f29498g.setAdapter(ra4);
    }

    /* renamed from: c0 */
    public final void mo57555c0() {
        this.f42000r.f29499h.setOnRefreshListener(new ya4(this));
        this.f42000r.f29501j.f21125c.setOnClickListener(new za4(this));
        this.f42000r.f29501j.f21127e.setText(getText(R.string.notification_history_screen_title));
        this.f42000r.f29501j.f21126d.setVisibility(8);
        this.f42000r.f29501j.f21126d.setOnClickListener(new C8409a());
    }

    /* renamed from: i0 */
    public final void mo57556i0() {
        this.f42002x.mo62870j(new ta4(this), new ua4(this));
    }

    /* renamed from: j0 */
    public final void mo57557j0() {
        if (this.f41999k.size() > 0) {
            this.f42002x.mo62871k(this.f41999k, new ta4(this), new ua4(this));
        }
    }

    /* renamed from: k0 */
    public final void mo57558k0() {
        this.f42002x.mo62867g().observe(getViewLifecycleOwner(), new sa4(this));
        this.f42002x.mo62866f().observe(getViewLifecycleOwner(), new va4(this));
    }

    /* renamed from: l0 */
    public final r37 mo57559l0() {
        return r37.f33317a;
    }

    /* renamed from: m0 */
    public final r37 mo57560m0() {
        this.f41999k.clear();
        mo57566s0();
        mo57552Z();
        this.f42000r.f29498g.setVisibility(8);
        this.f42000r.f29502k.setVisibility(0);
        mo57553a0();
        return r37.f33317a;
    }

    /* renamed from: n0 */
    public final r37 mo57561n0() {
        return r37.f33317a;
    }

    /* renamed from: o0 */
    public final r37 mo57562o0() {
        this.f41999k.clear();
        mo57566s0();
        mo57552Z();
        return r37.f33317a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ha2 a = ha2.m45079a(layoutInflater.inflate(R.layout.fragment_notification_history, viewGroup, false));
        this.f42000r = a;
        return a.mo43113b();
    }

    public void onResume() {
        super.onResume();
        f41998y = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f42002x = (ob4) new C0729l(requireActivity()).mo6421a(ob4.class);
        mo57555c0();
        mo57554b0();
        mo57558k0();
        mo57552Z();
    }

    /* renamed from: p0 */
    public final r37 mo57563p0() {
        return r37.f33317a;
    }

    /* renamed from: q0 */
    public final r37 mo57564q0() {
        this.f41999k.clear();
        mo57567t0();
        mo57552Z();
        return r37.f33317a;
    }

    /* renamed from: r0 */
    public final void m66714e0(List<String> list) {
        this.f41999k = list;
        StringBuilder sb = new StringBuilder();
        sb.append("selectedNotificationIds: ");
        sb.append(list.toString());
        mo57566s0();
    }

    /* renamed from: s0 */
    public final void mo57566s0() {
        if (this.f41999k.size() > 0) {
            this.f42000r.f29497f.setVisibility(0);
            this.f42000r.f29496e.setVisibility(8);
            this.f42000r.f29494c.setVisibility(0);
            this.f42000r.f29495d.setVisibility(8);
            return;
        }
        this.f42000r.f29497f.setVisibility(8);
        this.f42000r.f29496e.setVisibility(0);
        this.f42000r.f29494c.setVisibility(8);
        this.f42000r.f29495d.setVisibility(0);
    }

    /* renamed from: t0 */
    public final void mo57567t0() {
        mo57568u0();
    }

    /* renamed from: u0 */
    public final void mo57568u0() {
        boolean z = !f41998y;
        f41998y = z;
        if (z) {
            mo57551Y();
        } else {
            mo57540N();
        }
        this.f42001s.mo65620i(f41998y);
    }

    /* renamed from: v0 */
    public final void mo57569v0() {
        mo57568u0();
        this.f42000r.f29497f.setOnClickListener(new C8410b());
        this.f42000r.f29496e.setOnClickListener(new C8411c());
        this.f42000r.f29495d.setOnClickListener(new C8412d());
        this.f42000r.f29494c.setOnClickListener(new C8413e());
    }
}
