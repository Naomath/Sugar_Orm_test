package com.lifeistech.naoto.sugar_orm_test;

import android.content.Context;

import com.orm.SugarApp;
import com.orm.SugarContext;


/**
 * Created by naoto on 2017/05/12.
 */

public class Sugar_orm_control extends SugarApp{

    @Override
    public void onCreate(){
        super.onCreate();
        SugarContext.init(this);
    }

}
