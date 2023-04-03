package net.safemoon.androidwallet.fragments;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import org.web3j.abi.datatypes.Address;

public class QrFragment extends BaseMainFragment {

    /* renamed from: A */
    public String f42008A;

    /* renamed from: B */
    public TokenType f42009B;

    /* renamed from: C */
    public fz4 f42010C;

    /* renamed from: H */
    public Bitmap f42011H;

    /* renamed from: I */
    public Button f42012I;

    /* renamed from: k */
    public ImageView f42013k;

    /* renamed from: r */
    public ImageView f42014r;

    /* renamed from: s */
    public TextView f42015s;

    /* renamed from: x */
    public TextView f42016x;

    /* renamed from: y */
    public TextView f42017y;

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m66775t(View view) {
        mo50752i();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m66776u(View view) {
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f42008A));
        ol0.m70345Y(requireActivity(), R.string.copied);
    }

    @SuppressLint({"SetTextI18n"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_qr, viewGroup, false);
        this.f42017y = (TextView) inflate.findViewById(R.id.tvWarningText);
        this.f42014r = (ImageView) inflate.findViewById(R.id.iv_back);
        this.f42015s = (TextView) inflate.findViewById(R.id.tvPublicAddress);
        this.f42013k = (ImageView) inflate.findViewById(R.id.ivQr);
        this.f42016x = (TextView) inflate.findViewById(R.id.tvQr);
        this.f42012I = (Button) inflate.findViewById(R.id.btnCopy);
        if (getArguments() != null) {
            this.f42008A = getArguments().getString(Address.TYPE_NAME);
            this.f42009B = TokenType.fromValue(getArguments().getInt("tokenChainId", TokenType.BEP_20.getChainId()));
        }
        this.f42015s.setText(this.f42008A);
        this.f42017y.setText(getResources().getString(R.string.qr_wallet_alert_text, new Object[]{this.f42009B.getDisplayName()}));
        if (this.f42015s.getText().toString().length() > 0) {
            Display defaultDisplay = ((WindowManager) requireActivity().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            fz4 fz4 = new fz4(this.f42015s.getText().toString(), (Bundle) null, "TEXT_TYPE", (Math.min(point.x, point.y) * 3) / 4);
            this.f42010C = fz4;
            try {
                Bitmap d = fz4.mo20302d(0);
                this.f42011H = d;
                this.f42013k.setImageBitmap(d);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("onCreateView:--> ");
                sb.append(e.getMessage());
            }
        } else {
            this.f42015s.setError("Required");
        }
        this.f42014r.setOnClickListener(new lz4(this));
        this.f42012I.setOnClickListener(new mz4(this));
        return inflate;
    }
}
