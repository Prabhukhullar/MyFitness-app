package com.example.fragment1;

import android.widget.ImageView;
import android.widget.TextView;

public class Natural_model {
    private int imgN;
    private String txtN;

    public Natural_model(int imgN, String txtN) {
        this.imgN = imgN;
        this.txtN = txtN;
    }

    public int getImgN() {
        return imgN;
    }

    public void setImgN(int imgN) {
        this.imgN = imgN;
    }

    public String getTxtN() {
        return txtN;
    }

    public void setTxtN(String txtN) {
        this.txtN = txtN;
    }
}
