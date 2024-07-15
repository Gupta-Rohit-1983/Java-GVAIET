package com.genric.mobilebill.framework;

@FunctionalInterface
public interface MobileBill<T extends Payable> {
    public Float generateBill(T noDays);

}
