package zendesk.support.request;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.request.CellType;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

class ComponentRequestAdapter implements Listener<List<CellType.Base>> {
    private static final long UPDATE_TIME_WINDOW = 200;
    private final di3 listUpdateCallback;
    private final RecyclerView recyclerView;
    private final RequestAdapterSelector requestAdapterSelector;
    /* access modifiers changed from: private */
    public final List<CellType.Base> requestMessageList;
    private Runnable updateRunnable = null;

    public static class DiffCalculator extends C1294g.C1296b {
        private final List<CellType.Base> newList;
        private final List<CellType.Base> oldList;

        public boolean areContentsTheSame(int i, int i2) {
            return this.oldList.get(i).areContentsTheSame(this.newList.get(i2));
        }

        public boolean areItemsTheSame(int i, int i2) {
            if (this.oldList.get(i).getUniqueId() == this.newList.get(i2).getUniqueId()) {
                return true;
            }
            return false;
        }

        public int getNewListSize() {
            return this.newList.size();
        }

        public int getOldListSize() {
            return this.oldList.size();
        }

        private DiffCalculator(List<CellType.Base> list, List<CellType.Base> list2) {
            this.oldList = list;
            this.newList = list2;
        }
    }

    public static class RequestAdapter extends RecyclerView.Adapter<RequestViewHolder> {
        private final ComponentRequestAdapter dataSource;
        private int lastPosition = -1;

        public RequestAdapter(ComponentRequestAdapter componentRequestAdapter) {
            setHasStableIds(true);
            this.dataSource = componentRequestAdapter;
        }

        public int getItemCount() {
            return this.dataSource.getMessageCount();
        }

        public long getItemId(int i) {
            return this.dataSource.getMessageForPos(i).getUniqueId();
        }

        public int getItemViewType(int i) {
            return this.dataSource.getMessageForPos(i).getLayoutId();
        }

        @SuppressLint({"RecyclerView"})
        public void onBindViewHolder(RequestViewHolder requestViewHolder, int i) {
            this.dataSource.getMessageForPos(i).bind(requestViewHolder);
            int i2 = this.lastPosition;
            if (i > i2 && i2 != -1) {
                this.lastPosition = i;
                requestViewHolder.startAnimation();
            }
            if (this.lastPosition == -1) {
                this.lastPosition = i;
            }
        }

        public RequestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RequestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }

        public void onViewDetachedFromWindow(RequestViewHolder requestViewHolder) {
            super.onViewDetachedFromWindow(requestViewHolder);
            requestViewHolder.clearAnimation();
        }
    }

    public static class RequestAdapterSelector implements StateSelector<List<CellType.Base>> {
        private final CellFactory messageFactory;

        public RequestAdapterSelector(CellFactory cellFactory) {
            this.messageFactory = cellFactory;
        }

        public List<CellType.Base> selectData(State state) {
            StateConversation fromState = StateConversation.fromState(state);
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return this.messageFactory.generateCells(fromState.getMessages(), fromState.getUsers(), fromState.getStatus(), settings.getSystemMessage());
        }
    }

    public static class RequestViewHolder extends RecyclerView.C1231a0 {
        private static final long ANIMATION_DURATION = 250;
        private static final float ANIMATION_HEIGHT_RATIO = 0.6666667f;
        private static final TimeInterpolator TIME_INTERPOLATOR = vm4.m28892a(0.2f, Utils.FLOAT_EPSILON, 0.4f, 1.0f);
        private ValueAnimator animation;
        @SuppressLint({"UseSparseArrays"})
        private final Map<Integer, View> viewCache = new HashMap();

        public RequestViewHolder(View view) {
            super(view);
        }

        public void clearAnimation() {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.itemView.setTranslationY(Utils.FLOAT_EPSILON);
            }
        }

        public <E extends View> E findCachedView(int i) {
            E e;
            synchronized (this.viewCache) {
                if (this.viewCache.containsKey(Integer.valueOf(i))) {
                    e = (View) this.viewCache.get(Integer.valueOf(i));
                } else {
                    E findViewById = this.itemView.findViewById(i);
                    this.viewCache.put(Integer.valueOf(i), findViewById);
                    e = findViewById;
                }
            }
            return e;
        }

        public void startAnimation() {
            int measuredHeight = this.itemView.getMeasuredHeight();
            if (measuredHeight == 0) {
                this.itemView.measure(0, 0);
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((float) measuredHeight) * ANIMATION_HEIGHT_RATIO, 0.0f});
            this.animation = ofFloat;
            ofFloat.setInterpolator(TIME_INTERPOLATOR);
            this.animation.setDuration(ANIMATION_DURATION);
            this.animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RequestViewHolder.this.itemView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.animation.start();
        }
    }

    public ComponentRequestAdapter(di3 di3, CellFactory cellFactory, RecyclerView recyclerView2) {
        this.listUpdateCallback = di3;
        this.recyclerView = recyclerView2;
        this.requestMessageList = new ArrayList();
        this.requestAdapterSelector = new RequestAdapterSelector(cellFactory);
    }

    /* access modifiers changed from: private */
    public void updateDataSet(List<CellType.Base> list, List<CellType.Base> list2) {
        C1294g.C1299e c = C1294g.m9488c(new DiffCalculator(list, list2), true);
        this.requestMessageList.clear();
        this.requestMessageList.addAll(list2);
        c.mo9773c(this.listUpdateCallback);
    }

    public int getMessageCount() {
        return this.requestMessageList.size();
    }

    public CellType.Base getMessageForPos(int i) {
        return this.requestMessageList.get(i);
    }

    public StateSelector<List<CellType.Base>> getSelector() {
        return this.requestAdapterSelector;
    }

    public void update(final List<CellType.Base> list) {
        this.recyclerView.removeCallbacks(this.updateRunnable);
        C101001 r0 = new Runnable() {
            public void run() {
                ComponentRequestAdapter.this.updateDataSet(kj0.m47112c(ComponentRequestAdapter.this.requestMessageList), kj0.m47112c(list));
            }
        };
        this.updateRunnable = r0;
        this.recyclerView.postDelayed(r0, 200);
    }

    public ComponentRequestAdapter(List<CellType.Base> list, di3 di3, RequestAdapterSelector requestAdapterSelector2, RecyclerView recyclerView2) {
        this.requestMessageList = list;
        this.listUpdateCallback = di3;
        this.requestAdapterSelector = requestAdapterSelector2;
        this.recyclerView = recyclerView2;
    }
}
