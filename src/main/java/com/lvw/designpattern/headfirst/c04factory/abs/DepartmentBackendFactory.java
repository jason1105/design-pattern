package com.lvw.designpattern.headfirst.c04factory.abs;

import com.lvw.designpattern.headfirst.c04factory.abs.framework.*;
import com.lvw.designpattern.headfirst.c04factory.abs.framework.Package;

/**
 * 实现抽象工厂
 */
public class DepartmentBackendFactory extends BackendFactory {
    @Override
    protected Package createPkg() {
        return new PlasticPackage();
    }

    @Override
    protected Coupon createCoupon() {
        return new PointCardCoupon() ;
    }
}
