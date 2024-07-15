package com.genric.mobilebill.framework;

public class PostPaid implements MobileBill<PostPaid>, Payable {

    private Integer noDays;

    public void setNoDays(Integer noDays) {
        this.noDays = noDays;
    }

    public Integer getNoDays(){
        return noDays;
    }

    @Override
    public Float generateBill(PostPaid noDays){
        return noDays.getNoDays * 10.0F;
    }
}
