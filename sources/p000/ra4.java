package p000;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.NotificationHistoryFragment;
import net.safemoon.androidwallet.model.common.HeaderItemHistory;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistoryResult;
import net.safemoon.androidwallet.model.notificationHistory.ResultItemHistory;

/* renamed from: ra4 */
/* compiled from: NotificationHistoryAdapter */
public class ra4 extends RecyclerView.Adapter<RecyclerView.C1231a0> {

    /* renamed from: a */
    public List<String> f44316a = new ArrayList();

    /* renamed from: d */
    public boolean f44317d = false;

    /* renamed from: e */
    public C9236b f44318e;

    /* renamed from: g */
    public final List<HistoryListItem> f44319g;

    /* renamed from: k */
    public final C9241f f44320k;

    /* renamed from: r */
    public nm2 f44321r;

    /* renamed from: s */
    public nb4 f44322s;

    /* renamed from: x */
    public DateFormat f44323x;

    /* renamed from: ra4$a */
    /* compiled from: NotificationHistoryAdapter */
    public class C9235a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ NotificationHistoryResult f44324a;

        public C9235a(NotificationHistoryResult notificationHistoryResult) {
            this.f44324a = notificationHistoryResult;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                ra4.this.f44316a.add(this.f44324a.f42459id);
            } else {
                ra4.this.f44316a.remove(this.f44324a.f42459id);
            }
            if (ra4.this.f44318e != null) {
                ra4.this.f44318e.mo65622a(ra4.this.f44316a);
            }
        }
    }

    /* renamed from: ra4$b */
    /* compiled from: NotificationHistoryAdapter */
    public interface C9236b {
        /* renamed from: a */
        void mo65622a(List<String> list);
    }

    /* renamed from: ra4$c */
    /* compiled from: NotificationHistoryAdapter */
    public class C9237c extends RecyclerView.C1231a0 {
        public C9237c(View view) {
            super(view);
        }
    }

    /* renamed from: ra4$d */
    /* compiled from: NotificationHistoryAdapter */
    public static class C9238d extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final nm2 f44327a;

        public C9238d(View view, nm2 nm2) {
            super(view);
            this.f44327a = nm2;
        }

        /* renamed from: a */
        public void mo65623a(HistoryListItem historyListItem) {
            this.f44327a.f32148b.setText(((HeaderItemHistory) historyListItem).getTitle());
        }
    }

    /* renamed from: ra4$e */
    /* compiled from: NotificationHistoryAdapter */
    public class C9239e extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public nb4 f44328a;

        /* renamed from: ra4$e$a */
        /* compiled from: NotificationHistoryAdapter */
        public class C9240a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ NotificationHistoryResult f44330a;

            public C9240a(NotificationHistoryResult notificationHistoryResult) {
                this.f44330a = notificationHistoryResult;
            }

            public void onClick(View view) {
                if (NotificationHistoryFragment.f41998y) {
                    C9239e.this.f44328a.f32080b.setChecked(!C9239e.this.f44328a.f32080b.isChecked());
                } else {
                    ra4.this.f44320k.mo65626a(this.f44330a);
                }
            }
        }

        public C9239e(View view, nb4 nb4) {
            super(view);
            this.f44328a = nb4;
        }

        /* renamed from: b */
        public void mo65624b(HistoryListItem historyListItem) {
            int i;
            NotificationHistoryResult result = ((ResultItemHistory) historyListItem).getResult();
            if (result != null) {
                ConstraintLayout constraintLayout = this.f44328a.f32081c;
                if (result.read) {
                    i = R.drawable.trans_button_bg;
                } else {
                    i = R.drawable.trans_button_bg_unread;
                }
                constraintLayout.setBackgroundResource(i);
                this.f44328a.f32084f.setText(result.body);
                this.f44328a.f32086h.setText(result.title);
                this.f44328a.f32085g.setText(ra4.this.mo65617f(result.createdAt));
                this.itemView.setOnClickListener(new C9240a(result));
                ra4.this.mo65618g(this.f44328a, result);
            }
        }
    }

    /* renamed from: ra4$f */
    /* compiled from: NotificationHistoryAdapter */
    public interface C9241f {
        /* renamed from: a */
        void mo65626a(NotificationHistoryResult notificationHistoryResult);
    }

    public ra4(List<HistoryListItem> list, C9241f fVar, C9236b bVar) {
        this.f44319g = list;
        this.f44320k = fVar;
        this.f44318e = bVar;
        this.f44323x = new SimpleDateFormat("hh.mm aa");
    }

    /* renamed from: f */
    public final String mo65617f(String str) {
        try {
            return this.f44323x.format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return "-";
        }
    }

    /* renamed from: g */
    public final void mo65618g(nb4 nb4, NotificationHistoryResult notificationHistoryResult) {
        if (this.f44317d) {
            nb4.f32080b.setVisibility(0);
        } else {
            nb4.f32080b.setVisibility(8);
        }
        nb4.f32080b.setChecked(false);
        nb4.f32080b.setOnCheckedChangeListener(new C9235a(notificationHistoryResult));
    }

    public int getItemCount() {
        return this.f44319g.size();
    }

    public int getItemViewType(int i) {
        return this.f44319g.get(i).getType();
    }

    /* renamed from: h */
    public void mo65619h(List<HistoryListItem> list) {
        this.f44319g.clear();
        this.f44319g.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: i */
    public void mo65620i(boolean z) {
        this.f44317d = z;
        notifyDataSetChanged();
    }

    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        HistoryListItem historyListItem = this.f44319g.get(i);
        int type = historyListItem.getType();
        if (type == 0) {
            ((C9238d) a0Var).mo65623a(historyListItem);
        } else if (type == 1) {
        } else {
            if (type == 2) {
                ((C9239e) a0Var).mo65624b(historyListItem);
                return;
            }
            throw new IllegalStateException("Unexpected value: " + historyListItem.getType());
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            this.f44321r = nm2.m48826a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_notification_history_item_header, viewGroup, false));
            return new C9238d(this.f44321r.mo46104b(), this.f44321r);
        } else if (i == 1) {
            return new C9237c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_notification_history_item_footer, viewGroup, false));
        } else {
            this.f44322s = nb4.m48718a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notification_history_item, viewGroup, false));
            return new C9239e(this.f44322s.mo46049b(), this.f44322s);
        }
    }
}
