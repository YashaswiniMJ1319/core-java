package com.exm.pro.outer;

import com.exm.pro.inner.BridalMakeupSet;

public class MakeupRunner {

    public static void main(String[] args) {

        BridalMakeupSet bridalMakeupSet =
                new BridalMakeupSet("Lakme",
                        "Bridal Kit",
                        4999,
                        true);

        bridalMakeupSet.show();
    }
}