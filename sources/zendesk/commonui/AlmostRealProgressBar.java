package zendesk.commonui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlmostRealProgressBar extends ProgressBar {

    /* renamed from: s */
    public static final List<Step> f46770s = Arrays.asList(new Step[]{new Step(60, 4000), new Step(90, yt6.DEFAULT_POLLING_FREQUENCY)});

    /* renamed from: a */
    public C9845c f46771a;

    /* renamed from: d */
    public C9845c f46772d;

    /* renamed from: e */
    public List<Step> f46773e;

    /* renamed from: g */
    public Handler f46774g = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public Runnable f46775k;

    /* renamed from: r */
    public Runnable f46776r;

    public static class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new C9841a();

        /* renamed from: a */
        public final int f46777a;

        /* renamed from: d */
        public final List<Step> f46778d;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$State$a */
        public class C9841a implements Parcelable.Creator<State> {
            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel, (C9843a) null);
            }

            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public /* synthetic */ State(Parcel parcel, C9843a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f46777a);
            parcel.writeTypedList(this.f46778d);
        }

        public State(Parcelable parcelable, int i, List<Step> list) {
            super(parcelable);
            this.f46777a = i;
            this.f46778d = list;
        }

        public State(Parcel parcel) {
            super(parcel);
            this.f46777a = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            this.f46778d = arrayList;
            parcel.readTypedList(arrayList, Step.CREATOR);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$a */
    public class C9843a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f46781a;

        public C9843a(List list) {
            this.f46781a = list;
        }

        public void run() {
            Runnable unused = AlmostRealProgressBar.this.f46776r = null;
            List c = kj0.m47112c(this.f46781a);
            Collections.sort(c);
            List unused2 = AlmostRealProgressBar.this.f46773e = c;
            AlmostRealProgressBar almostRealProgressBar = AlmostRealProgressBar.this;
            almostRealProgressBar.mo73818j(almostRealProgressBar.f46773e, 0);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$b */
    public class C9844b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ long f46783a;

        public C9844b(long j) {
            this.f46783a = j;
        }

        public void run() {
            Runnable unused = AlmostRealProgressBar.this.f46775k = null;
            AlmostRealProgressBar.this.mo73817i(this.f46783a);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$c */
    public static class C9845c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final Animator f46785a;

        /* renamed from: d */
        public boolean f46786d = false;

        /* renamed from: e */
        public boolean f46787e = false;

        public C9845c(Animator animator) {
            this.f46785a = animator;
            animator.addListener(this);
        }

        /* renamed from: a */
        public Animator mo73842a() {
            return this.f46785a;
        }

        /* renamed from: b */
        public boolean mo73843b() {
            return this.f46787e;
        }

        /* renamed from: c */
        public boolean mo73844c() {
            return this.f46786d;
        }

        public void onAnimationCancel(Animator animator) {
            this.f46786d = false;
            this.f46787e = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.f46786d = false;
            this.f46787e = true;
        }

        public void onAnimationRepeat(Animator animator) {
            this.f46786d = true;
            this.f46787e = false;
        }

        public void onAnimationStart(Animator animator) {
            this.f46786d = true;
            this.f46787e = false;
        }
    }

    public AlmostRealProgressBar(Context context) {
        super(context);
    }

    /* renamed from: g */
    public final Step mo73815g(int i, int i2, Step step) {
        float f = (float) (i - i2);
        return new Step(step.f46779a, (long) (((float) step.f46780d) * (1.0f - (f / ((float) (step.f46779a - i2))))));
    }

    /* renamed from: h */
    public final C9845c mo73816h(long j) {
        Animator k = mo73819k(getProgress(), 100, j);
        Animator l = mo73820l(1.0f, Utils.FLOAT_EPSILON, 100);
        Animator k2 = mo73819k(100, 0, 0);
        Animator l2 = mo73820l(Utils.FLOAT_EPSILON, 1.0f, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(k).before(l);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(k2).before(l2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(j);
        animatorSet3.play(animatorSet).before(animatorSet2);
        return new C9845c(animatorSet3);
    }

    /* renamed from: i */
    public final void mo73817i(long j) {
        C9845c cVar = this.f46771a;
        if (cVar != null) {
            cVar.mo73842a().cancel();
            this.f46771a = null;
            C9845c h = mo73816h(j);
            this.f46772d = h;
            h.mo73842a().start();
        }
    }

    /* renamed from: j */
    public final void mo73818j(List<Step> list, int i) {
        if (this.f46771a == null) {
            long j = 0;
            C9845c cVar = this.f46772d;
            if (cVar != null && cVar.mo73844c() && !this.f46772d.mo73843b()) {
                j = this.f46772d.mo73842a().getDuration();
            }
            this.f46772d = null;
            C9845c o = mo73823o(list, i, j);
            this.f46771a = o;
            o.mo73842a().start();
        }
    }

    /* renamed from: k */
    public final Animator mo73819k(int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }

    /* renamed from: l */
    public final Animator mo73820l(float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{f, f2});
        ofFloat.setDuration(j);
        return ofFloat;
    }

    /* renamed from: m */
    public final void mo73821m(State state) {
        if (state.f46777a > 0) {
            ArrayList arrayList = new ArrayList(state.f46778d);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Step step : state.f46778d) {
                if (state.f46777a < step.f46779a) {
                    arrayList2.add(step);
                } else {
                    i = step.f46779a;
                }
            }
            if (kj0.m47118i(arrayList2)) {
                arrayList2.add(0, mo73815g(state.f46777a, i, (Step) arrayList2.remove(0)));
            }
            mo73818j(arrayList2, state.f46777a);
            this.f46773e = arrayList;
            return;
        }
        setProgress(0);
    }

    /* renamed from: n */
    public void mo73822n(List<Step> list) {
        Runnable runnable = this.f46775k;
        if (runnable != null) {
            this.f46774g.removeCallbacks(runnable);
            this.f46775k = null;
        } else if (this.f46776r == null) {
            C9843a aVar = new C9843a(list);
            this.f46776r = aVar;
            this.f46774g.postDelayed(aVar, 100);
        }
    }

    /* renamed from: o */
    public final C9845c mo73823o(List<Step> list, int i, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step next : list) {
            Animator k = mo73819k(i, next.f46779a, next.f46780d);
            int a = next.f46779a;
            arrayList.add(k);
            i = a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j);
        return new C9845c(animatorSet);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            mo73821m(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.f46771a != null && this.f46775k == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.f46773e);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    /* renamed from: p */
    public void mo73826p(long j) {
        Runnable runnable = this.f46776r;
        if (runnable != null) {
            this.f46774g.removeCallbacks(runnable);
            this.f46776r = null;
        } else if (this.f46775k == null) {
            C9844b bVar = new C9844b(j);
            this.f46775k = bVar;
            this.f46774g.postDelayed(bVar, 200);
        }
    }

    public static class Step implements Parcelable, Comparable<Step> {
        public static final Parcelable.Creator<Step> CREATOR = new C9842a();

        /* renamed from: a */
        public final int f46779a;

        /* renamed from: d */
        public final long f46780d;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$Step$a */
        public class C9842a implements Parcelable.Creator<Step> {
            /* renamed from: a */
            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            /* renamed from: b */
            public Step[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(int i, long j) {
            this.f46779a = i;
            this.f46780d = j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int compareTo(Step step) {
            return this.f46779a - step.f46779a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f46779a);
            parcel.writeLong(this.f46780d);
        }

        public Step(Parcel parcel) {
            this.f46779a = parcel.readInt();
            this.f46780d = parcel.readLong();
        }
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
