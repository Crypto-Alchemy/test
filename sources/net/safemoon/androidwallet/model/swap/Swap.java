package net.safemoon.androidwallet.model.swap;

import com.github.mikephil.charting.utils.Utils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

public class Swap implements Serializable {
    private static final long serialVersionUID = 7954856143702396824L;
    @SerializedName("address")
    @Expose
    public String address;
    public BigDecimal balance = BigDecimal.ZERO;
    @SerializedName("buySlippage")
    @Expose
    public Double buySlippage = null;
    @SerializedName("chainId")
    @Expose
    public Integer chainId;
    @SerializedName("coinMarketId")
    @Expose
    public String cmcId = null;
    @SerializedName("slug")
    @Expose
    public String cmcSlug = null;
    @SerializedName("decimals")
    @Expose
    public Integer decimals;
    public int imageResource = 0;
    @SerializedName("logoURI")
    @Expose
    public String logoURI = "";
    @SerializedName("name")
    @Expose
    public String name;
    public Double nativeBalance = Double.valueOf(Utils.DOUBLE_EPSILON);
    @SerializedName("pairs")
    @Expose
    public List<PairsData> pairs = null;
    @SerializedName("sellSlippage")
    @Expose
    public Double sellSlippage = null;
    @SerializedName("symbol")
    @Expose
    public String symbol;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Swap)) {
            return false;
        }
        Swap swap = (Swap) obj;
        if (this.imageResource != swap.imageResource || !Objects.equals(this.name, swap.name) || !Objects.equals(this.symbol, swap.symbol) || !Objects.equals(this.address, swap.address) || !Objects.equals(this.chainId, swap.chainId) || !Objects.equals(this.decimals, swap.decimals) || !Objects.equals(this.logoURI, swap.logoURI) || !Objects.equals(this.cmcSlug, swap.cmcSlug) || !Objects.equals(this.cmcId, swap.cmcId) || !Objects.equals(this.buySlippage, swap.buySlippage) || !Objects.equals(this.sellSlippage, swap.sellSlippage) || !Objects.equals(this.balance, swap.balance)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.symbol, this.address, this.chainId, this.decimals, this.logoURI, this.nativeBalance});
    }

    public IToken toIToken() {
        return new IToken() {
            public boolean getAllowSwap() {
                return true;
            }

            public int getChainId() {
                return Swap.this.chainId.intValue();
            }

            public String getContractAddress() {
                return Swap.this.address;
            }

            public int getDecimals() {
                return Swap.this.decimals.intValue();
            }

            public String getIconResName() {
                return Swap.this.logoURI;
            }

            public String getName() {
                return Swap.this.name;
            }

            public double getNativeBalance() {
                return Utils.DOUBLE_EPSILON;
            }

            public double getPercentChange1h() {
                return Utils.DOUBLE_EPSILON;
            }

            public double getPriceInUsdt() {
                return Utils.DOUBLE_EPSILON;
            }

            public String getSymbol() {
                return Swap.this.symbol;
            }

            public String getSymbolWithType() {
                return "API_" + Swap.this.address;
            }
        };
    }
}
