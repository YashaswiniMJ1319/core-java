package com.exm.pro.outer;

import com.exm.pro.inner.Report;

public class ReportRunner {
    public static void main(String[] args) {
        Report report1=new Report("Andriod app development",50,1.5,1500);
        Report report2=new Report("Andriod app development",50,1.5,150);
        boolean isSame=report1.equals(report2);
        System.out.println("checking is the title and no of pages of the report is same or not:"+isSame);

    }
}


