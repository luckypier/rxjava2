package com.zyx.test;


import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class SimpleMapFilter {

    public static void main(String[] args) {

//        Observable<String> source =
//                Observable.create(emitter -> {
//                    try {
//                        emitter.onNext("Alpha");
//                        emitter.onNext("Beta");
//                        emitter.onNext("Gamma");
//                        emitter.onNext("Delta");
//                        emitter.onNext("Epsilon");
//                        emitter.onComplete();
//                    }catch (Throwable e){
//                    emitter.onError(e);
//                    }
//                });

                Observable<String> source =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

                source
                .map(String::length)
                .filter(integer -> integer>=5)
                .subscribe(s -> System.out.println(s));

    }

}
