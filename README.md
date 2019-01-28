
old school -> imperative

/**************************************************
Learning RxJava by Thomas Nield
***************************************************/


/**************  Chapter one  **************/

Observable -> multiple values
Flowable -> multiple values, support backpressure

Single -> one value or error
Maybe -> one value, error or no emissions

Completable -> completes with error or success



Observable pushes the items
Streams and sequences pull the items

Reactive is not for all cases, but the most.

/**************  Chapter two  **************/

Observable<T>
    It pushes items of type T through aseries of operators until it arrives at a Observer.
    Observables can indeed be infinite.

    create()
    onNext()
    onComplete()
    onError()

Observer
    onSubscribe()
    onNext(T value)
    onError(Throwable e).retry()
    onComplete()

    Each operator, such as map() and filter(), also implements Observer internally.

Other Observable factories
Single, Completable and Maybe
Disposable