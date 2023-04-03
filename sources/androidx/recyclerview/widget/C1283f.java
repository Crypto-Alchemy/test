package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: DefaultItemAnimator */
public class C1283f extends C1342u {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    public ArrayList<RecyclerView.C1231a0> mAddAnimations = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.C1231a0>> mAdditionsList = new ArrayList<>();
    public ArrayList<RecyclerView.C1231a0> mChangeAnimations = new ArrayList<>();
    public ArrayList<ArrayList<C1292i>> mChangesList = new ArrayList<>();
    public ArrayList<RecyclerView.C1231a0> mMoveAnimations = new ArrayList<>();
    public ArrayList<ArrayList<C1293j>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.C1231a0> mPendingAdditions = new ArrayList<>();
    private ArrayList<C1292i> mPendingChanges = new ArrayList<>();
    private ArrayList<C1293j> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.C1231a0> mPendingRemovals = new ArrayList<>();
    public ArrayList<RecyclerView.C1231a0> mRemoveAnimations = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* compiled from: DefaultItemAnimator */
    public class C1284a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f6635a;

        public C1284a(ArrayList arrayList) {
            this.f6635a = arrayList;
        }

        public void run() {
            Iterator it = this.f6635a.iterator();
            while (it.hasNext()) {
                C1293j jVar = (C1293j) it.next();
                C1283f.this.animateMoveImpl(jVar.f6669a, jVar.f6670b, jVar.f6671c, jVar.f6672d, jVar.f6673e);
            }
            this.f6635a.clear();
            C1283f.this.mMovesList.remove(this.f6635a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    /* compiled from: DefaultItemAnimator */
    public class C1285b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f6637a;

        public C1285b(ArrayList arrayList) {
            this.f6637a = arrayList;
        }

        public void run() {
            Iterator it = this.f6637a.iterator();
            while (it.hasNext()) {
                C1283f.this.animateChangeImpl((C1292i) it.next());
            }
            this.f6637a.clear();
            C1283f.this.mChangesList.remove(this.f6637a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    /* compiled from: DefaultItemAnimator */
    public class C1286c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f6639a;

        public C1286c(ArrayList arrayList) {
            this.f6639a = arrayList;
        }

        public void run() {
            Iterator it = this.f6639a.iterator();
            while (it.hasNext()) {
                C1283f.this.animateAddImpl((RecyclerView.C1231a0) it.next());
            }
            this.f6639a.clear();
            C1283f.this.mAdditionsList.remove(this.f6639a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    /* compiled from: DefaultItemAnimator */
    public class C1287d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C1231a0 f6641a;

        /* renamed from: d */
        public final /* synthetic */ ViewPropertyAnimator f6642d;

        /* renamed from: e */
        public final /* synthetic */ View f6643e;

        public C1287d(RecyclerView.C1231a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6641a = a0Var;
            this.f6642d = viewPropertyAnimator;
            this.f6643e = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6642d.setListener((Animator.AnimatorListener) null);
            this.f6643e.setAlpha(1.0f);
            C1283f.this.dispatchRemoveFinished(this.f6641a);
            C1283f.this.mRemoveAnimations.remove(this.f6641a);
            C1283f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1283f.this.dispatchRemoveStarting(this.f6641a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    /* compiled from: DefaultItemAnimator */
    public class C1288e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C1231a0 f6645a;

        /* renamed from: d */
        public final /* synthetic */ View f6646d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f6647e;

        public C1288e(RecyclerView.C1231a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6645a = a0Var;
            this.f6646d = view;
            this.f6647e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6646d.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f6647e.setListener((Animator.AnimatorListener) null);
            C1283f.this.dispatchAddFinished(this.f6645a);
            C1283f.this.mAddAnimations.remove(this.f6645a);
            C1283f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1283f.this.dispatchAddStarting(this.f6645a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    /* compiled from: DefaultItemAnimator */
    public class C1289f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C1231a0 f6649a;

        /* renamed from: d */
        public final /* synthetic */ int f6650d;

        /* renamed from: e */
        public final /* synthetic */ View f6651e;

        /* renamed from: g */
        public final /* synthetic */ int f6652g;

        /* renamed from: k */
        public final /* synthetic */ ViewPropertyAnimator f6653k;

        public C1289f(RecyclerView.C1231a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6649a = a0Var;
            this.f6650d = i;
            this.f6651e = view;
            this.f6652g = i2;
            this.f6653k = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f6650d != 0) {
                this.f6651e.setTranslationX(Utils.FLOAT_EPSILON);
            }
            if (this.f6652g != 0) {
                this.f6651e.setTranslationY(Utils.FLOAT_EPSILON);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f6653k.setListener((Animator.AnimatorListener) null);
            C1283f.this.dispatchMoveFinished(this.f6649a);
            C1283f.this.mMoveAnimations.remove(this.f6649a);
            C1283f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1283f.this.dispatchMoveStarting(this.f6649a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$g */
    /* compiled from: DefaultItemAnimator */
    public class C1290g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1292i f6655a;

        /* renamed from: d */
        public final /* synthetic */ ViewPropertyAnimator f6656d;

        /* renamed from: e */
        public final /* synthetic */ View f6657e;

        public C1290g(C1292i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6655a = iVar;
            this.f6656d = viewPropertyAnimator;
            this.f6657e = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6656d.setListener((Animator.AnimatorListener) null);
            this.f6657e.setAlpha(1.0f);
            this.f6657e.setTranslationX(Utils.FLOAT_EPSILON);
            this.f6657e.setTranslationY(Utils.FLOAT_EPSILON);
            C1283f.this.dispatchChangeFinished(this.f6655a.f6663a, true);
            C1283f.this.mChangeAnimations.remove(this.f6655a.f6663a);
            C1283f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1283f.this.dispatchChangeStarting(this.f6655a.f6663a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$h */
    /* compiled from: DefaultItemAnimator */
    public class C1291h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1292i f6659a;

        /* renamed from: d */
        public final /* synthetic */ ViewPropertyAnimator f6660d;

        /* renamed from: e */
        public final /* synthetic */ View f6661e;

        public C1291h(C1292i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6659a = iVar;
            this.f6660d = viewPropertyAnimator;
            this.f6661e = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6660d.setListener((Animator.AnimatorListener) null);
            this.f6661e.setAlpha(1.0f);
            this.f6661e.setTranslationX(Utils.FLOAT_EPSILON);
            this.f6661e.setTranslationY(Utils.FLOAT_EPSILON);
            C1283f.this.dispatchChangeFinished(this.f6659a.f6664b, false);
            C1283f.this.mChangeAnimations.remove(this.f6659a.f6664b);
            C1283f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1283f.this.dispatchChangeStarting(this.f6659a.f6664b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$j */
    /* compiled from: DefaultItemAnimator */
    public static class C1293j {

        /* renamed from: a */
        public RecyclerView.C1231a0 f6669a;

        /* renamed from: b */
        public int f6670b;

        /* renamed from: c */
        public int f6671c;

        /* renamed from: d */
        public int f6672d;

        /* renamed from: e */
        public int f6673e;

        public C1293j(RecyclerView.C1231a0 a0Var, int i, int i2, int i3, int i4) {
            this.f6669a = a0Var;
            this.f6670b = i;
            this.f6671c = i2;
            this.f6672d = i3;
            this.f6673e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.C1231a0 a0Var) {
        View view = a0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(a0Var);
        animate.setDuration(getRemoveDuration()).alpha(Utils.FLOAT_EPSILON).setListener(new C1287d(a0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<C1292i> list, RecyclerView.C1231a0 a0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1292i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, a0Var) && iVar.f6663a == null && iVar.f6664b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(C1292i iVar) {
        RecyclerView.C1231a0 a0Var = iVar.f6663a;
        if (a0Var != null) {
            endChangeAnimationIfNecessary(iVar, a0Var);
        }
        RecyclerView.C1231a0 a0Var2 = iVar.f6664b;
        if (a0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, a0Var2);
        }
    }

    private void resetAnimation(RecyclerView.C1231a0 a0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        a0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(a0Var);
    }

    public boolean animateAdd(RecyclerView.C1231a0 a0Var) {
        resetAnimation(a0Var);
        a0Var.itemView.setAlpha(Utils.FLOAT_EPSILON);
        this.mPendingAdditions.add(a0Var);
        return true;
    }

    public void animateAddImpl(RecyclerView.C1231a0 a0Var) {
        View view = a0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(a0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C1288e(a0Var, view, animate)).start();
    }

    public boolean animateChange(RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2, int i, int i2, int i3, int i4) {
        if (a0Var == a0Var2) {
            return animateMove(a0Var, i, i2, i3, i4);
        }
        float translationX = a0Var.itemView.getTranslationX();
        float translationY = a0Var.itemView.getTranslationY();
        float alpha = a0Var.itemView.getAlpha();
        resetAnimation(a0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        a0Var.itemView.setTranslationX(translationX);
        a0Var.itemView.setTranslationY(translationY);
        a0Var.itemView.setAlpha(alpha);
        if (a0Var2 != null) {
            resetAnimation(a0Var2);
            a0Var2.itemView.setTranslationX((float) (-i5));
            a0Var2.itemView.setTranslationY((float) (-i6));
            a0Var2.itemView.setAlpha(Utils.FLOAT_EPSILON);
        }
        this.mPendingChanges.add(new C1292i(a0Var, a0Var2, i, i2, i3, i4));
        return true;
    }

    public void animateChangeImpl(C1292i iVar) {
        View view;
        RecyclerView.C1231a0 a0Var = iVar.f6663a;
        View view2 = null;
        if (a0Var == null) {
            view = null;
        } else {
            view = a0Var.itemView;
        }
        RecyclerView.C1231a0 a0Var2 = iVar.f6664b;
        if (a0Var2 != null) {
            view2 = a0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f6663a);
            duration.translationX((float) (iVar.f6667e - iVar.f6665c));
            duration.translationY((float) (iVar.f6668f - iVar.f6666d));
            duration.alpha(Utils.FLOAT_EPSILON).setListener(new C1290g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f6664b);
            animate.translationX(Utils.FLOAT_EPSILON).translationY(Utils.FLOAT_EPSILON).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C1291h(iVar, animate, view2)).start();
        }
    }

    public boolean animateMove(RecyclerView.C1231a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) a0Var.itemView.getTranslationY());
        resetAnimation(a0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(a0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.mPendingMoves.add(new C1293j(a0Var, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(RecyclerView.C1231a0 a0Var, int i, int i2, int i3, int i4) {
        View view = a0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(Utils.FLOAT_EPSILON);
        }
        if (i6 != 0) {
            view.animate().translationY(Utils.FLOAT_EPSILON);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(a0Var);
        animate.setDuration(getMoveDuration()).setListener(new C1289f(a0Var, i5, view, i6, animate)).start();
    }

    public boolean animateRemove(RecyclerView.C1231a0 a0Var) {
        resetAnimation(a0Var);
        this.mPendingRemovals.add(a0Var);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.C1231a0 a0Var, List<Object> list) {
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(a0Var, list)) {
            return true;
        }
        return false;
    }

    public void cancelAll(List<RecyclerView.C1231a0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(RecyclerView.C1231a0 a0Var) {
        View view = a0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f6669a == a0Var) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
                view.setTranslationX(Utils.FLOAT_EPSILON);
                dispatchMoveFinished(a0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, a0Var);
        if (this.mPendingRemovals.remove(a0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(a0Var);
        }
        if (this.mPendingAdditions.remove(a0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(a0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1293j) arrayList2.get(size4)).f6669a == a0Var) {
                    view.setTranslationY(Utils.FLOAT_EPSILON);
                    view.setTranslationX(Utils.FLOAT_EPSILON);
                    dispatchMoveFinished(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(a0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(a0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(a0Var);
        this.mAddAnimations.remove(a0Var);
        this.mChangeAnimations.remove(a0Var);
        this.mMoveAnimations.remove(a0Var);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1293j jVar = this.mPendingMoves.get(size);
            View view = jVar.f6669a.itemView;
            view.setTranslationY(Utils.FLOAT_EPSILON);
            view.setTranslationX(Utils.FLOAT_EPSILON);
            dispatchMoveFinished(jVar.f6669a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1231a0 a0Var = this.mPendingAdditions.get(size3);
            a0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(a0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1293j jVar2 = (C1293j) arrayList.get(size6);
                    View view2 = jVar2.f6669a.itemView;
                    view2.setTranslationY(Utils.FLOAT_EPSILON);
                    view2.setTranslationX(Utils.FLOAT_EPSILON);
                    dispatchMoveFinished(jVar2.f6669a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1231a0 a0Var2 = (RecyclerView.C1231a0) arrayList2.get(size8);
                    a0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(a0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((C1292i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        if (!this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1231a0> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                C1284a aVar = new C1284a(arrayList);
                if (z) {
                    ga7.m17771i0(((C1293j) arrayList.get(0)).f6669a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                C1285b bVar = new C1285b(arrayList2);
                if (z) {
                    ga7.m17771i0(((C1292i) arrayList2.get(0)).f6663a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                C1286c cVar = new C1286c(arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = getRemoveDuration();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = getMoveDuration();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = getChangeDuration();
                    }
                    ga7.m17771i0(((RecyclerView.C1231a0) arrayList3.get(0)).itemView, cVar, j + Math.max(j2, j3));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$i */
    /* compiled from: DefaultItemAnimator */
    public static class C1292i {

        /* renamed from: a */
        public RecyclerView.C1231a0 f6663a;

        /* renamed from: b */
        public RecyclerView.C1231a0 f6664b;

        /* renamed from: c */
        public int f6665c;

        /* renamed from: d */
        public int f6666d;

        /* renamed from: e */
        public int f6667e;

        /* renamed from: f */
        public int f6668f;

        public C1292i(RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2) {
            this.f6663a = a0Var;
            this.f6664b = a0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6663a + ", newHolder=" + this.f6664b + ", fromX=" + this.f6665c + ", fromY=" + this.f6666d + ", toX=" + this.f6667e + ", toY=" + this.f6668f + '}';
        }

        public C1292i(RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2, int i, int i2, int i3, int i4) {
            this(a0Var, a0Var2);
            this.f6665c = i;
            this.f6666d = i2;
            this.f6667e = i3;
            this.f6668f = i4;
        }
    }

    private boolean endChangeAnimationIfNecessary(C1292i iVar, RecyclerView.C1231a0 a0Var) {
        boolean z = false;
        if (iVar.f6664b == a0Var) {
            iVar.f6664b = null;
        } else if (iVar.f6663a != a0Var) {
            return false;
        } else {
            iVar.f6663a = null;
            z = true;
        }
        a0Var.itemView.setAlpha(1.0f);
        a0Var.itemView.setTranslationX(Utils.FLOAT_EPSILON);
        a0Var.itemView.setTranslationY(Utils.FLOAT_EPSILON);
        dispatchChangeFinished(a0Var, z);
        return true;
    }
}
