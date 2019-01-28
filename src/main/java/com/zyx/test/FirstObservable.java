package com.zyx.test;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public class FirstObservable {
    public static void main(String[] args) {

        Observable<String> myStrings =
                Observable.just("Alpha","Beta","Teta","Gamma");


        myStrings.subscribe(s -> System.out.println(s));
        myStrings
                .map(s -> s.length())
                .subscribe(s -> System.out.println(s));
    }
}
