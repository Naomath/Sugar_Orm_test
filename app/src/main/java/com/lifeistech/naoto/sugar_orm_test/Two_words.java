package com.lifeistech.naoto.sugar_orm_test;

import com.orm.SugarApp;
import com.orm.SugarRecord;

/**
 * Created by naoto on 2017/05/07.
 */

public class Two_words extends SugarRecord<Two_words>{

    String japanese;
    String english;
    public Two_words(){

    }

    public Two_words(String japanese, String english){
        //本物のコンストラクタ
        this.japanese = japanese;
        this.english = english;
    }
}
