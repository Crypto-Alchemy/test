package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C1283f;
import androidx.recyclerview.widget.C1328m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.squareup.picasso.Picasso;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9802b;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

@SuppressLint({"ViewConstructor"})
public class RequestViewConversationsEnabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    public ActionFactory f46878af;
    public CellFactory cellFactory;
    private ImagePickerDragAnimation imagePickerDragAnimation;
    private C9802b imageStream;
    private ComponentMessageComposer messageComposerComponent;
    private ViewMessageComposer messageComposerView;
    public Picasso picasso;
    private RecyclerView recyclerView;
    public Store store;
    private Subscription subscription;
    private View toolbar;
    private View toolbarContainer;

    public static class ImagePickerDragAnimation implements C9802b.C9805c {
        private final Interpolator cubicBezierInterpolator = vm4.m28892a(0.19f, Utils.FLOAT_EPSILON, 0.2f, 1.0f);
        private final View messageComposer;
        private final View recycler;
        private final View toolbar;
        private final View toolbarContainer;

        public ImagePickerDragAnimation(View view, View view2, View view3, View view4) {
            this.toolbarContainer = view;
            this.messageComposer = view2;
            this.recycler = view3;
            this.toolbar = view4;
        }

        private void animateBackground(int i, float f) {
            float interpolation = (float) ((int) (this.cubicBezierInterpolator.getInterpolation(f * 0.3f) * -1.0f * ((float) i)));
            this.messageComposer.setTranslationY(interpolation);
            this.recycler.setTranslationY(interpolation);
        }

        private void animateToolbar(int i, float f) {
            float f2 = (float) i;
            float f3 = f * f2;
            int C = ga7.m17717C(this.toolbar);
            if (i > 0) {
                float f4 = f2 - f3;
                float f5 = (float) C;
                if (f4 < f5) {
                    this.toolbarContainer.setTranslationY(f4 - f5);
                    return;
                }
            }
            this.toolbarContainer.setTranslationY(Utils.FLOAT_EPSILON);
        }

        public void onScroll(int i, int i2, float f) {
            animateToolbar(i2, f);
            animateBackground(i2, f);
        }
    }

    public static class RecyclerListener implements ViewMessageComposer.OnHeightChangeListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, di3 {
        private static final int FIXED_SCROLL_TIME = 50;
        private static final int SCROLL_INSTANT = 1;
        private static final int SCROLL_SMOOTH_FIXED_TIME = 3;
        private static final int SCROLL_SMOOTH_FIXED_VELOCITY = 2;
        private final LinearLayoutManager linearLayoutManager;
        /* access modifiers changed from: private */
        public final int recyclerDefaultBottomPadding;
        /* access modifiers changed from: private */
        public final RecyclerView recyclerView;

        public RecyclerListener(RecyclerView recyclerView2, LinearLayoutManager linearLayoutManager2) {
            this.recyclerView = recyclerView2;
            this.linearLayoutManager = linearLayoutManager2;
            this.recyclerDefaultBottomPadding = recyclerView2.getResources().getDimensionPixelOffset(m25.zs_request_recycler_padding_bottom);
        }

        private void postScrollToBottom(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    RecyclerListener.this.scrollToBottom(i);
                }
            });
        }

        /* access modifiers changed from: private */
        public void scrollToBottom(int i) {
            int i2;
            View view;
            int itemCount = this.recyclerView.getAdapter().getItemCount() - 1;
            if (itemCount < 0) {
                return;
            }
            if (i == 1) {
                RecyclerView.C1231a0 Z = this.recyclerView.mo9011Z(itemCount);
                if (Z == null || (view = Z.itemView) == null) {
                    i2 = 0;
                } else {
                    i2 = view.getHeight();
                }
                this.linearLayoutManager.mo8884I2(itemCount, (this.recyclerView.getPaddingBottom() + i2) * -1);
            } else if (i == 3) {
                C101122 r3 = new C1328m(this.recyclerView.getContext()) {
                    public int calculateTimeForScrolling(int i) {
                        return 50;
                    }
                };
                r3.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().mo9230S1(r3);
            } else if (i == 2) {
                C1328m mVar = new C1328m(this.recyclerView.getContext());
                mVar.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().mo9230S1(mVar);
            }
        }

        public void onChanged(int i, int i2, Object obj) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2, obj);
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                postScrollToBottom(2);
            }
        }

        public void onHeightChange(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    int paddingLeft = RecyclerListener.this.recyclerView.getPaddingLeft();
                    int paddingRight = RecyclerListener.this.recyclerView.getPaddingRight();
                    int paddingTop = RecyclerListener.this.recyclerView.getPaddingTop();
                    int access$100 = RecyclerListener.this.recyclerDefaultBottomPadding;
                    int i = i;
                    if (i > 0) {
                        access$100 += i;
                    }
                    if (access$100 != RecyclerListener.this.recyclerView.getPaddingBottom()) {
                        RecyclerListener.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, access$100);
                        RecyclerListener.this.scrollToBottom(1);
                    }
                }
            });
        }

        public void onInserted(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2);
            postScrollToBottom(3);
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 < i8) {
                postScrollToBottom(1);
            }
        }

        public void onMoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemMoved(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeRemoved(i, i2);
        }
    }

    public static class RequestItemAnimator extends C1283f {
        private final ComponentRequestAdapter component;

        public RequestItemAnimator(ComponentRequestAdapter componentRequestAdapter) {
            this.component = componentRequestAdapter;
            setSupportsChangeAnimations(false);
        }

        public boolean canReuseUpdatedViewHolder(RecyclerView.C1231a0 a0Var) {
            if (this.component.getMessageForPos(a0Var.getAdapterPosition()) instanceof CellType.Attachment) {
                return true;
            }
            return super.canReuseUpdatedViewHolder(a0Var);
        }
    }

    public RequestViewConversationsEnabled(Context context) {
        super(context);
        viewInit(context);
    }

    private Subscription bindComponents(Store store2) {
        return CombinedSubscription.from(bindMessageComposer(store2), bindRecycler(store2), bindDialogComponent(store2));
    }

    private Subscription bindDialogComponent(Store store2) {
        return store2.addListener(StateUi.class, new ComponentDialog(this.activity, this.f46878af, store2));
    }

    private Subscription bindMessageComposer(Store store2) {
        ComponentMessageComposer componentMessageComposer = new ComponentMessageComposer(this.activity, this.imageStream, this.messageComposerView, store2, this.f46878af);
        this.messageComposerComponent = componentMessageComposer;
        return store2.addListener(componentMessageComposer.getSelector(), this.messageComposerComponent);
    }

    private Subscription bindRecycler(Store store2) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.activity);
        RecyclerListener recyclerListener = new RecyclerListener(this.recyclerView, linearLayoutManager);
        ComponentRequestAdapter componentRequestAdapter = new ComponentRequestAdapter(recyclerListener, this.cellFactory, this.recyclerView);
        CellMarginDecorator cellMarginDecorator = new CellMarginDecorator(componentRequestAdapter, this.activity);
        RequestItemAnimator requestItemAnimator = new RequestItemAnimator(componentRequestAdapter);
        ComponentRequestAdapter.RequestAdapter requestAdapter = new ComponentRequestAdapter.RequestAdapter(componentRequestAdapter);
        this.recyclerView.setItemAnimator(requestItemAnimator);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.mo9067h(cellMarginDecorator);
        this.recyclerView.setAdapter(requestAdapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.messageComposerView.setOnHeightChangeListener(recyclerListener);
        this.messageComposerView.addOnFocusChangeListener(recyclerListener);
        this.recyclerView.addOnLayoutChangeListener(recyclerListener);
        return store2.addListener(componentRequestAdapter.getSelector(), componentRequestAdapter);
    }

    private void bindViews() {
        this.imageStream = BelvedereUi.m75343b(this.activity);
        this.recyclerView = (RecyclerView) findViewById(l35.activity_request_recycler_view);
        this.messageComposerView = (ViewMessageComposer) findViewById(l35.activity_request_message_composer);
        this.toolbarContainer = this.activity.findViewById(l35.activity_request_appbar);
        this.toolbar = this.activity.findViewById(l35.activity_request_toolbar);
        this.messageComposerView.init(this.imageStream);
        installDragAnimation();
    }

    private void installDragAnimation() {
        ImagePickerDragAnimation imagePickerDragAnimation2 = new ImagePickerDragAnimation(this.toolbarContainer, this.messageComposerView, this.recyclerView, this.toolbar);
        this.imagePickerDragAnimation = imagePickerDragAnimation2;
        this.imageStream.mo73732j(imagePickerDragAnimation2);
    }

    private void viewInit(Context context) {
        View.inflate(context, g45.zs_view_request_conversations_enabled, this);
        this.activity = (AppCompatActivity) context;
    }

    public boolean hasUnsavedInput() {
        ComponentMessageComposer componentMessageComposer = this.messageComposerComponent;
        if (componentMessageComposer == null || !componentMessageComposer.hasUnsavedInput()) {
            return false;
        }
        return true;
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    public void init(RequestComponent requestComponent, boolean z) {
        requestComponent.inject(this);
        bindViews();
        Subscription bindComponents = bindComponents(this.store);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
        if (z) {
            this.store.dispatch(this.f46878af.loadCommentsFromCacheAsync());
            this.store.dispatch(this.f46878af.loadRequestAsync());
            this.store.dispatch(this.f46878af.initialLoadCommentsAsync());
            this.messageComposerView.requestFocusForInput();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
